package com.fundamental;

/**
 * @author FIIT - Ambattur
 * @Name : Students
 * @Description : My first encapulated class [ data-hiding, getter, setter ]
 */
public class Students {
    private int studId;
    private String studName;
    private long studPhoneNo;
    private String studEmailId;

    public int getStudId() {
        return studId;
    }

    public void setStudId(int studId) {
        this.studId = studId;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public long getStudPhoneNo() {
        return studPhoneNo;
    }

    public void setStudPhoneNo(long studPhoneNo) {
        this.studPhoneNo = studPhoneNo;
    }

    public String getStudEmailId() {
        return studEmailId;
    }

    public void setStudEmailId(String studEmailId) {
        this.studEmailId = studEmailId;
    }
}
