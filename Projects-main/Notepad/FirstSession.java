package Notepad;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * FirstSession
 */
public class FirstSession implements Action {
    static JFrame frame;
    static JTextArea textArea;

    static JTextField textField;

    static JButton jButton;

    static JMenuBar jMenuBar;
    static JMenu jMenu;
    static JMenuItem jMenuItem, jMenuItem2;

    FirstSession(){
        frame = new JFrame("First Session");
        frame.setLayout(null); // isne sbse phele to pura size zero krdiya frame ka
        frame.setBounds(200, 100, 400, 400); // fir isne hmare according size de diya frame ko

        textArea = new JTextArea("First TextArea");
        textArea.setBounds(30, 30, 300, 300);

        textField = new JTextField("First textField");

        jButton = new JButton("Click me");
        jButton.setBounds(250, 350, 100, 100);
        jButton.setVisible(true);
        jButton.addActionListener(this);

        jMenuBar=new JMenuBar();
        jMenu=new JMenu("open");
        jMenuItem=new JMenuItem("first option");
        jMenuItem.addActionListener(this);
        jMenuItem2=new JMenuItem("Second option");
        jMenuItem2.addActionListener(this);

        jMenu.add(jMenuItem);
        jMenu.add(jMenuItem2);
        jMenuBar.add(jMenu);

        frame.setJMenuBar(jMenuBar);    


        textArea.add(textField);
        textArea.add(jButton);

        frame.add(jButton);
        frame.add(textArea);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
       FirstSession f=new FirstSession();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

        String s=e.getActionCommand();

        if(s.equals("Click me")){
            textArea.setText("You've clicked the button");
        }
        else if(s.equals("first option")){
            textArea.setText("you click first option");
        }
        else if(s.equals("Second option")){
            textArea.setText("you click second option");
        }
        
    }

    @Override
    public Object getValue(String key) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void putValue(String key, Object value) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setEnabled(boolean b) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean isEnabled() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        // TODO Auto-generated method stub
        
    }
}