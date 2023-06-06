package Pertemuan9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginPage extends JFrame implements ActionListener {
    private JLabel lblUsername, lblPassword;
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JButton btnLogin, btnRegister;

    public LoginPage() {
        // Membuat JFrame
        setTitle("Login Page");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        // Membuat label dan menentukan posisi
        lblUsername = new JLabel("Username");
        lblUsername.setBounds(20, 20, 80, 20);
        lblPassword = new JLabel("Password");
        lblPassword.setBounds(20, 50, 80, 20);

        // Membuat text field dan menentukan posisi
        txtUsername = new JTextField();
        txtUsername.setBounds(100, 20, 150, 20);
        txtPassword = new JPasswordField();
        txtPassword.setBounds(100, 50, 150, 20);

        // Membuat button Login dan menentukan posisi
        btnLogin = new JButton("Login");
        btnLogin.setBounds(110, 90, 80, 25);
        btnLogin.addActionListener(this);

        // Membuat button Register dan menentukan posisi
        btnRegister = new JButton("Register");
        btnRegister.setBounds(200, 130, 80, 15);
        btnRegister.setFont(new Font("Arial", Font.PLAIN, 10));
        btnRegister.setForeground(Color.BLUE);
        btnRegister.setBorderPainted(false);
        btnRegister.setContentAreaFilled(false);
        btnRegister.addActionListener(this);

        // Menambahkan komponen ke JFrame
        add(lblUsername);
        add(lblPassword);
        add(txtUsername);
        add(txtPassword);
        add(btnLogin);
        add(btnRegister);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnLogin) {
            String username = txtUsername.getText();
            String password = new String(txtPassword.getPassword());

            // Lakukan proses validasi login sesuai dengan kebutuhan
            if (username.equals("admin") && password.equals("password")) {
                JOptionPane.showMessageDialog(this, "Login successful!");
            } else {
                JOptionPane.showMessageDialog(this, "Login failed. Please try again.");
            }

            clearForm();
        } else if (e.getSource() == btnRegister) {
            JOptionPane.showMessageDialog(this, "Redirecting to Register Page...");
            // Tambahkan kode untuk navigasi ke halaman register di sini
        }
    }

    private void clearForm() {
        txtUsername.setText("");
        txtPassword.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LoginPage loginPage = new LoginPage();
            loginPage.setVisible(true);
        });
    }
}
