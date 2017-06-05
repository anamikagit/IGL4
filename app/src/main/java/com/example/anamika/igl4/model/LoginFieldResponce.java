package com.example.anamika.igl4.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginFieldResponce {
    @SerializedName("Id")
    @Expose
    private String id;
    @SerializedName("Uid")
    @Expose
    private String uid;
    @SerializedName("Pwd")
    @Expose
    private String pwd;
    @SerializedName("roleid")
    @Expose
    private String roleid;
    @SerializedName("orgid")
    @Expose
    private String orgid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid;
    }
}
