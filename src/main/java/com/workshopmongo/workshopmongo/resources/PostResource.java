package com.workshopmongo.workshopmongo.resources;

import com.workshopmongo.workshopmongo.domain.Post;
import com.workshopmongo.workshopmongo.domain.User;
import com.workshopmongo.workshopmongo.dto.UserDTO;
import com.workshopmongo.workshopmongo.services.PostService;
import com.workshopmongo.workshopmongo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/posts")
public class PostResource {

    @Autowired
    private PostService service;

    @RequestMapping(value = "/{id}", method=RequestMethod.GET)
    public ResponseEntity<Post> findById(@PathVariable String id){

        Post obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
