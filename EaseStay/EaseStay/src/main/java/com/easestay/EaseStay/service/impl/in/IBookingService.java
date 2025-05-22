package com.easestay.EaseStay.service.impl.in;
import com.easestay.EaseStay.Dto.Response;
import com.easestay.EaseStay.Entity.Booking;

public interface IBookingService {
    //this class basically represents the booking service interface to perform CRUD operations on the booking table
    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);
}