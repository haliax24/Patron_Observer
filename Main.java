//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Lector lector= new Lector(22,"Piter");
            Lector lector2= new Lector(60,"Norma");

            Diario diario= new Diario("Nuevo diario papa");
            diario.agregarObservador(lector2);
            diario.agregarObservador(lector);

            diario.publicar();

    }
}