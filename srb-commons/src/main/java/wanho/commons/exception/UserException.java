package wanho.commons.exception;

public class UserException extends RuntimeException {
    int code;  //异常编码

    public UserException(int code, String message) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
