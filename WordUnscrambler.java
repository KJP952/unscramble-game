import javax.swing.*;

public class WordUnscrambler{
    private JFrame frame;
    private JLabel label;
    private JTextField input;
    private JPanel panel;
    private JPanel textPanel;

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

    public void text(){
        label = new JLabel("How to Play: Unscramble the given word to win!");
        label.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        label.setOpaque(true);
        
    }

    public void inputField(){
        input = new JTextField(10);
        input.setAlignmentX(JTextField.CENTER_ALIGNMENT);
    }

    public void frameAdd(){

        panel.add(label);
        textPanel.add(input);
        
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
        game.inputField();
        game.frameAdd();
    }
}