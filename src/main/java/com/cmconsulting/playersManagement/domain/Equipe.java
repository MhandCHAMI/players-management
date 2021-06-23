package com.cmconsulting.playersManagement.domain;


import com.cmconsulting.playersManagement.domain.enumeration.Post;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "equipe")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
public class Equipe implements Serializable {

    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nom_complet", nullable = false)
    private String nomComplet;

    @Column(name = "surnom", nullable = true)
    private String surnom;

    @Column(name = "fondation", nullable = true)
    private Date fondtion;

    @Column(name = "stade", nullable = true)


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="stade_id", nullable=false)
    private Stade stade;

}
