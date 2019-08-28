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
    String card_number = "07302590";
    String type = "0";
    String session = "201601";
    List<ClassBean> timetable;
}
