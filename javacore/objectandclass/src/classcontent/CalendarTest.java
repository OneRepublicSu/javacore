package classcontent;

import java.time.*;
//ctrl+alt+ l 自动整理代码格式

/**
 *日期生成
 */
public class CalendarTest {
    //    快捷键psvm

    /**
     * 入口函数
     */
    public static void main(String[] args) {
//        首先，获取当前日期，并将其转换为LocalDate类型。
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

//        获取当前日期的月份和天数。
        date = date.minusDays(today - 1);
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();

        System.out.println("MON TUE WED THU FRI SAT SUN");
        for (int i = 0; i < value; i++) {
            System.out.print("");
            while (date.getMonthValue() == month) {
//                格式化为3位十进制数,补0
                System.out.printf("%3d", date.getDayOfMonth());
                if (date.getDayOfMonth() == today)
                    System.out.print("*");
                else {
                    System.out.print(" ");
                }
                date = date.plusDays(1);
                if (date.getDayOfWeek().getValue() == 1) System.out.println();
            }
            if (date.getDayOfWeek().getValue() != 1) System.out.println();
        }


    }
}
