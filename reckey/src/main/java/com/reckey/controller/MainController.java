package com.reckey.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.reckey.dto.KeyboardDTO;
import com.reckey.service.MainService;

@Controller
public class MainController {

	@Autowired
	MainService mainService;
	
	@GetMapping("keyboard-list")
	@ResponseBody
	public List<KeyboardDTO.Info> keyboardList(@RequestBody KeyboardDTO.RequestList request) {
		List<KeyboardDTO.Info> list = mainService.getKeyboardListInfo();
		return list;
	}
	
	@GetMapping()
	public void getCategoryInfoList() {
		
	}
	
	
}
