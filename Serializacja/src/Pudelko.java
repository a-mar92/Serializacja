import java.io.Serializable;

public class Pudelko implements Serializable {

    private int szerokosc;
    private int wysokosc;

    public void setSzerokosc(int szerokosc){
        this.szerokosc=szerokosc;
    }

    public void setWysokosc(int wysokosc) {
        this.wysokosc=wysokosc;
    }
}
