package medicPlus;

import javax.swing.*;
import java.awt.*;

public class Detalhes{

    public void montarDetalhes(JFrame f){

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






    }
}
