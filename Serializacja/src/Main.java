import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main  {
    public static void main(String[] args) {

        Pudelko pudelko = new Pudelko();
        pudelko.setSzerokosc(20);
        pudelko.setWysokosc(50);

        try {

            FileOutputStream fs = new FileOutputStream("pudelko.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(pudelko);
            os.close();


           } catch (Exception e){
            e.printStackTrace();
        }



    }}

