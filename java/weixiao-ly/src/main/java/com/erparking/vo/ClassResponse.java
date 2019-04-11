package com.erparking.vo;

import lombok.Data;

import java.util.List;

/**
 * @Description
 * @AUTHOR cuiyingnan
 * @DATE 2019/4/11 18:59
 **/
@Data
public class ClassResponse {
    String card_number;
    String type;
    String session;
    List<ClassBean> timetable;
}
