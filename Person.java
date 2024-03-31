import java.time.LocalDate;
import java.time.Period;

public class Person {
    String name;

    public void displayName() {
        System.out.println("Name: " + name);
    }

    public void displayAge(String dob) {
        LocalDate birthDate = LocalDate.parse(dob);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);
        int age = period.getYears();
        System.out.println("Age of Person: " + age);
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Sukanya Dharwad";
        p.displayName();
        p.displayAge("2004-06-19");
    }
}
