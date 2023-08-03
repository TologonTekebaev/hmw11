import java.util.Date;

/**
 * Created by Tologon on 3/8/23 at 20:48.
 */
public class University {
    private String universityName;
    private String UniversityAddress;
    private int amountOfTeachers;
    private int amountOfStudents;
    private int yearOfFoundation;

    public University(){

    }

    public University(String universityName, String universityAddress,
                      int amountOfTeachers, int amountOfStudents, int yearOfFoundation) {
        this.universityName = universityName;
        UniversityAddress = universityAddress;
        this.amountOfTeachers = amountOfTeachers;
        this.amountOfStudents = amountOfStudents;
        this.yearOfFoundation = yearOfFoundation;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getUniversityAddress() {
        return UniversityAddress;
    }

    public void setUniversityAddress(String universityAddress) {
        UniversityAddress = universityAddress;
    }

    public int getAmountOfTeachers() {
        return amountOfTeachers;
    }

    public void setAmountOfTeachers(int amountOfTeachers) {
        this.amountOfTeachers = amountOfTeachers;
    }

    public int getAmountOfStudents() {
        return amountOfStudents;
    }

    public void setAmountOfStudents(int amountOfStudents) {
        this.amountOfStudents = amountOfStudents;
    }

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    public void setYearOfFoundation(int yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
    }
}
