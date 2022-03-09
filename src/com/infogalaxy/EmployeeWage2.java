package com.infogalaxy;

import java.util.Random;

public class EmployeeWage2 {
    public static void main(String[] args) {

        final int WAGE_PER_HR = 20;
        final int PART_TIME_HR = 4;
        final int FULL_TIME_HR = 8;
        Random random = new Random();
        //UC-3 Checking for Employee Calculation of Month
        for (int i = 1; i <= 20; i++) {
            int empWage = 0;
            System.out.println("Day=" +i);
            int empAttendance = random.nextInt() % 2;
            System.out.println(empAttendance);
            //UC-1 Checking for Employee Present or Absent
            if (empAttendance == 0) {
                System.out.println("Employee is Absent");
            } else {
                System.out.println("Employee is Present");
                int empType = random.nextInt() % 2;
                //UC-2 Checking for Employee is on Part time or Full time
                switch(empType) {
                    case 0:
                        System.out.println("Employee is on Part time");
                        empWage = WAGE_PER_HR * FULL_TIME_HR;
                        break;
                    case 1:
                        System.out.println("Employee is on Full Time");
                        empWage = WAGE_PER_HR * FULL_TIME_HR;
                        break;
                }
                }
                System.out.println("Total Wage=" + empWage);
            }
        }
    }