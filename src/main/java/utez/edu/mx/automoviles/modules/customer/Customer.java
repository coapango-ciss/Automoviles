package utez.edu.mx.automoviles.modules.customer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import utez.edu.mx.automoviles.modules.car.Car;
import utez.edu.mx.automoviles.modules.employee.Employee;

import java.util.List;

@Entity
@Table(name = "customer")
public class Customer {

    /* Atributos */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "telephone_number")
    private String telephoneNumber;

    /* Relaciones */
    @ManyToOne
    @JoinColumn(name = "id_employee")
    private Employee employee;

    @OneToMany(mappedBy = "customer")
    @JsonIgnore
    List<Car> cars;

    /* Constructores */

    public Customer() {}

    public Customer(String name, String surname, String lastname, String telephoneNumber) {
        this.name = name;
        this.surname = surname;
        this.lastname = lastname;
        this.telephoneNumber = telephoneNumber;
    }

    public Customer(long id, String name, String surname, String lastname, String telephoneNumber) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.lastname = lastname;
        this.telephoneNumber = telephoneNumber;
    }

    public Customer(String name, String surname, String lastname, String telephoneNumber, Employee employee, List<Car> cars) {
        this.name = name;
        this.surname = surname;
        this.lastname = lastname;
        this.telephoneNumber = telephoneNumber;
        this.employee = employee;
        this.cars = cars;
    }

    public Customer(long id, String name, String surname, String lastname, String telephoneNumber, Employee employee, List<Car> cars) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.lastname = lastname;
        this.telephoneNumber = telephoneNumber;
        this.employee = employee;
        this.cars = cars;
    }

    /* Getters & Setters */

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
