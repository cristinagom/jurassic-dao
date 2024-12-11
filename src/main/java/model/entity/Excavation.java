package model.entity;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "excavation")
public class Excavation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @OneToMany(mappedBy = "excavation")
    private List<Paleontologist> lpaleontologist;


    public Excavation() {
        this.lpaleontologist = new ArrayList<>();
    }

    public Excavation(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.lpaleontologist = new ArrayList<>();
    }

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

    public List<Paleontologist> getLpaleontologit() {
        return lpaleontologist;
    }
    public void addPaleontologits(Paleontologist p){
        lpaleontologist.add(p);
        p.setExcavation(this);
    }
    public void remPaleontologist(Paleontologist p){
        List<Paleontologist> lp2 = new ArrayList<>();
        for(Paleontologist p1 : lpaleontologist){
            if (!Objects.equals(p1.getId(), p.getId())){
                lp2.add(p1);
            }
        }
        lpaleontologist = lp2;
        p.setExcavation(null);
    }

    @Override
    public String toString() {
        return "Excavation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lpaleontologist=" + lpaleontologist +
                '}';
    }
}