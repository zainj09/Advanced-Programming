//package Model;
//import View.*;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class Cell extends JButton {
//
//    private tictactoe t;
//    private String value="";
//    private int row;
//    private int col;
//    public Cell(){
//        super();
//        this.setPreferredSize(new Dimension(100,100));
//        setFont(new Font("Arial",Font.BOLD,40));
//    }
//
//    public void buttonAction() {
//        this.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//            }
//        });
//        for (int i = 0; i < t.size; i++) {
//            for (int j = 0; j < t.size; j++) {
//                t.buttons[i][j].setFont(new Font("Arial",Font.BOLD,40));
//                t.buttons[i][j].addActionListener(new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//
//                        if(((JButton) e.getSource()).getText()!="X" && ((JButton) e.getSource()).getText()!="O" ) {
//                            textField.setText("Player " + player + "'s turn!");
//                            if (player == "X") {
//                                player = "O";
//                            } else if (player == "O") {
//                                player = "X";
//                            }
//
//                            ((JButton) e.getSource()).setText(player);
//                            ((JButton) e.getSource()).setEnabled(false);
//
//                            if(checkWinner()==true){
//                                textField.setText("Game Over!");
//                                JOptionPane.showMessageDialog(null, "Game over! Player "+winner+" won");
//                                disableButtons();
//                            }
//
//                            else if(checkDraw()==true){
//                                textField.setText("Game Over!");
//                                JOptionPane.showMessageDialog(null, "Game over! Its a draw");
//                                disableButtons();
//                            }
//                        }
//                        else{
//                            textField.setText("invalid move!");
//                        }
//                    }
//                });
//            }
//        }
//    }
//    boolean checkWinner() {
//        int count = 0;
//        //for rows(i.e horizontl directn)...
//        for (int i = 0; i < size; i++) {
//            if (buttons[i][0].getText() == buttons[i][1].getText() && buttons[i][1].getText() == buttons[i][2].getText() && buttons[i][0].getText()!="") {
//                winner = buttons[i][0].getText();
//                count++;
//            }
//        }
//        //for colmns(i.e verticl directn)...
//        for (int j = 0; j < size; j++) {
//            if (buttons[0][j].getText() == buttons[1][j].getText() && buttons[1][j].getText() == buttons[2][j].getText() && buttons[1][j].getText()!=""){
//                winner = buttons[0][j].getText();
//                count++;
//            }
//        }
//        //for diognals...
//        if (buttons[0][0].getText() == buttons[1][1].getText() && buttons[1][1].getText() == buttons[2][2].getText() && buttons[2][2].getText()!="") {
//            winner = buttons[0][0].getText();
//            count++;
//        }
//        if (buttons[0][2].getText() == buttons[1][1].getText() && buttons[1][1].getText() == buttons[2][0].getText() && buttons[2][0].getText()!="") {
//            winner = buttons[0][2].getText();
//            count++;
//        }
//        if (count == 0) {
//            return false;
//        } else
//            return true;
//    }
//
//
//}
