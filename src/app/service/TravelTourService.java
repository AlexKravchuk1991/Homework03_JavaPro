package app.service;

import app.domain.TravelTour;

import java.math.BigDecimal;

public interface TravelTourService {
    TravelTour addTravelTour(long id, String title, String description, BigDecimal price);
    TravelTour getTravelTourById(long id);
}
