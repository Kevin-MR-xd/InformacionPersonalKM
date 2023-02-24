
package informacionpersonal;

/**
 *
 * @author ElChistes(Kevin Moreno)
 * 
 * Programa para imprimir cadenas en Java 
 * 
 */

public class InformacionPersonal {

    String nombre = "Kevin",
           apellido_paterno = "Moreno",
           apellido_materno = "Rojas";
    String edad = "18";
    String fecha_nacimiento = "29/Abril/2004";
    String hobbies = "Leer";
    String no_cuenta = "2271076";
    String semestre = "Segundo";
    String materia1 = "Calculo diferencial e integral",
           materia2 = "Programación",
           materia3 = "Teoria de algoritmos",
           materia4 = "Teoria de sistemas",
           materia5 = "Circuitos",
           materia6 = "Ingles";
    public void Informacion(){        
        System.out.println("El nombre completo de la persona es: " + nombre +" "+ apellido_paterno +" "+ apellido_materno );
        System.out.println("Su edad es: " + edad +" años ");
        System.out.println("Su fecha de nacimiento es: " + fecha_nacimiento);
        System.out.println("Su pasatiempo es: " + hobbies);
    }
    public void Informacion1() {
        System.out.println("El numero de cuenta de la persona es: "+no_cuenta);
        System.out.println("El semestre que cursa la persona es: "+semestre);
        System.out.println("Las materias que cursa la persona son: "+ materia1 +" "+ materia2 +" "+ materia3 +" "+ materia4 +" "+ materia5 +" "+ materia6);
    }
    
    public static void main(String[] args) {
        InformacionPersonal informacion= new InformacionPersonal();
        informacion.Informacion();
        InformacionPersonal informacion1 = new InformacionPersonal();
        informacion1.Informacion1();
                
    }
    
}
