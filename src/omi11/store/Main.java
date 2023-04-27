package omi11.store;

import jdk.jshell.spi.ExecutionControlProvider;
import omi11.time.TimeSlot;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//
//        Address adress = new Address("Horogasse 5");
//        Person p1 = new Person("Luka", "Wagner");
//        System.out.println(p1);
//
//        Customer p2 = new Customer("Luka", "nachname", address, "3412425343", true);
//        Customer p3 = new Customer("Luka", "nachname", address, "3412425343", true);
//
////      System.out.println(p2 instanceof Customer ? (p2) : null);
//        System.out.println(p2);
//        System.out.println(p3);

        TimeSlot t = new TimeSlot("10:00-16:09");
        System.out.println("Shift t: " + t);

        Employee E = new Employee("Luka", "nichtWagner",1);
        System.out.println(E);
        E.setShift(t);
        System.out.println("E.shift: " + E.getShift());

        Cook cook = new Cook("Michaela", "Melcher",10.1f);
        System.out.println("Cook: " + cook);
        cook.setShift(t);
        System.out.println(cook.getShift());

        Driver driver = new Driver("Markus", "Melcher","KL123AE");
        System.out.println(driver);
        driver.setShift(t);
        System.out.println(driver.getShift());

/*
        String inputTime = "1a:00-16:09";
        String[] inputTimeStringArray = new String[inputTime.length()];

        // put inputTime character for character into a new StringArray(inputTimeStringArray)
        for (int i = 0; i <= inputTime.length() -1; i++) {
            inputTimeStringArray[i] = inputTime.substring(i,i+1);
        }

        // Define content of parameters for Constructor of TimeSpan wich builds TImeSpan Object based on Integer Inputs
        Integer fromHour   = Integer.parseInt (inputTimeStringArray[0] + inputTimeStringArray[1]);  //[hh]:mm-hh:mm
        Integer fromMinute = Integer.parseInt (inputTimeStringArray[3] + inputTimeStringArray[4]);  //hh:[mm]-hh:mm
        Integer toHour     = Integer.parseInt (inputTimeStringArray[6] + inputTimeStringArray[7]);  //hh:mm-[hh]:mm
        Integer toMinute   = Integer.parseInt (inputTimeStringArray[9] + inputTimeStringArray[10]); //hh:mm-hh:[mm]

        try {
             new TimeSlot(fromHour,fromMinute,toHour,toMinute);
        }
        catch (NumberFormatException e) {
            System.out.println("Something weht wrong passing the Arguments parsed from the inputString to the Constructor of TimeSpan\n" + e);
        }
        catch (Exception e) {
            System.out.println("Something went wrong passing the parsed Values from the inputstring to the Constructor of TimeSpan\n" + e);
        }

 */
    }
}
