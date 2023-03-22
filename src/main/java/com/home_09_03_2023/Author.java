package com.home_09_03_2023;

public class Author {
    private String mereshenko;
    private String gorbach;
    private String logvina;
    private String shops;
    private String AC; // ассортиментный комитет

    public Author(String mereshenko, String gorbach, String logvina, String shops, String AC) {
        this.mereshenko = mereshenko;
        this.gorbach = gorbach;
        this.logvina = logvina;
        this.shops = shops;
        this.AC = AC;
    }

    public String getMereshenko() {
        return mereshenko;
    }

    public void setMereshenko(String mereshenko) {
        this.mereshenko = mereshenko;
    }

    public String getGorbach() {
        return gorbach;
    }

    public void setGorbach(String gorbach) {
        this.gorbach = gorbach;
    }

    public String getLogvina() {
        return logvina;
    }

    public void setLogvina(String logvina) {
        this.logvina = logvina;
    }

    public String getShops() {
        return shops;
    }

    public void setShops(String shops) {
        this.shops = shops;
    }

    public String getAC() {
        return AC;
    }

    public void setAC(String AC) {
        this.AC = AC;
    }

    @Override
    public String toString() {
        return "Author{" +
                "mereshenko='" + mereshenko + '\'' +
                ", gorbach='" + gorbach + '\'' +
                ", logvina='" + logvina + '\'' +
                ", shops='" + shops + '\'' +
                ", AC='" + AC + '\'' +
                '}';
    }
}
