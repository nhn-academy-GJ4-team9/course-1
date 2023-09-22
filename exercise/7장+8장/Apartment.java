package org.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Apartment {
    private int size;
    private String address;
    private ArrayList<String> resident;

    public Apartment(int size, String address) {
        if (isValid(size, address)) {
            this.size = size;
            this.address = address;
            this.resident = new ArrayList<>(10);
        } else {
            throw new IllegalArgumentException("에러");
        }
    }


    private boolean isValid(int size, String address) {
        if (size <= 0) {
            return false;
        }
        if (address.length() <= 0) {
            return false;
        }
        return true;
    }

    public int getSize() {
        return size;
    }

    public String getAddress() {
        return address;
    }

    public String getResident() {
        return this.resident.toString();
    }

    public int getResidentSize() {
        return resident.size();
    }

    public void addPerson(String name) {
        if (this.getResidentSize() < 10) {
            this.resident.add(name);
        }
    }

    public String getPerson(int num) {
        if (num >= 0 && num < this.getResidentSize()) {
            return this.resident.get(num);
        } else {
            return null;
        }
    }

    public void removePerson(int num) {
        if (num >= 0 && num < this.getResidentSize()) {
            this.resident.remove(num);
        }
    }

    public String toString() {
        return "평수: " + getSize() + "\n살고있는 사람: " + getResident() + "\n살고있는 사람 수: " + getResidentSize() + "\n주소:" +
                getAddress();
    }

    public void saveToFile(String filename) throws IOException {
        BufferedWriter br = new BufferedWriter(new FileWriter(filename, true));
        br.write(this.getSize() + " " + this.getAddress());
        for (int i = 0; i < this.getResidentSize(); i++) {
            br.write(" " + resident.get(i));

        }

        br.newLine();
        br.close();

    }

    public static Apartment readFromFile(BufferedReader br) throws IOException {
        String line = br.readLine();

        if (line == null) {
            return null;
        }
        String split[] = line.split(" ");

        Apartment a = new Apartment(Integer.parseInt(split[0]), split[1]);

        for (int i = 2; i < split.length; i++) {
            a.addPerson(split[i]);
        }
        return a;
    }


    public static void printApartmentsFromFile(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        Apartment a;
        while ((a = readFromFile(br)) != null) {
            System.out.println(a);
        }


    }


    public static void main(String[] args) throws IOException {


        Apartment a = new Apartment(100, "광주");
        a.addPerson("gichang");
        a.addPerson("jiwon");

        a.saveToFile("test.txt");

        BufferedReader br = new BufferedReader(new FileReader("test.txt"));

        Apartment b = readFromFile(br);

        b.saveToFile("test.txt");

        printApartmentsFromFile("test.txt");


    }
}
