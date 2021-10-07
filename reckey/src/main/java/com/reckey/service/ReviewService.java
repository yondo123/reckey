package com.reckey.service;

import java.util.List;

import com.reckey.dto.KeyboardDTO;
import com.reckey.dto.ReviewDTO;
	
public interface ReviewService {

	public List<ReviewDTO.Info> getReviewList(KeyboardDTO.RequestOne request);
	
	public void insertReview(ReviewDTO.requestOne request)  throws Exception;
}
