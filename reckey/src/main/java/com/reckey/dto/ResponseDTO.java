package com.reckey.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO {

	private String resultMsg;
	private String resultCode;
	private boolean result;
	private Object info;
}
