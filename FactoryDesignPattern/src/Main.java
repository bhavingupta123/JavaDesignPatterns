import Animals.*;

public class Main {

    public static void main(String[] args) {
        AnimalFactoryInterface a = new AnimalFactory();
        Animal an = a.createAnimal();
        an.action();
    }
}


//https://www.youtube.com/watch?v=v-GiuMmsXj4
//https://www.youtube.com/watch?v=EcFVTgRHJLM