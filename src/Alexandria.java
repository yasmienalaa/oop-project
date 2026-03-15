
public class Alexandria extends Governorate {

    private final String name = "alexandria";

    public Alexandria() {
        super("Sidi Gaber", "Stanley");
    }

    @Override
    public void displayAreas() {
        System.out.println("Alexandria Areas: \n" +"1."+ area1 +"\n" + "2. " + area2 );
    }

    @Override
    public String getName() {
        return name;
    }
}