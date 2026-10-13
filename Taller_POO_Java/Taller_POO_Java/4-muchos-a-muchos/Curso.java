import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private List<Estudiante> estudiantes = new ArrayList<>();

    public Curso(String nombre) {
        this.nombre = nombre;
    }

    public void agregarEstudiante(Estudiante e) {
        if (!estudiantes.contains(e)) {
            estudiantes.add(e);
            e.matricular(this);
        }
    }

    public String getNombre() { return nombre; }
    public List<Estudiante> getEstudiantes() { return estudiantes; }
}
