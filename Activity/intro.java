import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Intro implements ActionListener {

    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel Info;



    public static void main(String[] args) {

        JPanel P1 = new JPanel();
        JFrame F1 = new JFrame();
        F1.setSize(350,200);
        //F1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        F1.add(P1);

        P1.setLayout(null);

        userLabel = new JLabel("User");
        userLabel.setBounds(10, 20, 80, 25);
        P1.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100, 20, 164, 25);
        P1.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        P1.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds (100, 50, 165, 25);
        P1.add(passwordText);

        button = new JButton("Login");
        button.setBounds(10, 80, 80, 25);
        button.addActionListener(new Intro());
        P1.add(button);

        Info = new JLabel("");
        Info.setBounds(10, 110, 300, 25);
        P1.add(Info);


        F1.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordText.getText();
        System.out.println(user + " , " + password);

        if(user.equals("Marc Luiz") && password.equals("123")){
        Info.setText("Login success");
        } 
        else{
            Info.setText("Invalid username or password. Please try again.");
        };
        dispose();
        NewPage NewPage = new NewPage();

    }

    private void dispose() {
    }
}
