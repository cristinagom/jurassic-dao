package model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "paleontologists")
public class Paleontologist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "team")
    private Integer team;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_excavation")
    private Excavation excavation;

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

    public Integer getTeam() {
        return team;
    }

    public void setTeam(Integer team) {
        this.team = team;
    }

    public Excavation getExcavation() {
        return excavation;
    }

    public void setExcavation(Excavation excavation) {
        this.excavation = excavation;
    }

    @Override
    public String toString() {
        return "Paleontologist{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", team=" + team +
                ", excavation=" + excavation +
                '}';
    }
}