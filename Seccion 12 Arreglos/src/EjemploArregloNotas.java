import java.util.Scanner;

public class EjemploArregloNotas {
  public static void main(String[] args) {
    double[] claseMatematicas, claseHistoria, claseLenguaje;
    double sumNotasMatematicas=0, sumNotasHistoria=0, sumNotasLenguaje =0;

    claseMatematicas = new double[7];
    claseHistoria = new double[7];
    claseLenguaje = new double[7];

    Scanner sc = new Scanner(System.in);

    System.out.println("Ingresa 7 notas de estudiande para Matematicas ");
    for (int i = 0; i < claseMatematicas.length; i++) {
      claseMatematicas[i] = sc.nextDouble();
    }
    System.out.println("Ingresa 7 notas de estudiande para Historia ");
    for (int i = 0; i < claseHistoria.length; i++) {
      claseHistoria[i] = sc.nextDouble();
    }
    System.out.println("Ingresa 7 notas de estudiande para Lenguaje ");
    for (int i = 0; i < claseLenguaje.length; i++) {
      claseLenguaje[i] = sc.nextDouble();
    }

    for (int i = 0; i < 7; i++) {
      sumNotasMatematicas+=claseMatematicas[i];
      sumNotasHistoria+=claseHistoria[i];
      sumNotasLenguaje+=claseLenguaje[i];
    }
    System.out.println("promedio clase Matematicas "+(sumNotasMatematicas/claseMatematicas.length));
    System.out.println("promedio clase Historia "+(sumNotasHistoria/claseHistoria.length));
    System.out.println("promedio clase Lenguaje "+(sumNotasLenguaje/claseLenguaje.length));
    
    System.out.println("Ingresa el identificador del alumno ");
    int id = sc.nextInt();
    double promedioAlumno = (claseMatematicas[id]+claseHistoria[id]+claseLenguaje[id])/3;
    System.out.println("Promedio alumno "+promedioAlumno);
    sc.close();
  }
}
