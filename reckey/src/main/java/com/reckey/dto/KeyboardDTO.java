package com.reckey.dto;

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
		private String compImgUrl;
		private String kbdName;
		private String kbdType;
		private double kbdRate;
		private String kbdSwitch;
		private String kbdImgUrl;
	}
	
	@Getter
	@Setter
	public static class RequestList {
		
		@ApiParam(value = "sortMethod", required = true)
		private String sortMethod;
		
		@ApiParam(value ="pageNum", required = true)
		private int pageNum;
		
		@ApiParam(value="pagePerCnt", required = true)
		private int pagePerCnt;
	}
	
	@Getter
	@Setter
	@AllArgsConstructor
	public static class RequestOne {

	}
	
	@Getter
	@Setter
	public static class Response {
		
		private String compImgUrl;
		private String kbdName;
		private String kbdType;
		private double kbdRate;
		private String kbdSwitch;
		private String kbdImgUrl;
	}
	
}
