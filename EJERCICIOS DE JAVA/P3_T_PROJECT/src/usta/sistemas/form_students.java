package usta.sistemas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form_students extends JDialog {
    //AUTHOR: Jhon Alexis Piracoca Arcos
    //DATE: 2020/06/09
    //DESCRIPTION: this class insert all data of file D:/students.txt
    JTextField text_name, text_lastname, text_faculty;
    public form_students(){
        JPanel panel_superior = new JPanel();
        JLabel label_menu = new JLabel("NEW STUDENT",SwingConstants.CENTER);
        label_menu.setFont(new Font("Arial",0,30));
        panel_superior.add(label_menu);
        //panel central
        JPanel panel_central = new JPanel();
        panel_central.setLayout(new GridLayout(5,2));
        panel_central.add(new JLabel("")); panel_central.add(new JLabel(""));
        panel_central.add(new JLabel("                     Name: "));
        panel_central.add(text_name = new JTextField(""));
        panel_central.add(new JLabel("                     Last Name: "));
        panel_central.add(text_lastname = new JTextField(""));
        panel_central.add(new JLabel("                     Faculty: "));
        panel_central.add(text_faculty = new JTextField(""));
        //panel inferior
        JPanel panel_inferior = new JPanel();
        JButton boton_crear = new JButton("Crear");
        boton_crear.setBounds(0,0,300,50);
        boton_crear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e ) {
                //aqui va codigo boton formulario
                f_crear_nuevo_estudiante(e);
            }
        });
        panel_inferior.add(boton_crear);

        add(panel_inferior,BorderLayout.SOUTH);
        add(panel_superior,BorderLayout.NORTH);
        add(panel_central,BorderLayout.CENTER);

        //parametros
        setBounds(0,0,400,250);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
    }
    public void f_crear_nuevo_estudiante(java.awt.event.ActionEvent evt){
        //DESCRIPTION: this method saves the data into file
        final JDialog ventana_emergente = new JDialog(this,"SAVE DATA",true);
        if(text_name.getText().length()<3 || text_lastname.getText().length()<3 || text_faculty.getText().length()<3){
            ventana_emergente.add(new JLabel("Todos los campos deben tener minimo tres caracteres"));
        }else{
            //grabaremos en un archivo
            file_data_student file_data_student1 = new file_data_student();
            boolean rpta = file_data_student1.f_add_student(text_name.getText(),text_lastname.getText(),text_faculty.getText());
            if(rpta==true){
                ventana_emergente.add(new JLabel("DATOS GUARDADOS CON EXITO"));
                text_name.setText("");
                text_lastname.setText("");
                text_faculty.setText("");
            }else{
                ventana_emergente.add(new JLabel("Los dato NO se pueden guardar en el archivo D:/students.txt"));
            }
        }
        ventana_emergente.pack();
        ventana_emergente.setVisible(true);
    }
}
