package tt.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class ResponseItem<T> implements Serializable {
    @JsonProperty("obj")
    T obj;

    @JsonProperty("code")
    String code;

    @JsonProperty("desc")
    String desc;

    @JsonProperty("stamp")
    @JsonFormat(pattern = "yyyy-MM-dd hh:MM:ss", timezone = "GMT+8")
    Date stamp;
}
