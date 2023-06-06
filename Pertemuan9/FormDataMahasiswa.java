package Pertemuan9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FormDataMahasiswa extends JFrame implements ActionListener {
    private JLabel lblNIM, lblNama, lblJurusan;
    private JTextField txtNIM, txtNama, txtJurusan;
    private JButton btnSubmit, btnLogin;

    public FormDataMahasiswa() {
        // Membuat JFrame
        setTitle("Form Data Mahasiswa");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(Color.BLUE);

        // Membuat label dan menentukan posisi
        lblNIM = new JLabel("NIM");
        lblNIM.setBounds(30, 30, 90, 30);
        lblNama = new JLabel("Nama");
        lblNama.setBounds(30, 60, 90, 30);
        lblJurusan = new JLabel("Jurusan");
        lblJurusan.setBounds(30, 90, 90, 30);

        // Membuat text field dan menentukan posisi
        txtNIM = new JTextField();
        txtNIM.setBounds(100, 20, 150, 20);
        txtNama = new JTextField();
        txtNama.setBounds(100, 50, 150, 20);
        txtJurusan = new JTextField();
        txtJurusan.setBounds(100, 80, 150, 20);

        // Membuat button Submit dan menentukan posisi
        btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(50, 120, 80, 25);
        btnSubmit.addActionListener(this);
        btnSubmit.setBackground(Color.BLACK);
        btnSubmit.setForeground(Color.BLACK);
        btnSubmit.setFocusPainted(false); // Menghilangkan border pada saat button aktif

        // Menambahkan efek hover pada tombol Submit
        btnSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSubmit.setBackground(Color.BLUE);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSubmit.setBackground(Color.GREEN);
            }
        });

        // Membuat button Login Mahasiswa dan menentukan posisi
        btnLogin = new JButton("Login Mahasiswa");
        btnLogin.setBounds(140, 120, 130, 25);
        btnLogin.addActionListener(this);
        btnLogin.setBackground(Color.WHITE);
        btnLogin.setForeground(Color.BLACK);
        btnLogin.setFocusPainted(false); // Menghilangkan border pada saat button aktif

        // Menambahkan efek hover pada tombol Login Mahasiswa
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLogin.setBackground(Color.DARK_GRAY);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLogin.setBackground(Color.WHITE);
            }
        });

        // Menambahkan komponen ke JFrame
        add(lblNIM);
        add(lblNama);
        add(lblJurusan);
        add(txtNIM);
        add(txtNama);
        add(txtJurusan);
        add(btnSubmit);
        add(btnLogin);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSubmit) {
            String nim = txtNIM.getText();
            String nama = txtNama.getText();
            String jurusan = txtJurusan.getText();

            // Lakukan operasi lainnya sesuai dengan kebutuhan, misalnya menyimpan data ke
            // database

            JOptionPane.showMessageDialog(this, "Data Mahasiswa berhasil disimpan!");
            clearForm();
        } else if (e.getSource() == btnLogin) {
            // Lakukan operasi login untuk mahasiswa
            JOptionPane.showMessageDialog(this, "Anda telah login sebagai mahasiswa!");
        }
    }

    private void clearForm() {
        txtNIM.setText("");
        txtNama.setText("");
        txtJurusan.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FormDataMahasiswa form = new FormDataMahasiswa();
            form.setVisible(true);
        });
    }
}
