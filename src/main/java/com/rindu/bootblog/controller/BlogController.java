package com.rindu.bootblog.controller;

import com.rindu.bootblog.model.Post;
import com.rindu.bootblog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BlogController {

    @Autowired
    private PostService postService;

    @GetMapping(value = "/post")
    public List<Post> getAllPosts() {
        return postService.getAllPosts();
    }

    @PostMapping(value = "/post")
    public void publishPost(@RequestBody Post post){
        postService.insert(post);
    }

}
