package com.reckey.dto;

import java.util.List;

import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class KeyboardDTO {

	@Setter
	@Getter
	@AllArgsConstructor
	@NoArgsConstructor
	public static class Info{
		private String id;
		private String name;
		private String imgUrl;
		private String type;
		private double rate;
		private String switchType;
	}
	
	@Getter
	@Setter
	public static class RequestList {
		
		@ApiParam(value = "sortType")
		private String sortType;
		
		@ApiParam(value ="offset", required = true)
		private int offset;
		
		@ApiParam(value="page", required = true)
		private int page;
	}
	
	@Getter
	@Setter
	@AllArgsConstructor
	public static class RequestOne {

	}
	
	@Getter
	@Setter
	public static class Response {
		
		private int listSize = 0;
		private List<Info> items;
	}
	
}