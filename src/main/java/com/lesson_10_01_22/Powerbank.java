package com.lesson_10_01_22;

public class Powerbank {

    //min 3 fields  сила тока, емкость, размер
    // charge -> min, currency
    // turnOn
    //turnOf
    //checkStatus
    //offTimer

    public double current;
    public int capacity;
    public boolean status;
    public int chargeLevel;

    public Powerbank() {

    }

    public double getCharge(int minute, double current) {   /// зарядити пристрій (вхідний аргумент на скільки ти ставиш його на зарядку)
// якщо current від 1,3 заряд буде такий то
        //Количество заряда, прошедшее по участку цепи, пропорционально силе тока и времени прохождения заряда: q = I ⋅ t
        // якщо сила струма буде менше, зарфдити не зможемо девайс

        if (current == 2) {
            double charge = minute * current;
        } else if (current < 2) {
            System.out.println("Slow phone charging speed");
        }

        return current;
    }

    public double getOffTimer() {// таймер, чтобы поменять устройство в повербан
        double chargingTime = 0;
        chargingTime = (capacity / current) * 1.4;
        if (chargingTime == 4 && chargeLevel > 80) {
            System.out.println("timer");

        }


        return getOffTimer();
    }

    @Override
    public String toString() {
        return "Powerbank{" +
                "current=" + current +
                ", capacity=" + capacity +
                ", CheckStatus=" + status +
                ", chargeLevel=" + chargeLevel +
                '}';
    }

    public int toggle(int chargeLevel) { // якщо у Powerbank рівень заряду меньше 25%, його треба вімкнути
        if (chargeLevel < 25) {
            System.out.println("Charge your phone");
        } else {
            System.out.println("Turn off your phone");
        }
        return chargeLevel;
    }

    public boolean getStatus() { //метод, який показуэ наскыки він заряджений
        // время зарядки можно рассчитать - разделив его емкость на силу тока и умножить на коэфф диапазона 1,4 (среднее значение)
/// время зарядки = capacity/current*1,4

        double chargingTime = 0;
        chargingTime = (capacity / current) * 1.4;
        if (chargingTime == 4) {
            boolean isStatus =true;

        }
        return false;
    }
}
