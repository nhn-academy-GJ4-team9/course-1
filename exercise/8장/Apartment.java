package unit8;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;

public class Apartment {
    private int size;
    private String adress;
    private String[] names;

    public String[] getNames() {
        return names;
    }


    public Apartment(int size, String address) {
        this.size = size;
        this.adress = address;
        this.names = new String[10];

    }

    public int getSize() {
        return this.size;
    }

    public String getAdress() {
        return this.adress;
    }

    public int countNames() {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (names[i] != null) {
                count++;
            }
        }
        return count;
    }

    public void registName(String name) {
        for (int i = 0; i < 10; i++) {
            if (names[i] == null) {
                names[i] = name;
                break;
            }
        }

    }

    public String whoIs(int number) {
        String name = "";
        if (number < 0 || number > names.length || names[number] == null) {
            return null;
        } else {
            name += names[number];
        }
        return name;
    }

    public void removeName(int number) {
        if (number < 0 || number > names.length) {
            return;
        }
        if (names[number] != null)
            names[number] = null;
    }

    @Override
    public String toString() {
        String ris = "";
        ris += "Apartment:" + adress + "size: " + size;
        for (int i = 0; i < 10; i++) {
            if (names[i] != null) {
                ris += "\nnames " + i + ": " + names[i];
            }
        }
        return ris;

    }

    public static void saveToFile(String filename, Apartment apartment) throws IOException {
        FileWriter f = new FileWriter(filename);

        PrintWriter out = new PrintWriter(f);

        out.write(apartment.getAdress() + " " + apartment.getSize());
        for (int i = 0; i < apartment.countNames(); i++) {

            out.write(" " + apartment.whoIs(i));
        }

        out.close();
        f.close();

    }

    public static Apartment readFromFile(String filename) throws IOException {
        Apartment apartment;
        String str;
        String[] home;
        FileInputStream fis = new FileInputStream(filename);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        while ((str = br.readLine()) != null) {
            home = str.split(" ");
            apartment = new Apartment(Integer.parseInt(home[1]), home[0]);
            for (int i = 2; i < home.length; i++) {
                apartment.registName(home[i]);
            }
        }
        return apartment;
    }

    public static void client(String filename, Apartment apartment) {
        OutputStream os = System.out;
    }

    public static void main(String[] args) throws IOException {
        Apartment apartment = new Apartment(10, "home");
        apartment.registName("do");
        apartment.registName("di");
        apartment.registName("da");
        saveToFile("apartment.txt", apartment);
    }

}
