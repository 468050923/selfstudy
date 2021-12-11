package IoStream;

import java.io.Serializable;

public class UserXulieHua implements Serializable {
    private String name;
    private boolean sex;

    @Override
    public String toString() {
        return "UserXulieHua{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    private String email;
    private String address;

    public String getName() {
        return name;
    }

    public UserXulieHua setName(String name) {
        this.name = name;
        return this;
    }

    public boolean isSex() {
        return sex;
    }

    public UserXulieHua setSex(boolean sex) {
        this.sex = sex;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserXulieHua setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public UserXulieHua setAddress(String address) {
        this.address = address;
        return this;
    }

    public UserXulieHua(String name, boolean sex, String email, String address) {
        this.name = name;
        this.sex = sex;
        this.email = email;
        this.address = address;
    }
}
