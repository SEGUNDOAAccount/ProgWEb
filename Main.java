import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean menu= false;
        ArrayList<Agenda> contacto = new ArrayList<Agenda>();
        do{
        System.out.println("Agenda de Nicolas V1");
        System.out.println("Quieres ingresar [I] ingresar un nuevo contacto o [C] consultar un contacto existente?");
        String input = entrada.next();


        switch (input) {
            case "I":
                System.out.println("Ingrese el nombre");
                String nombre = entrada.next();
                System.out.println("Ingrese su numero");
                String numero = entrada.next();
                boolean abs = true;
                do {
                    System.out.println("Ingrese su mail(o presione enter si no tiene)");
                    String mail = entrada.nextLine();
                    entrada.nextLine();
                    if (mail != "") {
                        if (mail.contains("@")) {
                            System.out.println("Contacto ingresado!");
                            contacto.add(new Agenda(mail, nombre, numero));
                            abs = false;
                        }
                    } else {
                        System.out.println("Contacto ingresado!");
                        contacto.add(new Agenda(mail, nombre, numero));
                        abs = false;
                    }
                } while (!abs);
                break;
            case "C":

            for (Agenda agenda : contacto) {
                System.out.println(agenda.getNombre());
            }
            System.out.println("ingrese su nombre");
            String busqueda = entrada.next();

            
            for (Agenda agenda : contacto) {
                if(agenda.getNombre().equals(busqueda)){
                System.out.println(agenda.getNombre());
                System.out.println(agenda.getMail());
                System.out.println(agenda.getNumero());
                }
            }
                break;
            
            case "Salir":
                menu=true;
            break;
            default:
                System.out.println("se cierra el programa");
                menu = true;
                break;

            }
        } while(!menu);
       }
}