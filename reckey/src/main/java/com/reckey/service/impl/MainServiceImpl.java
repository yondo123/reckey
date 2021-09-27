package com.reckey.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reckey.dto.CompanyDTO;
import com.reckey.dto.KeyboardDTO;
import com.reckey.repository.MainRepository;
import com.reckey.service.MainService;

@Service
public class MainServiceImpl implements MainService{

	@Autowired
	MainRepository mainRepository;
	
	@Override
	public List<KeyboardDTO.Info> getKeyboardList(KeyboardDTO.RequestList request) {
		System.out.println(request.getOffset());
		System.out.println(request.getPage());
		List<KeyboardDTO.Info> keyboardList = mainRepository.getKeyboardList(request);
		return keyboardList;
	}

	@Override
	public List<CompanyDTO.Info> getCompanyList() {
		List<CompanyDTO.Info> companyList = mainRepository.getCompanyList();
		return companyList;
	}

}
