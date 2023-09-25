package com.nhnacademy.exercise.chapter8;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import com.nhnacademy.exercise.chapter7.Apartment;

public class Main {
    private static final String FILE_NAME = "apartment";

    public static void main(String[] args) throws IOException {
        Apartment apartment = new Apartment(18, "광주광역시 동구 필문대로 309");

        apartment.addResident("1");
        apartment.addResident("2");
        apartment.addResident("3");
        apartment.addResident("4");
        apartment.addResident("5");

        // System.out.println(apartment);

        // 문제 1
        saveToFile(apartment);

        // 문제 2
        System.out.println(readFromFile());
    }

    public static boolean saveToFile(Apartment apartment) throws IOException {

        try (FileWriter writer = new FileWriter(FILE_NAME + ".txt")) {
            writer.append(apartment.toString());

        } catch (FileNotFoundException e) {
            e.getMessage();
            return false;

        } catch (IOException e) {
            e.getMessage();
            return false;
        }

        return true;
    }

    public static Apartment readFromFile() throws IOException {
        Apartment result = null;

        try (FileInputStream stream = new FileInputStream(FILE_NAME + ".txt");
                BufferedReader reader = new BufferedReader(new InputStreamReader(stream))) {

            String address = "";
            int squareFootage = 0;
            String[] residents = null;
            int index = 0;

            String line = "";
            while ((line = reader.readLine()) != null) {
                String[] tmps = line.split(":");
                String category = tmps[0].trim();
                String element = tmps[1].trim();

                if (category.equals("주소")) {
                    address = element;
                } else if (category.equals("아파트 평수")) {
                    squareFootage = Integer.parseInt(element);
                } else if (category.equals("총 거주자")) {
                    residents = new String[Integer.parseInt(element)];
                } else {
                    residents[index++] = element;
                }
            }

            result = new Apartment(squareFootage, address);
            for (String resident : residents) {
                result.addResident(resident);
            }

        } catch (FileNotFoundException e) {
            e.getMessage();
            return null;
        }

        return result;
    }

    public static void writeToVideo(String fileName) throws IOException {
        // ???
    }
}