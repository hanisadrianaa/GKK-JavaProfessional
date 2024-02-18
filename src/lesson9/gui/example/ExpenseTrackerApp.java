package lesson9.gui.example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ExpenseTrackerApp extends JFrame {

    private JTextField expenseField;
    private JList expensesList;
    private DefaultListModel listModel;

    public ExpenseTrackerApp() {
        setTitle("Expense Tracker;");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();

        // textField
        JPanel inputPanel = new JPanel();
        JLabel expenseLabel = new JLabel("Expense: ");
        expenseField = new JTextField(20); // specified number of column

        // add button
        listModel = new DefaultListModel<>(); // to make sure it's not empty
        JButton addButton = new JButton("Add");
        addButton.addActionListener(new AddButtonListener());

        // scroll list
        expensesList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(expensesList);

        // delete button
        JButton deleteButton = new JButton("Delete");
        deleteButton.addActionListener(new DeleteButtonListener());
        
        inputPanel.add(expenseLabel);
        inputPanel.add(expenseField);
        inputPanel.add(addButton);

        panel.add(inputPanel);
        panel.add(scrollPane);
        panel.add(deleteButton);

        add(panel);
    }

    @SuppressWarnings("unchecked")
    private class AddButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String expense = expenseField.getText().trim(); // trim remove spaces
            if (!expense.isEmpty()) {
                listModel.addElement(expense);
                expenseField.setText("");
            }
        }
    }

    private class DeleteButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int selectIndex = expensesList.getSelectedIndex();
            if(selectIndex != -1) {
                listModel.remove(selectIndex);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ExpenseTrackerApp app = new ExpenseTrackerApp();
            app.setVisible(true);
        });
    }
}
