package com.introduction.unit5.Ex5;

public class Date {
    private int year;
    private int month;
    private int day;
    private int totday;
    private int daysOfMonth;

    @Override
    public String toString() {
        return "Date [year=" + year + ", month=" + month + ", day=" + day + "]";
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

   
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.totday = year * 365 + month * daysOfMonth + day;
    }

    public int daysOfMonth(int month) {
        Date date;
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                daysOfMonth = 30;
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysOfMonth = 31;
                break;
            case 2:
                daysOfMonth = 28;
                break;
            default:
                daysOfMonth = 0;
                System.out.println("Invalid Month!");
        }
        
        return daysOfMonth;
    }

    public boolean isPrecedes(Date date) {
        return this.totday < date.totday;
    }    
   
    public boolean equalTo(Date date) {
        return this.year == date.year && this.month == date.month && this.day == date.day;
    }

    public boolean isLeap(Date date) {
        if (date.year % 4 == 0 && date.year % 100 != 0 || this.year % 400 == 0) {
            return true;
        } else {
            return false;
        }

    }
    
    public void nextDay() {
        
        System.out.println(this.year +" : " + this.month +" : " + (this.day += 1));      

    }

    

    
    
    
}
