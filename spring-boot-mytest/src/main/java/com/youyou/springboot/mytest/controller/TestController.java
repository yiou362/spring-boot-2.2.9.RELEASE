package com.youyou.springboot.mytest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: liang you
 * @date: 2022/2/9
 */
@RestController
public class TestController {

	@RequestMapping("/test")
	public String test() {
		return "success";
	}
}
