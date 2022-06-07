import java.util.Scanner;

public class RecuMP03UF02 {

    static Scanner teclat = new Scanner(System.in);

    public static String elTriangleEs(int costat1, int costat2, int costat3) {
        String[] tipusTriangles = { "equilàter", "isòsceles", "escalè" };

        return (tipusTriangles[1]);
    }

    public static int llegirEnterAmbMissatge(String missatge) {
        int valorLlegit = 0;
        // el teu codi va aquí
        return (valorLlegit);
    }
    
    public static void mostraCompresos(int primerNombre, int segonNombre) {
        // el teu codi va aquí
    }
    
    public static int[] tornaFilaColumnaMesGranMatriu(int[][] matriu) {
        int[] filaColumna = new int[2];
        // el teu codi va aquí
        return (filaColumna);
    }
    
    public static void main(String[] args) {
        int[] costats = new int[3];
        for (int i = 0; i < costats.length; i++) {
            System.out.print("Entra el costat " + (i + 1) + ": ");
            try {
                costats[i] = teclat.nextInt();
            } catch (Exception e) {
                System.out.print("ERROR!\nCal que entris només enters!\n");
                i--;
            } finally{
                teclat = new Scanner(System.in);
            }
        }

        // -- INICI Primer eneunciat de la recuperació
        String tipusTriangle = elTriangleEs(costats[0], costats[1], costats[2]);
        
        System.out.print("El triangle amb els següents costats\n" +
        "Costat 1 = " + costats[0] + "\n" +
        "Costat 2 = " + costats[1] + "\n" +
        "Costat 3 = " + costats[2] + "\n" +
        "és un triangle de tipus " + tipusTriangle);
        // -- FINAL Primer eneunciat de la recuperació
        
        // -- INICI Segon eneunciat de la recuperació
        String textPrimerPositiu = "Entra el primer enter positiu:";
        int primerPositiuLlegit = 0;
        primerPositiuLlegit = llegirEnterAmbMissatge(textPrimerPositiu);
        System.out.print("Has entrat " + primerPositiuLlegit);

        String textSegonPositiu = "Entra el primer enter positiu:";
        int segonPositiuLlegit = 0;
        segonPositiuLlegit = llegirEnterAmbMissatge(textSegonPositiu);

        System.out.print("Els nombres compresos entre " +
                primerPositiuLlegit + " i " +
                segonPositiuLlegit + " són:\n");
        mostraCompresos(primerPositiuLlegit, segonPositiuLlegit);

    }

}
