package HomeCollections;

import java.util.Objects;

public class Onliner {
    private String categoryProdukt;
    private int quantityProdukt;

    public Onliner() {
    }

    public Onliner(String categoryProdukt, int quantityProdukt) {
        this.categoryProdukt = categoryProdukt;
        this.quantityProdukt = quantityProdukt;
    }

    public String getCategoryProdukt() {
        return categoryProdukt;
    }

    public void setCategoryProdukt(String categoryProdukt) {
        this.categoryProdukt = categoryProdukt;
    }

    public int getQuantityProdukt() {
        return quantityProdukt;
    }

    public void setQuantityProdukt(int quantityProdukt) {
        this.quantityProdukt = quantityProdukt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Onliner onliner = (Onliner) o;
        return quantityProdukt == onliner.quantityProdukt &&
                Objects.equals(categoryProdukt, onliner.categoryProdukt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryProdukt, quantityProdukt);
    }

    @Override
    public String toString() {
        return "Onliner{" +
                "categoryProdukt='" + categoryProdukt + '\'' +
                ", quantityProdukt=" + quantityProdukt +
                '}';
    }
}
