package lesson10.assignment_exercise.address_book_app;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class AddressBookApp extends JFrame {

    private JTextField nameField, phoneNumField, addressField;
    private JTable table;
    private DefaultTableModel model;
    private List<Contact> contacts;
    private AddressBookController controller;
    private ButtonGroup exportGroup;

    public AddressBookApp() {
        setTitle("Address Book");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        contacts = new ArrayList<>();

        model = new DefaultTableModel();
        model.addColumn("Name");
        model.addColumn("Phone");
        model.addColumn("Address");
        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        JPanel formPanel = new JPanel(new GridLayout(4, 2));
        formPanel.add(new JLabel("Name:"));
        nameField = new JTextField();
        formPanel.add(nameField);
        formPanel.add(new JLabel("Phone:"));
        phoneNumField = new JTextField();
        formPanel.add(phoneNumField);
        formPanel.add(new JLabel("Address:"));
        addressField = new JTextField();
        formPanel.add(addressField);

        add(formPanel, BorderLayout.NORTH);

        AddressBookDB db = new AddressBookDB();
        controller = new AddressBookController(this, contacts, model, db);

        JButton addButton = new JButton("Add");
        addButton.addActionListener(e -> controller.addContact());

        JButton editButton = new JButton("Edit");
        editButton.addActionListener(e -> controller.editContact());

        JButton deleteButton = new JButton("Delete");
        deleteButton.addActionListener(e -> controller.deleteContact());

        JButton searchButton = new JButton("Search");
        searchButton.addActionListener(e -> controller.searchContacts());

        JButton importButton = new JButton("Import");
        importButton.addActionListener(e -> controller.importContacts());

        JButton exportButton = new JButton("Export");
        exportButton.addActionListener(e -> controller.exportContacts(getSelectedExportFormat()));

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(addButton);
        buttonPanel.add(editButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(searchButton);
        buttonPanel.add(importButton);
        buttonPanel.add(exportButton);

        exportGroup = new ButtonGroup();
        JRadioButton csvButton = new JRadioButton("CSV");
        csvButton.setActionCommand("CSV");
        csvButton.setSelected(true);
        JRadioButton jsonButton = new JRadioButton("JSON");
        jsonButton.setActionCommand("JSON");
        JRadioButton xmlButton = new JRadioButton("XML");
        xmlButton.setActionCommand("XML");

        exportGroup.add(csvButton);
        exportGroup.add(jsonButton);
        exportGroup.add(xmlButton);

        JPanel exportPanel = new JPanel(new GridLayout(1, 3));
        exportPanel.add(csvButton);
        exportPanel.add(jsonButton);
        exportPanel.add(xmlButton);

        JPanel southPanel = new JPanel(new BorderLayout());
        southPanel.add(buttonPanel, BorderLayout.NORTH);
        //southPanel.add(exportPanel, BorderLayout.SOUTH);

        add(southPanel, BorderLayout.SOUTH);
    }

    public String getSelectedExportFormat() {
        return exportGroup.getSelection().getActionCommand();
    }

    public JTextField getNameField() {
        return nameField;
    }

    public JTextField getPhoneField() {
        return phoneNumField;
    }

    public JTextField getAddressField() {
        return addressField;
    }

    public JTable getTable() {
        return table;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AddressBookApp().setVisible(true);
            }
        });
    }
}
