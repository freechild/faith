package com.game.faith;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ActionController {
	
	@RequestMapping(value = "/action/move/{to}", method = RequestMethod.GET)
	public void actionMove(HttpServletResponse response, @PathVariable("to") String to) {
		try {
			// TODO: Move action
			response.getWriter().write("ok");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestMapping(value = "/action/do/{something}", method = RequestMethod.GET)
	public void actionDo(HttpServletResponse response, @PathVariable("something") String something) {
		try {
			// TODO: Do action
			response.getWriter().write("ok");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestMapping(value = "/action/sleep", method = RequestMethod.GET)
	public void actionSleep(HttpServletResponse response) {
		try {
			// TODO: Sleep action
			response.getWriter().write("ok");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
