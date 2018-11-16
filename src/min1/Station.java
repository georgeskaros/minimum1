package min1;

public class Station {

    String idStation;
    String description;
    int max;
    double lat;
    double lon;

    public String getIdStation(){
        return this.idStation;
    }
    public void setIdStation(String IdStation) {
        this.idStation=idStation;
    }

    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description) {
        this.description=description;
    }

    public int getMax(){
        return this.max;
    }
    public void setMax(int max) {
        this.max=max;
    }

    public double getLat(){
        return this.lat;
    }
    public void setLat(double lat) {
        this.lat=lat;
    }

    public double getLon(){
        return this.lon;
    }
    public void setLon(double lon) {
        this.lon=lon;
    }

    public Station (String idStation, String description, int max, double lat, double lon){
        this.setIdStation(idStation);
        this.setDescription(description);
        this.setMax(max);
        this.setLat(lat);
        this.setLon(lon);
    }
}
