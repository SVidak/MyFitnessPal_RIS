package com.example.myfitnesspal_ris_backend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Recepies", schema = "MyfitnessPal_RIS")
public class Recepy {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "recepie_name", nullable = false)
    private String recepieName;

    @Lob
    @Column(name = "recepie_description")
    private String recepieDescription;

}