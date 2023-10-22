import javax.swing.*;
import java.awt.Font;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class WordUnscrambler{
    private JFrame frame;
    private JLabel label;
    private JTextField input;
    private JPanel panel;
    private JPanel textPanel;
    private JLabel word;
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
        ScrambledList.add("OEPUR");

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
        game.words();
        game.inputPanel();
        game.text();
        game.scrambledWord();
        game.inputField();
        game.enterButton();
        game.frameAdd();
    }
}