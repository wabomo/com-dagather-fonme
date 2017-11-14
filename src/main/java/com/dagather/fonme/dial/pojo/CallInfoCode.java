package com.dagather.fonme.dial.pojo;

public class CallInfoCode {
    private String callid;
    private String appId;
    private String bindUUId;
    private String caller;
    private String callee;
    private String startCallTime;
    private String startRingTime;
    private String calleeAcceptTime;
    private String calleeDisplayNum;
    private String endCallTime;
    private String callEndreason;
    private String Duration;
    private String recordfile;

    public String getCallid() {
        return callid;
    }

    public void setCallid(String callid) {
        this.callid = callid;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getBindUUId() {
        return bindUUId;
    }

    public void setBindUUId(String bindUUId) {
        this.bindUUId = bindUUId;
    }

    public String getCaller() {
        return caller;
    }

    public void setCaller(String caller) {
        this.caller = caller;
    }

    public String getCallee() {
        return callee;
    }

    public void setCallee(String callee) {
        this.callee = callee;
    }

    public String getStartCallTime() {
        return startCallTime;
    }

    public void setStartCallTime(String startCallTime) {
        this.startCallTime = startCallTime;
    }

    public String getStartRingTime() {
        return startRingTime;
    }

    public void setStartRingTime(String startRingTime) {
        this.startRingTime = startRingTime;
    }

    public String getCalleeAcceptTime() {
        return calleeAcceptTime;
    }

    public void setCalleeAcceptTime(String calleeAcceptTime) {
        this.calleeAcceptTime = calleeAcceptTime;
    }

    public String getCalleeDisplayNum() {
        return calleeDisplayNum;
    }

    public void setCalleeDisplayNum(String calleeDisplayNum) {
        this.calleeDisplayNum = calleeDisplayNum;
    }

    public String getEndCallTime() {
        return endCallTime;
    }

    public void setEndCallTime(String endCallTime) {
        this.endCallTime = endCallTime;
    }

    public String getCallEndreason() {
        return callEndreason;
    }

    public void setCallEndreason(String callEndreason) {
        this.callEndreason = callEndreason;
    }

    public String getDuration() {
        return Duration;
    }

    public void setDuration(String duration) {
        Duration = duration;
    }

    public String getRecordfile() {
        return recordfile;
    }

    public void setRecordfile(String recordfile) {
        this.recordfile = recordfile;
    }
}
