package com.example.CabBooking.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CabBooking.Booking;


@Repository
public interface CabRepository extends JpaRepository<Booking, Long> {

}
