import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        // Declaracion de arreglo.
        int arreglo1[] = new int[5]; //0,1,2,3,4.
        //arreglo1 = {0,0,0,0,0};
        int []arreglo2 = new int[10]; //0,1,2,3,4,5,6,7,8,9.
        //arreglo2 = {0,0,0,0,0,0,0,0,0,0};
        int arreglo3[] = {1,2,3,4,5,6,7}; //0,1,2,3,4,5,6,7.
        int []arreglo4 = new int[] {10,20,30,40,50}; //0,1,2,3,4.
        //Acceder e Imprimir elementos
            System.out.println(arreglo1[2]); //0.
            System.out.println(arreglo2[7]); //0.
            System.out.println(arreglo3[5]); //6.
            System.out.println(arreglo4[4]); //50.
        //Asignar un valor a los arreglos.
        arreglo1[0] = 18;
        arreglo1[1] = 15;
        arreglo1[2] = 9;
        arreglo1[3] = 5;
        arreglo1[4] = 14;

        System.out.println("arreglo1[0] = " +arreglo1[0]); 
        System.out.println("arreglo1[1] = " +arreglo1[1]);
        System.out.println("arreglo1[2] = " +arreglo1[2]);
        System.out.println("arreglo1[3] = " +arreglo1[3]);
        System.out.println("arreglo1[4] = " +arreglo1[4]);

        System.out.println("    ");
        System.out.println("      :::::::::::::  ");
        System.out.println("     ::::::;;;;;;;;:      ::::;");
        System.out.println("  ::::::::;;;;;;;;;:      ::::;");
        System.out.println(" ::::::::::;;;;;;;;:      :::::::::;");
        System.out.println(" :::::::::::::::::::     :::::::::::;");
        System.out.println(" :::::::::::::::::::    :::::::::::;");
        System.out.println("     :::::::::::::::     :::::::");
        System.out.println("     ::::::   :::::: ");
        System.out.println("     ::::::   :::::: ");

        lector.close();
    }
} 
