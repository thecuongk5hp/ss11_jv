package bt06;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo(5);

        Animal lion = new Lion("Simba", 5);
        Animal elephant = new Elephant("Dumbo", 8);

        zoo.addAnimal(lion);
        zoo.addAnimal(elephant);

        zoo.makeAllSounds();
        zoo.moveAllAnimals();
    }
}
