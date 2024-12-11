package controller;

import java.util.List;

import model.dao.DinosaurDAO;
import model.entity.Dinosaur;
import view.DinosaurView;

public class DinosaurController {

    private DinosaurDAO dinosaurDAO;
    private DinosaurView dinosaurView;


    public DinosaurController() {
        dinosaurDAO = new DinosaurDAO();
        dinosaurView = new DinosaurView();
    }

    public void create(Dinosaur dinosaur) {

        dinosaurDAO.create(dinosaur);
    }

    public void update(Dinosaur dinosaur) {

        dinosaurDAO.update(dinosaur);
    }

    public void remove(Dinosaur dinosaur) {

        dinosaurDAO.delete(dinosaur);
    }

    public void viewAllDinosaurs() {

        List<Dinosaur> dinosaurs = dinosaurDAO.findAll();
        dinosaurView.viewAllDinosaurs(dinosaurs);
    }

    public void viewDinosaur(Dinosaur dinosaur) {

        dinosaurView.viewDinosaur(dinosaur);
    }
}