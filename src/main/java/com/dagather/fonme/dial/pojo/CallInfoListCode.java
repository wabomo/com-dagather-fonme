package com.dagather.fonme.dial.pojo;

import java.io.Serializable;
import java.util.List;

public class CallInfoListCode<T> implements Serializable {

    private Integer code;
    private String msg;
    private Integer toalrows;
    private Integer allPage;
    private Integer pageId;
    private List<T> data;

    public CallInfoListCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public CallInfoListCode(Integer code, String msg, List<T> data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getToalrows() {
        return toalrows;
    }

    public void setToalrows(Integer toalrows) {
        this.toalrows = toalrows;
    }

    public Integer getAllPage() {
        return allPage;
    }

    public void setAllPage(Integer allPage) {
        this.allPage = allPage;
    }

    public Integer getPageId() {
        return pageId;
    }

    public void setPageId(Integer pageId) {
        this.pageId = pageId;
    }

    public List<T> getData() {
        return this.data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
