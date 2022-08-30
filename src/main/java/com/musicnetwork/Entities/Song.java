package com.musicnetwork.Entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Song")
@Data
public class Song {

    private static final long serialVersionUID = -1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "songId")
    private Long songId;

    @Column(name = "songName")
    private String songName;

    @Column(name = "composer")
    private String composer;

    @Column(name = "singer")
    private String singer;

    @Column(name = "category")
    private String category;

    @Column(name = "uploadedAt")
    private Date uploadedAt;

    @ManyToOne
    @JoinColumn(name = "uploadedBy")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Account uploadedBy;

    @OneToMany(mappedBy = "song")
    private List<SongComment> comments;

    @Column(name = "songData")
    private byte[] songData;
}
