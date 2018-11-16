package min1;

public class User {
    String idUser;
    String name;
    String surname;

    public String getIdUser(){
        return this.idUser;
    }
    public void setIdUser(String IdUser) {
        this.idUser=idUser;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public String getSurname(){
        return this.surname;
    }
    public void setSurname(String surname) {
        this.surname=surname;
    }
    public User (String idUser, String name, String surname){
        this.setIdUser(idUser);
        this.setName(name);
        this.setSurname(surname);

    }
}
