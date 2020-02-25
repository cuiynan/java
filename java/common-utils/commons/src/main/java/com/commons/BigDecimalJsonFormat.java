package com.commons;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Objects;

/**
 * @author : cuiyingnan
 * @date : 2020/2/25 11:01
 * @desc :
 */
public class BigDecimalJsonFormat extends JsonSerializer<BigDecimal> {
    @Override
    public void serialize(BigDecimal value, JsonGenerator gen, SerializerProvider serializers) throws IOException, JsonProcessingException {
        if (Objects.isNull(value)) {
            gen.writeString("-");
        } else {
            // 这里取floor
            DecimalFormat df2 = new DecimalFormat("#,##0.00");
            gen.writeString(df2.format(value));
        }
    }
}
