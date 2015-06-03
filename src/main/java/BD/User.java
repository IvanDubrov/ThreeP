package BD;

public class User {
    private int id;
    private String name;
    private String password;
    private int levelOfAdmin;
    private String rol;
    private String phone;

    public User(int id, String выаываываываываывав, String ваня) {

    }


    public User(String name, String password, int levelOfAdmin, String rol, String phone) {
        this.name = name;
        this.password = password;
        this.levelOfAdmin = levelOfAdmin;
        this.rol = rol;
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public User() {
    }

    public User(String name, String password) {
    }

    public User(String password, int levelOfAdmin) {  //for autorizatiom !!!     loginMap.put(anOoo.getName(), new User(anOoo.getPassword(),anOoo.getLevelOfAdmin()));
    }

    public User(int id, String name, int levelOfAdmin) {//for loginMap!!!
        this.id = id;
        this.name = name;
        this.levelOfAdmin = levelOfAdmin;
    }

    public User(int id, String name, int levelOfAdmin, String rol) {
        this.id = id;
        this.name = name;
        this.levelOfAdmin = levelOfAdmin;
        this.rol = rol;
    }

    public User(int id, String name, String password, int levelOfAdmin, String rol, String phone) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.levelOfAdmin = levelOfAdmin;
        this.rol = rol;
        this.phone = phone;
    }

    public User(String mol) {
        this.name=mol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getLevelOfAdmin() {
        return levelOfAdmin;
    }

    public void setLevelOfAdmin(int levelOfAdmin) {
        this.levelOfAdmin = levelOfAdmin;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}