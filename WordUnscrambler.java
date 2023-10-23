import javax.swing.*;
import java.awt.Font;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WordUnscrambler{
    private JFrame frame;
    private JPanel panel;
    private JPanel textPanel;

    private JLabel label;
    private JLabel word;
    private JLabel result;
    private JTextField input;
    
    
    private JButton enter;

    private int randomNum;
    private String randomWord;

    private List<String> ScrambledList;
    private List<String> unScrambledList;

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

    public void words(){
        ScrambledList = new ArrayList<>();
        ScrambledList.add("EGLALRY"); 
        ScrambledList.add("RPUMOTCE");
        ScrambledList.add("TVENIS");
        ScrambledList.add("OETENLPHO");
        ScrambledList.add("ELPAP");
        ScrambledList.add("RUBOTIR");
        ScrambledList.add("RMOWKOBOO");
        ScrambledList.add("LSHNIGE");
        ScrambledList.add("POMCHAIN");
        ScrambledList.add("OEPURE");

        unScrambledList = new ArrayList<>();
        unScrambledList.add("GALLERY");
        unScrambledList.add("COMPUTER");
        unScrambledList.add("INVEST");
        unScrambledList.add("TELEPHONE");
        unScrambledList.add("APPLE");
        unScrambledList.add("BURRITO");
        unScrambledList.add("BOOKWORM");
        unScrambledList.add("ENGLISH");
        unScrambledList.add("CHAMPION");
        unScrambledList.add("EUROPE");

    }

    public void inputPanel(){
        textPanel = new JPanel();
        //textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.PAGE_AXIS));
    }

        

    public void scrambledWord(){
        randomNum = (int) (Math.random() * 10);
        randomWord = ScrambledList.get(randomNum);

        word = new JLabel(randomWord);
        word.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        word.setFont(new Font("Serif",Font.BOLD, 20));
        word.setOpaque(true);

        word.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

    }

    public void text(){
        label = new JLabel("How to Play: Unscramble the given word to win!");
        label.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        label.setOpaque(true);
        
    }

    public void enterButton(){
        enter = new JButton("Enter");
         enter.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent w){
                String userInput = input.getText().toUpperCase();
                String unscrambledWord = unScrambledList.get(randomNum);
            if (userInput.equalsIgnoreCase(unscrambledWord)) {
                result.setText ("Correct! You unscrambled the word.");
            } else {
                result.setText("Incorrect. Try again.");
            }
            input.setText("");
 
            }
        });
    }

    public void inputField(){
        input = new JTextField(10);
        input.setAlignmentX(JTextField.CENTER_ALIGNMENT);
    }

    public void resultLabel(){
        result = new JLabel("");
        result.setAlignmentX(JLabel.CENTER_ALIGNMENT);
    }

    public void frameAdd(){

        panel.add(label);
        panel.add(Box.createVerticalStrut(100));
        panel.add(word);
        panel.add(Box.createVerticalStrut(200));

        textPanel.add(input);
        textPanel.add(enter);

        panel.add(textPanel);
        panel.add(result);
        

        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args){
        WordUnscrambler game = new WordUnscrambler();
        game.gameFrame();
        game.gamePanel();
        game.words();
        game.inputPanel();
        game.text();
        game.scrambledWord();
        game.inputField();
        game.enterButton();
        game.resultLabel();
        game.frameAdd();
    }
}