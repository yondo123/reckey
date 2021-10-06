package com.reckey.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.reckey.dto.ResponseDTO;

@Controller
@RequestMapping("/api")
public class FileController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("/log")
	@ResponseBody
	public ResponseDTO main() {
		logger.trace("trace Log");
		logger.debug("debug Log");
		logger.info("info Log");
		logger.warn("warn Log");
		logger.error("error Log");
		
		return null;
	}
	
	@PostMapping("/upload")
	@ResponseBody
	public ResponseDTO main(MultipartFile request) {
		logger.trace("trace Log");
		logger.debug("debug Log");
		logger.info("info Log");
		logger.warn("warn Log");
		logger.error("error Log");
		
		return null;
	}
}
