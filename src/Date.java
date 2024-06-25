import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Date implements Cloneable {

    private int year;
    private Month month;
    private int day;
    private DayOfWeek dayOfWeek;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = Month.of(month);
        this.day = day;
        this.dayOfWeek = LocalDate.of(year, month, day).getDayOfWeek();
    }

    public Date(String date) {
        LocalDate localDate = LocalDate.of(
                Integer.parseInt(date.substring(0,4)),
                Integer.parseInt(date.substring(4,6)),
                Integer.parseInt(date.substring(6,8))
        );
        this.year = localDate.getYear();
        this.month = localDate.getMonth();
        this.day = localDate.getDayOfMonth();
        this.dayOfWeek = localDate.getDayOfWeek();
    }

    public static Date today() {
        LocalDate localDate = LocalDate.now();
        return new Date(
                localDate.getYear(),
                localDate.getMonth().getValue(),
                localDate.getDayOfMonth());
    }

    public static Date yesterday() {
        LocalDate yesterday = LocalDate.now().minusDays(1);
        return new Date(
                yesterday.getYear(),
                yesterday.getMonth().getValue(),
                yesterday.getDayOfMonth());
    }

    public static Date tomorrow() {
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        return new Date(
                tomorrow.getYear(),
                tomorrow.getMonth().getValue(),
                tomorrow.getDayOfMonth()
        );
    }

    public static Date previousDate(int days) {
        LocalDate previousDate = LocalDate.now().minusDays(days);
        return new Date(
                previousDate.getYear(),
                previousDate.getMonth().getValue(),
                previousDate.getDayOfMonth());
    }

//    public static Date nextDate(Date date, int days) {
//        LocalDate nextDate = LocalDate.of(
//                date.getYear(),
//                date.getMonth().getValue(),
//                date.getDay()).plusDays(days);
//        return new Date(nextDate.getYear(), nextDate.getMonth().getValue(),
//                nextDate.getDayOfMonth());
//    }

    public boolean isGreaterThan(Date other) {
        boolean ret = false;
        if (this.year > other.year) ret = true;
        else if(this.year == other.year && this.month.compareTo(other.month) > 0) ret = true;
        else if(this.year == other.year && this.month == other.month && this.day > other.day) ret = true;
        return ret;
    }

    public boolean isLowerThan(Date other)
    {
        boolean ret = false;
        if (this.year < other.year)
        {
            ret = true;
        }
        else if (this.year == other.year && this.month.compareTo(other.month) < 0)
        {
            ret = true;
        }
        else if (this.year == other.year && this.month == other.month && this.day < other.day)
        {
            ret = true;
        }
        return ret;
    }

    @Override
    public boolean equals(Object obj) {
        boolean ret = false;
        if(obj instanceof  Date) {
            if(this.year == ((Date)obj).year && this.month == ((Date)obj).month && this.day == ((Date)obj).day) ret = true;
        }
        return  ret;
    }

    @Override
    public String toString() {
        int month = this.month.getValue();
        String stringMonth;
        if(month < 10) stringMonth = new String("0" + month);
        else stringMonth = Integer.toString(month);

        String stringDay;
        if(this.day < 10) stringDay = new String("0" + day);
        else stringDay = Integer.toString(this.day);

        return new String(this.year + "-" + stringMonth + "-" + stringDay + "-" + this.dayOfWeek);
    }

    @Override
    public Date clone() throws CloneNotSupportedException {
        return (Date)super.clone();
    }

    public int getYear() {return this.year;}
    public Month getMonth() {return this.month;}
    public int getDay() {return this.day;}
    public DayOfWeek getDayOfWeek() {return this.dayOfWeek;}



}
