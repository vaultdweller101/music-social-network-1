package com.musicnetwork.Controllers;

import com.musicnetwork.DTOs.SongDTO;
import com.musicnetwork.Entities.Song;
import com.musicnetwork.Interfaces.SongInterface;
import com.musicnetwork.Repositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/song")
public class SongController {
    @Autowired
    SongInterface songInterface;
    SongRepository songRepository;

    @PostMapping
    public ResponseEntity<Song> add(@RequestBody SongDTO songDTO) {
        return new ResponseEntity<Song>(songInterface.addSong(songDTO), HttpStatus.CREATED);
    }

    // get list song and receive API from front end
    @GetMapping
    public Song get(@RequestParam String songName){
        return songRepository.getSongByName(songName);
    }
}
