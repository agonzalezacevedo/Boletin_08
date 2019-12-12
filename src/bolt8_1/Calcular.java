package bolt8_1;

import java.util.Scanner;

/**
 *
 * agonzalezacevedo
 */
public class Calcular {

    Scanner sc = new Scanner(System.in);
    private float num;

    public void calculo() {
        System.out.println("Inserta un numero entero: ");
        float escaneado = sc.nextFloat();
        if (escaneado <= 500) {
            num = escaneado + escaneado * 50 / 100;
        } else if (escaneado <= 1000) {
            num = escaneado + escaneado * 7 / 100;
        } else if (escaneado <= 5000) {
            num = escaneado + escaneado * 15 / 100;
        } else {
            num = escaneado - escaneado * 3 / 100;
        }
        System.out.println("La cantidad es " + escaneado);
        System.out.println("El incremento es " + (num - escaneado));
        System.out.println("La cantidad final é " + num);

    }

}
