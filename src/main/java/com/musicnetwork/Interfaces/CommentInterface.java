package com.musicnetwork.Interfaces;

import com.musicnetwork.DTOs.CommentDTO;
import com.musicnetwork.Entities.Comment;

public interface CommentInterface {
    Comment addComment(CommentDTO commentDTO);
}
