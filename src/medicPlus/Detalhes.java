package medicPlus;

import javax.swing.*;
import java.awt.*;

public class Detalhes{

    public void montarDetalhes(JFrame f){

        // GRID DE DADOS

        JSeparator sp1 = new JSeparator();
            sp1.setBounds(10, 10, 130, 10);
            f.add(sp1);

        JSeparator sp2 = new JSeparator();
            sp2.setBounds(10, 240, 130, 10);
            f.add(sp2);

        JSeparator sp3 = new JSeparator(SwingConstants.VERTICAL);
            sp3.setBounds(10, 10, 10, 230);
            f.add(sp3);

        JSeparator sp4 = new JSeparator(SwingConstants.VERTICAL);
            sp4.setBounds(140, 10, 10, 230);
            f.add(sp4);


        // DADOS CLIENTE

        JLabel lbNome, lbSexo, lbCPF;
        JLabel nome, sexo, cpf;
        String[] p1 = {"Camila Rocha", "Feminino", "559.035.996-89"};

        Font fontD = new Font("SansSerif", Font.BOLD, 18);
        Font fontCP = new Font("SansSerif", Font.ITALIC, 14);

        lbNome = new JLabel("NOME");
            lbNome.setBounds(15,25, 100,15);
            lbNome.setFont(fontD);
            f.add(lbNome);

        nome = new JLabel(p1[0]);
            nome.setBounds(15,60, 100,15);
            nome.setFont(fontCP);
            f.add(nome);

        lbSexo = new JLabel("SEXO");
            lbSexo.setBounds(15,100, 100,15);
            lbSexo.setFont(fontD);
            f.add(lbSexo);

        sexo = new JLabel(p1[1]);
            sexo.setBounds(15,135, 100,15);
            sexo.setFont(fontCP);
            f.add(sexo);

        lbCPF = new JLabel("CPF");
            lbCPF.setBounds(15,175, 100,15);
            lbCPF.setFont(fontD);
            f.add(lbCPF);

        cpf = new JLabel(p1[2]);
            cpf.setBounds(15,200, 100,15);
            cpf.setFont(fontCP);
            f.add(cpf);


        // LABEL TABELA

        JLabel data, tipo, valor;

        data = new JLabel("Data");
            data.setBounds(160, 10,80,20);
            data.setFont(fontD);
            f.add(data);

        tipo = new JLabel("Tipo");
            tipo.setBounds(232, 10,80,20);
            tipo.setFont(fontD);
            f.add(tipo);

        valor = new JLabel("Valor");
            valor.setBounds(308, 10,80,20);
            valor.setFont(fontD);
            f.add(valor);

        // TABELA (AGENDA)

        String date[][]=
                {{"10/01/18","Consulta","R$ 0"},
                {"15/02/18","Exame","R$ 85,00"},
                {"16/02/18","Exame","R$ 336,00"},
                {"12/05/18", "Consulta", "R$ 115,00"},
                {"31/08/18", "Exame", "R$ 255,00"},
                {"22/12/18", "Retorno", "R$ 0"}};

        String collumn[] = {"DATA", "TIPO", "VALOR"};

        JTable tabela = new JTable(date, collumn);
        tabela.setBounds(160,40,220,160);

        f.add(tabela);


        // BUTTON DASHBOARD

        JButton back = new JButton("Voltar");
            back.setBounds(230, 215, 80,25);
            f.add(back);

        back.addActionListener(e -> {

            Controller cot = new Controller();
            f.dispose();
            cot.dashboard();



        });


    }
}
