import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        //Окно
        JFrame window1 = new JFrame();
        window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window1.setVisible(true);
        window1.setSize(600,600);
        window1.getContentPane().setLayout((null)); //чтобы не растягивались элементы

        //Первая кнопка
        JButton button1 = new JButton();
        button1.setText("iOS");
        button1.setSize(100,100);
        button1.setLocation(100,100);
        ActionListener AListener1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        };
        button1.addActionListener(AListener1);
        window1.add(button1);  //Добавляем кнопку


        //Вторая кнопка
        JButton button2 = new JButton();
        button2.setText("Android");
        button2.setSize(100,100);
        button2.setLocation(500,100);

        ActionListener AListener2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        };
        button2.addActionListener(AListener2);
        window1.add(button2);
    }
}