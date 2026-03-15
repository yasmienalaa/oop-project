
public class Cairo extends Governorate {
    private final String name = "cairo";

    public Cairo() {
        super("Heliopolis", "Nasr City");
    }

    @Override
    public void displayAreas() {
        System.out.println("Cairo Areas: \n" +"1."+ area1 +"\n" + "2. " + area2 );
    }

    @Override
    public String getName() {
        return name;
    }
}
