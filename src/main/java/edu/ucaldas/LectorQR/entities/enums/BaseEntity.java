package edu.ucaldas.LectorQR.entities.enums;


import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@MappedSuperclass
@Data
public class BaseEntity {

    @Enumerated(EnumType.STRING)
    private EnumEstado estado;
}
