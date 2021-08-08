package com.reckey.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseDTO<T> {

	private String returnMsg;
	private String returnCode;
	private T info;
}
