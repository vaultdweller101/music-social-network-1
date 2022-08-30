package com.musicnetwork.Entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Comment")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Comment {
    private static final long serialVersionUID = -2L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "commentId")
    private Long commentId;

    @Column(name = "createdAt")
    private Date createdAt;

    @Column(name = "parentId")
    private Long parentId;

    @Column(name = "upvote")
    private int upvote;

    @Column(name = "downvote")
    private int downvote;

    @ManyToOne()
    @JoinColumn(name = "commenter")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Account commenter;

    @OneToMany(mappedBy = "comment")
    private List<SongComment> comments;

}
