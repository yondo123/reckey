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
		private int price;
		private String[] switchType;
	}
	
	@Getter
	@Setter
	public static class RequestList {
		
		@ApiParam
		private String sortType;
		
		@ApiParam(required = true)
		private int offset;
		
		@ApiParam(required = true)
		private int page;
	}
	
	@Getter
	@Setter
	public static class RequestOne {
		@ApiParam(required = true)
		private String id;
	}
	
	@Getter
	@Setter
	public static class Response {
		
		private int listSize = 0;
		private List<Info> items;
	}
	
}
