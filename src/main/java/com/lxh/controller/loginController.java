package com.lxh.controller;

import com.lxh.POJO.userPojo;
import com.lxh.result.logResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.HtmlUtils;

@Controller
public class loginController {

    @CrossOrigin
    @PostMapping(value = "api/login")
    @ResponseBody
    public logResult login(@RequestBody userPojo requestUser){
        String username = requestUser.getUsername();
        String password = requestUser.getPassword();
        username = HtmlUtils.htmlEscape(username);

        if (!username.equals("admin") || !password.equals("12345")){
            String message = "账号密码错误";
            System.out.println("test");
            return new logResult(400);
        }else {
            return new logResult(200);
        }

    }

}
