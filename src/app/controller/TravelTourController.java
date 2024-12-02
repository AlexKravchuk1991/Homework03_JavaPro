package app.controller;


import app.domain.TravelTour;
import app.service.TravelTourService;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class TravelTourController {
    private TravelTourService service;

    public TravelTourController(TravelTourService service) {
        this.service = service;
    }

    public TravelTour saveTravelTour(long id, String title, String description, BigDecimal price){
        return service.addTravelTour(id, title, description, price);
    }

    public TravelTour getTravelTour(long id){
        return service.getTravelTourById(id);
    }
}

