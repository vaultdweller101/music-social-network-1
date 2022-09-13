package com.musicnetwork.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "SongComment")
@Data
public class SongComment {
    private static final long serialVersionUID = -241L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Long Id;

    @ManyToOne
    @JoinColumn(name = "songId")
    private Song song;

    @ManyToOne
    @JoinColumn(name = "commentId")
    private Comment comment;
}
