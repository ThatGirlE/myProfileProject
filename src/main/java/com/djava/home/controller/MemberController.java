package com.djava.home.controller;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.djava.home.dao.BoardDao;

@Controller
public class MemberController {
	
	@Autowired //자동주입
	private SqlSession sqlSession;
	
//	@RequestMapping(value="/test")
//	public String test(Model model) {
//		
//		BoardDao dao = sqlSession.getMapper(BoardDao.class);
//		
//		model.addAttribute("title", dao.testDao("1"));
//		
//		
//		return "test";
//	}
	
	@RequestMapping(value="/") // 첫페이지를 인덱스로 띄우겠다
	public String root() {
		
		
		return "index";
	}
	
	@RequestMapping(value="/index")
	public String index() {
		return "index";
	}
	
	
}
