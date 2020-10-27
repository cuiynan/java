/*
 * Copyright (c) 2015-2025 by HRT All rights reserved
 */
package tt.response;

public enum ResponseCode {

    // *******************************************************
    SUCCESS("200", "成功"),
    ERROR("501", "系统错误"),
    NO_REPORT("502", "不存在此报告"),
    ;

    private final String code;

    private final String msg;

    ResponseCode(final String code, final String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

}


