package main;

import main.logic.Train;

import java.io.*;

public class TrainRepositoryBinaryImpl implements TrainRepository {
    @Override
    public void outputArray(Train[] t, File file) {
        try(FileOutputStream outputFile = new FileOutputStream(file);
            ObjectOutputStream outputStream = new ObjectOutputStream(outputFile)) {
                outputStream.writeObject(t);
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
        Train[] trains = null;
        try {
            FileInputStream inputFile = new FileInputStream(file);
            ObjectInputStream inputStream = new ObjectInputStream(inputFile);
            trains = (Train[]) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
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
