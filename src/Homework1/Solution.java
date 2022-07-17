package Homework1;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
/*
* 这个类用于提供排序方法和搜索功能
* */
public class Solution {
    public static void sortLost( Lost[] lostArray){
        ArrayList<String> timeList = new ArrayList<String>();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-M-dd HH:mm");
        ArrayList<Date> dateList = new ArrayList<Date>();
        for(int i=0;i<lostArray.length;i++){
            timeList.add(lostArray[i].getDate());
        }
//字符串转为时间，便于后续冒泡排序进行比较
        for (String str : timeList) {
            try {
                dateList.add(format.parse(str));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
//冒泡排序
        Date tempDate = null;
        for (int i = dateList.size()- 1; i > 0; --i) {
            for (int j = 0; j < i; ++j) {
              //按照从小到大的顺序
                if(dateList.get(j+1).after(dateList.get(j))){
                    tempDate = dateList.get(j);
                    dateList.set(j, dateList.get(j+1));
                    dateList.set(j+1, tempDate);
                }
            }
        }
        //对应dateList的成员顺序改变LostArray里的顺序，从而做到排序
        for(int i=0;i<dateList.size();i++){
            for(int j=0;j<lostArray.length;j++){
                if(lostArray[j].getDate().equals(format.format(dateList.get(i)))){
                    Lost temp;
                    temp=lostArray[i];
                    lostArray[i]=lostArray[j];
                    lostArray[j]=temp;
                    break;
                }
            }
        }
    }
    //搜索功能
    public static Lost selectByKeyword(Lost[] lostArray,String keyword){
        for(int i=0;i<lostArray.length;i++){
            if(lostArray[i].getPlace().equals(keyword)){
                return lostArray[i];
            }
        }
        return null;
    }
}
