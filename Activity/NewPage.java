public class NewPage extends JFrame {
    private JLabel nameLabel;
    private JTextArea userInfoArea;

    public NewPage() {
        super("User Information");

        nameLabel = new JLabel("name: Marc Luiz");
        userInfoArea = new JTextArea(10, 20);
        userInfoArea.setEditable(false);

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(nameLabel, BorderLayout.NORTH);
        panel.add(userInfoArea, BorderLayout.CENTER);

        // retrieve user information 

        add(panel);
        setSize(400, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        NewPage NewPage = new NewPage();
    }
}
