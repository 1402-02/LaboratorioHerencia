package herencia3;

public class Herencia3 {

    public static void main(String[] args) {
        Persona gato = new Persona("Daniel","Anzola", 24, 60);
        gato.imprimirDatosPersona();
        gato.definirEstadoPersona(24);
        Empleado gato2 = new Empleado();
        gato2.calcularSalario(true, 50000, 100);
        gato2.imprimirAsignacionSalario("Daniel Anzola", 500000);
        gato2 =gato2.ingresarDatosEmpleado();
        gato2.imprimirReporteEstadoEmpleado();
        SistemaInformacion gato3 = new SistemaInformacion();
        gato3.sistema();
    }
}
/*
1.Que métodos de la Superclase son utilizados en la subclase:
• definirEstadoPersona
• leerDatoTipoEntero
• imprimirReporteEstadoEmpleado
______________________________________________________________________________________________

2.Que función cumple el operador Super:
• la palabra super se usa para eludir la versión sobreescrita de la clase y 
  para heredar las variables a las subclases
______________________________________________________________________________________________

3.Observe los atributos de la Clase Padre, cuál es su visibilidad?  
  De qué manera se hace uso de estos en la clase hija?
• Tienen modificador de acceso protected, y puede aplicarse a todos los miembros de una clase, 
  es decir, tanto a campos como a métodos o constructores.
______________________________________________________________________________________________

4.Describa cómo funciona el método imprimirReporteEstadoEmpleado():
• Primero llama el método imprimirReporteEstadoEmpleado de la clase padre y lo ejecuta
• Luego pide el código del del empleado, llama el método imprimirAsignacionSalario y 
  determina si el empleado es fijo o contratado por la empresa.
______________________________________________________________________________________________

5.Que objetos se instancian en la Clase SistemaInformacion.
• Persona sistemaInformacion = new Persona();
• Empleado manejadorEmpleado = new Empleado();
_______________________________________________________________________________________________

6.Compare el método definirEstadoPersona (int edad) con el mismo método sobreescrito para 
  definir el estado del empleado. Qué diferencias tienen?  Porqué se hace?

• Lo que sucede es en el método método definirEstadoPersona (int edad) de la clase padre Persona, 
es para verificar si la persona es mayor o menor de edad; en cambio en el método método 
definirEstadoPersona (int edad) de la subclase Empleado, es para verificar si es menor de edad legal 
que va desde los 18 años hasta los 21, de ahí en adelante es mayor de edad legal y se hace porque 
son dos métodos iguales pero con diferentes instrucciones.
*/