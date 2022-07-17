package Homework1;
import java.util.Objects;


//CardLost类继承Lost类
public class CardLost extends Lost{
    //成员为学生的名字，掉落时间，学生学号，以及掉落的地点（便于后续查找功能的实现）
private String name;
private String date;
private String StudentID;
private String place;
//以下为构造函数、get、set、toString、equals函数
    public CardLost(){
        this.name="";
        this.date="1950-10-17 00:00";
        this.StudentID="0000000000";
        this.place="重庆邮电大学";
    }
    public CardLost(String name,String date,String StudentID,String place) {
        this.name = name;
        this.date=date;
        this.StudentID=StudentID;
        this.place=place;
    }
    @Override
    public String getPlace() {
        return place;
    }
    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String studentID) {
        StudentID = studentID;
    }

    @Override
    public void setDate(String date) {
        this.date = date;
    }
    @Override
    public String getDate() {
        return date;
    }
    @Override
    public String toString() {
        return "CardLost{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", StudentID='" + StudentID + '\'' +
                ", place='" + place + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CardLost)) return false;
        CardLost cardLost = (CardLost) o;
        return getName().equals(cardLost.getName()) &&
                getDate().equals(cardLost.getDate()) &&
                getStudentID().equals(cardLost.getStudentID());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getDate(), getStudentID());
    }
}
