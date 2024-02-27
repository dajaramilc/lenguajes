public class ObjetosDePersona extends Persona {
    double bono;
    String cargo;
//Acá se cumple herencia ya que objetos de persona es un "hijo" de persona
//constructor:
    public ObjetosDePersona(String nombre, int edad, double estatura, double salario, String colorfav, double bono, String cargo) {
        super(nombre, edad, estatura, salario, colorfav);
        this.bono = bono;
        this.cargo = cargo;
    }
    //definir setters y getters
        public double getBono() {
            return bono;
        }
 
    public void setBono(double bono) {
        this.bono = bono;
    }

    public String getCargo(){
        return cargo;
    }
        public void setCargo(String cargo){
            this.cargo = cargo;
        }
        // definir metodos

        public void calcularSalario() {
         //Aqui se ve el polimorfismo ya que dependiendo si es un objeto de persona o no, el método calcula salario se ejecuta de forma diferente
        if (cargo.equalsIgnoreCase("Profesor")){
            System.out.println(
            
            "Nombre: "+this.nombre+" Cargo: " + this.cargo  +
            "\nEdad: " + this.edad +
            "\nSalario: " + (this.salario + this.bono) +
            "\nBono Anual: " + this.bono);
        }
        else if (cargo.equalsIgnoreCase("Estudiante")){
            System.out.println(
                
            "Nombre: "+this.nombre+" Cargo: " + this.cargo  +
            "\nEdad: " + this.edad +
            "\nSalario: " + (this.salario*0)+", (el estudiante no trabaja)");
        }
        else {
            System.out.println(
                
            "Nombre: "+this.nombre+" Cargo: " + this.cargo  +
            "\nEdad: " + this.edad +
            "\nSalario: " + ((this.salario*5) + this.bono) +
            "\nBono Anual: " + this.bono);
        }
        //dependiendo de que cargo sea el objeto de la persona, se ejecutará de manera distinta el salario, ya que es ilogico que un profesor gane lo mismo que un gerente
    
    }
    public void ColorFavorito(){
//un simple polimorfismo donde se le agrega el cargo a lo que se imprime
//Hay abstraccion ya que no se imprimen los datos innecesarios
        System.out.println("El nombre es: "+this.nombre+" Cargo: "+this.cargo+"\nEdad: " + this.edad+" Y el color favorito es: "+this.colorfav);
      }
      public void MostrarEstatura(){
        //un simple polimorfismo donde se le agrega el cargo a lo que se imprime
        System.out.println("El nombre es: "+this.nombre+ " Cargo: "+this.cargo+
                          "\nEdad: " + this.edad+
                          " Y la altura es: "+this.estatura);
        }
            
}
