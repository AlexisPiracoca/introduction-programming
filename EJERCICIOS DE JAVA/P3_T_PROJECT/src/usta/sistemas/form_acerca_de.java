package usta.sistemas;

import javax.swing.*;
import java.awt.*;

public class form_acerca_de extends JFrame {
    //AUTHOR: Jhon Alexis Piracoca Arcos
    //DATE: 2020/06/09
    //DESCRIPTION: this class is about
    public form_acerca_de(){
        //panel superior
        JPanel panel_superior = new JPanel();
        JLabel label_menu = new JLabel("ACERCA DE",SwingConstants.CENTER);
        label_menu.setFont(new Font("Arial",0,30));
        panel_superior.add(label_menu);
        //panel central
        JPanel panel_central = new JPanel();
        String[] listItems = {"-This software was make by: Jhon Alexis Piracoca Arcos","",
                "-Student of the faculty of systems engineering","",
                "-Santo Tomás University Seccional Tunja","",
                "-Email: jhon.piracoca@usantoto.edu.co","",
                "-Github: https://github.com/AlexisPiracoca"};
        JList list = new JList(listItems);
        list.setFont(new Font("Arial",0,14));
        panel_central.add(list);
        //panel fotos
        JLabel logo2= new JLabel();
        logo2.setIcon(new ImageIcon("img/foto.jpg"));
        JPanel panel_logo2 = new JPanel();
        panel_logo2.add(logo2);
        JLabel logo = new JLabel();
        logo.setIcon(new ImageIcon("img/logo_universidad.png"));
        JPanel panel_logo = new JPanel();
        panel_logo.add(logo);
        //agregamos los paneles del formulario
        add(panel_superior,BorderLayout.NORTH);
        add(panel_central,BorderLayout.WEST);
        add(panel_logo2,BorderLayout.EAST);
        add(panel_logo,BorderLayout.SOUTH);
        //patrametros del formulario
        setVisible(true);
        this.getContentPane().setBackground(Color.WHITE);
        setResizable(false);
        setBounds(0,0,580,400);
        setLocationRelativeTo(null);
    }

}
