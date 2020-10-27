package tt.response;

import lombok.Data;

import java.util.Date;

/**
 * @Description
 * @AUTHOR cuiyingnan
 * @DATE 2019/2/11 16:38
 **/
@Data
public class ApiResponse<T> {

    ResponseItem<T> response;

    /**
     * 请求成功
     */
    public static <T> ApiResponse success(T data) {
        return ApiResponse.success("请求成功", data, "0000");
    }

    public static <T> ApiResponse success(){
        return success(null);
    }

    /**
     * 请求成功
     */
    public static <T> ApiResponse success(String message, T data, String code) {
        return result(message, data, code);
    }

    /**
     * 请求失败
     */
    public static ApiResponse error() {
        return ApiResponse.failed("请求失败", "9999");
    }

    public static ApiResponse error(String message) {
        return result(message, null, "9999");
    }

    /**
     * 请求失败
     */
    public static ApiResponse failed(String message, String code) {
        return result(message, null, code);
    }

    public static <T> ApiResponse failed(String message, T data, String code) {
        return result(message, data, code);
    }

    private static <T> ApiResponse result(String message, T data, String code) {
        ApiResponse result = new ApiResponse();
        ResponseItem response = new ResponseItem<>();
        response.setCode(code);
        response.setDesc(message);
        response.setObj(data);
        response.setStamp(new Date());
        result.setResponse(response);
        return result;
    }
}
