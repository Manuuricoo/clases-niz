import java.util.ArrayList;
import java.util.List;

public class GestorMensajes {
    private List<PlataformaMensajeria> plataformasEnOrden = new ArrayList<>();

    public void agregarPlataforma(PlataformaMensajeria plataforma) {
        plataformasEnOrden.add(plataforma);
    }

    public void setOrden(List<PlataformaMensajeria> nuevoOrden) {
        plataformasEnOrden = nuevoOrden;
    }

    public void enviar(Mensaje mensaje) {
        for (PlataformaMensajeria plataforma : plataformasEnOrden) {
            plataforma.enviar(mensaje);
        }
    }
}