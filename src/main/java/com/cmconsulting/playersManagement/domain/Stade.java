package com.cmconsulting.playersManagement.domain;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "stade")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
public class Stade implements Serializable {

    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nom", nullable = false)
    private String nom;
}
