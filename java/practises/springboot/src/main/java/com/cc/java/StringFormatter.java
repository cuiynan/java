package com.cc.java;

import java.util.Date;
import java.util.Locale;

/**
 * @author : cuiyingnan
 * @date : 2020/11/9 14:48
 * @desc :
 */
public class StringFormatter {


    public static void main(String[] args) {
        String str = null;
        str = String.format("Hi,%s", "王力");
        System.out.println(str);
        str = String.format("Hi,%s:%s.%s", "王南", "王力", "王张");
        //Hi,王南:王力.王张
        System.out.println(str);
        System.out.printf("字母a的大写是：%c %n", 'A');
        //字母a的大写是：A
        System.out.printf("3>7的结果是：%b %n", 3 > 7);
        //3>7的结果是：false
        System.out.printf("100的一半是：%d %n", 100 / 2);
        //100的一半是：50
        System.out.printf("100的16进制数是：%x %n", 100);
        //100的16进制数是：64
        System.out.printf("100的8进制数是：%o %n", 100);
        //100的8进制数是：144
        System.out.printf("50元的书打8.5折扣是：%f 元%n", 50 * 0.85);
        //50元的书打8.5折扣是：42.500000 元
        System.out.printf("上面价格的16进制数是：%a %n", 50 * 0.85);
        //上面价格的16进制数是：0x1.54p5
        System.out.printf("上面价格的指数表示：%e %n", 50 * 0.85);
        //上面价格的指数表示：4.250000e+01
        System.out.printf("上面价格的指数和浮点数结果的长度较短的是：%g %n", 50 * 0.85);
        //上面价格的指数和浮点数结果的长度较短的是：42.5000
        System.out.printf("上面的折扣是%d%% %n", 85);
        //上面的折扣是85%
        System.out.printf("字母A的散列码是：%h %n", 'A');
        //字母A的散列码是：41
        str = String.format("格式参数$的使用：%1$d,%2$s", 99, "abc");
        System.out.println(str);
        //格式参数$的使用：99,abc

        System.out.printf("显示正负数的符号：%+d与%d%n", 99, -99);
        //显示正负数的符号：+99与-99
        System.out.printf("最牛的编号是：%03d%n", 7);
        //最牛的编号是：007
        System.out.printf("Tab键的效果是：% 8d%n", 7);
        //Tab键的效果是：       7
        System.out.printf("整数分组的效果是：%,d%n", 9989997);
        //整数分组的效果是：9,989,997
        System.out.printf("一本书的价格是：% 50.5f元%n", 49.8);
        //一本书的价格是：                                          49.80000元
        Date date = new Date();
        System.out.printf("全部日期和时间信息：%tc%n", date);
        //全部日期和时间信息：星期一 十一月 09 17:04:48 CST 2020
        System.out.printf("年-月-日格式：%tF%n", date);
        //年-月-日格式：2020-11-09
        System.out.printf("月/日/年格式：%tD%n", date);
        System.out.printf("HH:MM:SS PM格式（12时制）：%tr%n", date);
        //HH:MM:SS PM格式（12时制）：05:04:48 下午
        System.out.printf("HH:MM:SS格式（24时制）：%tT%n", date);
        //HH:MM:SS格式（24时制）：17:04:48
        System.out.printf("HH:MM格式（24时制）：%tR", date);
        //HH:MM格式（24时制）：17:04
        System.out.printf("2位数字24时制的小时（不足2位前面补0）:%tH%n", date);
        //2位数字24时制的小时（不足2位前面补0）:17
        System.out.printf("2位数字12时制的小时（不足2位前面补0）:%tI%n", date);
        //2位数字12时制的小时（不足2位前面补0）:05
        //k的使用
        System.out.printf("2位数字24时制的小时（前面不补0）:%tk%n", date);
        //2位数字24时制的小时（前面不补0）:17
        //l的使用
        System.out.printf("2位数字12时制的小时（前面不补0）:%tl%n", date);
        //2位数字12时制的小时（前面不补0）:5
        //M的使用
        System.out.printf("2位数字的分钟（不足2位前面补0）:%tM%n", date);
        //2位数字的分钟（不足2位前面补0）:04
        //S的使用
        System.out.printf("2位数字的秒（不足2位前面补0）:%tS%n", date);
        //2位数字的秒（不足2位前面补0）:48
        //L的使用
        System.out.printf("3位数字的毫秒（不足3位前面补0）:%tL%n", date);
        //3位数字的毫秒（不足3位前面补0）:198
        System.out.printf("9位数字的毫秒数（不足9位前面补0）:%tN%n", date);
        //9位数字的毫秒数（不足9位前面补0）:198000000
        str = String.format(Locale.US, "小写字母的上午或下午标记(英)：%tp", date);
        System.out.println(str);
        //小写字母的上午或下午标记(英)：pm
        System.out.printf("小写字母的上午或下午标记（中）：%tp%n", date);
        //小写字母的上午或下午标记（中）：下午
        System.out.printf("相对于GMT的RFC822时区的偏移量:%tz%n", date);
        //相对于GMT的RFC822时区的偏移量:+0800
        System.out.printf("时区缩写字符串:%tZ%n", date);
        //时区缩写字符串:CST
        System.out.printf("1970-1-1 00:00:00 到现在所经过的秒数：%ts%n", date);
        //1970-1-1 00:00:00 到现在所经过的秒数：1604912688
        System.out.printf("1970-1-1 00:00:00 到现在所经过的毫秒数：%tQ%n", date);
        //1970-1-1 00:00:00 到现在所经过的毫秒数：1604912688198
    }
}
