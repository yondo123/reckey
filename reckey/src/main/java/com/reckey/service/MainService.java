package com.reckey.service;

import java.util.List;

import com.reckey.dto.CompanyDTO;
import com.reckey.dto.KeyboardDTO;
import com.reckey.dto.ReviewDTO;


public interface MainService {

	public List<KeyboardDTO.Info> getKeyboardList(KeyboardDTO.RequestList request);

	public List<CompanyDTO.Info> getCompanyList(CompanyDTO.RequestList request);
	
	public List<ReviewDTO.Info> getReviewList(KeyboardDTO.RequestOne request);
	
	public int insertReview(ReviewDTO.requestOne request);
}
