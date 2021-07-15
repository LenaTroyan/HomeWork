import java.util.concurrent.atomic.AtomicBoolean;

public class Unit1Task0 {
    public static void main (String[] args) {
        int day = 1;
        int month = 6;

        System.out.println("Арифметические операторы");
        System.out.println("month+day =" +(month + day));
        System.out.println("month/day =" +(month / day));
        System.out.println("month-day =" +(month - day));
        System.out.println("month%day =" +(month % day));
        System.out.println("month*day =" +(month * day));
        System.out.println("month-1 =" +(--month ));
        System.out.println("day+1 =" +(++day));
        System.out.println("month+=day =" +(month += day));
        System.out.println("month-=day =" +(month -= day));
        System.out.println("month*=day =" +(month *= day));
        System.out.println("month/=day =" +(month /= day));
        System.out.println("month%=day =" +(month %= day));



        System.out.println("Битовые операторы");
        System.out.println("month | day =" +(month | day));
        System.out.println("month |= day =" +(month |= day));
        System.out.println("month & day =" +(month & day));
        System.out.println("month ^ day =" +(month ^ day));
        System.out.println("month ^= day =" +(month ^= day));
        System.out.println("~day =" +(~day));
        System.out.println("month >> day = " +(month >> day));
        System.out.println("month >>= day = " +(month >>= day));
        System.out.println("month >>> day = " +(month >>> day));
        System.out.println("month >>>=day = " +(month >>>= day));
        System.out.println("month << day = " +(month << day));
        System.out.println("month <<= day = " +(month <<= day));

        System.out.println("Операторы сравнения");
        System.out.println("month < day =" +(month < day));
        System.out.println("month > day =" +(month > day));
        System.out.println("month > day =" +(month <= day));
        System.out.println("month > day =" +(month >= day));
        System.out.println("month == day =" +(month == day));
        System.out.println("month != day =" +(month != day));

        System.out.println("Логические операторы");
        boolean month1 = true;
        boolean day1 = false;
        System.out.println("month != day =" +(month1 || day1));
        System.out.println("month && day =" +(month1 && day1));
        System.out.println("!day ="+(!day1));







    }
}
