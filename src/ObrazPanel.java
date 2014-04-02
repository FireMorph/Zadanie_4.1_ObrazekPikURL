/**
 * Created by Mac on 02.04.14.
 */

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class ObrazPanel extends JPanel {    //Wymaga plik albo blad
    private BufferedImage[] obrazek;
    private Dimension wymiarObr1;
    private Dimension wymiarObr2;
    private Dimension wymiarSuma;

    public ObrazPanel() {
        super();
        obrazek = new BufferedImage[2];

        File plik = new File("java.jpg");

        try {
            obrazek[0] = ImageIO.read(plik);
        } catch (IOException ioe) {
            System.err.println("Blad odczytu pliku");
        }

        URL adres = null;
        try {
            adres = new URL("http://javastart.pl/wp-content/uploads/2012/12/jee.jpg");
        } catch (MalformedURLException mURLe) {
            System.err.println("Blad odczytu URL");
        }

        try {
            obrazek[1] = ImageIO.read(adres);
        } catch (IOException ioe) {
            System.err.println("Blad odczytu adresu URL");
        }
        wymiarObr1 = new Dimension(obrazek[0].getWidth(), obrazek[0].getHeight());
        wymiarObr2 = new Dimension(obrazek[1].getWidth(), obrazek[1].getHeight());

        wymiarSuma = new Dimension((int) (wymiarObr1.getWidth() + wymiarObr2.getWidth() + 100), (int) ( (wymiarObr1.getHeight() >= wymiarObr2.getHeight()) ? wymiarObr1.getHeight() : wymiarObr2.getHeight())  + 50);
        setPreferredSize(wymiarSuma);
    }

    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(obrazek[0], 0, 0, this);
        g.drawImage(obrazek[1], (int) (wymiarObr1.getWidth() + 50), 0, this);
    }
}
