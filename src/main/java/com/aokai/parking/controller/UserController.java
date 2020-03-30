package com.aokai.parking.controller;

import com.aokai.parking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

    @RequestMapping(value = "/updateUserState", method = RequestMethod.POST)
    public String updateUserState(Integer id, Integer state) {
        Integer flag = userService.updateUserState(state, id);
        System.out.println(flag);
        String msg = null;
        if (flag == 1) {
            msg = "OK";
            return msg;
        } else {
            return msg;
        }
    }

}
