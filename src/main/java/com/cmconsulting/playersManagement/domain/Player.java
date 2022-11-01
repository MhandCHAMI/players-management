package com.cmconsulting.playersManagement.domain;

import com.cmconsulting.playersManagement.domain.enumeration.Post;
import lombok.*;
import org.springframework.data.repository.cdi.Eager;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "player", indexes = @Index(name = "index_nom",columnList = "nom"))
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Player {

//    -


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Builder.Default
    private Long id = 20L;

    @Column(name = "nom", nullable = false)
    @Builder.Default
    private String nom="CHAMI";

    @Column(name = "prenom", nullable = false)
    @Builder.Default
    private String prenom="mhand";

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

//    @Column(name = "listString", nullable = false)
//    private List<String> stringList;

}
