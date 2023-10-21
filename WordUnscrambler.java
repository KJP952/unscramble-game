import javax.swing.*;
import java.awt.Font;

public class WordUnscrambler{
    private JFrame frame;
    private JLabel label;
    private JTextField input;
    private JPanel panel;
    private JPanel textPanel;
    private JLabel word;
    private JButton enter;

    public void gameFrame(){
        frame = new JFrame("Word Unscrambler");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void gamePanel(){
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        
    }

    public void inputPanel(){
        textPanel = new JPanel();
        //textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.PAGE_AXIS));
    }
    
    public void scrambledWord(){
        word = new JLabel("Test");
        word.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        word.setFont(new Font("Serif",Font.BOLD, 20));
        word.setOpaque(true);

    }
    public void text(){
        label = new JLabel("How to Play: Unscramble the given word to win!");
        label.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        label.setOpaque(true);
        
    }

    public void enterButton(){
        enter = new JButton("Enter");
    }

    public void inputField(){
        input = new JTextField(10);
        input.setAlignmentX(JTextField.CENTER_ALIGNMENT);
    }

    public void frameAdd(){

        panel.add(label);
        panel.add(Box.createVerticalStrut(100));
        panel.add(word);
        panel.add(Box.createVerticalStrut(200));
        textPanel.add(input);
        textPanel.add(enter);
        panel.add(textPanel);
        

        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args){
        WordUnscrambler game = new WordUnscrambler();
        game.gameFrame();
        game.gamePanel();
        game.inputPanel();
        game.text();
        game.scrambledWord();
        game.inputField();
        game.enterButton();
        game.frameAdd();
    }
}