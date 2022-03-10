package com.infogalaxy;

import java.util.Random;

public class EmployeeWage2 {
    int working_day = 0;
    int working_hrs = 0;
    int empWage = 0;
    int totalWage = 0;
    Random random = new Random();

    public static void main(String[] args) {
        EmployeeWage2 E = new EmployeeWage2();
        E.getemp();
        E.showEmp();
    }

    void getemp() {
        //UC-3 Checking for Employee Calculation of Month
        while (working_hrs <= Constants.TOTAL_WORKING_HR && working_day < Constants.WORKING_DAY) {
            working_day++;
            System.out.println("Day=" + working_day);
            int empAttendance = random.nextInt() % 2;
            System.out.println(empAttendance);
            //UC-1 Checking for Employee Present or Absent
            if (empAttendance == Constants.IS_ABSENT) {
                System.out.println("Employee is Absent");
            } else {
                System.out.println("Employee is Present");
                int empType = random.nextInt() % 2;
                if (empType < 0) {
                    empType = -empType;
                }
                //UC-2 Checking for Employee is on Part time or Full time
                switch (empType) {
                    case Constants.IS_PART_TIME:
                        System.out.println("Employee is on Part time");
                        totalWage = totalWage + (Constants.WAGE_PER_HR * Constants.FULL_TIME_HR);
                        working_hrs = working_hrs + Constants.PART_TIME_HR;
                        break;
                    case Constants.IS_FULL_TIME:
                        System.out.println("Employee is on Full Time");
                        totalWage =  totalWage+(Constants.WAGE_PER_HR * Constants.FULL_TIME_HR);
                        working_hrs = working_hrs + Constants.FULL_TIME_HR;
                        break;
                }

            }
            }
        }
        void showEmp(){
            System.out.println("Wage=" + empWage);
            System.out.println("Total Wage="+totalWage);
            System.out.println("Working Day=" + working_day);
            System.out.println("Total Working Hours=" + working_hrs);
        }
        }


