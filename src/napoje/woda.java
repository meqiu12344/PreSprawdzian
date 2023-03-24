package napoje;

public class woda extends Napoje{

    private boolean gazowana;

    public woda(String nazwa, boolean gazowana) {
        super(nazwa);
        this.gazowana = gazowana;
    }



    @Override
    public void pij() {
        super.pij();
    }

}
