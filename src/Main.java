import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        HashMap<Targa, Proprietario> mappaAuto = new HashMap<>();


        Targa targa1 = new Targa("AM");
        Targa targa2 = new Targa("A1");
        Targa targa3 = new Targa("B");

        Proprietario p1 = new Proprietario("Mario", "Rossi", "MR");
        Proprietario p2 = new Proprietario("Giulia", "Bianchi", "GB");
        Proprietario p3 = new Proprietario("Luigi", "Verdi", "LV");

        mappaAuto.put(targa1, p1);
        mappaAuto.put(targa2, p2);
        mappaAuto.put(targa3, p3);



    }
}
