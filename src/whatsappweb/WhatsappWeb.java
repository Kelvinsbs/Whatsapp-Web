package whatsappweb;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.LayoutManager;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WhatsappWeb {

    public static void main(String[] args) {

        //Decoração do Frame
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Botoes para definir o layout do borderLayout e a base da aplicação
        JButton jb1 = new JButton("WEST");
        jb1.setPreferredSize(new Dimension(500, 860));
//       JButton jb2 = new JButton("EAST");

        //Painel Esquerdo Primeiro
        JPanel panel3 = new JPanel();
        BoxLayout boxlayout = new BoxLayout(panel3, BoxLayout.X_AXIS);
        panel3.setLayout(boxlayout);
        panel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        JButton ImagemUsuario = new JButton("Icone Usuario");
        JButton jbEdois = new JButton("IconConversa");
        JButton jbEtreis = new JButton("TresPontos");

        panel3.add(ImagemUsuario);
        panel3.add(jbEdois);
        panel3.add(jbEtreis);

        //Painel Esquerdo Segunda Parte - JTextField
        JPanel panel4 = new JPanel();
        panel4.setLayout(new BorderLayout());
        panel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        JLabel Lupa = new JLabel("Lupa");
        JTextField PesquisarContato = new JTextField("Pesquisar Contato");

        panel4.add(Lupa, BorderLayout.WEST);
        panel4.add(PesquisarContato, BorderLayout.CENTER);

        //Painel Esquerdo Terceira Parte - Contatos
        JPanel PainelContato = new JPanel();
        PainelContato.setLayout(new GridBagLayout());
        PainelContato.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        PainelContato.add(new JLabel("ImgContato   "), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        PainelContato.add(new JLabel("NomeContato   "), gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        PainelContato.add(new JLabel("Horas   "), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        PainelContato.add(new JLabel("TextoMsg   "), gbc);

        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        PainelContato.add(new JLabel("Silenciar"), gbc);

        //Painel Esquerdo Terceira Parte - Contatos 2
        JPanel PainelContato2 = new JPanel();
        PainelContato2.setLayout(new GridBagLayout());
        PainelContato2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        //
        GridBagConstraints gbc2 = new GridBagConstraints();

        gbc2.fill = GridBagConstraints.HORIZONTAL;
        gbc2.gridx = 0;
        gbc2.gridy = 0;
//        gbc.gridheight = 2;
        PainelContato2.add(new JLabel("ImgContato   "), gbc2);

        gbc2.gridx = 1;
        gbc2.gridy = 0;
//        gbc.gridwidth = 2;
        PainelContato2.add(new JLabel("NomeContato   "), gbc2);

        gbc2.gridx = 2;
        gbc2.gridy = 0;
        gbc2.fill = GridBagConstraints.HORIZONTAL;
        PainelContato2.add(new JLabel("Horas   "), gbc2);

        gbc2.gridx = 1;
        gbc2.gridy = 1;
        gbc2.fill = GridBagConstraints.HORIZONTAL;
//        gbc.gridwidth = 2;
        PainelContato2.add(new JLabel("TextoMsg   "), gbc2);

        gbc2.gridx = 2;
        gbc2.gridy = 1;
        gbc2.fill = GridBagConstraints.HORIZONTAL;
        PainelContato2.add(new JLabel("Silenciar"), gbc2);
        
        //Painel Esquerdo Terceira Parte - Contatos 2
        JPanel PainelContato3 = new JPanel();
        PainelContato3.setLayout(new GridBagLayout());
        PainelContato3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        //
        GridBagConstraints gbc3 = new GridBagConstraints();

        gbc3.fill = GridBagConstraints.HORIZONTAL;
        gbc3.gridx = 0;
        gbc3.gridy = 0;
//        gbc.gridheight = 2;
        PainelContato3.add(new JLabel("ImgContato   "), gbc3);

        gbc3.gridx = 1;
        gbc3.gridy = 0;
//        gbc.gridwidth = 2;
        PainelContato3.add(new JLabel("NomeContato   "), gbc3);

        gbc3.gridx = 2;
        gbc3.gridy = 0;
        gbc3.fill = GridBagConstraints.HORIZONTAL;
        PainelContato3.add(new JLabel("Horas   "), gbc3);

        gbc3.gridx = 1;
        gbc3.gridy = 1;
        gbc3.fill = GridBagConstraints.HORIZONTAL;
//        gbc.gridwidth = 2;
        PainelContato3.add(new JLabel("TextoMsg   "), gbc3);

        gbc3.gridx = 2;
        gbc3.gridy = 1;
        gbc3.fill = GridBagConstraints.HORIZONTAL;
        PainelContato3.add(new JLabel("Silenciar"), gbc3);
        
        //Painel Esquerdo Terceira Parte - Contatos 2
        JPanel PainelContato4 = new JPanel();
        PainelContato4.setLayout(new GridBagLayout());
        PainelContato4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        //
        GridBagConstraints gbc4 = new GridBagConstraints();

        gbc4.fill = GridBagConstraints.HORIZONTAL;
        gbc4.gridx = 0;
        gbc4.gridy = 0;
//        gbc.gridheight = 2;
        PainelContato4.add(new JLabel("ImgContato   "), gbc4);

        gbc4.gridx = 1;
        gbc4.gridy = 0;
//        gbc.gridwidth = 2;
        PainelContato4.add(new JLabel("NomeContato   "), gbc4);

        gbc4.gridx = 2;
        gbc4.gridy = 0;
        gbc4.fill = GridBagConstraints.HORIZONTAL;
        PainelContato4.add(new JLabel("Horas   "), gbc4);

        gbc4.gridx = 1;
        gbc4.gridy = 1;
        gbc4.fill = GridBagConstraints.HORIZONTAL;
//        gbc.gridwidth = 2;
        PainelContato4.add(new JLabel("TextoMsg   "), gbc4);

        gbc4.gridx = 2;
        gbc4.gridy = 1;
        gbc4.fill = GridBagConstraints.HORIZONTAL;
        PainelContato4.add(new JLabel("Silenciar"), gbc4);

       //Frame Principal
        //Divide a Aplicação em Duas partes
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        panel.setLayout(new BorderLayout());
        panel2.setLayout(new BorderLayout());

        //Painel da Esquerda
        JPanel panelEsquerdo = new JPanel();
        BoxLayout boxlayoutPainelEsquerdo = new BoxLayout(panelEsquerdo, BoxLayout.Y_AXIS);
        panelEsquerdo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelEsquerdo.setLayout(boxlayoutPainelEsquerdo);
        panel.add(panelEsquerdo);
        panelEsquerdo.add(panel3);
        panelEsquerdo.add(panel4);
        panelEsquerdo.add(PainelContato);
        panelEsquerdo.add(PainelContato2);
        panelEsquerdo.add(PainelContato3);
        panelEsquerdo.add(PainelContato4);

        //Painel da Direita
        JPanel panelDireito = new JPanel();
        panelDireito.setLayout(new BorderLayout());
        //cabecalho
        JPanel panelCabecalho = new JPanel();
        panelCabecalho.setLayout(new GridBagLayout());
        panelCabecalho.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        GridBagConstraints gbcD = new GridBagConstraints();

        gbcD.fill = GridBagConstraints.HORIZONTAL;
        gbcD.gridx = 0;
        gbcD.gridy = 0;
        panelCabecalho.add(new JButton("Img"), gbcD);

        gbcD.gridx = 1;
        gbcD.gridy = 0;
        panelCabecalho.add(new JButton("nome"), gbcD);

        gbcD.gridx = 1;
        gbcD.gridy = 1;
        gbcD.fill = GridBagConstraints.HORIZONTAL;
        panelCabecalho.add(new JButton("status"), gbcD);

        gbcD.gridx = 2;
        gbcD.gridy = 0;
        gbcD.fill = GridBagConstraints.HORIZONTAL;
        panelCabecalho.add(new JButton("icone"), gbcD);

        gbcD.gridx = 3;
        gbcD.gridy = 0;
        gbcD.fill = GridBagConstraints.HORIZONTAL;
        panelCabecalho.add(new JButton("pontos"), gbcD);

        ///conversas
        JPanel panelConversas = new JPanel();
        panelConversas.setLayout(new BorderLayout());

        JLabel conversaPessoa = new JLabel("Hahahaha, ola, como você esta?");
        JLabel conversaEu = new JLabel("Estou bem e você?");

        panelConversas.add(conversaPessoa, BorderLayout.WEST);
        panelConversas.add(conversaEu, BorderLayout.EAST);

        //digitar
        JPanel panelDigitar = new JPanel();
        panelDigitar.setLayout(new BorderLayout());
        JLabel emote = new JLabel("Emote");
        JTextField input = new JTextField("Insira aqui a msg");
        JButton enviar = new JButton("Enviar");

        panelDigitar.add(emote, BorderLayout.WEST);
        panelDigitar.add(input, BorderLayout.CENTER);
        panelDigitar.add(enviar, BorderLayout.EAST);

        panelDireito.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelDireito.add(panelCabecalho, BorderLayout.NORTH);
        panelDireito.add(panelConversas, BorderLayout.CENTER);
        panelDireito.add(panelDigitar, BorderLayout.SOUTH);
        panel2.add(panelDireito);
        //Frame
        frame.setSize(1440, 860);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.add(panel, BorderLayout.WEST);
        frame.add(panel2, BorderLayout.CENTER);
        frame.setVisible(true);
        frame.pack();

    }

    private static String getResource(String userIconpng) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
