package by.tms.services;

import by.tms.model.Address;
import by.tms.model.MilitaryOffice;
import by.tms.model.Person;
import by.tms.model.PersonRegistry;

import static by.tms.utils.Constants.FEMALE;
import static by.tms.utils.Constants.MALE;

public class Main {
    public static void main(String[] args) {

        Person[] people = new Person[10];
        people[0] = new Person("Александр", 25, MALE, new Address("Belarus", "Гродно"));
        people[1] = new Person("Сергей", 25, MALE, new Address("Belarus", "Минск"));
        people[2] = new Person("Дмитрий", 34, MALE, new Address("Belarus", "Гомель"));
        people[3] = new Person("Алия", 18, FEMALE, new Address("Belarus", "Могилев"));
        people[4] = new Person("Варвара", 34, FEMALE, new Address("Belarus", "Витебск"));
        people[5] = new Person("Кирилл", 20, MALE, new Address("Belarus", "Орша"));
        people[6] = new Person("Ярослав", 28, MALE, new Address("Belarus", "Минск"));
        people[7] = new Person("Арсений", 26, MALE, new Address("Belarus", "Минск"));
        people[8] = new Person("Фёдор", 22, MALE, new Address("Belarus", "Минск"));
        people[9] = new Person("Александр", 26, MALE, new Address("Belarus", "Барановичи"));

        MilitaryOffice militaryOffice = new MilitaryOffice(new PersonRegistry(people));
        int recruits = militaryOffice.getRecruits();
        int recruitsAlexandr = militaryOffice.getRecruits("Александр");
        System.out.println("Количество годных к службе призывников: " + recruits);
        System.out.println("Количество годных призывников в городе Минск: " + militaryOffice.getRecruitsCity("Минск"));
        System.out.println("Количество призывников от 25 до 27 лет: " + militaryOffice.getRecruitsAge(25, 27));
        System.out.println("Призывник(и) с именем Александр: " + recruitsAlexandr);
    }
}
