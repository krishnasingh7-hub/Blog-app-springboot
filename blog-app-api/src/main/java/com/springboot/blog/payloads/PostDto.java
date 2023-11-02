package com.springboot.blog.payloads;

import java.util.Date;

import com.springboot.blog.entities.Category;
import com.springboot.blog.entities.User;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostDto {

	private String title;
	
	private String content;
	
	private String imageName;
	
	private Date addedDate;
	
	private CategoryDto category;
	
	private UserDto user;
	
}
