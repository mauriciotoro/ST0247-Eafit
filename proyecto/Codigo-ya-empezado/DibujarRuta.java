package ruteovehiculoselectricos;

/**
 *
 * @author ljpalaciom
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JFrame;

/**
 *
 * @author Javi
 */
public class DibujarRuta extends JPanel {

    Pair[] coordenadas;
    List<ArrayList<Integer>> rutas;

    public DibujarRuta(Pair[] coordenadas, List<ArrayList<Integer>> rutas) {
        this.coordenadas = coordenadas;
        this.rutas = rutas;
    }

    @Override
    public void paintComponent(Graphics g) {
        DibujarLineas(g);
    }

    public void DibujarLineas(Graphics g) {

        for (List<Integer> ruta : rutas) {
            int xInicial, yInicial, xFinal, yFinal;
            xInicial = Math.round((float) coordenadas[ruta.get(0)].first);
            yInicial = Math.round((float) coordenadas[ruta.get(0)].second);

            for (int i = 0; i < ruta.size(); ++i) {
                int actual = ruta.get(i);
                xFinal = Math.round((float) coordenadas[actual].first);
                yFinal = Math.round((float) coordenadas[actual].second);

                g.setColor(Color.DARK_GRAY);
                g.drawLine(xInicial * 5 + 250, yInicial * 5 + 40, xFinal * 5 + 250, yFinal * 5 + 40);
                // g.drawString(String.valueOf(actual), xFinal*5 + 250,yFinal*5 + 40);
                if (actual != 0) {
                    g.setColor(Color.red);
                    g.fillOval(xFinal * 5 + 250, yFinal * 5 + 40, 5, 5);
                }
                xInicial = xFinal;
                yInicial = yFinal;
            }

            g.setColor(Color.GREEN);
            g.fillOval(xInicial * 5 + 240, yInicial * 5 + 30, 20, 20);
        }
    }
}
