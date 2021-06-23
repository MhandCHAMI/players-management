package com.cmconsulting.playersManagement.domain;

import com.cmconsulting.playersManagement.domain.enumeration.Post;
import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "player", indexes = @Index(name = "index_nom",columnList = "nom"))
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
public class Player implements Serializable {

    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nom", nullable = false)
    private String nom;

    @Column(name = "prenom", nullable = false)
    private String prenom;

    @Column(name = "numero", nullable = false)
    private int numero;

    @Column(name = "date_naissance", nullable = false)
    private Date dateNaissance;

    @Enumerated(EnumType.STRING)
    @Column(name = "post", nullable = false)
    private Post post;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="equipe_id", nullable=false)
    private Equipe equipe;
}
