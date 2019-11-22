package com.dates;

import org.springframework.util.StringUtils;

/**
 * @author : cuiyingnan
 * @date : 2019/7/19 15:53
 * @desc :
 */
public class DateUtils {

    /**
     * 输入1年返回365天
     */
    public static int getDayByYear(double year) {
        return year > 0 ? (int) (year * 365) : 0;
    }

    /**
     * 输入1月返回30天
     */
    public static int getDayByMonth(double month) {
        return month > 0 ? (int) (month * 30) : 0;
    }

    /**
     * 输入1周返回7天
     */
    public static int getDayByWeek(double week) {
        return week > 0 ? (int) (week * 7) : 0;
    }


    /**
     * 将含年、月的日期转为 以天为单位的数值
     *
     * @param unit
     * @param value
     * @return
     */
    public static double getDays(String unit, double value) {
        if (!StringUtils.isEmpty(unit)) {
            switch (unit) {
                case "年":
                    value = getDayByYear(value);
                    break;
                case "月":
                    value = getDayByMonth(value);
                    break;
                case "周":
                    value = getDayByWeek(value);
                    break;
            }
        }
        return value;
    }
}
