import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BullsAndCows extends JFrame implements ActionListener {


    @Override
    public void actionPerformed(ActionEvent event){

        if(event.getSource().equals(restart)){
            Collections.shuffle(digits);

            number = digits.get(0)*1000+digits.get(1)*100 + digits.get(2)*10 + digits.get(3);

            numOfGuesses=0;

            textArea.setText(EMPTY_STRING);

            textArea.append(RULES);

        }else{
            String temp = inputLine.getText();
            inputLine.setText(EMPTY_STRING);

            if(temp.equals("just tell me the number")){
                JOptionPane.showMessageDialog(null, number);
            }

            if(!temp.equals("")){
                numOfGuesses++;
                runGuess(temp);
            }
        }
    }

    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 600;
    private static final int FRAME_X_ORIGIN = 0;
    private static final int FRAME_Y_ORIGIN = 0;
    private static final int BUTTON_WIDTH = 80;
    private static final int BUTTON_HEIGHT = 30;
    private static final String EMPTY_STRING = "";
    private static final String NEWLINE = System.getProperty("line.separator");
    private static final String RULES = ("Rules: Guess four-digit numbers with no repeats and no zeros. "
            + "\nA \"bull\" means that you have a correct digit in the correct \nplace, "
            + "and a \"cow\" means that you have a correct digit, but in \nthe wrong place." + NEWLINE + NEWLINE);

    private final JLabel instructions = new JLabel ("Guess a number: ");

    private List<Integer> digits;

    private JButton guessButton;

    private JButton restart;

    private JTextField inputLine;

    private JTextArea textArea;

    private int number;

    private int numOfGuesses;

    public void createAppForm(){
        Container contentPane;

        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setResizable(false);
        setTitle("Bulls and Cows: The Java Rendition");
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);

        contentPane = getContentPane();
        contentPane.setLayout(null);
        contentPane.setBackground(Color.lightGray);

        digits = new ArrayList<Integer>();
        for (int i = 1; i <= 9; i++) {
            digits.add(i);
        }

        Collections.shuffle(digits);

        number = digits.get(0)*1000+digits.get(1)*100+digits.get(2)*10+digits.get(3);

        numOfGuesses = 0;

        guessButton = new JButton("Guess!");
        guessButton.setBounds(330,60,BUTTON_WIDTH,BUTTON_HEIGHT);
        guessButton.setBorder(BorderFactory.createRaisedBevelBorder());
        contentPane.add(guessButton);

        restart = new JButton("Restart!");
        restart.setBounds(420, 60, BUTTON_WIDTH,BUTTON_HEIGHT);
        restart.setBorder(BorderFactory.createRaisedBevelBorder());
        contentPane.add(restart);

        guessButton.addActionListener(this);
        restart.addActionListener(this);

        inputLine = new JTextField();
        inputLine.setBounds(95,60,220,25);
        contentPane.add(inputLine);

        inputLine.addActionListener(this);

        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollText = new JScrollPane(textArea);
        scrollText.setBounds(100,100,400,600);
        scrollText.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        textArea.append(RULES);

        contentPane.add(scrollText);

        instructions.setBounds(100,33,300,20);
        contentPane.add(instructions);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void runGuess(String numString){
        int bulls = 0;
        int cows = 0;

        int guess = Integer.parseInt(numString);

        if((guess/1000)<=0 || (guess/1000)>=10){
            JOptionPane.showMessageDialog(null, "Please enter in a four-digit number without repeat or 0.");
            numOfGuesses--;
        }else if(guess == number){
            textArea.append("You won the game. The number was "+ number+". " + NEWLINE + "It took you "+numOfGuesses+" guesses.");
            textArea.append(NEWLINE + "Click the 'Restart!' button below to play again.");
        }else{
            for (int i = 0; i < 4; i++) {
                if((number/(int) Math.pow(10, i))%10 ==(guess/(int) Math.pow(10, i))%10){
                    bulls++;
                }else{
                    for (int j = 0; j < 4; j++) {
                        if((number /(int)Math.pow(10,i))%10 == (guess/(int) Math.pow(10, j))%10){
                            cows++;
                        }
                    }
                }
            }
            textArea.append("    "+numOfGuesses+"     |     Your guess: "+guess+"     |     Bulls: "+bulls+"   Cows: "+cows+NEWLINE);
        }
        inputLine.setText(EMPTY_STRING);
    }

}
