package main.io;

import main.TrainRepositoryBinaryImpl;
import main.TrainRepositoryTextImpl;
import main.logic.Train;
import main.servise.TrainServise;

import java.util.*;

public class View {
    private final TrainServise trainService =  new TrainServise();
    public void menu(Train[] trains){
        int option=1;
        Scanner read=new Scanner(System.in);
        TrainRepositoryBinaryImpl trainRepositoryBinaryImpl=new TrainRepositoryBinaryImpl();
        TrainRepositoryTextImpl trainRepositoryTextImpl=new TrainRepositoryTextImpl();
        while (option != 0) {
            System.out.println(
                    """
                            1. Find train by point of destination
                            2. Find train by departure time
                            3. Find train by point of destination and number of seats
                            4. Read file text
                            5. Read file binary
                            6. Write in file text
                            7. Write in file binary
                            0. Exit"""
            );
            option=Integer.parseInt(read.nextLine());
            switch (option) {
                case 1:
                    System.out.println("Enter point of destination:");
                    String pod=read.nextLine();
                    Train[] task1 = trainService.findTrainByPointOfDestination(trains, pod);
                    for(Train train : task1){
                        System.out.println(train);
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Enter departure time:");
                    String dt=read.nextLine();
                    Train[] task2 = trainService.findTrainByDepartureTime(trains, dt);
                    for(Train train : task2){
                        System.out.println(train);
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Enter point of destination:");
                    String pofd=read.nextLine();
                    System.out.println("Enter number of seats:");
                    int nos=Integer.parseInt(read.nextLine());
                    Train[] task3 = trainService.findTrainByPointOfDestinationAndNumberOfSeats(trains, pofd, nos);
                    for(Train train : task3){
                        System.out.println(train);
                    }
                    break;
                case 4:
                    System.out.println("Enter filename to read:");
                    String readfileText=read.nextLine()+".txt";
                    Train[] trains1Text = trains;
                    Train[] trains2Text = trainRepositoryTextImpl.readArray(readfileText);
                    trains= new Train[trains.length+trains1Text.length];
                    System.arraycopy(trains1Text, 0, trains, 0, trains1Text.length);
                    System.arraycopy(trains2Text, 0, trains, trains1Text.length, trains.length - trains1Text.length);
                    break;
                case 5:
                    System.out.println("Enter filename to read:");
                    String readfile=read.nextLine()+".txt";
                    Train[] trains1Binary = trains;
                    Train[] trains2Binary = trainRepositoryBinaryImpl.readArray(readfile);
                    trains= new Train[trains.length+trains1Binary.length];
                    System.arraycopy(trains1Binary, 0, trains, 0, trains1Binary.length);
                    System.arraycopy(trains2Binary, 0, trains, trains1Binary.length, trains.length - trains1Binary.length);
                    break;
                case 6:
                    System.out.println("Enter filename to write:");
                    String writefileText=read.nextLine()+".txt";
                    trainRepositoryTextImpl.outputArray(trains, writefileText);
                    break;
                case 7:
                    System.out.println("Enter filename to write:");
                    String writefileBinary=read.nextLine()+".txt";
                    trainRepositoryBinaryImpl.outputArray(trains, writefileBinary);
                    break;

            }
        }
    }
}