package com.example.demo1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1.dao.LoginDao;
import com.example.demo1.vo.MemberVO;

@Service
public class LoginServiceImpl implements LoginService {
        @Autowired
        LoginDao loginDao;
        
        @Override
        public List<MemberVO> selectListEnterpriseMember(MemberVO vo) {
               return loginDao.selectListEnterpriseMember(vo);
        }

		@Override
		public MemberVO getMember(String userid) {
			return loginDao.getMember(userid);
		}
}