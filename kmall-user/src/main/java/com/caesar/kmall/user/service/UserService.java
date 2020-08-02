package com.caesar.kmall.user.service;

import com.caesar.kmall.user.bean.UmsMember;
import com.caesar.kmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;


public interface UserService {

    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getMemberReceiveAddress(String memberId);
}
