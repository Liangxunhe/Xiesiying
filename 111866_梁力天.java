import javax.swing.*;

public class LLT {
    private JPanel panel1;
    void go(){
        JFrame frame = new JFrame("LLT");
        frame.setContentPane(panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,200,600,300);
        frame.setVisible(true);
    }


    public static void main(String[] args) {

      new LLT().go();


    }
}
