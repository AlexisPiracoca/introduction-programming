package usta.sistemas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form_project extends JDialog{
    //AUTHOR: Jhon Alexis Piracoca Arcos
    //DATE: 2020/06/09
    //DESCRIPTION: this class insert all data of file D:/project.txt
    JTextField text_code, text_name, text_faculty, text_researcher;
    public form_project(){
        JPanel panel_superior = new JPanel();
        JLabel label_menu = new JLabel("NEW PROJECT",SwingConstants.CENTER);
        label_menu.setFont(new Font("Arial",0,30));
        panel_superior.add(label_menu);
        //panel central
        JPanel panel_central = new JPanel();
        panel_central.setLayout(new GridLayout(5,2));
        panel_central.add(new JLabel("")); panel_central.add(new JLabel(""));
        panel_central.add(new JLabel("                     Code: "));
        panel_central.add(text_code = new JTextField(""));
        panel_central.add(new JLabel("                     Name: "));
        panel_central.add(text_name = new JTextField(""));
        panel_central.add(new JLabel("                     Faculty: "));
        panel_central.add(text_faculty = new JTextField(""));
        panel_central.add(new JLabel("                     Researcher: "));
        panel_central.add(text_researcher = new JTextField(""));
        //panel inferior
        JPanel panel_inferior = new JPanel();
        JButton boton_crear = new JButton("Crear");
        boton_crear.setBounds(0,0,300,50);
        boton_crear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e ) {
                //aqui va codigo boton formulario
                f_crear_nuevo_proyecto(e);
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
    public void f_crear_nuevo_proyecto(java.awt.event.ActionEvent evt){
        //DESCRIPTION: this method saves the data into file
        final JDialog ventana_emergente = new JDialog(this,"SAVE DATA",true);
        if(text_code.getText().length()<3 ||
                text_name.getText().length()<10 ||
                text_faculty.getText().length()<5 ||
                text_researcher.getText().length()<10){
            ventana_emergente.add(new JLabel("Todos los campos deben tener minimo entre tres y diez caracteres"));
        }else{
            //grabaremos en un archivo
            file_data_project file_data_project1 = new file_data_project();
            boolean rpta = file_data_project1.f_add_project(text_code.getText(),
                    text_name.getText(),
                    text_faculty.getText(),
                    text_researcher.getText());
            if(rpta==true){
                ventana_emergente.add(new JLabel("DATOS GUARDADOS CON EXITO"));
                text_code.setText("");
                text_name.setText("");;
                text_faculty.setText("");
                text_researcher.setText("");
            }else{
                ventana_emergente.add(new JLabel("Los dato NO se pueden guardar en el archivo D:/projects.txt"));
            }
        }
        ventana_emergente.pack();
        ventana_emergente.setVisible(true);
    }
}
