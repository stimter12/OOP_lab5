package main;

import main.factory.TrainFactory;
import main.logic.Train;

import java.io.*;

public class TrainRepositoryTextImpl implements TrainRepository {
    @Override
    public void outputArray(Train[] t, File file) {
        try(PrintWriter outputStream = new PrintWriter(file)) {
            outputStream.println(t.length);
            for (Train train : t) {
                outputStream.println(train.toStringFile());
            }
        } catch (IOException e) {
            System.err.println("File not found");
        }
    }

    @Override
    public void outputArray(Train[] t, String fileName) {
        File file = new File(fileName);
        outputArray(t, file);
    }

    @Override
    public Train[] readArray(File file) {
        Train[] trains = new Train[0];
        try (BufferedReader inputStream = new BufferedReader(new FileReader(file))) {
            int numberOfTrains = Integer.parseInt(inputStream.readLine());
            trains = new Train[numberOfTrains];
            for (int i = 0; i < numberOfTrains; i++) {
                String stringTrain = inputStream.readLine();
                String[] stringTrainArray = stringTrain.split(",");
                trains[i]=TrainFactory.createTrain(
                        Integer.parseInt(stringTrainArray[0]), stringTrainArray[1],
                        Integer.parseInt(stringTrainArray[2]), stringTrainArray[3],
                        Integer.parseInt(stringTrainArray[4]),stringTrainArray[5]);
            }
        } catch (IOException e) {
            System.err.println("File not found");
        }
        return trains;
    }

    @Override
    public Train[] readArray(String fileName) {
        File file = new File(fileName);
        return readArray(file);
    }
}
