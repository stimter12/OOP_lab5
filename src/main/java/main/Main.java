package main;

import main.factory.TrainFactory;
import main.io.View;
import main.logic.Train;

public class Main {
    private final View view = new View();

    public static void main(String[] args){
        new Main().run();
    }
    private void run(){
        Train[] trains= TrainFactory.createTrains();
        view.menu(trains);
    }
}