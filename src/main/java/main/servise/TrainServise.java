package main.servise;

import main.logic.Train;

import java.util.*;

public class TrainServise {
    public Train[] findTrainByPointOfDestination(Train[] trains,String pointOfDestination){
        Train[] result = new Train[trains.length];
        int count = 0;
        for (Train train : trains) {
            if (train.getPointOfDestination().equals(pointOfDestination)) {
                result[count++] = train;
            }
        }
        return Arrays.copyOf(result, count);
    }
    public Train[] findTrainByDepartureTime(Train[] trains,String departureTime){
        Train[] result = new Train[trains.length];
        int count = 0;
        for (Train train : trains) {
            double temp1;
            if(train.getDepartureTime().length()==5){
                temp1=Double.parseDouble(train.getDepartureTime().substring(0,2))+
                        (double) Integer.parseInt(train.getDepartureTime().substring(3, 5)) /60;
            }else {
                temp1=Double.parseDouble(train.getDepartureTime().substring(0,1))+
                        (double) Integer.parseInt(train.getDepartureTime().substring(2, 4)) /60;
            }
            double temp2;
            if(departureTime.length()==5){
                temp2=Double.parseDouble(departureTime.substring(0,2))+
                        (double) Integer.parseInt(departureTime.substring(3, 5)) /60;
            }else {
                temp2=Double.parseDouble(departureTime.substring(0,1))+
                        (double) Integer.parseInt(departureTime.substring(2, 4)) /60;
            }
            if (temp1>temp2) {
                result[count++] = train;
            }
        }
        return Arrays.copyOf(result, count);
    }
    public Train[] findTrainByPointOfDestinationAndNumberOfSeats
            (Train[] trains,String pointOfDestination,int n){
        Train[] result = new Train[trains.length];
        int count = 0;
        for (Train train : trains) {
            if (train.getPointOfDestination().equals(pointOfDestination)
                    && train.getNumberOfSeats()>=n) {
                result[count++] = train;
            }
        }
        return Arrays.copyOf(result, count);
    }
}
