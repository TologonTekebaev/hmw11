/**
 * Created by Tologon on 3/8/23 at 20:18.
 */
public class Person {
    private String fulName;
    private int age;
    private String country;
    private String specialty;
    private String hobby;

    public Person(){

    }

    public Person(String fulName, int age,
                  String country, String specialty, String hobby) {
        this.fulName = fulName;
        this.age = age;
        this.country = country;
        this.specialty = specialty;
        this.hobby = hobby;
    }

    public String getFulName() {
        return fulName;
    }

    public void setFulName(String fulName) {
        this.fulName = fulName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
