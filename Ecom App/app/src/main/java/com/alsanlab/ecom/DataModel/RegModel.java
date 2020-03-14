package com.alsanlab.ecom.DataModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class RegModel {
    @SerializedName("Username")
    @Expose
    private String username;
    @SerializedName("Useremail")
    @Expose
    private String useremail;
    @SerializedName("Userphone")
    @Expose
    private String userphone;
    @SerializedName("Userpw")
    @Expose
    private String userpw;
    @SerializedName("UserDevId")
    @Expose
    private String userDevId;
    @SerializedName("ServerMsg")
    @Expose
    private String serverMsg;


    public RegModel(String username, String useremail, String userphone, String userpw, String userDevId) {
        this.username = username;
        this.useremail = useremail;
        this.userphone = userphone;
        this.userpw = userpw;
        this.userDevId = userDevId;
    }




    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone;
    }

    public String getUserpw() {
        return userpw;
    }

    public void setUserpw(String userpw) {
        this.userpw = userpw;
    }

    public String getUserDevId() {
        return userDevId;
    }

    public void setUserDevId(String userDevId) {
        this.userDevId = userDevId;
    }

    public String getServerMsg() {
        return serverMsg;
    }

    public void setServerMsg(String serverMsg) {
        this.serverMsg = serverMsg;
    }

    @Override
    public String toString() {
        return "RegModel{" +
                "username='" + username + '\'' +
                ", useremail='" + useremail + '\'' +
                ", userphone='" + userphone + '\'' +
                ", userpw='" + userpw + '\'' +
                ", userDevId='" + userDevId + '\'' +
                ", serverMsg='" + serverMsg + '\'' +
                '}';
    }
}
