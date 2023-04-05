package Proxy;

import java.util.ArrayList;
import java.util.List;

// Clase proxy que actúa como intermediario entre el cliente y la clase RealInternet
public class ProxyInternet implements Internet {
    private Internet realInternet = new RealInternet();
    private List<String> restrictedSites;

    public ProxyInternet() {
        restrictedSites = new ArrayList<String>();
        restrictedSites.add("site1.com");
        restrictedSites.add("site2.com");
        restrictedSites.add("site3.com");
    }

    // Verifica si el sitio está restringido antes de permitir que se conecte a través de la clase RealInternet
    public void connectTo(String url) {
        if (restrictedSites.contains(url.toLowerCase())) {
            System.out.println("Acceso denegado a " + url);
        } else {
            realInternet.connectTo(url);
        }
    }
}
