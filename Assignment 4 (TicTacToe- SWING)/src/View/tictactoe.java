package View;
//import Controller.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class tictactoe extends JFrame {

    int size = 3;
    String winner;
    String player ;
    JTextField textField;
    JPanel board = new JPanel();
    JButton buttons[][] = new JButton[3][3];
    JPanel info = new JPanel();
    JButton reset=new JButton();

    tictactoe() {
        super("TicTacToe");
        setSize(350, 400);
        setResizable(false);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        board.setLayout(new GridLayout(3, 3));

        player = "O";
        textField = new JTextField("Take First Turn");

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].setPreferredSize(new Dimension(100, 100));
                board.add(buttons[i][j]);
            }
        }

        this.add(board);
        buttonAction();
        restartAction();
        reset.setText("Restart");
        textField.setEditable(false);
        info.setLayout(new FlowLayout(1,50,20));
        info.add(textField);
        info.add(reset);
        this.add(info);
        setVisible(true);

    }

    void buttonAction() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                buttons[i][j].setFont(new Font("Arial",Font.BOLD,40));
                buttons[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        if(((JButton) e.getSource()).getText()!="X" && ((JButton) e.getSource()).getText()!="O" ) {
                            textField.setText("Player " + player + "'s turn!");
                            if (player == "X") {
                                player = "O";
                            } else if (player == "O") {
                                player = "X";
                            }

                            ((JButton) e.getSource()).setText(player);
                            ((JButton) e.getSource()).setEnabled(false);

                            if(checkWinner()==true){
                                textField.setText("Submitted by Zain Jaffery");
                                JOptionPane.showMessageDialog(null, "Game over! Player "+winner+" won");
                                disableButtons();
                            }

                            else if(checkDraw()==true){
                                textField.setText("Submitted by Zain Jaffery");
                                JOptionPane.showMessageDialog(null, "Game over! Its a draw");
                                disableButtons();
                            }
                        }
                        else{
                            textField.setText("invalid move!");
                        }
                    }
                });
            }
        }
    }

    void disableButtons(){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                buttons[i][j].setEnabled(false);
            }
        }
    }

    void restartAction(){
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(int i=0;i<size;i++) {
                    for(int j=0;j<size;j++) {
                        buttons[i][j].setEnabled(true);
                        buttons[i][j].setText("");
                        buttons[i][j].setBackground(null);
                        textField.setText("Take First Turn");
                    }
                }
            }
        });
    }

    boolean checkWinner() {
        int count = 0;
        //for rows(i.e horizontl directn)...
        for (int i = 0; i < size; i++) {
            if (buttons[i][0].getText() == buttons[i][1].getText() && buttons[i][1].getText() == buttons[i][2].getText() && buttons[i][0].getText()!="") {
                winner = buttons[i][0].getText();
                count++;
                for(int k=0;k<size;k++)
                    buttons[i][k].setBackground(Color.BLUE);
            }
        }
        //for colmns(i.e verticl directn)...
        for (int j = 0; j < size; j++) {
            if (buttons[0][j].getText() == buttons[1][j].getText() && buttons[1][j].getText() == buttons[2][j].getText() && buttons[1][j].getText()!=""){
                winner = buttons[0][j].getText();
                count++;
                for(int k=0;k<size;k++)
                    buttons[k][j].setBackground(Color.BLUE);
            }
        }
        //for diognals...
        if (buttons[0][0].getText() == buttons[1][1].getText() && buttons[1][1].getText() == buttons[2][2].getText() && buttons[2][2].getText()!="") {
            winner = buttons[0][0].getText();
            count++;
            for(int i=0;i<size;i++)
                buttons[i][i].setBackground(Color.BLUE);
        }

        if (buttons[0][2].getText() == buttons[1][1].getText() && buttons[1][1].getText() == buttons[2][0].getText() && buttons[2][0].getText()!="") {
            winner = buttons[0][2].getText();
            count++;
            buttons[0][2].setBackground(Color.BLUE);
            buttons[1][1].setBackground(Color.BLUE);
            buttons[2][0].setBackground(Color.BLUE);
        }
        if (count == 0) {
            return false;
        } else
            return true;
    }

    boolean checkDraw() {
        int moveCount=0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (buttons[i][j].getText() != "X" && buttons[i][j].getText() != "O") {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        tictactoe t=new tictactoe();
    }
}