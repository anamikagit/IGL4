package com.example.anamika.igl4.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MeterReadingResponce {
    @SerializedName("ConsumerName")
    @Expose
    private String consumerName;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("mob_no")
    @Expose
    private String mobNo;
    @SerializedName("cons_no")
    @Expose
    private String consNo;
    @SerializedName("Reading")
    @Expose
    private String reading;
    @SerializedName("IMG_DATE")
    @Expose
    private String iMGDATE;

    public String getConsumerName() {
        return consumerName;
    }

    public void setConsumerName(String consumerName) {
        this.consumerName = consumerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    public String getConsNo() {
        return consNo;
    }

    public void setConsNo(String consNo) {
        this.consNo = consNo;
    }

    public String getReading() {
        return reading;
    }

    public void setReading(String reading) {
        this.reading = reading;
    }

    public String getIMGDATE() {
        return iMGDATE;
    }

    public void setIMGDATE(String iMGDATE) {
        this.iMGDATE = iMGDATE;
    }
}
