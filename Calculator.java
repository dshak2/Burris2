package Hacker200;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;
import javax.swing.BorderFactory; // Added for BorderFactory
import javax.swing.SwingConstants; // Added for SwingConstants

/**
 *
 * @author labcecom
 */
public class Calculadora extends JFrame {
    private JTextField numField1;
    private JTextField numField2;
    private JButton addButton;
    private JLabel resultLabel;
    private JLabel errorLabel;

    public Calculadora() {
        setTitle("Enhanced Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Use a main panel with BorderLayout for overall structure
        // Then a grid panel for the input fields and button
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10)); // Gaps for padding
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Margin for the main panel

        JPanel inputOutputPanel = new JPanel(new GridLayout(3, 2, 5, 5)); // 3 rows, 2 columns for inputs and result

        numField1 = new JTextField(10);
        numField2 = new JTextField(10);
        addButton = new JButton("Add");
        resultLabel = new JLabel("Result: ");
        
        inputOutputPanel.add(new JLabel("Number 1:"));
        inputOutputPanel.add(numField1);
        inputOutputPanel.add(new JLabel("Number 2:"));
        inputOutputPanel.add(numField2);
        inputOutputPanel.add(addButton);
        inputOutputPanel.add(resultLabel);

        mainPanel.add(inputOutputPanel, BorderLayout.CENTER);

        errorLabel = new JLabel(" "); // Initialize with a space to take up height
        errorLabel.setForeground(Color.RED);
        errorLabel.setHorizontalAlignment(SwingConstants.CENTER); // Center the error text
        mainPanel.add(errorLabel, BorderLayout.SOUTH);
        
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                errorLabel.setText(""); // Clear previous error messages
                String input1 = numField1.getText();
                String input2 = numField2.getText();

                try {
                    int number1 = Integer.parseInt(input1);
                    int number2 = Integer.parseInt(input2);
                    int sum = add(number1, number2); // or Calculadora.this.add(number1, number2)
                    resultLabel.setText("Result: " + sum);
                } catch (NumberFormatException ex) {
                    errorLabel.setText("Error: Invalid input. Please enter integers only.");
                    resultLabel.setText("Result: ");
                }
            }
        });

        setContentPane(mainPanel); // Set the main panel as the content pane
        pack(); // Adjusts window size to fit components
        setLocationRelativeTo(null); // Center the window
    }

    public static int add(int a, int b) { // Changed to static
        return a + b;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Calculadora calc = new Calculadora();
                calc.setVisible(true);
            }
        });
    }
}
