package com.musicnetwork.Repositories;

import com.musicnetwork.Entities.SongComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SongCommentRepository extends JpaRepository<SongComment, Long> {
    @Query(value = "select * from comment where Id = :Id", nativeQuery = true)
    SongComment getSongCommentById(@Param("Id") Long Id);
}

