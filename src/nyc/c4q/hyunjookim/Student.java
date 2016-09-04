package nyc.c4q.hyunjookim;


public class Student {

//    ACCESS MODIFIER
//    protected String firstName;  // if its in the same package, the main can access it.
//    String firstName;            // package protected

    private String firstName;
    private String lastName;
    private int idNumber = 0;
    private String favoriteFood;


    public Student(String firstName, String lastName, int idNumber, String favoriteFood) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.favoriteFood = favoriteFood;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastname) {
        this.lastName = lastname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public static boolean checkSameFavoriteFood(Student studentOne, Student studentTwo) {
        studentOne.getFavoriteFood().equalsIgnoreCase(studentTwo.getFavoriteFood());
        return true;
    }

}
