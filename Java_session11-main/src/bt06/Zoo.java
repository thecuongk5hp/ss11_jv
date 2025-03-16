package bt06;

class Zoo {
    private Animal[] animals;
    private int count;

    public Zoo(int capacity) {
        animals = new Animal[capacity];
        count = 0;
    }

    public void addAnimal(Animal animal) {
        if (count < animals.length) {
            animals[count] = animal;
            count++;
        } else {
            System.out.println("Sở thú đã đầy!");
        }
    }

    public void makeAllSounds() {
        System.out.println(" Tiếng kêu của động vật ");
        for (int i = 0; i < count; i++) {
            System.out.print(animals[i].getName() + ": ");
            animals[i].sound();
        }
    }

    public void moveAllAnimals() {
        System.out.println("Chuyển động của động vật ");
        for (int i = 0; i < count; i++) {
            System.out.print(animals[i].getName() + ": ");
            animals[i].move();
        }
    }
}
