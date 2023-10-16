package com.springboot.blog.payloads;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
public class UserDto {
	
	private int id;
	private String name;
	private String email;
	private String password;
	private String about;

}
