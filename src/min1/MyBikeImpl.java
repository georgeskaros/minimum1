package min1;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class MyBikeImpl implements MyBike {
    private static MyBike instance;
    public Station stations[] = new Station[S];
    public int stationNum;

    private HashMap<String, User> users = new HashMap<String, User>();
    private LinkedList<Bike> bikes = new LinkedList<Bike>();
    public static MyBike getInstance() {                                    //this is the singleton pattern
        if (instance==null) instance = new MyBikeImpl();
        return instance;
    }

    public void addUser(String idUser, String name, String surname) {
        this.users.put(idUser, new User(idUser, name, surname));

    }

    public void addStation(String idStation, String description, int max, double lat, double lon) {
        if (stationNum >= S){
        this.stations[this.stationNum++]=new Station(idStation, description, max, lat, lon);
        }
    }

    public void addBike(String idBike, String description, double kms, String idStation) throws StationFullException, StationNotFoundException {
        this.bikes.add(new Bike(idBike, description, kms, idStation));
    }

    public List<Bike> bikesByStationOrderByKms(String idStation) throws StationNotFoundException {
        return null;
    }

    public Bike getBike(String stationId, String userId) throws UserNotFoundException, StationNotFoundException {
        return null;
    }

    public List<Bike> bikesByUser(String userId) throws UserNotFoundException {
        return null;
    }

    public int numUsers() {
        return 0;
    }


    public int numStations() {
        return this.stationNum;
    }


    public int numBikes(String idStation) throws StationNotFoundException {
        return 0;
    }

    public void clear() {

    }
}
