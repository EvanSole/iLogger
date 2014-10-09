package com.vip.logger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vip.logger.service.SceLoggerService;

@Controller
@RequestMapping(value = "/logger")
public class SceLoggerController {

	@Autowired
	private SceLoggerService sceLoggerService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String defaultView() {
		return "logger";
	}
	
	@RequestMapping(value = "/logger", method = RequestMethod.GET)
	public String logger() {
		return "logger";
	}

	
}
