package BD;

public class Friend {
    private int id;
    private int idPerson;
    private String nameFriend;
    private String phoneFriend;
    private String emailFriend;

    public Friend() {
        //need for MyBatis !!!
    }

    public Friend(int id, int idPerson, String nameFriend, String phoneFriend, String emailFriend) {
        this.id = id;
        this.idPerson = idPerson;
        this.nameFriend = nameFriend;
        this.phoneFriend = phoneFriend;
        this.emailFriend = emailFriend;
    }

    public Friend(int idPerson, String nameFriend, String phoneFriend, String emailFriend) {
        this.idPerson = idPerson;
        this.nameFriend = nameFriend;
        this.phoneFriend = phoneFriend;
        this.emailFriend = emailFriend;
    }

    public Friend(int i) {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public String getNameFriend() {
        return nameFriend;
    }

    public void setNameFriend(String nameFriend) {
        this.nameFriend = nameFriend;
    }

    public String getPhoneFriend() {
        return phoneFriend;
    }

    public void setPhoneFriend(String phoneFriend) {
        this.phoneFriend = phoneFriend;
    }

    public String getEmailFriend() {
        return emailFriend;
    }

    public void setEmailFriend(String emailFriend) {
        this.emailFriend = emailFriend;
    }
}
