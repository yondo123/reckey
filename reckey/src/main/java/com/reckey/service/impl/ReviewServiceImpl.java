package com.reckey.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.reckey.constants.Constants;
import com.reckey.dto.KeyboardDTO;
import com.reckey.dto.ReviewDTO;
import com.reckey.repository.ReviewRepository;
import com.reckey.service.FileService;
import com.reckey.service.ReviewService;

@Service
public class ReviewServiceImpl implements ReviewService, Constants{

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	ReviewRepository reviewRepository;
	
	@Autowired
	FileService fileService;
	
	@Override
	public List<ReviewDTO.Info> getReviewList(KeyboardDTO.RequestOne request){
		List<ReviewDTO.Info> list = reviewRepository.getReviewList(request);
		return list;
	}
	
	@Override
	public void insertReview(ReviewDTO.requestOne request) throws Exception{
		
		try {
			MultipartFile recFile = request.getRecordFile();
			logger.info("try to upload File : " +recFile.getOriginalFilename());
			
			String recordUrl = fileService.upload(recFile, MP3_UPLOAD_PATH);
	
			request.setRecordUrl(recordUrl);
			reviewRepository.insertReview(request);
			
		}catch(SQLException e){
			logger.error(e.getMessage());
			throw new Exception("SQL Error !!", e);
		}
	}


}
