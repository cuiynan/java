package com.commons;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Objects;

/**
 * @author : cuiyingnan
 * @date : 2020/2/25 11:02
 * @desc : 在springboot项目中使用，如  vo层
 * UserVo中,使用解码或者编码
 * @JsonSerialize(Using=JsonDeserialize.class)
 * @JsonDeserialize(Using=BigDecimalDeJsonFormat.class) private BigDecimal money;
 */
public class BigDecimalDeJsonFormat extends JsonDeserializer<BigDecimal> {

    @Override
    public BigDecimal deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        if (Objects.isNull(jsonParser.getDecimalValue())) {
            return null;
        }
        DecimalFormat df2 = new DecimalFormat("###0.00");
        return new BigDecimal(df2.format(jsonParser));
    }
}
