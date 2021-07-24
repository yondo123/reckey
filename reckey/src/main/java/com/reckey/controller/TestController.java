package com.reckey.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.reckey.dto.TestDto;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Controller
@RequestMapping("/reckey")
public class TestController {

	@ApiOperation(value="mainTest", notes="main 컨트롤러 API")
	@ApiResponses({
		@ApiResponse(code = 200, message = "OK !!"),
		@ApiResponse(code = 500, message = "Server Error !!"),
		@ApiResponse(code = 404, message = "Page Not Found !!")
	})
	
	@GetMapping("/main")
	@ResponseBody
	public ArrayList<String> main(TestDto testDto) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("test");
		list.add("test1");
		return list;
	}
}
