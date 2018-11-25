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

        configFrame(f, 400, 300);

    }

    public void detalhes(){

        JFrame f = new JFrame("MEDIC+ :: Detalhes");
        menuBar(f);

        Detalhes det = new Detalhes();
        det.montarDetalhes(f);

        configFrame(f, 400, 300);

    }

    public void newCliente(){


        JFrame f = new JFrame("MEDIC+ :: Novo Cliente");
        menuBar(f);

        NovoCliente newCli = new NovoCliente();
        newCli.montarNewCli(f);

        configFrame(f, 400, 300);

    }

    public void login(){

        JFrame f = new JFrame("MEDIC+ :: Login");

        Login login = new Login();
        login.montarLogin(f);

        configFrame(f, 400, 300);

    }
}
