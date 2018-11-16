package min1;

public class Bike {
    String idBike;
    String description;
    double kms;
    String idStation;

    public String getIdBike(){
        return this.idBike;
    }
    public void setIdBike(String IdBike) {
        this.idBike=idBike;
    }

    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description) {
        this.description=description;
    }
    public double getKms(){
        return this.kms;
    }
    public void setKms(double kms) {
        this.kms=kms;
    }
    public String getIdStation(){
        return this.idStation;
    }
    public void setIdStation(String IdStation) {
        this.idStation=idStation;
    }
    public Bike (String idBike, String description, double kms, String idStation){
        this.setIdBike(idBike);
        this.setDescription(description);
        this.setKms(kms);
        this.setIdStation(idStation);
    }
}
