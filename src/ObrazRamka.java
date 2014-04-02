/**
 * Created by Mac on 02.04.14.
 */

import javax.swing.*;

public class ObrazRamka extends JFrame {
    public ObrazRamka() {
        super("Obrazki");
        ObrazPanel panel = new ObrazPanel();
        add(panel);
        setSize(panel.getSize());
        pack();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

    }
}
