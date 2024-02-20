package lesson10.assignment_exercise.address_book_app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class AddressBookController {

    private AddressBookApp app;
    private List<Contact> contacts;
    private DefaultTableModel model;

    private AddressBookDB db;

    public AddressBookController(AddressBookApp app, List<Contact> contacts, DefaultTableModel model,
            AddressBookDB db) {
        this.app = app;
        this.contacts = contacts;
        this.model = model;
        this.db = db;
    }

    public void addContact() {
        String name = app.getNameField().getText();
        String phone = app.getPhoneField().getText();
        String address = app.getAddressField().getText();

        if (!name.isEmpty() && !phone.isEmpty() && !address.isEmpty()) {
            // Contact contact = new Contact(name, phone, address);
            // contacts.add(contact);
            // model.addRow(new Object[]{name, phone, address});
            // clearFields();

            db.addContact(name, phone, address);

            Object[] rowData = { name, phone, address };
            model.addRow(rowData);

            clearFields();
        } else {
            JOptionPane.showMessageDialog(null, "Please fill in all fields.");
        }
    }

    public void editContact() {
        int selectedRow = app.getTable().getSelectedRow();
        if (selectedRow != -1) {
            String name = app.getNameField().getText();
            String phone = app.getPhoneField().getText();
            String address = app.getAddressField().getText();

            if (!name.isEmpty() && !phone.isEmpty() && !address.isEmpty()) {
                Contact contact = contacts.get(selectedRow);
                contact.setName(name);
                contact.setPhone(phone);
                contact.setAddress(address);
                model.setValueAt(name, selectedRow, 0);
                model.setValueAt(phone, selectedRow, 1);
                model.setValueAt(address, selectedRow, 2);
                clearFields();
            } else {
                JOptionPane.showMessageDialog(null, "Please fill in all fields.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a contact to edit.");
        }
    }

    public void deleteContact() {
        int selectedRow = app.getTable().getSelectedRow();
        if (selectedRow != -1) {
            String name = (String) model.getValueAt(selectedRow, 0);
            String phone = (String) model.getValueAt(selectedRow, 1);
    
            db.deleteContact(name, phone);
    
            model.removeRow(selectedRow);
    
            clearFields();
        } else {
            JOptionPane.showMessageDialog(null, "Please select a contact to delete.");
        }
    }
    

    public void searchContacts() {
        String query = JOptionPane.showInputDialog(null, "Enter search term:");
        if (query != null && !query.isEmpty()) {
            for (int i = 0; i < model.getRowCount(); i++) {
                String name = (String) model.getValueAt(i, 0);
                String phone = (String) model.getValueAt(i, 1);
                String address = (String) model.getValueAt(i, 2);
                if (name.contains(query) || phone.contains(query) || address.contains(query)) {
                    app.getTable().setRowSelectionInterval(i, i);
                    break;
                }
            }
        }
    }

    public void importContacts() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try (Scanner scanner = new Scanner(file)) {
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String[] parts = line.split(",");
                    if (parts.length == 3) {
                        String name = parts[0].trim();
                        String phone = parts[1].trim();
                        String address = parts[2].trim();
                        Contact contact = new Contact(name, phone, address);
                        contacts.add(contact);
                        model.addRow(new Object[] { name, phone, address });
                    }
                }
                JOptionPane.showMessageDialog(null, "Import successful!");
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error reading file: " + ex.getMessage());
            }
        }
    }

    public void exportContacts(String exportFormat) {
        if (exportFormat.equals("CSV")) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileFilter(new FileNameExtensionFilter("CSV files (*.csv)", "csv"));
            int result = fileChooser.showSaveDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                String filePath = file.getAbsolutePath();
                if (!filePath.toLowerCase().endsWith(".csv")) {
                    filePath += ".csv";
                }
                file = new File(filePath);
                try (PrintWriter writer = new PrintWriter(file)) {
                    for (Contact contact : contacts) {
                        writer.println(contact.getName() + "," + contact.getPhone() + "," + contact.getAddress());
                    }
                    JOptionPane.showMessageDialog(null, "Export successful!");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Error writing to file: " + ex.getMessage());
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Unsupported export format.");
        }
    }

    private void clearFields() {
        app.getNameField().setText("");
        app.getPhoneField().setText("");
        app.getAddressField().setText("");
    }

    // private String getFileExtension(String filename) {
    // int dotIndex = filename.lastIndexOf('.');
    // if (dotIndex == -1) {
    // return "";
    // }

    // return filename.substring(dotIndex + 1).toLowerCase();
    // }

    // private void importCSV(String line) {
    // String[] parts = line.split(",");
    // if (parts.length == 3) {
    // String name = parts[0].trim();
    // String phone = parts[1].trim();
    // String address = parts[2].trim();
    // Contact contact = new Contact(name, phone, address);
    // contacts.add(contact);
    // model.addRow(new Object[] { name, phone, address });
    // }
    // }

    // private void importJSON(String line) {
    // try {
    // JSONTokener tokener = new JSONTokener(line);
    // JSONArray jsonArray = new JSONArray(tokener);
    // for (int i = 0; i < jsonArray.length(); i++) {
    // JSONObject jsonObject = jsonArray.getJSONObject(i);
    // String name = jsonObject.getString("name");
    // String phone = jsonObject.getString("phone");
    // String address = jsonObject.getString("address");
    // Contact contact = new Contact(name, phone, address);
    // contacts.add(contact);
    // model.addRow(new Object[]{name, phone, address});
    // }
    // } catch (Exception e) {
    // JOptionPane.showMessageDialog(null, "Error importing JSON: " +
    // e.getMessage());
    // }
    // }

    // private void importXML(String line) {

    // }

    // private void exportCSV(BufferedWriter writer) throws IOException {
    // for (Contact contact : contacts) {
    // writer.write(contact.getName() + "," + contact.getPhone() + "," +
    // contact.getAddress() + "\n");
    // }
    // }

    // private void exportJSON(BufferedWriter writer) throws IOException {

    // }

    // private void exportXML(BufferedWriter writer) throws IOException {

    // }

    
}
