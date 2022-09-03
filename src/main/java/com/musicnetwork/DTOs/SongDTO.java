package com.musicnetwork.DTOs;

import java.util.Date;

//Insert some method here
public class SongDTO {
    private String songName;
    private String composer;
    private String singer;
    private String category;
    private Date uploadedAt;
    public SongDTO(){}

    public String getSongname(){return songName;}

    public void setSongname(String songName){this.songName = songName;}

    public String getComposer(){return composer;}

    public void setComposer(String composer){this.composer = composer;}

    public String getSinger(){return singer;}

    public void setSinger(String singer){this.singer = singer;}

    public String getCategory(){return category;}

    public void setCategory(String category){this.category = category;}

    public Date getUploadedAt(){return uploadedAt;}
}
