public class Date {
    private int year;
    private int month;
    private int day;
    public Date(int month, int day, int year){
        if (year < 0){
            throw new IllegalArgumentException("year is to low");
        }
        if (0 > month || month > 12){
            throw new IllegalArgumentException("month is wrong");
        }
        this.month = month;
        int[] monLengths = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (day > monLengths[month-1] || day < 0){
            throw new IllegalArgumentException("day is wrong");
        }
        this.year = year;
        this.day = day;
    }
    public void setYear(int Year){
        this.year = Year;
    }
    public void setMonth(int Month){
        this.month = Month;
    }
    public void setDay(int Day){
        this.day = Day;
    }
    public int getYear(){
        return year;
    }
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }
    public String getBirthDate(){
        return month + "/" + day + "/" + year;
    }
}
