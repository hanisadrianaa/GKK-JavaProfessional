package lesson9.gui.assignment_exercise.address_book;

// Assignment 4
// Address Book: Build an address book application
// that allows users to add, edit, and delete contacts.

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class AddressBookApp extends JFrame {
    private JTable table; // to display addrees book entries
    private DefaultTableModel model; // to manage data that is display in table

    // input for contact information
    private JTextField nameField;
    private JTextField emailField;
    private JTextField phoneField;

    public AddressBookApp() {
        setTitle("Address Book");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLayout(new BorderLayout());

        // column for name, email, phone
        // initialize 'table' with a 'model'
        model = new DefaultTableModel();
        model.addColumn("Name");
        model.addColumn("Email");
        model.addColumn("Phone");

        table = new JTable(model);

        // add JScrollPane to center of frame to display table
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        JPanel formPanel = new JPanel(new GridLayout(3, 2));
        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField();
        JLabel phoneLabel = new JLabel("Phone:");
        phoneField = new JTextField();

        formPanel.add(nameLabel);
        formPanel.add(nameField);
        formPanel.add(emailLabel);
        formPanel.add(emailField);
        formPanel.add(phoneLabel);
        formPanel.add(phoneField);
        add(formPanel, BorderLayout.SOUTH); /// add formPannel to the bottom of the frame

        // add new row to the table
        JButton addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();
                String phone = phoneField.getText();
                model.addRow(new String[]{name, email, phone});
                clearFields();
            }
        });

        // modifies selected row in the table
        JButton editButton = new JButton("Edit");
        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    String name = nameField.getText();
                    String email = emailField.getText();
                    String phone = phoneField.getText();
                    model.setValueAt(name, selectedRow, 0);
                    model.setValueAt(email, selectedRow, 1);
                    model.setValueAt(phone, selectedRow, 2);
                    clearFields();
                } else {
                    JOptionPane.showMessageDialog(AddressBookApp.this, "Please select a contact to edit.");
                }
            }
        });

        // deletes selected row in the table
        JButton deleteButton = new JButton("Delete");
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    model.removeRow(selectedRow);
                    clearFields();
                } else {
                    JOptionPane.showMessageDialog(AddressBookApp.this, "Please select a contact to delete.");
                }
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(editButton);
        buttonPanel.add(deleteButton);
        add(buttonPanel, BorderLayout.NORTH); // add buttonPanel at the bottom of the frame
    }

    // method to clear text field
    private void clearFields() {
        nameField.setText("");
        emailField.setText("");
        phoneField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                AddressBookApp app = new AddressBookApp();
                app.setVisible(true);
            }
        });
    }
}

