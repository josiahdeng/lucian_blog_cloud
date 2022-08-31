package com.lucian.api.backend.controller;

import com.lucian.api.backend.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author denglingxiang
 * @date 2022/08/27 11:47
 **/
@RestController
public class PostController {
    PostService postService;

    @Autowired
    public void setPostService(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("posts")
    public String index(){
        return postService.index();
    }
}
