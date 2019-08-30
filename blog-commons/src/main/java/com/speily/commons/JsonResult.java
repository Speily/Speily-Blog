package com.speily.commons;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @Auther: SPL
 * @Date: 11/23 0023 17:38
 * @Description: json结果类
 */
@Getter
@Setter
public class JsonResult implements Serializable {

    public JsonResult() {
    }

    public JsonResult(boolean success) {
        this.success = success;
        this.msg = "响应成功";
        this.obj = null;
        this.status = "200";
    }

    private boolean success;
    private String status;
    private String msg;
    private Object obj;
}
