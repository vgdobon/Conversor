import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean error=true;
        boolean errorEleccionPulgadas=true;
        boolean errorEleccionKm=true;
        int eleccionConversion = -1;
        while(error){
            System.out.println("Pulsa la opcion de conversion que quieras realizar");
            System.out.println("1) Convertir pulgadas en centimetros");
            System.out.println("2) Convertir km y millas");
            eleccionConversion = sc.nextInt();
            if (eleccionConversion == 1 || eleccionConversion == 2) {
                error = false;
            }
        }
            int pulgadasCentimetros=0;
            int kmMillas;
            double pulgadas, centimetros;
            double km, millas;
            double resultado;

            if(eleccionConversion == 1) {

                while(errorEleccionPulgadas) {


                    System.out.println("¿Que quieres convertir?");
                    System.out.println("1) De pulgadas a centimetros");
                    System.out.println("2)De centimetros a pulgdas");
                    pulgadasCentimetros = sc.nextInt();

                    if(pulgadasCentimetros==1 || pulgadasCentimetros==2){
                        errorEleccionPulgadas=false;
                    }

                }
                    if (pulgadasCentimetros == 1) {
                        System.out.println("Dime las pulgadas que quieres convertir");
                        pulgadas = sc.nextDouble();
                        resultado = pulgadas * 2.54;
                        System.out.println(pulgadas + " pulgadas son:" + resultado + " centimetros");
                    } else {
                        System.out.println("Dime los centimetros que quieres convertir");
                        centimetros = sc.nextDouble();
                        resultado = centimetros / 2.54;
                        System.out.println(centimetros + " cm. son:" + resultado + " pulgadas");

                    }

            } else {
                System.out.println("¿Que quieres convertir?");
                System.out.println("1) De km a millas");
                System.out.println("2)De millas a km");
                kmMillas = sc.nextInt();
                if (kmMillas == 1) {
                    System.out.println("Dime los km que quieres convertir");
                    km = sc.nextDouble();
                    resultado = km * 0.621371;
                    System.out.println(km + " km son:" + resultado + " millas");
                } else {
                    System.out.println("Dime las millas que quieres convertir");
                    millas = sc.nextDouble();
                    resultado = millas * 1.60934;
                    System.out.println(millas + " millas son:" + resultado + " km");
                }
            }


    }
}
