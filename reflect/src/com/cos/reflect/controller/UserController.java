package com.cos.reflect.controller;

import com.cos.reflect.controller.dto.JoinDto;

import anno.RequestMapping;

public class UserController {
	@RequestMapping(value = "/user/join")
	public String join(JoinDto dto) {
		System.out.println("join() 함수 호출됨");
		System.out.println(dto);
		return "/";
	}
	
	@RequestMapping("/user/login")
	public String login() {
		System.out.println("login() 함수 호출됨");
		return "/";
	}
	
	@RequestMapping("/user")
	public String user() {
		System.out.println("user() 함수 호출됨");
		return "/";
	}
	
	@RequestMapping("/hello")
	public String hello() {
		System.out.println("hello() 함수 호출됨");
		return "/";
	}
}