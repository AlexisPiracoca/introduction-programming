package usta.sistemas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form_menu extends JFrame {
    //AUTHOR: Jhon Alexis Piracoca Arcos
    //DATE: 2020/06/09
    //DESCRIPTION: constructor (se ejecuta cada vez que yo llame esta clase)
    public form_menu(){
        //label 1 menu
        JLabel label1 = new JLabel("SAC VERSION JAVA",SwingConstants.CENTER);
        label1.setFont(new Font("Arial",0,30));
        label1.setBounds(152,10,300,30);
        add(label1);
        //label del creador
        JLabel label2 = new JLabel("CREADO POR: Jhon Alexis Piracoca Arcos",SwingConstants.CENTER);
        label2.setBounds(6,350,590,20);
        add(label2);
        //button
        JButton button1 = new JButton("Iniciar");
        button1.setBounds(250,150,100,50);
        button1.setFont(new Font("Arial",0,19));
        button1.setBackground(Color.WHITE);
        //accion cuando le de click
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //codigo de lo que va hacer el boton
                //se crea una instancia del formulario principal
                form_principal form_principal1 = new form_principal();
            }
        });
        add(button1);
        //propiedades del formulario
        setLayout(null);
        setVisible(true);
        setResizable(false);
        setBounds(0,0,600,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
