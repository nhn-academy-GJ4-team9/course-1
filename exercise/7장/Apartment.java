package com.nhnacademy.exercise.chapter7;

public class Apartment {
    private int squareFootage;
    private String address;
    private String[] residents;
    private int index;

    private static final int MAX_RESIDENT_NUM = 10;

    public Apartment(int squareFootage, String address) {
        this.squareFootage = squareFootage;
        this.address = address;
        this.residents = new String[MAX_RESIDENT_NUM];
        this.index = 0;

    }

    public int getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(int squareFootage) {
        this.squareFootage = squareFootage;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getResidentsNums() {
        return residents.length;
    }

    private int getIndex() {
        return this.index;
    }

    public void addResident(String name) {
        if (index >= MAX_RESIDENT_NUM) {
            // throw new ArrayIndexOutOfBoundsException("더 이상 입주 할 수 없습니다.");
            return;
        }

        this.residents[index++] = name;
    }

    public String get(int index) {
        String result = null;
        if (index < getIndex()) {
            result = this.residents[index];
        }

        return result;
    }

    public void remove(int index) {
        if (0 > index || index >= this.index) {
            // throw new IllegalArgumentException("해당 층에 거주하는 사람을 탐색할 수 없습니다.");
            return;
        }

        System.arraycopy(residents, index + 1, residents, index, this.index);
        this.index--;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("주소: " + this.getAddress() + "\n");
        builder.append("아파트 평수: " + this.getSquareFootage() + "\n");
        builder.append("총 거주자: " + this.index + "\n");
        builder.append("-------- 거주자 명단 --------" + "\n");
        for (int i = 0; i < this.index; i++) {
            builder.append("이름: " + this.get(i) + "\n");
        }

        return builder.toString();
    }
}
