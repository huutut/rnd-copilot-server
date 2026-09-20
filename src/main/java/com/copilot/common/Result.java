package com.copilot.common;

public class Result<T> {
    private Integer code;
    private Boolean success;
    private String message;
    private Long timestamp;
    private T data;

    public static <T> Result<T> success(T data) {
        Result<T> result = new Result<>();
        result.setCode(200);
        result.setSuccess(true);
        result.setMessage("请求成功");
        result.setTimestamp(System.currentTimeMillis());
        result.setData(data);
        return result;
    }

    public static <T> Result<T> error(Integer code, String message) {
        Result<T> result = new Result<>();
        result.setCode(code);
        result.setSuccess(false);
        result.setMessage(message);
        result.setTimestamp(System.currentTimeMillis());
        return result;
    }

    // 手动生成 Getter/Setter（防止 Maven 依赖没刷新完 Lombok 报错）
    public Integer getCode() { return code; }
    public void setCode(Integer code) { this.code = code; }
    public Boolean getSuccess() { return success; }
    public void setSuccess(Boolean success) { this.success = success; }
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
    public Long getTimestamp() { return timestamp; }
    public void setTimestamp(Long timestamp) { this.timestamp = timestamp; }
    public T getData() { return data; }
    public void setData(T data) { this.data = data; }
}