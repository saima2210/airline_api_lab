package com.example.airline_api.services;

import com.example.airline_api.models.Flight;
import com.example.airline_api.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {

    @Autowired
    FlightRepository flightRepository;

    @Autowired
    PassengerService passengerService;

    public void saveFlight (Flight flight) {
        flightRepository.save(flight);
    }

    public Flight findFlight(Long id) {
        return flightRepository.findById(id).get();
    }

    public List<Flight> findAllFlights(){
        return flightRepository.findAll();
    }


    public void deleteFlight(Long id) {
        flightRepository.deleteById(id);
    }

}
