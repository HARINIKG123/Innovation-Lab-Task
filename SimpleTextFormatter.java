import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class SimpleTextFormatter extends JFrame{
    private JTextField textField;
    private JTextArea textArea;
    public SimpleTextFormatter(){
        setTitle("Text Formatter");
        setSize(300,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        set Layout(new FlowLayOut());
        textField=new JTextField(15);
        add (textField);
        JButton FormatButton=new JButton("FormatText");
        add(FormatButton);
        textArea.setEditable(false);
        add(new JScrollpane(textArea));
        FormatButton.addActionListener(new ActionListener()) {
            @Override
            public void actionperformed(ActionEvent e) {
                formatText();
            }
        });
            setvisible(true);
        }
        private void formatText() {
            string text=textfield.getText();
            textArea.setFont(new Front("Arial",Front.PLAIN,16));
        }
        public static void main(String[] args) {
            new SiumpleTextFormatter();
        }
    }        
