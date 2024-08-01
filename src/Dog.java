public class Dog {
    private String name;
    private int age;
    private String breed;
    private House house;
    private EnumColor enumColorColor;

    public Dog(String name, int age, String breed, EnumColor enumColorColor, House house) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.enumColorColor = enumColorColor;
        this.house = house;
    }

    public String getName() {
        return name;
    }

    public House getHouse() {
        return house;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public EnumColor getEnumColorColor() {
        return enumColorColor;
    }
}