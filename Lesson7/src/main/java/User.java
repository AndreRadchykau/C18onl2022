import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    public String name;
    public String surname;
    public int age;
    public String gender;

    public String setNameSurname() {
        return name + " " + surname;
    }

    public void increaseAge(int age) {
        this.age = age;
        age++;
        System.out.println(age);
    }

    public String userOutput() {
        return name + " " + surname + ", " + age + ", " + gender;
    }

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Deprecated //Аннотация @Deprecated используется для пометки устаревших методов или типов.
    public int getAge() {
        return age;
    }
}