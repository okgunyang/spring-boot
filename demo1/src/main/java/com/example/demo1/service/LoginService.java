package com.example.demo1.service;

import java.util.List;

import com.example.demo1.vo.MemberVO;

public interface LoginService {
    List<MemberVO> selectListEnterpriseMember(MemberVO vo);
    public MemberVO getMember(String userid);
}