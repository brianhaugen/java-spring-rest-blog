package com.pluralsight.blog.data;

import com.pluralsight.blog.model.Author;
import com.pluralsight.blog.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;



@Component
public abstract class PostRepository implements JpaRepository<Post, Long> {


    final PostRepository postRepository;

    @Autowired
    public PostRepository(PostRepository pr){
        this.postRepository = pr;
    }

    @RestResource(rel="contains-title", path="containsTitle")
    public List<Post> findByTitleContaining(String title) {
        return List<Post>;
    }
}

