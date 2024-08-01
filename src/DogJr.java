public class DogJr extends Dog {

    public DogJr(String name, int age, String breed, EnumColor enumColorColor, House house) {
        super(name, age, breed, enumColorColor, house);
    }

    final public void makeVoice() {
        System.out.println("Гав гав");
    }

    public void makeVoice(String bark) {
        System.out.println(bark);
    }

    public String getInfo(){
        return "Name: " + getName() +
                "\nAge: " + getAge() +
                "\nBreed: " + getBreed();
    }
}