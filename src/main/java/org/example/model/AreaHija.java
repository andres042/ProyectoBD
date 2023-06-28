package org.example.model;

public class AreaHija {
    private int areaPadreId;
    private int areaHijaId;
    private String areaHija;


    @Override
    public String toString() {
        return "AreaHija{" +
                "areaPadreId=" + areaPadreId +
                ", areaHijaId=" + areaHijaId +
                ", areaHija='" + areaHija + '\'' +
                '}';
    }

    public AreaHija(int areaPadreId, int areaHijaId, String areaHija) {
        this.areaPadreId = areaPadreId;
        this.areaHijaId = areaHijaId;
        this.areaHija = areaHija;
    }

    public int getAreaPadreId() {
        return areaPadreId;
    }

    public void setAreaPadreId(int areaPadreId) {
        this.areaPadreId = areaPadreId;
    }

    public int getAreaHijaId() {
        return areaHijaId;
    }

    public void setAreaHijaId(int areaHijaId) {
        this.areaHijaId = areaHijaId;
    }

    public String getAreaHija() {
        return areaHija;
    }

    public void setAreaHija(String areaHija) {
        this.areaHija = areaHija;
    }
}
