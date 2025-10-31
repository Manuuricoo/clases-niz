
interface Estado {
    void cambiar(Semaforo s);

    void mostrar();
}

class EstadoRojo implements Estado {
    @Override
    public void cambiar(Semaforo s) {
        s.setEstado(new EstadoVerde());
    }

    @Override
    public void mostrar() {
        System.out.println("El semáforo está en ROJO");
    }
}

class EstadoVerde implements Estado {
    @Override
    public void cambiar(Semaforo s) {
        s.setEstado(new EstadoAmarillo());
    }

    @Override
    public void mostrar() {
        System.out.println("El semáforo está en VERDE");
    }
}

class EstadoAmarillo implements Estado {
    @Override
    public void cambiar(Semaforo s) {
        s.setEstado(new EstadoRojo());
    }

    @Override
    public void mostrar() {
        System.out.println("El semáforo está en AMARILLO");
    }
}

public class Semaforo {
    private Estado estado;

    public Semaforo() {
        this.estado = new EstadoRojo(); // estado inicial
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void cambiarEstado() {
        estado.cambiar(this);
    }

    public void mostrarEstado() {
        estado.mostrar();
    }

    public static void main(String[] args) throws InterruptedException {
        Semaforo s = new Semaforo();

        while (true) {
            s.mostrarEstado();
            Thread.sleep(2000);
            s.cambiarEstado();
        }
    }
}