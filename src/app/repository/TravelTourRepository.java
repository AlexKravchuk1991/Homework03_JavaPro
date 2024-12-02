package app.repository;

import app.domain.TravelTour;

public interface TravelTourRepository {
    TravelTour save(TravelTour travelTour);
    TravelTour findById(long id);
}
