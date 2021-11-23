package com.example.feign.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.feign.DTO.PostDTO;
import com.example.feign.client.PostClient;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("posts")
public class PostController {
  
  private PostClient postClient;
  
  @GetMapping
  public List<PostDTO> getAllPos(){
    return postClient.getAllPosts();
  }

}
