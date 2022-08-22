package com.musicnetwork.Entities;

import com.musicnetwork.Enum.Role;
import lombok.*;

import javax.persistence.*;

import java.util.List;

@Entity
@Data
@Table(name = "Account")
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    @Id
    @Column(name = "username", unique = true)
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "role")
    private Role role;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "uploadedBy", cascade = CascadeType.ALL)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<Song> uploadedSongs;

    @OneToMany(mappedBy = "commentId", cascade = CascadeType.ALL)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<Comment> comments;
}
