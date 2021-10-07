package com.reckey.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.reckey.dto.KeyboardDTO;
import com.reckey.dto.ResponseDTO;
import com.reckey.dto.ReviewDTO;
import com.reckey.service.ReviewService;

@Controller
public class ReviewController {

	@Autowired
	ReviewService reviewService;
	
	@GetMapping("keyboard-review")
	@ResponseBody
	public List<ReviewDTO.Info> reviewList(KeyboardDTO.RequestOne request){
		List<ReviewDTO.Info> list = reviewService.getReviewList(request);
		return list;
	}
	
	@PostMapping("review")
	@ResponseBody
	public ResponseDTO insertReview(ReviewDTO.requestOne request) {
		ResponseDTO resDto = new ResponseDTO();
		
		try {
			reviewService.insertReview(request);
			return resDto;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			resDto.setResult(false);
			resDto.setResultMsg(e.getMessage());
			return resDto;
		}
	}
}
