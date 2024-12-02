package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class DniEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long dniNumber;
    private String dniLetter;

    // Constructor vacío necesario para JPA
    public DniEntity() {
    }

    public DniEntity(Long dniNumber, String dniLetter) {
        this.dniNumber = dniNumber;
        this.dniLetter = dniLetter;
    }

    public Long getDniNumber() {
        return dniNumber;
    }

    public void setDniNumber(Long dniNumber) {
        this.dniNumber = dniNumber;
    }

    public String getDniLetter() {
        return dniLetter;
    }

    public void setDniLetter(String dniLetter) {
        this.dniLetter = dniLetter;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
