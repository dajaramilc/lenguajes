public class Persona
{
  //definir propiedades
String nombre;
String colorfav;
double salario;
int edad;
double estatura;
//constructor:
 public Persona(String nombre, int edad, double estatura, double salario, String colorfav){
     this.nombre = nombre;
     this.colorfav = colorfav;
     this.edad = edad;
     this.salario = salario;
     this.estatura = estatura;
 }
 //setters y getters
  public String getNombre(){
  return nombre;
  }
  public String getColorFav(){
    return colorfav;
    }
  public int getEdad(){
    return edad;
  }
  public double getEstatura() {
  return estatura;
}
  public double getSalario(){
  return salario;
  }
  public void setNombre(String nombre){
  this.nombre = nombre;
  }
  public void setColorFav(String colorfav){
    this.colorfav = colorfav;
    }
  public void setEdad(int edad){
  this.edad = edad;
}
public void setEstatura(double estatura){
 this.estatura = estatura; 
}
  public void setSalario(double salario){
    this.salario = salario;
  }
  // metodo simple que solo imprime nombre, edad, y salario, en objetos persona se puede ver el polimorfismo al aplicarse el metodo de diferente manera
  public void calcularSalario(){
    System.out.println(   "Nombre: "+this.nombre+
                         "\nEdad: " + this.edad +
                        "\nSalario: " + this.salario
);}
public void ColorFavorito(){
//metodo que imprime sin mucho rodeo el color favorito
  System.out.println("El nombre es: "+this.nombre+
                    "\nEdad: " + this.edad+
                    " Y el color favorito es: "+this.colorfav);
}
public void MostrarEstatura(){
  //metodo que muestra la estatura
System.out.println("El nombre es: "+this.nombre+ 
                  "\nEdad: " + this.edad+
                  " Y la altura es: "+this.estatura);
}
    
  
}