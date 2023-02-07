package home;

public class PersonBuilder {
    private String name = null;
    private String surname = null;
    private int age;
    private String city;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setCity(String city) {
        this.city = city;
        return this;
    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }
    public Person build() {
        if (age < 0) {
            throw new IllegalArgumentException("Не верный возраст");
        }
        if (name == null) {
            throw new IllegalStateException("Имя не указано");
        }
        if (surname == null) {
            throw new IllegalStateException("Фамилия не указана");
        }
        return new Person(this);
}
}

