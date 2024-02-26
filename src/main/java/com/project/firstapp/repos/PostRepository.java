package com.project.firstapp.repos;

import com.project.firstapp.entities.Post;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

}
