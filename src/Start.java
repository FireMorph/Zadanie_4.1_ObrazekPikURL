/**
 * Created by Mac on 02.04.14.
 */

import java.awt.*;

public class Start {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ObrazRamka();
            }
        });
    }
}
