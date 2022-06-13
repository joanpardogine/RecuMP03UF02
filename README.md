# MP03 - UF02: Disseny modular
## Recuperació curs **2021-2022**
### dilluns, 13 de juny de 2022

Cal que creeu un repositori remot privat al vostre github, el nom del qual ha de ser **```<CognomNom>RecuMP03UF02```**, i que convideu a l'usuari **```joanpardogine```**. Cal que feu un **``**``commit``**``**, cada **15 minuts**, amb el missatge **```Control HH:MM```**. On **```HH:MM```** és l'hora en què s'ha de fer el **``commit``**. En el repositori [**```RecuMP03UF02```**](https://github.com/joanpardogine/RecuMP03UF02) de l'usuari **```joanpardogine```** trobareu el programa que faré servir per corregir aquesta activitat.

Aquest és el contingut del fitxer [**```RecuMP03UF02.java```**](./RecuMP03UF02.java).

```java
import java.util.Scanner;

public class RecuMP03UF02 {

    static Scanner teclat = new Scanner(System.in);
    static String[] tipusTriangles = { "equilàter", "isòsceles", "escalè" };

    public static String elTriangleEs(int costat1, int costat2, int costat3) {
        // el teu codi va aquí
        // return (tipusTriangles[??]);
        return ("no està fet!"); // Aquesta línia cal que la modifiqueu amb la que vosaltres creieu oportú.
    }

    public static int llegirPositiuAmbMissatge(String missatgeAMostrar) {
        int valorLlegit = -1;
        // el teu codi va aquí
        return (valorLlegit); // Aquesta línia cal que la modifiqueu amb la que vosaltres creieu oportú.
    }

    public static void mostrarCompresosEntre(int primerNombre, int segonNombre) {
        // el teu codi va aquí
    }

    public static void main(String[] args) {
        String tipusTriangle = "";

        int[] costats = new int[3];
            for (int i = 0; i < costats.length; i++) {
                System.out.print("Entra el costat " + (i + 1) + ": ");
                try {
                    costats[i] = teclat.nextInt();
                } catch (Exception e) {
                    System.out.print("ERROR!\nCal que entris només enters!\n");
                    i--;
                } finally {
                    teclat = new Scanner(System.in);
                }
            }

            // -- INICI Primer enunciat de la recuperació
            tipusTriangle = elTriangleEs(costats[0], costats[1], costats[2]);

            System.out.print("Si el costat #1 és de " + costats[0] +
                    " el #2 és de " + costats[1] +
                    " i el #3 és de " + costats[2] + "." +
                    "\nLlavors és un triangle de tipus " + tipusTriangle + ".\n\n");
            // -- FINAL Primer enunciat de la recuperació

        // -- INICI Segon enunciat de la recuperació

        String textPrimerPositiu = "Entra el primer enter positiu: ";
        String textSegonPositiu = "Entra el segon enter positiu: ";

        int primerPositiuLlegit = 0;
        int segonPositiuLlegit = 0;
            primerPositiuLlegit = llegirPositiuAmbMissatge(textPrimerPositiu);
            segonPositiuLlegit = llegirPositiuAmbMissatge(textSegonPositiu);

                System.out.println("Has entrat com a primer positiu " + primerPositiuLlegit);
                System.out.println("Has entrat com a segon  positiu " + segonPositiuLlegit);
            // -- FINAL Segon enunciat de la recuperació

            // -- INICI Tercer enunciat de la recuperació
            //  Comentar la lína 77
            //  en cas de que l'alumne hagi fet el segon enunciat
                System.out.print("Els nombres compresos entre " +
                        primerPositiuLlegit + " i " +
                        segonPositiuLlegit + " són:\n");
                mostrarCompresosEntre(primerPositiuLlegit, segonPositiuLlegit);

            // -- FINAL Tercer enunciat de la recuperació


    }
}

```

