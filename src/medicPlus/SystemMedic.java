package medicPlus;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static medicPlus.Controller.*;


public class SystemMedic {

    public static void startSystem(){

        Controller cot = new Controller();
        cot.login();

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

        inicio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Controller cot = new Controller();
                cot.login();
                f.setVisible(false);
            }
        });

        sair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }


    public static void configFrame(JFrame f, int width, int height) {

        f.setSize(width, height);
        f.setResizable(false);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
