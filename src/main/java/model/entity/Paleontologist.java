package entity;

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
    private Excavation idExcavation;

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

    public Excavation getIdExcavation() {
        return idExcavation;
    }

    public void setIdExcavation(Excavation idExcavation) {
        this.idExcavation = idExcavation;
    }

}