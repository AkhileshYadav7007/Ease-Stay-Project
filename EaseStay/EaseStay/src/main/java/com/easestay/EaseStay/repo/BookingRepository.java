package com.easestay.EaseStay.repo;
import com.easestay.EaseStay.Entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    //this class basically represents the booking repository to perform CRUD operations on the booking table

    Optional<Booking> findByBookingConfirmationCode(String confirmationCode);
}

