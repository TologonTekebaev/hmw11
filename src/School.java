/**
 * Created by Tologon on 3/8/23 at 20:30.
 */
public class School {
    private String schoolName;
    private String schoolAddress;
    private int amountOfTeachers;
    private int amountOfStudents;

    public School(){

    }

    public School(String schoolName, String schoolAddress,
                  int amountOfTeachers, int amountOfStudents) {
        this.schoolName = schoolName;
        this.schoolAddress = schoolAddress;
        this.amountOfTeachers = amountOfTeachers;
        this.amountOfStudents = amountOfStudents;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolAddress() {
        return schoolAddress;
    }

    public void setSchoolAddress(String schoolAddress) {
        this.schoolAddress = schoolAddress;
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
}
