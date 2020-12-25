import javax.swing.*;
import java.awt.*;

public class Timer extends JFrame {
    private Container pan;
    private JPanel panel;
    private JTextField message = new JTextField("Info"), minute = new JTextField("000"), sekunden = new JTextField("000");
    private JButton start;

    public Timer(){
        panel = new JPanel(new GridLayout(2,3,5,0));
        pan = this.getContentPane();
        pan.setLayout(new BorderLayout());
        panel.setBackground(Color.orange);
        start = new JButton("Start");


        panel.add(minute);  panel.add(sekunden);  panel.add(start);
        panel.add(new JLabel("Minuten")); panel.add(new JLabel("Sekunden"));

        pan.add(panel, BorderLayout.NORTH);
        pan.add(message, BorderLayout.CENTER);

        message.setBackground(new Color(0,0,0));
        message.setForeground(new Color(255, 255, 255));
        message.setEditable(false);
        message.setFont(new Font("TimesRoman", Font.BOLD, 20));

        minute.setFont(new Font("TimesRoman", Font.BOLD, 20));
        minute.setEditable(false);

        sekunden.setFont(new Font("TimesRoman", Font.BOLD, 20));
        sekunden.setEditable(false);

        start.addActionListener((e)->{
            //Aktion für Start
        });
        this.setTitle("Timer");
        this.setSize(500, 150);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            new Timer();
        });
    }

}
