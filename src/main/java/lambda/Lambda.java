package lambda;

public class Lambda {

  public static void main(String arg[]){
    MiNombre miNombreAnonima = new MiNombre(){
      @Override
      public String miNombre(){
        return "PAula Anonimo";
      }
    };

    System.out.println(miNombreAnonima.miNombre());

    MiNombre miNombreL = () -> "Paula Lambda";
    System.out.println(miNombreL.miNombre());

    Sumar suma = new Sumar(){
      @Override
      public int suma(int a, int b){
        return a+b;
      }
    };

    System.out.println(suma.suma(1,3));

    Sumar suma1 = (a,b) -> a+b;

    System.out.println(suma1.suma(1,2));

  }
}
