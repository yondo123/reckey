package com.reckey.dto;

import io.swagger.annotations.ApiParam;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TestDto {

	@ApiParam(value = "param1", required = true)
	private String param1;
	
	@ApiParam(value = "param2", required = true)
	private String param2;
	
	@ApiParam(value = "param3", required = true)
	private int param3;
}
