package Practica;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class LaboratorioAlumnoTest {

    @Test
    public void testOrdenamientoBurbujaPorCodigo() {
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

    @Test
    public void testOrdenamientoSeleccionPorNombre() {
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

        LaboratorioAlumno.seleccionPorNombre(entrada);
        assertArrayEquals(esperado, entrada);
    }

    @Test
    public void testOrdenamientoInsercionPorCodigo() {
        LaboratorioAlumno.Alumno[] entrada = {
            new LaboratorioAlumno.Alumno(5, "Luis"),
            new LaboratorioAlumno.Alumno(2, "Pedro"),
            new LaboratorioAlumno.Alumno(4, "Maria")
        };

        LaboratorioAlumno.Alumno[] esperado = {
            new LaboratorioAlumno.Alumno(2, "Pedro"),
            new LaboratorioAlumno.Alumno(4, "Maria"),
            new LaboratorioAlumno.Alumno(5, "Luis")
        };

        LaboratorioAlumno.insercionPorCodigo(entrada);
        assertArrayEquals(esperado, entrada);
    }
}
