package com.musicnetwork.Interfaces;

import com.musicnetwork.DTOs.SongDTO;
import com.musicnetwork.Entities.Song;

public interface SongInterface {
    Song addSong(SongDTO songDTO);

}
