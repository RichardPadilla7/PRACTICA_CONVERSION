// de entero a double y el mismo valor entero a cadena
// Richard Padilla

public class Main {
    public static void main(String[] args) {

        int num1 = 7;
        double convertir;
        String convertir2;

        convertir = (double) num1;
        System.out.println("El número convertido a double es: " + convertir);

        convertir2 = String.valueOf(num1);
        System.out.print("El número convertido a cadena es: " + convertir2);


    }
}