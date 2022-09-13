package com.musicnetwork.DTOs;

import com.musicnetwork.Entities.Account;

import java.util.Date;

public class CommentDTO {
    private Long commentId;
    private Date createdAt;
    private Long parentId;
    private int upvote;
    private int downvote;
    private Account commenter;

    public CommentDTO(){}

    public void setCommentId(Long commentId) {this.commentId = commentId;}

    public Long getCommentId(){
        return commentId;
    }

    public void setCreatedAt(Date createdAt) { this.createdAt = createdAt;}

    public Date getCreatedAt(){
        return createdAt;
    }

    public void setParentId(Long parentId){this.parentId = parentId;}

    public Long getParentId(){return parentId;}

    public void setUpvote(int upvote) {this.upvote = upvote;}

    public int getUpvote(){
        return upvote;
    }

    public void setDownvote(int downvote){this.downvote = downvote;}

    public int getDownvote(){
        return downvote;
    }

    public Account getCommenter(Account commenter){
        return commenter;
    }

    public void setCommenter(){this.commenter = commenter;}
}
