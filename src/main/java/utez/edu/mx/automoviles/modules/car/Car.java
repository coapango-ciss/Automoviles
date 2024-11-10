package utez.edu.mx.automoviles.modules.car;

import jakarta.persistence.*;
import utez.edu.mx.automoviles.modules.brand.Brand;
import utez.edu.mx.automoviles.modules.customer.Customer;
import utez.edu.mx.automoviles.modules.service.Service;

import java.util.List;

@Entity
@Table(name = "car")
public class Car {

    /* Atributos */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "model")
    private String model;

    @Column(name = "color")
    private String color;

    @Column(name = "register_date")
    private String registerDate;

    @Column(name = "price")
    private double price;

    /* Relaciones */
    @ManyToOne
    @JoinColumn(name = "id_brand")
    private Brand brand;

    @ManyToOne
    @JoinColumn(name = "id_customer")
    private Customer customer;

    @ManyToMany
    @JoinTable(
            name = "car_has_services",
            joinColumns = @JoinColumn(name = "id_car"),
            inverseJoinColumns = @JoinColumn(name = "id_service")
    )
    List<Service> services;

    /* Constructores */
    public Car() {}

    public Car(String model, String color, String registerDate, double price) {
        this.model = model;
        this.color = color;
        this.registerDate = registerDate;
        this.price = price;
    }

    public Car(long id, String model, String color, String registerDate, double price) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.registerDate = registerDate;
        this.price = price;
    }

    public Car(String model, String color, String registerDate, double price, Brand brand, Customer customer, List<Service> services) {
        this.model = model;
        this.color = color;
        this.registerDate = registerDate;
        this.price = price;
        this.brand = brand;
        this.customer = customer;
        this.services = services;
    }

    public Car(long id, String model, String color, String registerDate, double price, Brand brand, Customer customer, List<Service> services) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.registerDate = registerDate;
        this.price = price;
        this.brand = brand;
        this.customer = customer;
        this.services = services;
    }

    /* Getters & Setters */

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }
}
