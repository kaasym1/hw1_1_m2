public final class FightingDog extends DogJr {

    public FightingDog(String name, int age, String breed, EnumColor enumColorColor, House house) {
        super(name, age, breed, enumColorColor, house);
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nHouse: " + getHouse().getName() +
                "\nHouse: " + getHouse().getAddress();
    }
}