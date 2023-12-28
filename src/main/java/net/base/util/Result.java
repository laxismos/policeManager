package net.base.util;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Result {
    private Object data;
    private boolean status;
    private String msg;
    
    public static Result Success(Object data){
        return new Result(data, true , "OK");
    }

    public static Result Failure(String errMsg){
        return new Result(null, false ,errMsg);
    }
    
}
