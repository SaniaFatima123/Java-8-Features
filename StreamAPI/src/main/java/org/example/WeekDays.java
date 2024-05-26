package org.example;

import java.util.logging.Level;

public enum WeekDays {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}
class Days{
    public static void main(String[] args) {

        WeekDays data = WeekDays.FRIDAY;
        System.out.println(data);
        System.out.println("************************");

        //values() method in enum return arrays of all the enum constants
        for(WeekDays cons: WeekDays.values()){
            System.out.println(cons);
        }
    }
}
