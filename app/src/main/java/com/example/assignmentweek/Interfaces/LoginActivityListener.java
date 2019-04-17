package com.example.assignmentweek.Interfaces;

import com.example.assignmentweek.Response.LoginResponse;
import com.example.assignmentweek.Response.Register;

public interface LoginActivityListener {

    void login(LoginResponse response);

    void register(Register response);
}
