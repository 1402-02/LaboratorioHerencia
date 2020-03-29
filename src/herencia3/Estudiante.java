package herencia3;

import javax.swing.JOptionPane;

public class Estudiante extends Persona {
    int carnet;
    double promnotas;
    int numaterias;

    public Estudiante(int carnet, double promnotas, int numaterias, String nombre, String apellido, int edad, double peso) {
        super(nombre, apellido, edad, peso);
        this.carnet = carnet;
        this.promnotas = promnotas;
        this.numaterias = numaterias;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public double getPromnotas() {
        return promnotas;
    }

    public void setPromnotas(double promnotas) {
        this.promnotas = promnotas;
    }

    public int getNumaterias() {
        return numaterias;
    }

    public void setNumaterias(int numaterias) {
        this.numaterias = numaterias;
    }
    
    public void promedio(){
        double nota, acum=0;
        carnet = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el carnet del estudiante"));
        numaterias = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de materias"));
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante");
        apellido = JOptionPane.showInputDialog("Ingrese el apellido del estudiante");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante"));
        peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso del estudiante"));
        for (int i = 1; i <= numaterias; i++) {
            nota= Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota de la materia "+i));
            acum+=nota;
            promnotas=acum/numaterias;
        }
        JOptionPane.showMessageDialog(null,"Nombre: "+nombre+"\nApellido: "+apellido+"\nEdad: "+edad+
                "\nPeso: "+peso+"\nCarnet: "+carnet+"\nNumero de materias: "
                +numaterias+"\nPromedio: "+promnotas);
    }
}