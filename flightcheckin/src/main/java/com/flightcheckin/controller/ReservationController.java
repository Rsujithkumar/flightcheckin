package com.flightcheckin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

import com.flightcheckin.dto.Reservation;
import com.flightcheckin.dto.ReservationUpdateRequest;
import com.flightcheckin.integration.ReservationRestClient;

@Controller
@RequestMapping("/reservation")
public class ReservationController {

    @Autowired
    private ReservationRestClient restClient;

    @RequestMapping("/showCheckIn")
    public String showCheckIn() {
        return "showCheckIn";
    }

    @RequestMapping("/startCheckIn")
    public String startCheckIn(@RequestParam("id") Long id, Model model) {
        Reservation reservation = restClient.findReservation(id);
        model.addAttribute("reservation", reservation);
        return "checkInResult";
    }

    @RequestMapping("/finalConfirmation")
    public String finalConfirmation(@RequestParam("numberOfBags") int numberOfBags, @RequestParam("id") Long id, ModelMap modelMap) {
        ReservationUpdateRequest request = new ReservationUpdateRequest();
        request.setId(id);
        request.setNumberOfBags(numberOfBags);
        request.setCheckedIn(true);
        Reservation reservation = restClient.updateReservation(request);
        modelMap.addAttribute("msg", "Passenger has checkedIn with reservation id:");
        modelMap.addAttribute("reservation", reservation);
        return "confirmedStatus";
    }
}





