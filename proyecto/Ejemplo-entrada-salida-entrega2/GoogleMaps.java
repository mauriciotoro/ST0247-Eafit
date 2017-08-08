import java.awt.Desktop;
import java.net.*;
import java.io.IOException;

public class GoogleMaps {
    // Código para abrir un navegador y un URL desde Java
    // Cuando midan tiempo, no pongan esto porque les sale muy mal la medición.
    public static void hola()
    {
        if (Desktop.isDesktopSupported()) {
        Desktop desktop = Desktop.getDesktop();
        if (desktop.isSupported(Desktop.Action.BROWSE)) {
            try {
                desktop.browse(new URI("https://www.google.es/maps/dir/6.1521026,-75.6158273/6.1769038,-75.5853826/6.150728,-75.5312788/6.236831,-75.5706288/6.1868153,-75.5914233/6.2007872,-75.5786226/6.1742041,-75.3394911/6.2646443,-75.5684491/6.2541748,-75.4211777/6.1521026,-75.6158273/@6.2402553,-75.6186275,11z/data=!3m1!4b1"));
            }
            catch(IOException ioe) {
                ioe.printStackTrace();
            }
            catch(URISyntaxException use) {
                use.printStackTrace();
            }
        }
    }
    }
}