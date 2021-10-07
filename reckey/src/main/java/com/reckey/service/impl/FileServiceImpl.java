package com.reckey.service.impl;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.reckey.constants.Constants;
import com.reckey.service.FileService;

@Service
public class FileServiceImpl implements FileService, Constants{

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public String upload(MultipartFile file, String path) throws Exception{
		
		//파일 경로 생성
		String fileName = UUID.randomUUID().toString()+RECORD_FILE_EXTENTION;
		Path uploadPath = Paths.get(path + File.separator + fileName);
		
		try {
			Files.copy(file.getInputStream(), uploadPath, StandardCopyOption.REPLACE_EXISTING);
			logger.info("["+uploadPath+ "] upload success !!");
			
			return MP3_URL+fileName;
			
		} catch (IOException e) {
			logger.error(e.getMessage());
			throw new Exception("파일 업로드에 실패하였습니다.", e);
		}
		
	}

}
