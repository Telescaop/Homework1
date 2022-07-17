package Homework1;
import java.util.Objects;
//BookLost类继承Lost类
public class BookLost extends Lost{
    //成员为书的名称，掉落时间以及掉落地点
    private String name;
    private String date;
    private String place;
    //以下为构造函数、get、set、toString、equals函数
    public BookLost(){
        this.name="";
        this.date="1950-10-17 00:00";
        this.place="重庆邮电大学";
    }
    public BookLost(String name,String date,String place){
        this.name=name;
        this.date=date;
        this.place=place;
    }
    @Override
    public String getPlace() {
        return place;
    }
    @Override
    public void setPlace(String place) {
        this.place = place;
    }
    @Override
    public String getDate() {
        return date;
    }
    @Override
    public void setDate(String date) {
        this.date = date;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "BookLost{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", place='" + place + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BookLost)) return false;
        BookLost bookLost = (BookLost) o;
        return Objects.equals(getName(), bookLost.getName()) &&
                Objects.equals(getDate(), bookLost.getDate());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getDate());
    }

}
