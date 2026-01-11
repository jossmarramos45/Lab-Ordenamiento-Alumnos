package Practica;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class LaboratorioAlumnoTest {

    @Test
    public void testBurbujaPorCodigo() {
        LaboratorioAlumno.Alumno[] entrada = {
            new LaboratorioAlumno.Alumno(3, "Carlos"),
            new LaboratorioAlumno.Alumno(1, "Ana"),
            new LaboratorioAlumno.Alumno(2, "Bruno")
        };

        LaboratorioAlumno.Alumno[] esperado = {
            new LaboratorioAlumno.Alumno(1, "Ana"),
            new LaboratorioAlumno.Alumno(2, "Bruno"),
            new LaboratorioAlumno.Alumno(3, "Carlos")
        };

        LaboratorioAlumno.burbujaPorCodigo(entrada);
        assertArrayEquals(esperado, entrada);
    }
}
