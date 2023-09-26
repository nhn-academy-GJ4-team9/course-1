package com.introduction.unit7;

public class Apartment {
    private int size;
    private String adress;
    private String[] names;

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

}
