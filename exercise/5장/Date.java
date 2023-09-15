package com.nhnacademy.exercise;

/*
 * 1. 반복되는 String Literals, 특히 Day를 Enum 으로 구현?
 * 2. Magic Number 사용자제
 * 3. 입력으로 올바르지 않은 범위의 값이 입력될 때, 예외처리 등 부족
 */

public class Date implements Comparable<Date> {
    public static void main(String[] args) {
        Date date = new Date(2023, 8, 15, "Wednsday");
        System.out.println(date.getNextDate());
    }

    private int year;
    private int month;
    private int date;
    private String day;

    private int[] datesOfMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public Date(int year, int month, int date, String day) {
        this.year = year;
        this.month = month;
        this.date = date;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDate() {
        return date;
    }

    public String getDay() {
        return day;
    }

    public void setDatesOfMonth(int[] datesOfMonth) {
        this.datesOfMonth = datesOfMonth;
    }

    public boolean isLeapyear() {
        int executedYear = this.getYear();
        return (executedYear % 4 == 0 || (executedYear % 100 != 0 && executedYear % 400 == 0));
    }

    public String getNextDay() {
        String nextDay = null;

        switch (getDay()) {
            case "Sunday":
                nextDay = "Monday";
                break;
            case "Monday":
                nextDay = "Tuesday";
                break;
            case "Tuesday":
                nextDay = "Wednsday";
                break;
            case "Wednsday":
                nextDay = "Thursday";
                break;
            case "Thursday":
                nextDay = "Friday";
                break;
            case "Friday":
                nextDay = "Saturday";
                break;
            case "Saturday":
                nextDay = "Sunday";
                break;
            default:
                break;
        }
        return nextDay;
    }

    public Date getNextDate() {
        int nextYear = getYear();
        int nextMonth = getMonth();
        int nextDate = getDate();

        datesOfMonth[1] = isLeapyear() ? 29 : 28;

        if (getDate() == datesOfMonth[getMonth() - 1]) {
            if (getMonth() == 12 && getDate() == datesOfMonth[11]) {
                nextYear += 1;
                nextMonth = 0;
            }
            nextMonth += 1;
            nextDate = 0;
        }
        nextDate += 1;
        return new Date(nextYear, nextMonth, nextDate, getNextDay());
    }

    @Override
    public String toString() {
        return getYear() + ". " + getMonth() + ". " + getDate() + ". " + getDay();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + year;
        result = prime * result + month;
        result = prime * result + date;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Date other = (Date) obj;
        return getYear() == other.getYear() && getMonth() == other.getMonth() && getDate() == other.getDate();
    }

    @Override
    public int compareTo(Date other) {
        if (this.getYear() == other.getYear()) {
            if (this.getMonth() == other.getMonth()) {
                return this.getDate() - other.getDate();
            } else {
                return this.getMonth() - other.getMonth();
            }
        } else {
            return this.getYear() - other.getYear();
        }
    }

}