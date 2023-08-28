package Animals;

public class AnimalFactory implements AnimalFactoryInterface{ //Actual Animal Factory, has logic abt which to choose

    @Override
    public Animal createAnimal() {
        int choice = 1; // shld change dynamically actually

        switch (choice){
            case 1: return new Cat();
            case 2: return new Dog();
        }

        return null;
    }
}
