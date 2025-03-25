package main.factory;

import main.logic.Train;

public class TrainFactory {
    public static Train createTrain(int id, String pointOfDestination, long trainNumber,
                                    String departureTime, int numberOfSeats, String travelTime){
        return new Train(id,pointOfDestination,trainNumber,departureTime,numberOfSeats,travelTime);
    }
    public static Train[] createTrains(){
        return new Train[] {
                new Train(1,"Kuiv",1004301,
                        "10:00",400,"2:00"),

                new Train(2,"Kherson",1004625,
                        "1:30",500,"1:30"),

                new Train(3,"Mykolaiv",1004260,
                        "18:30",350,"1:40"),

                new Train(4,"Mykolaiv",1005032,
                        "23:00",800,"0:50"),

                new Train(5,"Kherson",1004188,
                        "11:30",300,"2:25"),

                new Train(6,"Lviv",1004368,
                        "14:20",400,"7:40"),

                new Train(7,"Kharkiv",1005143,
                        "4:30",950,"5:10"),

                new Train(8,"Mykolaiv",1005042,
                        "21:15",800,"0:50"),

                new Train(9,"Kherson",1004788,
                        "13:20",600,"2:40"),

                new Train(10,"Lviv",1004374,
                        "15:20",400,"5:20"),

                new Train(11,"Kharkiv",1005443,
                        "7:30",1100,"6:30")
        };
    }
}
