public class Date {
    private int year;
    private int month;
    private int day;
    public Date(int month, int day, int year){ //add some checks
        this.year = year;
        this.month = month;
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
