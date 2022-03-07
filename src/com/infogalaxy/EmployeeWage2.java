package com.infogalaxy;

import java.util.Random;

public class EmployeeWage2 {
    public static void main(String[] args) {
        Random random = new Random();
        final int PART_TIME_HR = 4;
        final int FULL_TIME_HR = 8;
        int empWage = 0;
            int empAttendance = random.nextInt() % 2;
            if (empAttendance == 0) {
                System.out.println("Employee is Absent");
            } else {
                System.out.println("Emplyee is Present");
                int empType = random.nextInt() % 2;
                if(empAttendance == 0){
                    System.out.println("Employee is on Part time");
                    empWage = PART_TIME_HR * FULL_TIME_HR;
                } else {
                    System.out.println("Employee is on Full Time");
                    empWage = PART_TIME_HR * FULL_TIME_HR;
                }
                    System.out.println("Total Wage="+empWage);
                }
            }
    }
