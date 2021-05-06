package com.web.history.controller;

import com.web.history.vo.UserInfoVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jacksparrow414
 * @date 2021/5/5
 */
@RestController
@RequestMapping(value = "/user")
public class BasicAjaxController {
    
    @PostMapping(value = "/submit")
    public String submit(@RequestBody UserInfoVO userInfoVO) {
        return userInfoVO.getUsername();
    }
    
    @PostMapping(value = "/submitAndReturnJson")
    public UserInfoVO submitAndReturnJson(@RequestBody UserInfoVO userInfoVO) {
        return userInfoVO;
    }
}
