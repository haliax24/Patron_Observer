public class Lector implements observador{
    private String nombre;
    private Integer edad;

    public Lector(Integer edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    @Override
    public void actualizar() {
        System.out.println("Yo soy "+ nombre+ " y estoy leyendo el new  articulo");
    }
}
