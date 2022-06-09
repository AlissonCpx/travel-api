package travelapi.travelapi.model;


import lombok.Data;

import javax.persistence.*;


@Data
@Entity
public class ClientModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

}
