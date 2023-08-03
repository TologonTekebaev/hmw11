import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Person objPerson1 = new Person();
        Person objPerson2 = new Person();
        Person objPerson3 = new Person();

        objPerson1.setFulName("Ulan Kubanychbekov");
        objPerson1.setAge(27);
        objPerson1.setCountry("Kyryzstan, Balykchy");
        objPerson1.setSpecialty("Java programmer");
        objPerson1.setHobby("Play football");

        objPerson2.setFulName("Kuba Abdirasulov");
        objPerson2.setAge(23);
        objPerson2.setCountry("Kyryzstan, Batken");
        objPerson2.setSpecialty("Business man");
        objPerson2.setHobby("Play tennis");

        objPerson3.setFulName("Muhammed Toichubai uulu");
        objPerson3.setAge(26);
        objPerson3.setCountry("Kyryzstan, Osh");
        objPerson3.setSpecialty("Java senior programmer");
        objPerson3.setHobby("Reading books");


        Person[] peopleArray = {objPerson1, objPerson2, objPerson3};
        System.out.println("--------------People--------------");
        for (Person people: peopleArray) {
            System.out.println("Name: " + people.getFulName());
            System.out.println("Age: " + people.getAge());
            System.out.println("Country: " + people.getCountry());
            System.out.println("Specialty: " + people.getSpecialty());
            System.out.println("Hobby: " + people.getHobby());
            System.out.println("--------------------------------------");
        }

        University objUniversity1 = new University();
        University objUniversity2 = new University();
        University objUniversity3 = new University();

        objUniversity1.setUniversityName("AUCA");
        objUniversity1.setUniversityAddress("Asanbay 13");
        objUniversity1.setAmountOfTeachers(57);
        objUniversity1.setAmountOfStudents(441);
        objUniversity1.setYearOfFoundation(1999);

        objUniversity2.setUniversityName("KNU");
        objUniversity2.setUniversityAddress("Jibek jolu 12");
        objUniversity2.setAmountOfTeachers(256);
        objUniversity2.setAmountOfStudents(11000);
        objUniversity2.setYearOfFoundation(1884);

        objUniversity3.setUniversityName("Ala-Too");
        objUniversity3.setUniversityAddress("Ankara 76");
        objUniversity3.setAmountOfTeachers(101);
        objUniversity3.setAmountOfStudents(567);
        objUniversity3.setYearOfFoundation(2001);

        University[] universitiesArray = {objUniversity1, objUniversity2, objUniversity3};
        System.out.println("--------------Universities--------------");
        for (University universities: universitiesArray) {
            System.out.println("University name: " + universities.getUniversityName());
            System.out.println("Address: " + universities.getUniversityAddress());
            System.out.println("Amount of teachers: " + universities.getAmountOfTeachers());
            System.out.println("Amount of students: " + universities.getAmountOfStudents());
            System.out.println("Year of foundation: " + universities.getYearOfFoundation());
            System.out.println("--------------------------------------");
        }

            School objSchool1 = new School();
            School objSchool2 = new School();
            School objSchool3 = new School();

            objSchool1.setSchoolName("Ch.Aitmatov 12");
            objSchool1.setSchoolAddress("Bishkek, avenue Chui 128");
            objSchool1.setAmountOfTeachers(86);
            objSchool1.setAmountOfStudents(356);

            objSchool2.setSchoolName("T.Kasymbekov");
            objSchool2.setSchoolAddress("Naryn, avenue Azizov 92");
            objSchool2.setAmountOfTeachers(34);
            objSchool2.setAmountOfStudents(180);

            objSchool3.setSchoolName("A.Osmonov 3");
            objSchool3.setSchoolAddress("Talas, avenue Talas 19");
            objSchool3.setAmountOfTeachers(23);
            objSchool3.setAmountOfStudents(152);

            School[] schoolsArray = {objSchool1, objSchool2, objSchool3};
            System.out.println("--------------Schools--------------");
             for (School schools : schoolsArray){
                 System.out.println("School name: " + schools.getSchoolName());
                 System.out.println("School address: " + schools.getSchoolAddress());
                 System.out.println("Amount of teachers: " + schools.getAmountOfTeachers());
                 System.out.println("Amount of students: " + schools.getAmountOfStudents());
                 System.out.println("--------------------------------------");

        Car carObj1 = new Car();
        Car carObj2 = new Car();
        Car carObj3 = new Car();


                 carObj1.setNameOfCar("TOYOTA");
                 carObj1.setMadeOf("Japan");
                 carObj1.setColor("Black");
                 carObj1.setEngineSize(3.2);
                 carObj1.setPrice(2000000);

                 carObj2.setNameOfCar("BMV");
                 carObj2.setMadeOf("Germany");
                 carObj2.setColor("Black");
                 carObj2.setEngineSize(4.25);
                 carObj2.setPrice(6000000);

                 carObj3.setNameOfCar("KIA");
                 carObj3.setMadeOf("Korea");
                 carObj3.setColor("White");
                 carObj3.setEngineSize(2.8);
                 carObj3.setPrice(1880000);

                 Car[] carsArray = {carObj1, carObj2, carObj3};
                 System.out.println("--------------Cars--------------");
                 System.out.println();
                 for (Car car : carsArray) {
                     System.out.println("Car name: " + car.getNameOfCar());
                     System.out.println("Made in: " + car.getMadeOf());
                     System.out.println("Color: " + car.getColor());
                     System.out.println("Engine size: " + car.getEngineSize());
                     System.out.println("Price: " + car.getPrice());
                     System.out.println("--------------------------------------");
                 }
             }
    }
}