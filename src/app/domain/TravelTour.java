package app.domain;

import java.math.BigDecimal;
import java.util.Objects;

public class TravelTour {
    private long id;
    private String title;
    private String description;
    private BigDecimal price;
    private String article;

    public long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TravelTour that = (TravelTour) o;
        return id == that.id && Objects.equals(title, that.title) && Objects.equals(description, that.description) && Objects.equals(price, that.price) && Objects.equals(article, that.article);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, price, article);
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public TravelTour(long id, String title, String description, BigDecimal price) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        return "TravelTour{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", article='" + article + '\'' +
                '}';
    }
}
