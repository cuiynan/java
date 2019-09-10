package com.cc.utils;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.util.Date;

/**
 * @ClassName JsonYYYYMMDD
 * @Description 用于vo层的输入输出
 * @AUTHOR cuiyingnan
 * @DATE 2019/1/17 13:35
 **/
public class JsonYYYYMMDD  extends JsonSerializer<Date> {
    @Override
    public void serialize(Date date, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        SystemConstants.dateFormat.format(date);
    }
}
