package main.logic;

import java.io.Serializable;

public class Train implements Serializable {
    private int id;
    private String pointOfDestination;
    private long trainNumber;
    private String departureTime;
    private int numberOfSeats;
    private String travelTime;
    public Train(int id,String pointOfDestination, long trainNumber,
                 String departureTime,int numberOfSeats, String travelTime){
        this.id=id;
        this.pointOfDestination=pointOfDestination;
        this.trainNumber=trainNumber;
        this.departureTime=departureTime;
        this.numberOfSeats=numberOfSeats;
        this.travelTime=travelTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPointOfDestination() {
        return pointOfDestination;
    }

    public void setPointOfDestination(String pointOfDestination) {
        this.pointOfDestination = pointOfDestination;
    }

    public long getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(long trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getTravelTime() {return travelTime;}

    public void setTravelTime(String travelTime) {this.travelTime = travelTime;}

    @Override
    public String toString() {
        return "Train{" +
                "id=" + id +
                ", pointOfDestination='" + pointOfDestination +
                ", trainNumber=" + trainNumber +
                ", departureTime=" + departureTime +
                ", numberOfSeats=" + numberOfSeats +
                ", travelTime=" + travelTime +
                '}';
    }
    public String toStringFile() {
        return  id +
                "," + pointOfDestination +
                "," + trainNumber +
                "," + departureTime +
                "," + numberOfSeats +
                "," + travelTime;
    }


}
