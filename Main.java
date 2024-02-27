
class Main {
  public static void main(String[] args) {
    //creacion de objeto persona
      Persona yeison = new Persona("Yeison", 18, 175, 1000000, "amarillo");
      //encapsulamiento
   yeison.setEdad(12);
   yeison.setEstatura(158);
    yeison.calcularSalario();
    yeison.ColorFavorito();
    yeison.MostrarEstatura();
    
System.out.println();
    //creacion de objeto, objetos de persona
    ObjetosDePersona santi = new ObjetosDePersona( "Santiago", 21, 170, 1000000, "rojo", 100000, "Estudiante");
    //encapsulamiento
    santi.setCargo("Gerente");
    santi.setEdad(68);
    santi.setColorFav("negro");
    santi.setBono(300000);
    santi.calcularSalario();
    System.out.println();
    santi.ColorFavorito();
    System.out.println();
    santi.MostrarEstatura();

    System.out.println();
//creacion de objeto, objetos de persona
    ObjetosDePersona carlos = new ObjetosDePersona( "carlos", 19, 195, 1000000, "verde", 100000, "Profesor");
   //encapsulamiento
    carlos.setCargo("Estudiante");
    carlos.setEdad(17);
    carlos.setEstatura(112);
    carlos.calcularSalario();
    System.out.println();
    carlos.MostrarEstatura();
    System.out.println();
    carlos.ColorFavorito();

    System.out.println();
//creacion de objeto, objetos de persona
    ObjetosDePersona mario = new ObjetosDePersona( "mario", 21, 170, 1000000, "rojo", 100000, "Estudiante");
  //encapsulamiento
    mario.setCargo("Profesor");
    mario.setEdad(39);
    mario.setNombre("Diego");
    mario.calcularSalario();
    System.out.println();
    mario.ColorFavorito();
    System.out.println();
    mario.MostrarEstatura();
  }
}