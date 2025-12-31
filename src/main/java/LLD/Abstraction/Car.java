package LLD.Abstraction;

public class Car implements Noisy{
    @Override
    public void makeNoise() {
        System.out.println("Honk");
    }
}
