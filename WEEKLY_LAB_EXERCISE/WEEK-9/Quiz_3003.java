import javax.swing.*;
import java.awt.*;
public class Quiz_3003 extends JFrame{
    private JRadioButton[] option1,option3;
    private JCheckBox[] option2,option4;
    private ButtonGroup group1,group3;
    private JButton submitButton;
    public Quiz_3003() {
        setVisible(true);
        setTitle("QUIZ ON JAVA BASICS!");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton butt=new JButton("Click me!!!!");
        setLayout(new GridBagLayout());
        GridBagConstraints gbc=new GridBagConstraints();
        gbc.gridx=0;
        gbc.gridy=1;
        add(new JLabel("q1.How many access modifiers are there in JAVA?"),gbc);
        option1=new JRadioButton[]{
                new JRadioButton("1"),
                new JRadioButton("2"),
                new JRadioButton("3"),
                new JRadioButton("4")
        };
        group1=new ButtonGroup();
        for(int i=0;i<option1.length;i++){
            gbc.gridy++;
            add(option1[i],gbc);
            group1.add(option1[i]);
        }
        gbc.gridy++;
        add(new JLabel("q2.what types of inheritance is supported by JAVA?"),gbc);
        option2=new JCheckBox[]{
                new JCheckBox("Multiple inheritance"),
                new JCheckBox("Hybrid inheritance"),
                new JCheckBox("Multilevel inheritance"),
                new JCheckBox("Single inheritance"),
                new JCheckBox(" Hierarchical inheritance")
        };
        for(JCheckBox i:option2){
            gbc.gridy++;
            add(i,gbc);
        }
        gbc.gridy++;
        add(new JLabel("q3.How many keywords are there in JAVA?"),gbc);
        option3=new JRadioButton[]{
                new JRadioButton("32"),
                new JRadioButton("52"),
                new JRadioButton("64"),
                new JRadioButton("95")
        };
        group3=new ButtonGroup();
        for(int i=0;i<option3.length;i++){
            gbc.gridy++;
            add(option3[i],gbc);
            group3.add(option3[i]);
        }
        gbc.gridy++;

        add(new JLabel("q4.Output of the following program."),gbc);
        JTextArea textArea = new JTextArea();
        gbc.gridy++;
        textArea.setText("public class Solution{\n" +
                "       public static void main(String[] args){\n" +
                "                     short x = 10;\n" +
                "                     x =  x * 5;\n" +
                "                     System.out.print(x);\n" +
                "       }\n" +
                "}");
        gbc.gridy++;
        add(textArea,gbc);
        textArea.setEditable(false);
        option4=new JCheckBox[]{
                new JCheckBox("50"),
                new JCheckBox("10"),
                new JCheckBox("compile time error"),
                new JCheckBox("run time error")
        };
        for(JCheckBox i:option4){
            gbc.gridy++;
            add(i,gbc);
        }
        gbc.gridy++;
        add(new JLabel("q5.Father of JAVA?"),gbc);
        JTextField jamesgosling=new JTextField(13);
        gbc.gridy++;
        add(jamesgosling,gbc);
        gbc.gridy++;
        submitButton=new JButton("submit!!");
        add(submitButton,gbc);
        submitButton.addActionListener(e->{
            int score=0;
            if(option1[3].isSelected()) score++;
            if(option2[0].isSelected() && option2[2].isSelected() && option2[3].isSelected() && option2[4].isSelected() ) score++;
            if(option3[1].isSelected()) score++;
            if(option4[2].isSelected()) score++;
            if(jamesgosling.getText().toLowerCase().equals("james gosling")) score++;
            JOptionPane.showMessageDialog(null, "Your score is: " + score + "/" +5);
        });
    }
    public static void main(String[] args) {
        new Quiz_3003();
    }
}
