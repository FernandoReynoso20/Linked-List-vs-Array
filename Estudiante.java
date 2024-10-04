import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Estudiante {

    int matricula;
    String nombre;
    double indiceAcademico;

    public Estudiante(int matricula, String nombre, double indiceAcademico) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.indiceAcademico = indiceAcademico;
    }

    @Override
    public String toString() {
        return "Estudiante [matricula: " + matricula + ", nombre: " + nombre + ", indiceAcademico: " + indiceAcademico + "]";
    }

    public List<Estudiante> sortingStudents(List<Estudiante> notSorted, boolean ascendent) {
        for (int i = 0; i < notSorted.size() - 1; i++) {
            for (int j = 0; j < notSorted.size() - 1 - i; j++) {
                if (ascendent) {
                    if (notSorted.get(j).indiceAcademico > notSorted.get(j + 1).indiceAcademico) {
                        Estudiante temp = notSorted.get(j);
                        notSorted.set(j, notSorted.get(j + 1));
                        notSorted.set(j + 1, temp);
                    }
                } else {
                    if (notSorted.get(j).indiceAcademico < notSorted.get(j + 1).indiceAcademico) {
                        Estudiante temp = notSorted.get(j);
                        notSorted.set(j, notSorted.get(j + 1));
                        notSorted.set(j + 1, temp);
                    }
                }
            }
        }
        return notSorted;
    }

    public static List<Estudiante> generarEstudiantes(int n) {
        List<Estudiante> estudiantes = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            int matricula = rand.nextInt(10000);
            double indiceAcademico = 1.0 + (rand.nextDouble() * 3.0);  
            String nombre = "Estudiante " + (i + 1);
            estudiantes.add(new Estudiante(matricula, nombre, indiceAcademico));
        }

        return estudiantes;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de estudiantes: ");
        int n = scanner.nextInt();

        List<Estudiante> estudiantes = generarEstudiantes(n);

        System.out.println("\nEstudiantes sin ordenar:");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }

        System.out.println("\nIngrese 1 para ordenar ascendente o 0 para descendente:");
        boolean ascendente = scanner.nextInt() == 1;

        scanner.close();

        Estudiante est = new Estudiante(0, "", 0);
        est.sortingStudents(estudiantes, ascendente);

        
        System.out.println("\nEstudiantes ordenados:");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    }
}
