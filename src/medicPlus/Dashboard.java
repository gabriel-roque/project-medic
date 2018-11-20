package medicPlus;

import javax.swing.*;
import java.awt.*;


public class Dashboard {


    public void montarDashboard(JFrame f){

        String[] clientes = {"Gabriel Roque", "Jadilson Guedes", "Felipe Oliveira", "Lucas Roque"};

        //LABEL Cliente

        JLabel Lbclientes = new JLabel("Clientes");
            Font fontCliente = new Font("SansSerif", Font.BOLD, 20);
            Lbclientes.setFont(fontCliente);
            Lbclientes.setBounds(10,10 ,120, 15);
        f.add(Lbclientes);


        //BUTTON Novo Cliente

        JButton btNewCli = new JButton("Novo Cliente");
            btNewCli.setBounds(355,10, 130,25);
        f.add(btNewCli);

        //SEPARATOR

        JSeparator spDash = new JSeparator();
            spDash.setBounds(10,40,475,15);
        f.add(spDash);


        //Coluna NOME

        Font fontNome = new Font("SansSerif", Font.BOLD, 19);
        JLabel nome = new JLabel("Nome");
        nome.setFont(fontNome);
            nome.setBounds(10,50,100,20);
        f.add(nome);

        Font fontNomeList = new Font("SansSerif", Font.ITALIC, 17);
        DefaultListModel<String> l1 = new DefaultListModel<>();

            for (String view  : clientes){ //Exibe nomes

                l1.addElement(view);

            }

        JList<String> list = new JList<>(l1);
        list.setFont(fontNomeList); //font sytle
        list.setBounds(10,80, 130,160);
        f.add(list);

        //SEPARATOR

        JSeparator sp1 = new JSeparator(SwingConstants.VERTICAL);
            sp1.setBounds(150,50, 15,190);
        f.add(sp1);






//        String data[][]={ {"101","Amit","670000"},
//                {"102","Jai","780000"},
//                {"101","Sachin","700000"}};
//        String column[]={"ID","NAME","SALARY"};
//        JTable tableCli = new JTable(data, column);
//        tableCli.setBounds(10,70,400,150);
//


//        String data[][]={ {"101","Amit","670000"},
//                {"102","Jai","780000"},
//                {"101","Sachin","700000"}};
//        String column[]={"ID","NAME","SALARY"};
//        JTable jt=new JTable(data,column);
//        jt.setBounds(120,40,200,100);
//        JScrollPane sp=new JScrollPane(jt);
//        f.add(jt);
//
////
//        f.add(tableCli);









    }
}
