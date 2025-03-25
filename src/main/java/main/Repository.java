package main;

import java.io.File;

public interface Repository<T> {
    void outputArray(T[] t, File file);
    void outputArray(T[] t, String fileName);
    T[] readArray(File file);
    T[] readArray(String fileName);
}
