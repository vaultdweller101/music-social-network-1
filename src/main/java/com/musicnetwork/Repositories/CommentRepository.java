package com.musicnetwork.Repositories;

import com.musicnetwork.Entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    @Query(value = "select * from comment where commentId = :commentId", nativeQuery = true)
    Comment getCommentByCommentId(@Param("commentId") Long commentId);
}

