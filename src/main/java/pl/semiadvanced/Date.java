package pl.semiadvanced;

/**
 * Created by RENT on 2017-01-03.
 */
public class Date {
    public int year;
    public int month;
    public int day;


    public Date(int year, int month, int day) {
        // throw new IllegalArgumentException("Liczba dni nie może być ujemna");
        setYear(year);
        setMonth(month);
        setDay(day);
        //this.year = year;
//        this.month = month;
//        this.day = day;
    }

    public void addYear() {
        //        year++;       konstrukcje tożsame
        //        year=year+1;
        year += 1;
    }

    public void addYears(int x) {
        if (x >= 0) {
            year += x;
        }
    }

    public void addMonths(int x) {
        if (x > 0) {
            month += x;
            if (month > 12) {

                if (month % 12 != 0) {
                    year = year + month / 12;
                    month = month % 12;
                } else {
                    year = year + month / 12 - 1;
                    month = 12;
                }
            }
            //a sprytniej trzeba było tak:
            // WARIANT 1
//            while (month > MAX_MONTHS) {
//                month -= MAX_MONTHS;
//                year++;
//            }

            // WARIANT 2
//            if (month > MAX_MONTHS) {
//                int yearsExceeded = (month - 1) / MAX_MONTHS;
//                year += yearsExceeded;
//                month = month - yearsExceeded * MAX_MONTHS;
//            }
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 0) {
            throw new IllegalArgumentException("Ujemny rok!");
        }
        this.year = year;

    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Liczba miesięcy musi być w zakresie 1 do 12");
        } else {
            this.month = month;
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
