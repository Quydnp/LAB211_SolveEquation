/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Common;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author HI
 */
public class Validation {
    
    Scanner sc = new Scanner(System.in);
    public int inputInt(String mess, int min, int max) {
        System.out.print(mess);
        while (true) {
            String input = sc.nextLine();
            try {
                int number = Integer.parseInt(input);
                if (number < min || number > max) {
                    System.out.print("Please input between " + min + ", " + max + ": ");
                    continue;
                }
                return number;
            } catch (Exception e) {
                System.out.print("Please input an integer number: ");
            }
        }
    }

    public double inputDouble(String mess, double min, double max) {
        System.out.print(mess);
        while (true) {
            String input = sc.nextLine();
            try {
                double number = Double.parseDouble(input);
                if (number < min || number > max) {
                    System.out.print("Please input between " + min + ", " + max + ": ");
                    continue;
                }
                return number;
            } catch (Exception e) {
                System.out.print("Please input an double number: ");
            }
        }
    }
    
    public float inputFloat(String mess) {
        System.out.print(mess);
        while (true) {
            String input = sc.nextLine();
            try {
                float number = Float.parseFloat(input);
                return number;
            } catch (Exception e) {
                System.out.print("Please input an float number: ");
            }
        }
    }
    
    public String inputString(String mess, String regex) {
        System.out.print(mess);
        while (true) {
            String input = sc.nextLine();
            if (!input.matches(regex)) {
                System.out.println("Please input matched with regex:" + regex);
                continue;
            }
            if (input.equals("")) {
                System.out.print("Please input a non-empty string: ");
                continue;
            }
            return input;
        }
    }

    public String inputDate(String mess) {
        System.out.print(mess);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        dateFormat.setLenient(false);
        while (true) {
            String input = sc.nextLine();
            try {
                Date date = dateFormat.parse(input);
                Date curDate = Calendar.getInstance().getTime();
                if (curDate.compareTo(date) < 0) {
                    System.out.print("Please input date that before current date: ");
                    continue;
                }
                dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
                return dateFormat.format(date);
            } catch (Exception e) {
                System.out.print("Please input valid date (dd-MM-yyyy): ");
            }
        }
    }

    public boolean checkInputYN() {
        while (true) {
            String result = sc.nextLine();
            if (result.equalsIgnoreCase("Y")) {
                return true;
            } else if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Please input y/Y or n/N.");
            System.out.print("Enter again: ");
        }
    }
    
    public boolean isOdd(float n) {
        if (n%2==1) return true;
        return false;
    }
    
    public boolean isEven(float n) {
        if (n%2==0) return true;
        return false;
    }
    
    public boolean isPerfectSquare(float n) {
        int a = (int) Math.sqrt(n);
        if (a*a == n) return true;
        return false;
    }
}
