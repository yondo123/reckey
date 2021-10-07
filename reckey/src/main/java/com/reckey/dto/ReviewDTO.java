package com.reckey.dto;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class ReviewDTO {

	@Getter
	@Setter
	@AllArgsConstructor
	@NoArgsConstructor
	public static class Info{
		private int seq;
		private String userId;
		private String nickname;
		private String content;
		private String recordUrl;
		private int rate;
		private String createDate;
		private String updateDate;
	}
	
	@Getter
	@Setter
	public static class requestOne{
		private String keyboardId;
		private String userId;
		private String nickname;
		private String content;
		private String recordUrl;
		private int rate;
		private MultipartFile recordFile;
	}
}
