package com.example.demo1.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo1.vo.MemberVO;

@Mapper
public interface LoginDao {
        public List<MemberVO> selectListEnterpriseMember(MemberVO memberVo);
        public MemberVO getMember(String userid);
}