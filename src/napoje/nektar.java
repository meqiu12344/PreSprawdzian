package napoje;

public class nektar extends Napoje{
    private String smak;

    public nektar(String nazwa, String smak) {
        super(nazwa);
        this.smak = smak;
    }

    @Override
    public void pij() {
        super.pij();
    }
}
