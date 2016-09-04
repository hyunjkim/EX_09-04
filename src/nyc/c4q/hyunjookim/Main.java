package nyc.c4q.hyunjookim;

public class Main {

    public static void main(String[] args) {

        Student hyun = new Student ("Hyunjoo", "Kim", 1, "donkatsu");
        Student leigh = new Student ("Leigh", "Douglas", 2, "sushi");

        System.out.println(Student.checkSameFavoriteFood(hyun,leigh));

    }
}
