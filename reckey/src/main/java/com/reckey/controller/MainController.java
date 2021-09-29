package com.reckey.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.reckey.dto.CompanyDTO;
import com.reckey.dto.KeyboardDTO;
import com.reckey.dto.ResponseDTO;
import com.reckey.dto.ReviewDTO;
import com.reckey.service.MainService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Controller
public class MainController {

	@Autowired
	MainService mainService;
	
	@ApiOperation(value="mainController", notes="main Controller API")
	@ApiResponses({
		@ApiResponse(code = 200, message = "OK !!"),
		@ApiResponse(code = 500, message = "Server Error !!"),
		@ApiResponse(code = 404, message = "Page Not Found !!")
	})
	
	@GetMapping("keyboard-list")
	@ResponseBody
	public List<KeyboardDTO.Info> keyboardList(KeyboardDTO.RequestList request) {
		List<KeyboardDTO.Info> list = mainService.getKeyboardList(request);
		return list;
	}
	
	@GetMapping("company-list")
	@ResponseBody
	public List<CompanyDTO.Info> companyList(CompanyDTO.RequestList request) {
		List<CompanyDTO.Info> list = mainService.getCompanyList(request);
		return list;
	}

	@GetMapping("keyboard-review")
	@ResponseBody
	public List<ReviewDTO.Info> reviewList(KeyboardDTO.RequestOne request){
		List<ReviewDTO.Info> list = mainService.getReviewList(request);
		return list;
	}
	
	@PostMapping("review")
	@ResponseBody
	public ResponseDTO insertReview(ReviewDTO.requestOne request) {
		ResponseDTO resDto = new ResponseDTO();
		
		int result = mainService.insertReview(request);

		if(result == 0) {
			resDto.setResult(false);
		}
		
		resDto.setResult(true);
		return resDto;
	}
	
}
