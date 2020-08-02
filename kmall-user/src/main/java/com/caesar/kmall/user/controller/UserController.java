package com.caesar.kmall.user.controller;

import com.caesar.kmall.user.bean.UmsMember;
import com.caesar.kmall.user.bean.UmsMemberReceiveAddress;
import com.caesar.kmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "hello user";
    }

    @RequestMapping("/getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        List<UmsMember> allUser = userService.getAllUser();
        return allUser;
    }

    /**
     * 根据memberId查询用户地址
     * @param memberId
     * @return
     */
    @RequestMapping("/getMemberReceiveAddress")
    @ResponseBody
    public List<UmsMemberReceiveAddress> umsMemberReceiveAddress(String memberId){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddressList = userService.getMemberReceiveAddress(memberId);
        return umsMemberReceiveAddressList;
    }

}
