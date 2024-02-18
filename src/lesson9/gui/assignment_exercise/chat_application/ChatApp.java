package lesson9.gui.assignment_exercise.chat_application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChatApp extends JFrame {
    private JTextField messageField; // user input
    private JTextArea chatArea; // display chat messages

    public ChatApp() {
        setTitle("Chat Application");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        chatArea = new JTextArea(); // display chat messages
        chatArea.setEditable(false); // non-editable by user
        JScrollPane scrollPane = new JScrollPane(chatArea); // scrolling in chat area
        add(scrollPane, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel(new BorderLayout());
        add(bottomPanel, BorderLayout.SOUTH);

        messageField = new JTextField(); // for entering messages
        bottomPanel.add(messageField, BorderLayout.CENTER);

        JButton sendButton = new JButton("Send"); // button to send messages
        bottomPanel.add(sendButton, BorderLayout.EAST);

        // handle event when send button is clicked
        sendButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                sendMessage();
            }
            
        });

        // handle event when Enter key is press while field has focus
        messageField.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                sendMessage();
            }
            
        });

        setVisible(true);
    }

    // call method when user sends a message
    private void sendMessage() {
        String message = messageField.getText(); // get text from message field
        if(!message.isEmpty()) {
            chatArea.append("You: " + message + "\n");
            // generates automated reply
            // using generateAutomatedReply() method
            chatArea.append("Bot: " + generateAutomatedReply(message) + "\n");
            messageField.setText("");
        }
    }

    // call method to generate automated reply based on user's message
    private String generateAutomatedReply(String message) {
        message = message.toLowerCase(); // convert to lowercase for easier comparison
        String reply;

        // check for specific keyword to determine the reply
        if(message.contains("hello") || message.contains("hi")) {
            reply = "Hi there!";
        } else if(message.contains("how are you")) {
            reply = "I'm just a bot, but thanks for asking.";
        } else if(message.contains("bye") || message.contains("goodbye")) {
            reply = "Goodbye!";
        } else {
            reply = "I'm sorry, I don't understand.";
        }
        
        return reply;
    }

    public static void main(String[] args) {
        new ChatApp();
    }
}

