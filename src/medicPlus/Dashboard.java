package medicPlus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.sun.deploy.uitoolkit.ToolkitStore.dispose;


public class Dashboard{


    public void montarDashboard(JFrame f){

        String[] clientes = {"Gabriel Roque de Mirada", "Jadilson Guedes Silva", "Felipe Oliveira Alves", "Lucas Roque Falcao"};

        //LABEL Cliente

        JLabel Lbclientes = new JLabel("Clientes");
            Font fontCliente = new Font("SansSerif", Font.BOLD, 25);
            Lbclientes.setFont(fontCliente);
            Lbclientes.setBounds(10,10 ,120, 20);
        f.add(Lbclientes);


        //BUTTON Novo Cliente

        JButton btNewCli = new JButton("Novo Cliente");
            btNewCli.setBounds(255,10, 130,25);
        f.add(btNewCli);

        //SEPARATOR

        JSeparator spDash = new JSeparator();
            spDash.setBounds(10,40,375,15);
        f.add(spDash);


        //Coluna NOME

        Font fontNome = new Font("SansSerif", Font.BOLD, 19);
        JLabel nome = new JLabel("Nome");
        nome.setFont(fontNome);
            nome.setBounds(10,50,100,20);
        f.add(nome);

        Font fontNomeList = new Font("SansSerif", Font.ITALIC, 19);
        DefaultListModel<String> l1 = new DefaultListModel<>();

            for (String view : clientes){ //Exibe nomes

                l1.addElement(view);

            }

        JList<String> list = new JList<>(l1);
        list.setFont(fontNomeList); //font sytle
        list.setBounds(10,80, 230,160);
        f.add(list);

        //SEPARATOR

        JSeparator sp1 = new JSeparator(SwingConstants.VERTICAL);
            sp1.setBounds(255,50, 15,190);
        f.add(sp1);

        //DETALHES Botao

        JButton btPesq = new JButton();
        btPesq.setIcon(new ImageIcon(getClass().getResource("/public/lupa.png")));

        btPesq.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Controller cot = new Controller();
                cot.detalhes();

            }

        });

        btPesq.setBounds(300, 80, 50,20);
        f.add(btPesq);


    }


}
