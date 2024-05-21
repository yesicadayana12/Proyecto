import javax.swing.*;
import java.util.Scanner;

public class Proyecto {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float edad[] = new float[5];
        float conteo_edad = 0, promedi_edadmay = 0, conteo_igu = 0;
        float suma_mayor = 0, suma_menor = 0, conteo_edadmen= 0;
        float pro_menor=0;
        float conteo_edadmay = 0;
        int num;

        JOptionPane.showMessageDialog(null, "**********************************");

        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Bienvenido por favor ingrese la cantidad de estudiante"));

        for (int i = 0; i < num; i++) {

            System.out.println("Por favor ingresa la cantidad de la edad");
            edad[i] = entrada.nextInt();


            if (edad[i] == 5) {
                conteo_igu++;

            }
            if (edad[i] < 5) {
                conteo_edadmen++;
                suma_menor += edad[i];

            }

            if (edad[i] > 5) {

                conteo_edadmay++;
                suma_mayor += edad[i];
            }


            if (conteo_edadmen == 5){

                System.out.println("Los estudiantes menores de 5 años se sabe ecaptamente el  numero");
        }
             else{

                pro_menor = suma_menor/conteo_edadmen;
             }

                System.out.println("el promedio de menor de los estudiantes menor de 5 años es"+pro_menor);
                System.out.println(" Promedio de edad mayor a los estudiantes de 5 años es " + promedi_edadmay);
                System.out.println("L os estudiantes con igual edad es "+conteo_igu);
        }

    }

}

