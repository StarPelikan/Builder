package home;

public class Person {
    private final String name;
    private final String surname;
    private int age;
    private String city;

    public Person(PersonBuilder personBuilder) {
        this.name = personBuilder.getName();
        this.surname = personBuilder.getSurname();
        setAge(personBuilder.getAge());
        this.city = personBuilder.getCity();

    }

    public boolean hasAge() {
        return age > 0;
    }

    public boolean hasAddress() {
        return !city.equals(null);
    }

    public void setAge(int age) {

        if (hasAge()) {
            throw new IllegalStateException("Возраст уже записан");
        }

        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("Столько не живут");
        }
        this.age = age;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void happyBirthday() {
        age++;
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
    protected PersonBuilder newChildBuilder() {
        return new PersonBuilder().setSurname(this.surname).setCity(this.city);
    }
    @Override
    public String toString() {
        return "[" + name + " " + surname + ", age: " + age + ", city: " + city + ".]";
    }
}