
public class Giza extends Governorate {
    private final String name = "giza";

    public Giza() {
        super("Dokki", "Mohandessin");
    }

    @Override
    public void displayAreas() {
        System.out.println("Giza Areas: \n" + "1." + area1 +"\n" + "2. " + area2);
    }

    @Override
    public String getName() {
        return name;
    }
}
