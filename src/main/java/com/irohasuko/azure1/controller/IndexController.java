package com.irohasuko.azure1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	/**
	 * インデックスページの表示
	 * @return
	 */
	@GetMapping("/main")
	public String index() {
		return "forward:/index.html";
	}
}
