package wanho.commons.exception;

public class BusinessException extends UserException {
    public BusinessException(int code,String message) {
        super(code,message);
    }
}
