package com.musicnetwork.Controllers;

import com.musicnetwork.DTOs.CommentDTO;
import com.musicnetwork.Entities.Comment;
import com.musicnetwork.Interfaces.CommentInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    CommentInterface commentInterface;

    @PostMapping
    public ResponseEntity<Comment> addComment(@RequestBody CommentDTO commentDTO) {
        return new ResponseEntity<Comment>(commentInterface.addComment(commentDTO), HttpStatus.CREATED);
    }
}
