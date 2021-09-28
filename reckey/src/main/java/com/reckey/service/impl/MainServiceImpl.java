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
		List<KeyboardDTO.Info> keyboardList = mainRepository.getKeyboardList(request);
		
		String[] switchType = null;
		
		for(KeyboardDTO.Info keyboardInfo : keyboardList) {
			switchType = mainRepository.getKeyboardSwitchType(keyboardInfo.getId());
			keyboardInfo.setSwitchType(switchType);
		}
		return keyboardList;
	}

	@Override
	public List<CompanyDTO.Info> getCompanyList(CompanyDTO.RequestList request) {
		List<CompanyDTO.Info> companyList = mainRepository.getCompanyList(request);
		return companyList;
	}

}
