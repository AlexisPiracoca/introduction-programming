package usta.sistemas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form_principal extends JFrame {
    //AUTHOR: Jhon Alexis Piracoca Arcos
    //DATE: 2020/06/09
    //DESCRIPTION: aqui van todas las funciones de los botones
    public form_principal() {
        setTitle("SAC VERSION JAVA 1.0"); //TITULO DEL SOFTWARE
        setLayout(new BorderLayout());
        JPanel panel_superior = new JPanel();
        JLabel label_menu = new JLabel("MENÚ PRINCIPAL", SwingConstants.CENTER);
        label_menu.setFont(new Font("Arial", 0, 20));
        panel_superior.add(label_menu);
        //panel izquierdo  (donde van a estar los botones)
        JPanel panel_izquierdo = new JPanel();
        panel_izquierdo.setLayout(new GridLayout(3, 1));
        //creamos el primer boton
        JButton boton_formulario1 = new JButton("NEW STUDENT");
        boton_formulario1.setBounds(0, 0, 100, 30);
        boton_formulario1.setFont(new Font("Arial", 0, 20));
        boton_formulario1.setBackground(Color.WHITE);
        boton_formulario1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //aqui va codigo boton formulario
                form_students form_students1 = new form_students();
            }
        });
        panel_izquierdo.add(boton_formulario1);
        //creamos el segundo boton
        JButton boton_formulario2 = new JButton("LIST ALL STUDENTS");
        boton_formulario2.setBounds(0, 0, 100, 30);
        boton_formulario2.setFont(new Font("Arial", 0, 20));
        boton_formulario2.setBackground(Color.WHITE);
        boton_formulario2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //aqui va codigo boton formulario
                f_open_form_show_all_students(e);
            }
        });
        panel_izquierdo.add(boton_formulario2);
        //boton agregar proyecto
        JButton boton_proyecto = new JButton("NEW PROJECT");
        boton_proyecto.setBounds(0, 0, 100, 30);
        boton_proyecto.setFont(new Font("Arial", 0, 20));
        boton_proyecto.setBackground(Color.WHITE);
        boton_proyecto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //aqui va codigo boton formulario
                form_project form_project1 = new form_project();
            }
        });
        panel_izquierdo.add(boton_proyecto);
        //aqui va el boton del nuevo proyeto
        JButton boton_nuevo_proyecto = new JButton("LIST OF PROJECTS");
        boton_nuevo_proyecto.setBounds(0, 0, 100, 30);
        boton_nuevo_proyecto.setFont(new Font("Arial", 0, 20));
        boton_nuevo_proyecto.setBackground(Color.WHITE);
        boton_nuevo_proyecto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //aqui va codigo boton formulario
                f_open_form_show_all_project(e);
            }
        });
        panel_izquierdo.add(boton_nuevo_proyecto);
        //boton acerca de
        //creamos el segundo boton
        JButton acerca_de = new JButton("ABOUT");
        acerca_de.setBounds(0, 0, 100, 30);
        acerca_de.setFont(new Font("Arial", 0, 20));
        acerca_de.setBackground(Color.WHITE);
        acerca_de.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //aqui va codigo boton formulario
                form_acerca_de form_acerca_de1 = new form_acerca_de();
            }
        });
        panel_izquierdo.add(acerca_de);
        //creamos el panel inferior
        JPanel panel_inferior = new JPanel();
        panel_inferior.add(new JLabel("CREADO POR: Jhon Alexis Piracoca Arcos"));
        //agregar los paneles al formulario (jframe)
        add(panel_izquierdo, BorderLayout.CENTER);
        add(panel_superior, BorderLayout.NORTH);
        add(panel_inferior, BorderLayout.SOUTH);

        //parametros generales del formulario
        setVisible(true);
        setResizable(false);
        setBounds(0, 0, 600, 400);
        setLocationRelativeTo(null);
    }

    private void f_open_form_show_all_students(java.awt.event.ActionEvent evt) {
        form_show_all_student form_show_all_student1 = new form_show_all_student(this);
    }

    private void f_open_form_show_all_project(java.awt.event.ActionEvent evt) {
        form_show_all_project form_show_all_project1 = new form_show_all_project(this);
    }
}
