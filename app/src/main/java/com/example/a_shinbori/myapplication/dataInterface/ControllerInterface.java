package com.example.a_shinbori.myapplication.dataInterface;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by a_shinbori on 2017/06/08.
 */
public class ControllerInterface {
    public final static int RESULT_OK = 100;
    public final static int RESULT_OK_01 = 101;
    public final static int RESULT_OK_02 = 102;
    public final static int RESULT_NG = 200;
    public final static int RESULT_NG_01 = 201;
    public final static int RESULT_NG_02 = 202;
    public final static String DEFAULT_MESSAGE = "(message none)";

    private int result;
    private String Message;
    private Map data;

    public ControllerInterface() {
        Map map = new HashMap();
        setResult(RESULT_NG);
        setMessage(DEFAULT_MESSAGE);
        setData(map);
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public Map getData() {
        return data;
    }

    public void setData(Map data) {
        this.data = data;
    }
}
