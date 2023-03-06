public class LibroCalificaciones
{
    private String TecnicasDeProgramacion1;


    public void establecerNombreDelCurso( String nombre){

        TecnicasDeProgramacion1 = nombre;
    }
    public String obtenerNombreDelCurso(){
        return TecnicasDeProgramacion1;
    }
    public void mostrarMensaje(){
        System.out.printf("Bienvenido al libro de calificaciones para\n%s!\n ", obtenerNombreDelCurso() );
    }
}
