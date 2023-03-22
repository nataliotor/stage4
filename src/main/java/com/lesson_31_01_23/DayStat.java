package com.lesson_31_01_23;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DayStat { // статистика за день
    public LocalDate date;
    public LocalTime startTime;

    public LocalTime endTime;

    public DayStat(LocalDate date, LocalTime startTime, LocalTime endTime) {
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public DayStat(LocalDate date, LocalTime startTime) {
        this.date = date;
        this.startTime = startTime;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    //fixme - correct cont with test


    //    public int getActiveHours(){ // расчет активных часов в день
//        LocalTime data = LocalTime.now(ZoneId.from(date));
//        LocalTime fromWorks = LocalTime.now(ZoneId.from(startTime));  ///ZoneId — идентификатор часового пояса, например Европа/Берлин.
//
//        Duration countActiveHoursDay = Duration.between(data,fromWorks); //Duration представляет собой промежуток, основанный на времени (часы, минуты, секунды, наносекунды). Его можно создать либо напрямую, либо вывести в качестве разности между другими типами:
//
//        System.out.println(countActiveHoursDay);
//
//        return 0;
//    }
    public long getActiveHours(){ //расчет активных часов в день

        return startTime.until(endTime, ChronoUnit.HOURS);
    }


    public int getCountWeekend(LocalDate toWork, LocalDate fromWork) {  //Расчёт количества выходных между датами
        int weekdays = 0;
        if (toWork.equals(fromWork)) {
            return weekdays;
        }

        while (toWork.isBefore(fromWork)) {
            if (DayOfWeek.SATURDAY.equals(toWork.getDayOfWeek()) && DayOfWeek.MONDAY.equals(toWork.getDayOfWeek())) {
                weekdays++;
            }
            toWork = toWork.plusDays(1);
        }
        return weekdays;
    }

    @Override
    public String toString() {
        return "DayStat{" +
                "date=" + date +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }



    //    public int getSalaryMonth(){ // зарплата за месяц
//        int salaryHours = 30;
//        int salaryDay = salaryHours*8;
//
//        //return (31-DayStat.getCountWeekend(2023-01-01,2023-01-31))*salaryDay;
//
}

