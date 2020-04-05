package com.aokai.hospital.controller;

import com.aokai.hospital.model.dto.User;
import com.aokai.hospital.model.qo.RegisterReq;
import com.aokai.hospital.model.qo.UserReq;
import com.aokai.hospital.po.Patient;
import com.aokai.hospital.service.UserService;
import com.aokai.hospital.utils.MD5Util;
import com.aokai.hospital.utils.TokenUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
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

    /**
     * 用户登录
     * @param userReq
     * @return
     * @throws JsonProcessingException
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public String login(@RequestBody @Validated UserReq userReq) throws JsonProcessingException {
        // 通过账号密码获取用户信息
        User user = userService.checkUser(userReq);
        if (user == null) {
            return "登录失败，账户或密码错误";
        }
        // 生成token
        String token = TokenUtil.sign(user);

        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("token", token);
        ObjectMapper objectMapper = new ObjectMapper();

        return objectMapper.writeValueAsString(hashMap);
    }

    /**
     * 患者注册
     * @param registerReq
     * @return
     * @throws JsonProcessingException
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public String register(@RequestBody @Validated RegisterReq registerReq) throws JsonProcessingException {
        // 检查注册用户名称是否存在
        Boolean isPatientName = userService.checkUserName(registerReq);
        if (isPatientName) {
            return "用户名已存在";
        }
        // 检查注册用户邮箱是否被注册
        Boolean isPatientEmail = userService.checkUserEmail(registerReq);
        if (isPatientEmail) {
            return "邮箱已存在";
        }
        // 注册患者信息
        Boolean isInsert = userService.insertPatient(registerReq);
        if (! isInsert) {
            return "注册患者用户失败";
        }

        User user = new User();
        user.setUsername(registerReq.getAccount());
        user.setPassword(MD5Util.string2MD5(registerReq.getPassword()));

        // 生成token
        String token = TokenUtil.sign(user);

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
