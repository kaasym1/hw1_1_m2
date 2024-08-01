public class Main {
    public static void main(String[] args) {
        House house = new House("Apartment", "Bokonbaeva/Bilinka");
        DogJr dogJr = new DogJr("Alex", 13, "Alabay", EnumColor.BLACK, house);

        FightingDog fightingDog = new FightingDog("Bob", 9, "Alabay", EnumColor.BLUE, house);
        FightingDog fightingDog1 = new FightingDog("Nick", 8, "Alabay", EnumColor.RED, house);

        System.out.println("DogJr: " + dogJr.getInfo() +
                "\nFighting Dog: " + fightingDog.getInfo() +
                "\nFighting Dog1: " + fightingDog1.getInfo());

        dogJr.makeVoice();
        dogJr.makeVoice("Wof wof");
    }
}