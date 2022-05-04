import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class SwiftDate {
    private int year;
    private int month;
    private int day;
    private final LocalDate date;
    public SwiftDate(int year, int month, int day) {
        this.setYear(year);
        this.setMonth(month);
        this.setDay(day);
        date =  LocalDate.of(getYear(),getMonth(),getDay());
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public LocalDate getDate(){
        return this.date;
    }
    public boolean isLeapYear(){
        return this.date.isLeapYear();
    }
    public int getCentury(){
        int century;
        if (this.getYear() % 100 == 0) {
            century = this.getYear() / 100;
        } else {
            century = (this.getYear() / 100) + 1;
        }
        return century;
    }
    public int getDaysDifference(SwiftDate other){
        long daysBetween = DAYS.between(this.getDate(), other.getDate());
        int difference = (int)daysBetween;
        return Math.abs(difference) + 1;
    }
    public void printInfo(){
        System.out.print(this.getYear() + " "+ String.format("%02d", this.getMonth())+ " " + String.format("%02d", this.getDay()) +
                " - "+ this.getCentury() + " century.");
        if(this.isLeapYear()){
            System.out.print(" It is LEAP year.");
        }
        System.out.println();
    }
}
