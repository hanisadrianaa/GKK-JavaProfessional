package lesson9.gui.assignment_exercise.tic_tac_toe_game;

// 10. Tic-Tac-Toe Game
// Create a GUI version of the classic tic-tac-toe game where
// users can play against the computer or against another player.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToeUser extends JFrame {
    private JPanel panel;
    private JButton[] buttons = new JButton[9];
    private boolean xTurn = true;

    public TicTacToeUser() {
        setTitle("Tic-Tac-Toe");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        for(int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            buttons[i].setFont(new Font("Arial", Font.PLAIN, 40));
            buttons[i].addActionListener(new ButtonClickListener());
            panel.add(buttons[i]);
        }

        add(panel, BorderLayout.CENTER);
        setSize(400, 400);
        setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {

        // when button is click, actionPerformed is called
        // check whose turn it is (xTurn)
        // set text of clicked button to "X" or "O" accordingly, disables the button
        // toggles xTurn
        // then call checkForWinner to see if there's a winner or the game is a tie

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();

            if(xTurn) {
                button.setText("X");
            } else {
                button.setText("O");
            }

            button.setEnabled(false);
            xTurn = !xTurn;

            checkForWinner();
        }

    }

    public void checkForWinner() {

        // check rows
        // loop over the rows of game board
        // i += 3, increment i by 3 in each repetition to move to next row 
        for (int i = 0; i < 9; i += 3) {
            // condition check if symbols in current row are same and not empty
            // if true, means a player has won
            // a message dialog will be shown
            // game is reset
            if (buttons[i].getText().equals(buttons[i+1].getText()) && buttons[i].getText().equals(buttons[i+2].getText()) && !buttons[i].isEnabled()) {
                JOptionPane.showMessageDialog(panel, buttons[i].getText() + " wins!");
                resetGame();
                return;
            }
        }

        // check columns
        // loop checks the column of game board
        // repetition over the column of game board
        for (int i = 0; i < 3; i++) {
            // condition check if symbol in current column are same and not empty
            // if true, means a player has won
            // a message dialog will be shown
            // game is reset
            if (buttons[i].getText().equals(buttons[i+3].getText()) && buttons[i].getText().equals(buttons[i+6].getText()) && !buttons[i].isEnabled()) {
                JOptionPane.showMessageDialog(panel, buttons[i].getText() + " wins!");
                resetGame();
                return;
            }
        }

        // check diagonals
        // check the diagonal of game board
        if (buttons[0].getText().equals(buttons[4].getText()) && buttons[0].getText().equals(buttons[8].getText()) && !buttons[0].isEnabled()) {
            // condition check if symbol in main diagonal are same and not empty
            // if true, means a player has won
            // a message dialog will be shown
            // game is reset
            JOptionPane.showMessageDialog(panel, buttons[0].getText() + " wins!");
            resetGame();
            return;
        }
        if (buttons[2].getText().equals(buttons[4].getText()) && buttons[2].getText().equals(buttons[6].getText()) && !buttons[2].isEnabled()) {
            // condition check if symbol in other diagonal are same and not empty
            // if true, means a player has won
            // a message dialog will be shown
            // game is reset
            JOptionPane.showMessageDialog(panel, buttons[2].getText() + " wins!");
            resetGame();
            return;
        }

        // check for tie
        boolean tie = true; // assuming the game is a tie
        for (int i = 0; i < 9; i++) { // loop repeat over all button on game board
            if (buttons[i].isEnabled()) { // if any button is still enable (example: not click), game is not a tie
                tie = false; // tie is set to false
                break;
            }
        }
        if (tie) { // if tie is true after check all button, means all button are disable (example: board is full)
            // game is a tie
            // a message dialog will be shown
            // game is reset
            JOptionPane.showMessageDialog(panel, "Tie game!");
            resetGame();
        }
    }

    // method to reset game board
    public void resetGame() {
        for (int i = 0; i < 9; i++) { // loop repeat over all button in game board
            // i represent index of each button in buttons array
            buttons[i].setText(""); // set text of current button to empty string, clearing any X or O that previously set on button
            buttons[i].setEnabled(true); // enables current button, button may have been disabled (when player win or game is a tie) so need to be re-eanable for next game
        }
        
        xTurn = true; // indicating that it's X turn to play first in next game
    }

    public static void main(String[] args) {
        new TicTacToeUser();
    }
}
