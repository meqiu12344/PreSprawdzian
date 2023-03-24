package napoje;

public class sok extends Napoje{

    private String smak;

    public sok(String nazwa, String smak) {
        super(nazwa);
        this.smak = smak;
    }

    @Override
    public void pij() {
        super.pij();
    }
}
