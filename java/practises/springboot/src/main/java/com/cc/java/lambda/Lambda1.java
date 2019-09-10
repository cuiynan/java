package com.cc.java.lambda;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author : cuiyingnan
 * @date : 2019/7/1 16:28
 * @desc : 时隔2个多月，回头再看，还是不是理解很透彻
 * 故，继续多做几个示例加深理解。
 */
public class Lambda1 {

    private static List<Person> personList = Lists.newArrayList();

    static {
        personList.add(Person.builder().id(10).address("apple").address("shanghai").build());
        personList.add(Person.builder().id(12).address("apple").address("wuhan").build());
        personList.add(Person.builder().id(16).address("apple").address("nanjing").build());
    }

    public static void main(String[] args) {
        //分组
        Map<Integer, List<Person>> collect = personList.stream().collect(Collectors.groupingBy(c -> c.getId()));
//        Map<String, Integer> collect = personList.stream().collect(Collectors.groupingBy(Person::getName, Collectors.counting()));
//        System.out.println(collect);
    }

}
