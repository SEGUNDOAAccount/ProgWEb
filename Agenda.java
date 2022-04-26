
public class Agenda {
        public String mail;
        public String nombre;
        public String numero;
        public Agenda(String mail, String nombre, String numero) { // bien el constructor!
            this.mail = mail;
            this.nombre = nombre;
            this.numero = numero;
        }
        public String getMail() {
            return mail;
        }
        public void setMail(String mail) {
            this.mail = mail;
        }
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public String getNumero() {
            return numero;
        }
        public void setNumero(String numero) {
            this.numero = numero;
        }

        // esto es cuando haces un print(contacto) va a llamar e esta funcion implicitamente
        @Override
        public String toString() {
            return "Contacto { nombre=" + nombre + ", numero=" + numero + ", mail=" + mail + '}';
        }
        
}