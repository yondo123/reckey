package com.reckey.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.reckey.dto.KeyboardDTO;
import com.reckey.dto.ReviewDTO;

@Repository
public interface ReviewRepository {

	public List<ReviewDTO.Info> getReviewList(KeyboardDTO.RequestOne request);
	
	public int insertReview(ReviewDTO.requestOne request);
}
