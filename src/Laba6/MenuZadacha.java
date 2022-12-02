package Laba6;

import java.awt.Container;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;

final class MenuZadacha extends JFrame{
    public static MenuZadacha b1;
    static ButtonGroup bg = new ButtonGroup();
    static ButtonGroup bg1 = new ButtonGroup();
    static JRadioButtonMenuItem one;
    static JRadioButtonMenuItem two;
    static JRadioButtonMenuItem three;
    static JRadioButtonMenuItem four;
    static JRadioButtonMenuItem five;
    static JRadioButtonMenuItem six;
    static  JTextArea area1;


    static ActionListener  buttonListener1 = new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            area1.setForeground(Color.blue);
        }
    };

    static ActionListener  buttonListener2 = new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            area1.setForeground(Color.red);
        }
    };

    static ActionListener  buttonListener3 = new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            area1.setForeground(Color.black);
        }
    };

    static ActionListener  buttonListener4 = new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            area1.setFont(new Font("TimesRoman", Font.BOLD, 14));
        }
    };

    static ActionListener  buttonListener5 = new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            area1.setFont(new Font("MS Sans Serif", Font.PLAIN, 14));
        }
    };

    static ActionListener  buttonListener6 = new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            area1.setFont(new Font("Courier", Font.ITALIC, 14));
        }
    };

    public static JMenu createViewMenu()
    {
        JMenu viewMenu_m = new JMenu("Меню");
        JMenu viewMenu = new JMenu("Цвет");
        JMenu viewMenu1 = new JMenu("Шрифт");
        one = new JRadioButtonMenuItem("Синий");
        two = new JRadioButtonMenuItem("Крассный");
        three = new JRadioButtonMenuItem("Черный");
        four = new JRadioButtonMenuItem("Times New Roman");
        five = new JRadioButtonMenuItem("MS Sans Serif");
        six = new JRadioButtonMenuItem("Courier New");
        one.addActionListener(buttonListener1);
        two.addActionListener(buttonListener2);
        three.addActionListener(buttonListener3);
        four.addActionListener(buttonListener4);
        five.addActionListener(buttonListener5);
        six.addActionListener(buttonListener6);
        bg.add(one);
        bg.add(two);
        bg.add(three);
        bg1.add(four);
        bg1.add(five);
        bg1.add(six);
        viewMenu1.add(four);
        viewMenu1.add(five);
        viewMenu1.add(six);
        viewMenu.add(one);
        viewMenu.add(two);
        viewMenu.add(three);
        viewMenu_m.add(viewMenu);
        viewMenu_m.add(viewMenu1);
        return viewMenu_m;
    }


    public MenuZadacha()
    {
        super("Лабараторная работа  6, 3 вариант задания");
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        setSize(350, 150);
        Container container = getContentPane();
        area1 = new JTextArea("Михаил Свалов", 3, 10);
        container.add(area1);
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(createViewMenu());
        setJMenuBar(menuBar);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        JFrame.setDefaultLookAndFeelDecorated(true);
        b1  = new MenuZadacha();
    }
}