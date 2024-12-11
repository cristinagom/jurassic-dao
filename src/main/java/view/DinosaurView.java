package view;

import model.entity.Dinosaur;

import java.util.List;

public class DinosaurView {
    public void viewDinosaur(Dinosaur d) {
        System.out.println("Dinosaur data: " +d);
    }

    public void viewAllDinosaurs(List<Dinosaur> dinosaurs) {

        for (Dinosaur d : dinosaurs) {
            System.out.println("Dinosaur data: "+ d);
        }
    }
}
