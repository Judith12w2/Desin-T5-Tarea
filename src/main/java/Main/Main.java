package Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        // Crear la ventana
        JFrame frame = new JFrame("Interfaz Swing");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un panel
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        // Hacer visible la ventana
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        // Crear un botón
        JButton button = new JButton("Haz clic");
        button.setBounds(150, 70, 100, 25);
        panel.add(button);

        // Agregar acción al botón
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "¡Hola, mundo!");
            }
        });
    }
}
