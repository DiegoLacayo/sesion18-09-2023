import java.util.Scanner;
public class Arreglo {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        System.out.println("Cantidad de notas; ");
        int cantidadNotas = lector.nextInt();

        while (cantidadNotas <= 0) {
            System.out.println("No puede ingresar valores menores o = 0");
            System.out.println("Cantidad de notas: ");
            cantidadNotas = lector.nextInt();
        }
        
        int[] notas = new int[cantidadNotas];
        int sumaNotas = 0;
        String[] nombreEstudante = new String[cantidadNotas];

        System.out.println("Ingrese las notas del grupo: ");
        for (int i = 0; i < notas.length; i++) {

            System.out.print("Estudiante ["+ (i+1) +"] = ");
            nombreEstudante[i] = lector.next();

            System.out.print("Notas ["+ (i+1) +"] = ");
            notas[i] = lector.nextInt();

            sumaNotas += notas[i]; 
        }

        for (int i = 0; i < nombreEstudante.length; i++) { 
            System.out.println(nombreEstudante[i] + " " +  notas[i]);
        }

        //double promedio = 0.0;
        System.out.println("Promedio de notas es de :" + (double)sumaNotas/cantidadNotas);

        System.out.println("    ");
        System.out.println("      :::::::::::::  ");
        System.out.println("     ::::::;;;;;;;;:      ::::;");
        System.out.println("  ::::::::;;;;;;;;;:      ::::;");
        System.out.println(" ::::::::::;;;;;;;;:      :::::::::;");
        System.out.println(" :::::::::::::::::::     :::::::::::;");
        System.out.println(" :::::::::::::::::::    :::::::::::;");
        System.out.println("     :::::::::::::::     :::::");
        System.out.println("     ::::::   ::::::  ");
        System.out.println("     ::::::   ::::::  ");
    
        lector.close();
    }
} 
