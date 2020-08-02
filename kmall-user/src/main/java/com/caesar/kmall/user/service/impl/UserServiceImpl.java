package com.caesar.kmall.user.service.impl;

import com.caesar.kmall.user.bean.UmsMember;
import com.caesar.kmall.user.bean.UmsMemberReceiveAddress;
import com.caesar.kmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.caesar.kmall.user.mapper.UserMapper;
import com.caesar.kmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {
        //return userMapper.selectAllUser();
        List<UmsMember> umsMemberList = userMapper.selectAll();
        return  umsMemberList;
    }

    @Override
    public List<UmsMemberReceiveAddress> getMemberReceiveAddress(String memberId) {
        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(memberId);
        List<UmsMemberReceiveAddress> results = umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);
        return results;
    }
}
