import java.awt.Font;

import javax.swing.*;
public class About extends JFrame{
    About(){
        setBounds(100, 100, 500, 400);
        setTitle("About Notepad Application");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        ImageIcon icon = new ImageIcon(getClass().getResource("notepad_icon.jpg"));
        setIconImage(icon.getImage());

        setLayout(null);

        JLabel iconLabel = new JLabel(new ImageIcon(getClass().getResource("notepad_icon.jpg")));
        iconLabel.setBounds(100, 50, 150, 120);
        add(iconLabel);

        JLabel textLabel = new JLabel("<html> Welcome to Notepad Application<br>Notepad is a simple text editor for Microsoft Windows  and a basic text-editing program which enables computer users to create documents<br></html>");
        textLabel.setBounds(100, 80, 350, 300);
        textLabel.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12));
        add(textLabel);
    }
    
    public static void main(String[] args){
        new About().setVisible(true);
    }
}
