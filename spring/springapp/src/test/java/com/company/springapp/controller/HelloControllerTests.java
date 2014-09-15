package com.company.springapp.controller;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import com.company.springapp.controller.HelloController;

public class HelloControllerTests {

	@Test
	public void testHandleRequestView() throws Exception{
		HelloController controller = new HelloController();
		ModelAndView model = controller.handleRequest(null, null);
		assertEquals("hello",model.getViewName());
		assertNotNull(model.getModel());
		String nowValue= (String) model.getModel().get("now");
		assertNotNull(nowValue);
	}
}
