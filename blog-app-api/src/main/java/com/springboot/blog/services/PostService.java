package com.springboot.blog.services;

import java.util.List;

import com.springboot.blog.entities.Post;
import com.springboot.blog.payloads.PostDto;

public interface PostService {

	PostDto createPost(PostDto postDto,Integer userId,Integer categoryId);
	
	Post updatePost(PostDto postDto,Integer postId);
	
	void deletePost(Integer postId);
	
	//Get all posts
	List<PostDto> getAllPost();
	
	PostDto getPostById(Integer postId);
	
	//get all post by category
	List<PostDto> getPostsByCategory(Integer categoryId);
	
	//get all post by user
	List<PostDto> getPostsByUser(Integer userId);
	
	// search post
	List<Post> searchPosts(String keyword);
}
