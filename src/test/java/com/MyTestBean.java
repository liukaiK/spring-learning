package com;

public class MyTestBean {

    private String testStr = "testStr";

    private MyTestBean(String testStr) {
    }

    public MyTestBean(String name, String message) {
        System.out.println(name);
        System.out.println(message);
    }

    public String getTestStr() {
        return testStr;
    }

    public void setTestStr(String testStr) {
        this.testStr = testStr;
    }


}
