package cn.gov.customs.online.utils;

/**
 * 统一返回类
 */
public class RespUtil<T> {

    private String code;
    private String msg;
    private T data;

    public RespUtil() {
    }

    public RespUtil(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T>RespUtil<T> success(String code, String msg, T data) {
        return new RespUtil<>(code, msg, data);
    }

    public static <T>RespUtil<T> error(String code, String msg, T data) {
        return new RespUtil<>(code, msg, data);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
