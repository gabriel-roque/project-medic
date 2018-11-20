package medicPlus;

import javax.swing.*;

public class System {


    public static void main(String[] args) {


        startSystem(); // inicia o sistema



    }

    public static void startSystem(){

        JFrame f = montarFrame();
        menuBar(f);

        Dashboard dash = new Dashboard();
        dash.montarDashboard(f);

        configFrame(f);

    }

    public static JFrame montarFrame() {

        JFrame f = new JFrame("MEDIC+");
        return f;

    }


    private static void menuBar(JFrame f) {

        JMenu menuArquivo = new JMenu("Arquivo");
            JMenu subMenuSalvar = new JMenu("Salvar");
                JMenuItem itemAbrir = new JMenuItem("Abrir");
                JMenuItem itemSalvar = new JMenuItem("Salvar");
                JMenuItem itemSalComo = new JMenuItem("Salvar como");
                JMenuItem gr = new JMenuItem("Exportar PDF");
        JMenu menuSair = new JMenu("Sair");

        subMenuSalvar.add(itemSalvar);
        subMenuSalvar.add(itemSalComo);
        menuArquivo.add(itemAbrir);
        menuArquivo.add(subMenuSalvar);
        menuArquivo.addSeparator();
        menuArquivo.add(gr);
        menuArquivo.add(menuSair);


        JMenuBar menuCompleto = new JMenuBar();
        menuCompleto.add(menuArquivo);
        menuCompleto.add(menuSair);
        f.setJMenuBar(menuCompleto);

    }


    public static void configFrame(JFrame f) {

        f.setSize(500, 300);
        f.setResizable(false);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
