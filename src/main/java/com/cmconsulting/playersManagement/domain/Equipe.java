package com.cmconsulting.playersManagement.domain;

import lombok.*;
import org.hibernate.envers.Audited;

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
@Audited(withModifiedFlag = true)
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


//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name="stade_id", nullable=false)
//    private Stade stade;

}
