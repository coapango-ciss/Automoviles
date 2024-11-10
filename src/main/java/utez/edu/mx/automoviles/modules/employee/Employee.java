package utez.edu.mx.automoviles.modules.employee;

import jakarta.persistence.*;
import utez.edu.mx.automoviles.modules.rol.Rol;

@Entity
@Table(name = "employee")
public class Employee {
    /* Atributos */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "lastname")
    private String lastname;

    /* Relaciones */

    @ManyToOne
    @JoinColumn(name = "id_rol")
    private Rol rol;

    /* Contructores */
    public Employee() {}

    public Employee(String name, String surname, String lastname) {
        this.name = name;
        this.surname = surname;
        this.lastname = lastname;
    }

    public Employee(Long id, String name, String surname, String lastname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.lastname = lastname;
    }

    public Employee(String name, String surname, String lastname, Rol rol) {
        this.name = name;
        this.surname = surname;
        this.lastname = lastname;
        this.rol = rol;
    }

    public Employee(Long id, String name, String surname, String lastname, Rol rol) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.lastname = lastname;
        this.rol = rol;
    }

    /* Getters & Setters */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
