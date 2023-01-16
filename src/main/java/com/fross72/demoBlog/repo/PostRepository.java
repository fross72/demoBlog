package com.fross72.demoBlog.repo;

import com.fross72.demoBlog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
