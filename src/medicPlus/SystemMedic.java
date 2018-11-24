package medicPlus;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SystemMedic {

    public static void startSystem(){

        JFrame f = montarFrame();

        Dashboard dash = new Dashboard();
        dash.montarDashboard(f);

        configFrame(f);

    }

    public static JFrame montarFrame() {

        JFrame f = new JFrame("MEDIC+ :: Dashboard");
        menuBar(f);

        return f;

    }


    public static void menuBar(JFrame f) {

        JMenu menuArquivo = new JMenu("Arquivo");
            JMenu subMenuSalvar = new JMenu("Salvar");
                JMenuItem itemAbrir = new JMenuItem("Abrir");
                JMenuItem itemSalvar = new JMenuItem("Salvar");
                JMenuItem itemSalComo = new JMenuItem("Salvar como");
                JMenuItem gr = new JMenuItem("Exportar PDF");
        JMenu navegar = new JMenu("Navegar");
            JMenuItem inicio = new JMenuItem("Inicio");
            JMenuItem sair = new JMenuItem("Sair");

        subMenuSalvar.add(itemSalvar);
        subMenuSalvar.add(itemSalComo);
        menuArquivo.add(itemAbrir);
        menuArquivo.add(subMenuSalvar);
        menuArquivo.addSeparator();
        menuArquivo.add(gr);

        navegar.add(inicio);
        navegar.add(sair);


        JMenuBar menuCompleto = new JMenuBar();
        menuCompleto.add(menuArquivo);
        menuCompleto.add(navegar);
        f.setJMenuBar(menuCompleto);

        //EVENTS BAR

        sair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }


    public static void configFrame(JFrame f) {

        f.setSize(400, 300);
        f.setResizable(false);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
