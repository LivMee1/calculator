import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class caculator {
        private JPanel panel1;
        private JButton a0Button;
        private JButton a1Button;
        private JButton a4Button;
        private JButton cButton;
        private JButton a5Button;
        private JButton a2Button;
        private JButton button10;
        private JButton a6Button;
        private JButton button11;
        private JButton a3Button;
        private JButton button13;
        private JButton button1;
        private JTextField textField1;
        private JButton a7Button;
        private JButton a8Button;
        private JButton a9Button;
        private JButton button16;
        private JButton button2;

        double num1, num2, result;
        String act;

        public caculator() {
                cButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                               textField1.setText("");
                        }
                });
                a7Button.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                textField1.setText(textField1.getText() + a7Button.getText());
                        }
                });
                a8Button.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                textField1.setText(textField1.getText() + a8Button.getText());
                        }
                });
                a9Button.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                textField1.setText(textField1.getText() + a9Button.getText());
                        }
                });
                a4Button.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                textField1.setText(textField1.getText() + a4Button.getText());
                        }
                });
                a5Button.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                textField1.setText(textField1.getText() + a5Button.getText());
                        }
                });
                a6Button.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                textField1.setText(textField1.getText() + a6Button.getText());
                        }
                });
                a1Button.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                textField1.setText(textField1.getText() + a1Button.getText());
                        }
                });
                a2Button.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                textField1.setText(textField1.getText() + a2Button.getText());
                        }
                });
                a3Button.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                textField1.setText(textField1.getText() + a3Button.getText());
                        }
                });
                a0Button.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                textField1.setText(textField1.getText() + a0Button.getText());
                        }
                });
                button10.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                if (textField1.getText().isEmpty()) {
                                        return;
                                }
                                if (!textField1.getText().contains(".")) {
                                        textField1.setText(textField1.getText() + button10.getText());
                                }
                        }
                });
                button13.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                num1 = Double.parseDouble(textField1.getText());
                                act = "+";
                                textField1.setText("");
                        }
                });
                button1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                num1 = Double.parseDouble(textField1.getText());
                                act = "*";
                                textField1.setText("");
                        }
                });
                button2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                num1 = Double.parseDouble(textField1.getText());
                                act = "-";
                                textField1.setText("");
                        }
                });
                button16.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                num1 = Double.parseDouble(textField1.getText());
                                act = "/";
                                textField1.setText("");
                        }
                });
                button11.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                num2 = Double.parseDouble(textField1.getText());

                                if (act == "+") {
                                        result = num1 + num2;
                                        textField1.setText(String.valueOf(result));
                                } else if (act == "-") {
                                        result = num1 - num2;
                                        textField1.setText(String.valueOf(result));
                                } else if (act == "*") {
                                        result = num1 * num2;
                                        textField1.setText(String.valueOf(result));
                                } else if (num2 == 0) {
                                        textField1.setText("Нелья делить на ноль");
                                } else if (act == "/") {
                                        result = num1 / num2;
                                        textField1.setText(String.valueOf(result));
                                }

                        }
                });

        }

        public static void main(String[] args) {
                JFrame frame = new JFrame("caculator");
                frame.setContentPane(new caculator().panel1);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
        }
}
