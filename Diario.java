import java.util.ArrayList;
import java.util.List;

public class Diario implements  Observado{
    private String nombre;
    private List<observador> subscriptoresList;
    public Diario(String nombre){
        this.nombre=nombre;
        subscriptoresList= new ArrayList<>();
    }

    @Override
    public void agregarObservador(observador Observador) {
        subscriptoresList.add(Observador);
    }

    @Override
    public void notifyAllobserver() {
        for (observador O: subscriptoresList){
            O.actualizar();
        }
    }

    @Override
    public void removerObservador(observador Observador) {
        subscriptoresList.remove(Observador);
    }
    public void publicar(){
        System.out.println("nuevo articulo en el diario online");
        notifyAllobserver();
    }
}
