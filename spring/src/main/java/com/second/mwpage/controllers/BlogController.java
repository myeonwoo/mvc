package com.second.mwpage.controllers;

import com.second.mwpage.entities.Post;
import com.second.mwpage.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class BlogController {

    @Autowired
    private PostRepository postRepository;

    @GetMapping(value="/posts")
    public List<Post> posts() {
        return postRepository.findAll();
    }

    @PostMapping(value="/post")
    public void publishPost(@RequestBody Post post) {
        if(post.getDateCreated() == null)
            post.setDateCreated(new Date());
        postRepository.save(post);
    }
}
