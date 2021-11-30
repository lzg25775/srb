package wanho.commons.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AjaxResult {
    int code;
    String message;
    Object data;

    public static  AjaxResult ok(String message){
        return new AjaxResult(0,message,null);
    }

    public static  AjaxResult ok(String message,Object data){
       return new AjaxResult(0,message,data);
    }

    public static  AjaxResult fail(int code,String message){
        return new AjaxResult(code,message,null);
    }
}
