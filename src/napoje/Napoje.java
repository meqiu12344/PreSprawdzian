package napoje;

public abstract class Napoje {
    private String nazwa;

    public String getNazwa() {
        return nazwa;
    }

    public Napoje(String nazwa) {
        this.nazwa = nazwa;
    }

    public void pij(){}
}
