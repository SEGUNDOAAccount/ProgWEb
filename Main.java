import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String input;
        Scanner entrada = new Scanner(System.in);
        ArrayList<Agenda> contacto = new ArrayList<Agenda>();
        System.out.println("Agenda de Nicolas V1");
        do { // muy bien!
            System.out.println("Quieres ingresar [I] ingresar un nuevo contacto [C] consultar un contacto existente o para salir [S]?");
            input = entrada.next();
            switch (input.toLowerCase()) {
                case "i":
                    System.out.println("Ingrese el nombre");
                    String nombre = entrada.next();
                    System.out.println("Ingrese su numero");
                    String numero = entrada.next();
                    boolean abs = false; // que es abs?
                    do {
                        System.out.println("Ingrese su mail(o presione enter si no tiene)");
                        String mail = entrada.nextLine();
                        entrada.nextLine(); // y esta linea??
                        // se puede hacer mas corto.
                        if (mail.equals("") || mail.contains("@")) {
                            contacto.add(new Agenda(mail,nombre, numero ));
                            System.out.println("Contacto ingresado");
                            abs = true;
                        } else {
                            System.out.println("Mail invalido");
                        }
                    } while (!abs);
                    break;
                case "c":
                    System.out.println("Ingrese el nombre del contacto");
                    String nombre2 = entrada.next();
                    for (int i = 0; i < contacto.size(); i++) {
                        if (contacto.get(i).getNombre().equals(nombre2)) {
                            System.out.println(contacto.get(i)); // queda mas facil :)
                        }
                    }
                    break;
                case "s" :
                    System.out.println("Gracias por usar nuestra agenda");
                    break;
                default:
                     break;

            }
        } while (!input.toLowerCase().equals("s"));
    }
}