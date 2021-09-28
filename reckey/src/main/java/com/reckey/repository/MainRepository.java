package com.reckey.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.reckey.dto.CompanyDTO;
import com.reckey.dto.KeyboardDTO;

@Repository
public interface MainRepository {

	public List<KeyboardDTO.Info> getKeyboardList(KeyboardDTO.RequestList request);
	public List<CompanyDTO.Info> getCompanyList(CompanyDTO.RequestList request);
	public String[] getKeyboardSwitchType(String id);
}
