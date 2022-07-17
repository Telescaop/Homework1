package Homework1;
//Lost虚拟类，作为CardLost和BookLost类的父类。
public abstract class Lost {
    //对象成员名字、时间、地址
    private String name;
    /*
    * 将时间设定为String是为了便于存储和输出
    * Date类我认为虽然计算方便，但是格式并不便于存储，所以我在排序时将String类转换为date类进行排序
    * */
    private String date;
    private String place;
    public abstract String getPlace();
    public abstract void setPlace(String place);
    public abstract String getName();
    public abstract void setName(String name);
    public abstract String getDate();
    public abstract void setDate(String date);
    public abstract String toString();
    public abstract boolean equals(Object o);
    public abstract int hashCode();
}
