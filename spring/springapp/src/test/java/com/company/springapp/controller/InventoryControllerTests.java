package com.company.springapp.controller;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import com.company.springapp.controller.InventoryController;
import com.company.springapp.services.SimpleProductManager;

public class InventoryControllerTests {

	@Test
	public void testHandleRequestView() throws Exception{
		InventoryController controller = new InventoryController();
		controller.setProductManager(new SimpleProductManager());
		ModelAndView model = controller.handleRequest(null, null);
		assertEquals("hello",model.getViewName());
		assertNotNull(model.getModel());
		@SuppressWarnings("unchecked")
		Map<String, Object> modelMap = (Map<String, Object>) model.getModel().get("model");
		String nowValue= (String) modelMap.get("now");
		assertNotNull(nowValue);
	}
}
