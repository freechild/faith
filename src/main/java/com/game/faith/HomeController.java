package com.game.faith;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.game.faith.vo.Total_management;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "faith";
	}
	
	//그냥 controller 안에서 뉴로 vo생성후 생성값 그냥 수정하는 형식으로 해볼까한다
	//이 소스은 상황따라 service or dao로 빠질수있다.
	Total_management total_management;
	
	
	
	
	
}
