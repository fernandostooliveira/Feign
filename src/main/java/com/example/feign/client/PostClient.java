package com.example.feign.client;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.feign.DTO.PostDTO;

@FeignClient(name = "post", url = "https://jsonplaceholder.typicode.com")
public interface PostClient {

  @GetMapping(value = "/posts")
  List<PostDTO> getAllPosts();
}
