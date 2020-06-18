package usta.sistemas;

import javax.swing.*;
import java.awt.*;

public class form_show_all_student extends JDialog{
    //AUTHOR: Jhon Alexis Piracoca Arcos
    //DATE: 2020/06/09
    //DESCRIPTION: this class show all data of file D:/students.txt
    public form_show_all_student(java.awt.Frame parent){
        super(parent,true);
        setLayout(new BorderLayout());
        //panel superior
        JPanel panel_superior = new JPanel();
        JLabel label_menu = new JLabel("List of Students",SwingConstants.CENTER);
        label_menu.setFont(new Font("Arial",0,20));
        panel_superior.add(label_menu);
        //panel central
        String[] columnsNames ={"Name","Last Name","Faculty"};
        file_data_student file_data_student1 = new file_data_student();
        JTable tabla_datos = new JTable(file_data_student1.f_all_data_students(),columnsNames);
        tabla_datos.setBounds(10,50,400,500);
        JScrollPane panel_central = new JScrollPane(tabla_datos);
        //añadimos los paneles
        add(panel_superior,BorderLayout.NORTH);
        add(panel_central,BorderLayout.CENTER);
        //parametros generales del formulario
        setSize(600,400);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        pack(); //modal
    }
}
