package com.reckey.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reckey.dto.KeyboardDTO.Info;
import com.reckey.repository.MainRepository;
import com.reckey.service.MainService;

@Service
public class MainServiceImpl implements MainService{

	@Autowired
	MainRepository mainRepository;
	
	@Override
	public List<Info> getKeyboardListInfo() {
		List<Info> keyboardList = mainRepository.getKeyboardListInfo();
		return keyboardList;
	}

}
