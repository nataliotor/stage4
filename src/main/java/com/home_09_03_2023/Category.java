package com.home_09_03_2023;

public class Category {

    private String retail;
    private String accounting;
    private String director;
    private String shops;
    private String assortment;

    public Category(String retail, String accounting, String director, String shops, String assortment) {
        this.retail = retail;
        this.accounting = accounting;
        this.director = director;
        this.shops = shops;
        this.assortment = assortment;
    }

    public String getRetail() {
        return retail;
    }

    public void setRetail(String retail) {
        this.retail = retail;
    }

    public String getAccounting() {
        return accounting;
    }

    public void setAccounting(String accounting) {
        this.accounting = accounting;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getShops() {
        return shops;
    }

    public void setShops(String shops) {
        this.shops = shops;
    }

    public String getAssortment() {
        return assortment;
    }

    public void setAssortment(String assortment) {
        this.assortment = assortment;
    }

    @Override
    public String toString() {
        return "Category{" +
                "retail='" + retail + '\'' +
                ", accounting='" + accounting + '\'' +
                ", director='" + director + '\'' +
                ", shops='" + shops + '\'' +
                ", assortment='" + assortment + '\'' +
                '}';
    }
}
