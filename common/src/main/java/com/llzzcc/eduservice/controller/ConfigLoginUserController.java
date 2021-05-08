package com.llzzcc.eduservice.controller;


import com.llzzcc.eduservice.config.R;
import com.llzzcc.eduservice.entity.ConfigLoginUser;
import com.llzzcc.eduservice.service.ConfigLoginUserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author llzzcc
 * @since 2021-05-08
 */
@RestController
@RequestMapping("/eduservice/config-login-user")
public class ConfigLoginUserController {

    @Autowired
    private ConfigLoginUserService configLoginUserService;

    @ApiOperation(value = "Login")
    @PostMapping("login")
    public R login(){
        return R.ok().data("token","admin-user");
    }

    @ApiOperation(value = "Getinfo")
    @GetMapping("getinfo")
    public R getinfo(){
        List<ConfigLoginUser> list = configLoginUserService.list(null);
        return R.ok().data("list",list);
    }

    @ApiOperation(value = "Logout")
    @PostMapping("logout")
    public R logout(){
        return R.ok();
    }
}

