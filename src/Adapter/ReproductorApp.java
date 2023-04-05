package Adapter;

public class ReproductorApp {
    // Interfaz Reproductor
    public interface Reproductor {
        void reproducir();
    }

    // Clase ReproductorDeMp3 que implementa la interfaz Reproductor
    public static class ReproductorDeMp3 implements Reproductor {
        public void reproducir() {
            System.out.println("Reproduciendo archivo de formato mp3...");
        }
    }

    // Clase ReproductorDeWav que NO implementa la interfaz Reproductor
    public static class ReproductorDeWav {
        public void reproducirWav() {
            System.out.println("Reproduciendo archivo de formato wav...");
        }
    }

    // Clase AdaptadorDeWav que implementa la interfaz Reproductor y utiliza la clase ReproductorDeWav mediante
    // un objeto
    public static class AdaptadorDeWav implements Reproductor {
        private ReproductorDeWav reproductorDeWav;

        public AdaptadorDeWav(ReproductorDeWav reproductorDeWav) {
            this.reproductorDeWav = reproductorDeWav;
        }

        public void reproducir() {
            reproductorDeWav.reproducirWav();
        }
    }

    // Clase de prueba que utiliza los reproductores y adaptadores
    public static class PruebaAdaptador {
        public static void main(String[] args) {
            Reproductor reproductor1 = new ReproductorDeMp3();
            reproductor1.reproducir();

            ReproductorDeWav reproductorDeWav = new ReproductorDeWav();
            Reproductor reproductor2 = new AdaptadorDeWav(reproductorDeWav);
            reproductor2.reproducir();
        }
    }

}
