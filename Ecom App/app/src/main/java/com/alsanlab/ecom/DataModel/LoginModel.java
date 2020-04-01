package com.alsanlab.ecom.DataModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginModel {
    @SerializedName("Username")
    @Expose
    private String username;
    @SerializedName("Userpw")
    @Expose
    private String userpw;
    @SerializedName("ServerMsg")
    @Expose
    private String serverMsg;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpw() {
        return userpw;
    }

    public void setUserpw(String userpw) {
        this.userpw = userpw;
    }

    public String getServerMsg() {
        return serverMsg;
    }

    public void setServerMsg(String serverMsg) {
        this.serverMsg = serverMsg;
    }

    public LoginModel(String username, String userpw) {
        this.username = username;
        this.userpw = userpw;
    }
}
