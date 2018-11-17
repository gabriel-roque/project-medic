package medicPlus;

import javax.swing.*;

public class System {


    public static void main(String[] args) {


        startSystem(); // inicia o sistema



    }

    public static void startSystem(){

        JFrame f = montarFrame();
        montarFrame();

        Dashboard dash = new Dashboard();
        dash.montarDashboard(f);

        configFrame(f);

    }

    public static JFrame montarFrame() {

        JFrame f = new JFrame("MEDIC+");
        return f;

    }

    public static void configFrame(JFrame f) {

        f.setSize(385, 280);
        f.setResizable(false);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
