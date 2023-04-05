package Proxy;

// Clase que proporciona una implementación real de la funcionalidad de conexión a internet
public class RealInternet implements Internet {
    public void connectTo(String url) {
        System.out.println("Conectando a " + url);
    }
}
