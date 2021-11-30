package wanho.commons.controller;

import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;
import wanho.commons.exception.BusinessException;
import wanho.commons.exception.UserException;
import wanho.commons.result.AjaxResult;

@RestControllerAdvice
public class ExceptionHandlerController {

    @ExceptionHandler(value = RuntimeException.class)
    public AjaxResult handlerException(RuntimeException ex) {
        return AjaxResult.fail(-1, ex.getMessage());
    }

    //用来处理特殊的自定义异常
    @ExceptionHandler(value = {UserException.class})
    public AjaxResult handlerUserException(UserException ex) {
        if (ex instanceof  BusinessException) {
            System.out.println("特殊处理");
        }
        return AjaxResult.fail(ex.getCode(), ex.getMessage());
    }

    @ExceptionHandler(value = {
            NoHandlerFoundException.class,
            HttpRequestMethodNotSupportedException.class,
            MissingPathVariableException.class

    })
    public AjaxResult handlerServletException(Exception ex) {
        return AjaxResult.fail(-2, ex.getMessage());
    }


}
