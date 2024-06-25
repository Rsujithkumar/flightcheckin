package com.flightcheckin.integration;



import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import com.flightcheckin.dto.Reservation;
import com.flightcheckin.dto.ReservationUpdateRequest;

@Component
public class ReservationRestClientImpl implements ReservationRestClient {

    

    private final RestTemplate restTemplate;

    public ReservationRestClientImpl() {
        this.restTemplate = new RestTemplate();
    }

    @Override
    public Reservation findReservation(Long id) {
    	Reservation reservation=restTemplate.getForObject("http://localhost:8080/flightreservationapp/reservations/"+id, Reservation.class);
        return reservation;
    }
    @Override
    public Reservation updateReservation(ReservationUpdateRequest request) {
    	Reservation reservation=restTemplate.postForObject("http://localhost:8080/flightreservationapp/reservation", request, Reservation.class);
        return reservation;
    }

}
