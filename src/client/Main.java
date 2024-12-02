package client;

import app.controller.TravelTourController;
import app.domain.TravelTour;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext("app");
        TravelTourController controller = context.getBean(TravelTourController.class);

        TravelTour tour = controller.getTravelTour(3);
        TravelTour tour1 = controller.saveTravelTour(4,"Amsterdam","you can walk in rot street and have fun",new BigDecimal(12937));

        tour = controller.getTravelTour(4);
        System.out.println(tour);

    }
}
