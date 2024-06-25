package com.flightcheckin.integration;




import org.springframework.stereotype.Component;

import com.flightcheckin.dto.Reservation;
import com.flightcheckin.dto.ReservationUpdateRequest;

@Component
public interface ReservationRestClient {
	
    public Reservation findReservation(Long id);
	
    public Reservation updateReservation(ReservationUpdateRequest request);
}
