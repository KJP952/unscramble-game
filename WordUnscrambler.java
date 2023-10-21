import javax.swing.*;

public class WordUnscrambler{
    private JFrame frame;
    private JLabel label;
    private JTextField input;
    private JPanel panel;

    public void gameFrame(){
        frame = new JFrame("Word Unscrambler");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void gamePanel(){
        panel = new JPanel();
    }
    public void text(){
        label = new JLabel("How to Play: Unscramble the given word to win!");
        label.setOpaque(true);
    }

    public void inputField(){
        input = new JTextField(15);
    }

    public void frameAdd(){
        panel.add(label);
        panel.add(input);
        
        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args){
        WordUnscrambler game = new WordUnscrambler();
        game.gameFrame();
        game.gamePanel();
        game.text();
        game.inputField();
        game.frameAdd();
    }
}