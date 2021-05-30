package org.zerock.guestbook.artist.domain;


import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.zerock.guestbook.guestbook.domain.BaseEntity;

import javax.persistence.*;


@EntityListeners(value = {AuditingEntityListener.class})
@Entity
@Table(name = "artists")
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "roles")
public class Artist extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "artist_id")
    private long artistId;
    //, unique = true , nullable = false
    @Column(name = "username")
    private String username;

    //, columnDefinition="Number(10) default '12345678'"

    @Column(name = "password")
    private String password;

//    @Embedded
    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "address")
    private String address;

    @Column(name = "school")
    private String school;

    @Column(name = "department")
    private String department;



}
