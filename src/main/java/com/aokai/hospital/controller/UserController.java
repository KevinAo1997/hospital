package com.aokai.hospital.controller;

import com.aokai.hospital.po.User;
import com.aokai.hospital.service.UserService;
import com.aokai.hospital.utils.TokenUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.io.JsonEOFException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
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

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestHeader Map<String, Object> para) throws JsonProcessingException {

        String username = (String)para.get("username");
        String password = (String) para.get("password");
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
