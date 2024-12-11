package model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "dinosaur")
public class Dinosaur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_period")
    private Period idPeriod;

    @Column(name = "height")
    private Integer height;

    @Column(name = "weight")
    private Integer weight;

    @Column(name = "length")
    private Integer length;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Period getIdPeriod() {
        return idPeriod;
    }

    public void setIdPeriod(Period idPeriod) {
        this.idPeriod = idPeriod;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Dinosaur{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", idPeriod=" + idPeriod +
                ", height=" + height +
                ", weight=" + weight +
                ", length=" + length +
                '}';
    }
}