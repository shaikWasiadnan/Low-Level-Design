package LLD.Abstraction;

public class Dog implements Noisy{
    @Override
    public void makeNoise() {
        System.out.println("Bark");
    }
}
