package app.service;

import app.domain.TravelTour;
import app.repository.TravelTourRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@PropertySource("classpath:application.property")
public class TravelTourServiceImpl implements TravelTourService {

    private TravelTourRepository repository;
    private String article;

    public TravelTourServiceImpl(TravelTourRepository repository, @Value("${article.name}") String article) {
        this.repository = repository;
        this.article = article;
    }

    @Override
    public TravelTour addTravelTour(long id, String title, String description, BigDecimal price) {
        return repository.save(new TravelTour(id, title, description, price));
    }

    @Override
    public TravelTour getTravelTourById(long id) {
        TravelTour tour = repository.findById(id);
        setArticle(tour);
        return tour;
    }

    private void setArticle(TravelTour travelTour) {
       String articleToSet = String.format("%s%s%d", article, travelTour.getDescription().charAt(1), travelTour.getId());
       travelTour.setArticle(articleToSet);
    }
}
