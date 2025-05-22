package com.easestay.EaseStay.service.impl.in;

import com.easestay.EaseStay.Dto.LoginRequest;
import com.easestay.EaseStay.Dto.Response;
import com.easestay.EaseStay.Entity.User;

public interface IUserService {
    //this class basically represents the user service interface to perform CRUD operations on the user table
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}
