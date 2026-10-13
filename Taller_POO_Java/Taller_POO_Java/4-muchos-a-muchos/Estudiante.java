import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String nombre;
    private List<Curso> cursos = new ArrayList<>();

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public void matricular(Curso curso) {
        if (!cursos.contains(curso)) {
            cursos.add(curso);
            curso.agregarEstudiante(this); // mantiene ambos lados sincronizados
        }
    }

    public String getNombre() { return nombre; }
    public List<Curso> getCursos() { return cursos; }
}
