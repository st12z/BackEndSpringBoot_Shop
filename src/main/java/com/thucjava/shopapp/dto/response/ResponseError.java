package com.thucjava.shopapp.dto.response;

import java.io.Serializable;

public class ResponseError extends ResponseData implements Serializable {
    public ResponseError(int status,String message) {
        super(status,message);
    }
}
