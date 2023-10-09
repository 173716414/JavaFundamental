package victor.day3;

import java.util.Calendar;

/**
 * @Author：Victor_htq
 * @Package：victor.day3
 * @Project：JavaFaundamental
 * @name：CalenderLearn
 * @Date：2023/10/9 15:29
 * @Filename：CalenderLearn
 */
public class CalenderLearn {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.DAY_OF_MONTH, 2);
        System.out.println(c.get(Calendar.DATE));
        c.add(Calendar.DATE, 30);
        System.out.println(c.get(Calendar.DATE));
    }
    Calendar c1 = Calendar.getInstance();
    // 获得年份
    int year = c1.get(Calendar.YEAR);
    // 获得月份
    int month = c1.get(Calendar.MONTH) + 1;
    // 获得日期
    int date = c1.get(Calendar.DATE);
    // 获得小时
    int hour = c1.get(Calendar.HOUR_OF_DAY);
    // 获得分钟
    int minute = c1.get(Calendar.MINUTE);
    // 获得秒
    int second = c1.get(Calendar.SECOND);
    // 获得星期几（注意（这个与Date类是不同的）：1 代表星期日、2 代表星期1、3 代表星期二，以此类推）
    int day = c1.get(Calendar.DAY_OF_WEEK);
}
