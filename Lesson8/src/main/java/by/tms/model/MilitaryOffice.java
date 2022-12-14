package by.tms.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static by.tms.utils.Constants.*;

@Setter
@Getter
@NoArgsConstructor
public class MilitaryOffice {
    private PersonRegistry personRegistry;

    public MilitaryOffice(PersonRegistry personRegistry) {
        this.personRegistry = personRegistry;
    }

    private boolean checkRecruits(Person person) {
        return person.getAge() > MIN_AGE && person.getAge() <= MAX_AGE && person.getGender().equals(MALE);
    }

    public int getRecruits() {
        int count = 0;
        for (Person person : personRegistry.getPersons()) {
            if (checkRecruits(person)) {
                count++;
            }
        }
        return count;
    }

    public int getRecruits(String name) {
        int count = 0;
        for (Person person : personRegistry.getPersons()) {
            if (checkRecruits(person) && person.getName().equalsIgnoreCase(name)) {
                count++;
            }
        }
        return count;
    }

    public int getRecruitsCity(String city) {
        int count = 0;
        for (Person person : personRegistry.getPersons()) {
            if (checkRecruits(person) && person.getAddress().getCity().equalsIgnoreCase(city)) {
                count++;
            }
        }
        return count;
    }

    public int getRecruitsAge(int minAge, int maxAge) {
        int count = 0;
        for (Person person : personRegistry.getPersons()) {
            if (person.getAge() >= minAge && person.getAge() <= maxAge) {
                count++;
            }
        }
        return count;
    }
}
