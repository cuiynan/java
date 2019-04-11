package com.erparking.entity;

import com.erparking.entity.ClassBean;
import lombok.Data;

import java.util.List;

/**
 * @Description
 * @AUTHOR cuiyingnan
 * @DATE 2019/4/11 18:59
 **/
@Data
public class ClassResult {
    String card_number;
    String type;
    String session;
    List<ClassBean> timetable;
}
