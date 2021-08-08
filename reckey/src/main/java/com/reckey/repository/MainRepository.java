package com.reckey.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.reckey.dto.KeyboardDTO;

@Repository
public interface MainRepository {

	public List<KeyboardDTO.Info> getKeyboardListInfo();
}
