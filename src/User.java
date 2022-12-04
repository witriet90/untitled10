public class User {

    private final long id;
    private final String name;
    private final String secondName;
    private final String passportId;
    private final String phoneNumber;

    public User(long id, String name, String secondName, String passportId, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.secondName = secondName;
        this.passportId = passportId;
        this.phoneNumber = phoneNumber;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getPassportId() {
        return passportId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
