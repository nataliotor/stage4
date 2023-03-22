package com.lesson_31_01_23;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Employee {
    private String name;
    private int salary;
    private boolean isFullTimeEmployment;
    public String specialty;
    private int experience;
    private ArrayList<DayStat> dayStats;

    public Employee(String name, int salary, boolean isFullTimeEmployment, String specialty, int experience) {
        this.name = name;
        this.salary = salary;
        this.isFullTimeEmployment = isFullTimeEmployment;
        this.specialty = specialty;
        this.experience = experience;
        this.dayStats = new ArrayList<>();
    }

    public void addDayStat(DayStat someDayStat) {
        dayStats.add(someDayStat);

    }

    public void startWorkSession() { // почати нову сесію
        DayStat some = new DayStat(LocalDate.now(), LocalTime.now());
        dayStats.add(some); // зберіжи всі some в dayStats

    }

    public void finishWorkSession() {
        if (!dayStats.isEmpty()) {   /// перевіряємо чи е це май масив не пустим, ! - інверсія умов( не пустий)
            int lastIndex = dayStats.size() - 1;   // дай мені останній елемент (індекс останнього елемента)
            DayStat current = dayStats.get(lastIndex); // дай нам з dayStats останній елемент
            current.setEndTime(LocalTime.now()); // встанови ендтайм (встанови кінець сесія)
        }

    }

    public int countDayStat() { // порахуй всі DayStat за робочу сесію
        int count = 0;
        try {
            for (DayStat some : dayStats) {
                count += some.getActiveHours();
            }
        }catch (NullPointerException exception){
            throw new NullPointerException("0");

        }
        return count;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean isFullTimeEmployment() {
        return isFullTimeEmployment;
    }

    public void setFullTimeEmployment(boolean fullTimeEmployment) {
        isFullTimeEmployment = fullTimeEmployment;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", isFullTimeEmployment=" + isFullTimeEmployment +
                ", specialty='" + specialty + '\'' +
                ", experience=" + experience +
                '}';
    }

    public int getSalaryMonth() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");


        int salaryDay = salary * 8;


        LocalDate startDay = LocalDate.parse("1.01.2022", formatter);
        LocalDate endDay = LocalDate.parse("31.12.2022", formatter);

        int days = Period.between(startDay, endDay).getDays(); //  расчет количества месяцев и дней

        int salaryMonth = 0;
        for (DayStat some : dayStats) {
            /// DayStat.getCountActiveHoursDay.
            salaryMonth = (days - some.getCountWeekend(startDay, endDay) * salaryDay);


        }


        return salaryMonth;
    }

    public static void main(String[] args) {


        Employee one = new Employee("Sasha", 45, true, "IT engineer", 5);
        Employee two = new Employee("Vasya", 20, true, "HR manager", 2);

        System.out.println(one);
        System.out.println(two);
        System.out.println("_____________________________________________________________________________________");


        DayStat dayStat = new DayStat(LocalDate.now(), LocalTime.now());
        System.out.println(dayStat);
        System.out.println("______________________________________________________________________________________");

        one.addDayStat(dayStat);
        two.addDayStat(dayStat);

        one.countDayStat();
        one.startWorkSession();
        one.finishWorkSession();
        one.getSalaryMonth();


        two.countDayStat();
        two.startWorkSession();
        two.finishWorkSession();
        two.getSalaryMonth();


    }
}


