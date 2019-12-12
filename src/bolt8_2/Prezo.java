package bolt8_2;

import java.util.Scanner;

/**
 * @author agonzalezacevedo
 */
public class Prezo {

    Scanner ler = new Scanner(System.in);
    private float prezoFinal;
    int unidades;

    public void Desconto() {
        System.out.println("¿Canto es o prezo do producto? ");
        int prezo = ler.nextInt();
        System.out.println("¿Canto es o numero de unidades? ");
        unidades = ler.nextInt();
        if (unidades < 100) {
            prezoFinal = unidades * prezo;
        } else if (unidades < 200) {
            if (prezo > 4000) {
                prezoFinal = prezo * unidades * 0.95f;
            } else {
                prezoFinal = prezo * unidades * 0.98f;
            }
        } else {
            if (prezo > 4000) {
                prezoFinal = prezo * unidades * 0.90f;
            } else {
                prezoFinal = prezo * unidades * 0.92f;
            }

        }
        System.out.println("Son " + unidades + " unidades.");
        System.out.println("O prezo por unidad son " + prezo + "€");
        System.out.println("O prezo total e " + prezoFinal + "€");
        System.out.println("O desconto son " + (prezo * unidades - prezoFinal) + "€");

    }

}
