package com.project.firstapp.services;

import com.project.firstapp.entities.Post;
import com.project.firstapp.repos.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    public PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> getAllPosts(Optional<Long> userId) {
        if (userId.isPresent())
            return postRepository.findByUserId(userId.get());
        return postRepository.findAll();
    }

    public Post getOnePostById(Long postId) {
        return postRepository.findById(postId).orElse(null);
    }
}
