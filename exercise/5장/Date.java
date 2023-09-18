package org.example;

import java.util.Objects;

public class Date {
    int day;
    int month;
    int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }


    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String yunyear() {

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return "윤년";
        } else {
            return "평년";
        }
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String directory(Date other) {
        String first = "";
        String second = "";

        first = String.valueOf(year) + String.valueOf(month) + String.valueOf(day);
        second = String.valueOf(other.getYear()) + String.valueOf(other.getMonth()) + String.valueOf(other.getDay());

        if (first.compareTo(second) < 0) {
            return "date1 이 더 앞";
        } else if (first.compareTo(second) == 0) {
            return "둘이 같음";

        } else {
            return "date2 가 더 앞";
        }


    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void addYear() {
        this.year += 1;
    }

    public void addDay() {
        this.day += 1;
    }

    public void nextDay() {
        if (this.getMonth() == 12) {
            if (this.getDay() == 31) {
                this.setDay(1);
                this.setMonth(1);
                this.addYear();
            } else {
                this.addDay();
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Date) {
            Date date1 = (Date) o;
            return this.day == date1.getDay() && this.year == date1.getYear() && this.month == date1.getMonth();
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }


    public static void main(String[] args) {
        Date date1 = new Date(31, 12, 2020);
        Date date2 = new Date(1, 1, 2021);

        System.out.println("date1의 날짜: " + date1.getDay());
        System.out.println("date1의 월: " + date1.getMonth());
        System.out.println("date1의 년도: " + date1.getYear());

        System.out.println("date1과 date2는 같은 날짜입니까? " + date1.equals(date2));
        System.out.println("date1이 date2보다 이전입니까? " + date1.directory(date2));

        System.out.println("date1의 년도는 윤년입니까? " + date1.yunyear());

        date1.nextDay();
        System.out.println("date1의 다음 날짜는 " + date1.getDay() + "/" + date1.getMonth() + "/" + date1.getYear());
    }
}
