
package com.example.assignmentweek.Request;

import com.google.gson.annotations.SerializedName;

public class SignRequest {

    @SerializedName("email")
    private String mEmail;
    @SerializedName("password")
    private String mPassword;

    public SignRequest(String mEmail, String mPassword) {
        this.mEmail = mEmail;
        this.mPassword = mPassword;
    }
}
