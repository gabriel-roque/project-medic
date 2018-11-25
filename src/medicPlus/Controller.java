package medicPlus;

import javax.swing.*;

import static medicPlus.SystemMedic.configFrame;
import static medicPlus.SystemMedic.menuBar;

public class Controller {

    public void dashboard(){

        JFrame f = new JFrame("MEDIC+ :: Dashboard");
        menuBar(f);

        Dashboard dash = new Dashboard();
        dash.montarDashboard(f);

        configFrame(f);

    }

    public void detalhes(){

        JFrame f = new JFrame("MEDIC+ :: Detalhes");
        menuBar(f);

        Detalhes det = new Detalhes();
        det.montarDetalhes(f);

        configFrame(f);

    }



}