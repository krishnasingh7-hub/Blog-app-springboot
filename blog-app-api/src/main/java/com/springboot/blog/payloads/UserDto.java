package com.springboot.blog.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
public class UserDto {
	
	private int id;
	
	@NotEmpty
	@Size(min=4,message="Username must be of min 4 character")
	private String name;
	
	@Email(message = "Email Not valid")
	private String email;
	
	@NotEmpty
	@Size(min=3,max=10,message = "password length must be between 3 to 10 chracter")
	private String password;
	
	@NotEmpty
	private String about;

}
