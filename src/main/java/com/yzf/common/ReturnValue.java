package com.yzf.common;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ReturnValue {

    private Boolean success = Boolean.TRUE;
    private String errorMsg;
    private Map<String, Object> data = new HashMap<String, Object>();

    public static ReturnValue newInstance() {
        return new ReturnValue();
    }

    public Boolean getSuccess() {
        return success;
    }

    public Map<String, Object> getData() {
        return Collections.unmodifiableMap(data);
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void put(String key, Object value) {
        this.data.put(key, value);
    }

    public void putAll(Map<String, Object> map) {
        this.data.putAll(map);
    }

    public void fail() {
        this.success = Boolean.FALSE;
    }

    public void fail(String errorMsg) {
        this.success = Boolean.FALSE;
        this.errorMsg = errorMsg;
    }

}
