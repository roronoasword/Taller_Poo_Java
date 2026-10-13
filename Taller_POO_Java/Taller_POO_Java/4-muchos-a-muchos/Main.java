public class Main {
    public static void main(String[] args) {
        Estudiante ana = new Estudiante("Ana");
        Estudiante luis = new Estudiante("Luis");
        Curso poo = new Curso("POO");
        Curso bd = new Curso("Bases de datos");

        ana.matricular(poo);
        ana.matricular(bd);
        luis.matricular(poo);

        System.out.println("Ana tiene " + ana.getCursos().size() + " cursos");
        System.out.println("POO tiene " + poo.getEstudiantes().size() + " estudiantes");
    }
}
