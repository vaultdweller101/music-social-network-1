package com.musicnetwork.Services;

import com.musicnetwork.DTOs.SongDTO;
import com.musicnetwork.Entities.Song;
import com.musicnetwork.Interfaces.SongInterface;
import com.musicnetwork.Repositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class SongService implements SongInterface {
    @Autowired
    SongRepository songRepository;

    @Override
    public Song addSong(SongDTO songDTO) {
        Song song = new Song();
        song.setSongName(songDTO.getSongName());
        song.setSongId(songDTO.getSongId());
        song.setComposer(songDTO.getComposer());
        song.setSinger(songDTO.getSinger());
        song.setCategory(songDTO.getCategory());
        song.setUploadedAt(songDTO.getUploadedAt());
        return songRepository.save(song);
    }
}
