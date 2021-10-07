package com.reckey.service;

import java.util.List;

import com.reckey.dto.CompanyDTO;
import com.reckey.dto.KeyboardDTO;


public interface MainService {

	public List<KeyboardDTO.Info> getKeyboardList(KeyboardDTO.RequestList request);

	public List<CompanyDTO.Info> getCompanyList(CompanyDTO.RequestList request);

}
