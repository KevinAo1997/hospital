package com.aokai.hospital.controller;

import com.aokai.hospital.model.dto.User;
import com.aokai.hospital.enums.UserTypeEnum;
import com.aokai.hospital.model.qo.UserReq;
import com.aokai.hospital.service.UserService;
import com.aokai.hospital.utils.TokenUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description :   .
 *
 * @author : aokai
 * @date : Created in 2020/3/29 19:15
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestBody UserReq userReq) throws JsonProcessingException {
        // 通过账号密码获取用户信息
        User user = userService.checkUser(userReq);
        if (user == null) {
            return "登录失败，账户或密码错误";
        }
        String username = user.getUsername();
        String password = user.getPassword();

        // 生成token
        String token = TokenUtil.sign(new User(username, password));

        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("token", token);
        ObjectMapper objectMapper = new ObjectMapper();

        return objectMapper.writeValueAsString(hashMap);


    }

    @RequestMapping(value = "/test",method = RequestMethod.POST)
    public String test()  {
        String str  = "test通过";
        return str;
    }

}
