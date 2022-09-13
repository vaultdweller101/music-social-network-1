package com.musicnetwork.Services;

import com.musicnetwork.DTOs.CommentDTO;
import com.musicnetwork.Entities.Comment;
import com.musicnetwork.Interfaces.CommentInterface;
import com.musicnetwork.Repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class CommentService implements  CommentInterface{
    @Autowired
    CommentRepository commentRepository;

    @Override
    public Comment addComment(CommentDTO commentDTO) {
        Comment comment = new Comment();
        comment.setCommentId(commentDTO.getCommentId());
        comment.setCreatedAt(commentDTO.getCreatedAt());
        comment.setParentId((commentDTO.getParentId()));
        comment.setDownvote(commentDTO.getDownvote());
        comment.setUpvote(commentDTO.getUpvote());
        return commentRepository.save(comment);

    }
}
