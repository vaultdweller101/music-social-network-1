package com.musicnetwork.Repositories;

import com.musicnetwork.Entities.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepository extends JpaRepository<Song, Long> {
    @Query(value = "select * from song repo where id = :id", nativeQuery = true)
    Song getSongByID(@Param("id") Long id);

    @Query(value = "select * from song repo where songName like '%[songName]%'",
            nativeQuery = true)
    Song getSongByName(@Param("songName") String songName);
}
