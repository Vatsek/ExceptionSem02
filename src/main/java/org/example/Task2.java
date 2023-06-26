package org.example;
import java.io.*;

public class Task2 {
    public static void main(String[] args) {
        String[] strings = {"asdf", "asdf"};
        String strinqs1 = strings[1];
        try (InputStream inputStream = new FileInputStream("sdaf^dsaf")) {
            test();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Я жив!");
    }

    public static void test() throws IOException {
        File file = new File("l");
        file.createNewFile();
        FileReader reader = new FileReader(file);
        reader.read();
    }
}