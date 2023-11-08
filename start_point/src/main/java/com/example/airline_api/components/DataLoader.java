package com.example.airline_api.components;

import com.example.airline_api.models.Flight;
import com.example.airline_api.models.Passenger;
import com.example.airline_api.repositories.FlightRepository;
import com.example.airline_api.repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
@Component

public class DataLoader implements ApplicationRunner {

    @Autowired
    FlightRepository flightRepository;

    @Autowired
    PassengerRepository passengerRepository;

    public DataLoader(){

    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Flight flight1 = new Flight("Seoul", 200, "", "");
        flightRepository.save(flight1);

        Passenger passenger1 = new Passenger("bob", "bob@fakeemail.com" );
        passenger1.addFlight(flight1);
        passengerRepository.save(passenger1);


        Flight flight2 = new Flight("Doha", 100, "", "");
        flightRepository.save(flight2);

        Passenger passenger2 = new Passenger("lily", "lilly@fakemail.com");
        passenger2.addFlight(flight2);
        passengerRepository.save(passenger2);
    }


}
