package com.alsanlab.ecom.DataModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DeviceCheckModel {

    @SerializedName("UserDevId")
    @Expose
    private String userDevId;
    @SerializedName("ServerMsg")
    @Expose
    private String serverMsg;


    public DeviceCheckModel(String userDevId) {
        this.userDevId = userDevId;
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

}
