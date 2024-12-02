package app.repository;


import app.domain.TravelTour;
import org.springframework.stereotype.Repository;

import java.awt.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TravelTourRepositoryImp implements TravelTourRepository {
    List<TravelTour> tourList = new ArrayList<>();

    public TravelTourRepositoryImp() {
        initValue();
    }

    private void initValue(){
        tourList.add(new TravelTour(1,"tour to Berlin", "you can walk around the city",new BigDecimal(1200)));
        tourList.add(new TravelTour(2,"tour to Helsinky", "you can sky in mountains",new BigDecimal(1200)));
        tourList.add(new TravelTour(3,"tour to Hanover", "you can see a beautiful city",new BigDecimal(1200)));

    }


    @Override
    public TravelTour save(TravelTour travelTour) {
        tourList.add(travelTour);
        return travelTour;
    }

    @Override
    public TravelTour findById(long id) {

            for (TravelTour travelTour : tourList) {
                if(travelTour.getId() == id){
                    return travelTour;
                }
            }
        return null;
    }
}
