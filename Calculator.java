// 잘이해가 안되서 다시 공부하면서 풀었습니다. 늦어서 죄송합니다 교수님
import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame{
    public Calculator(){
        setTitle("계산기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container d = getContentPane();
        JLabel j = new JLabel("0", SwingConstants.RIGHT);
        d.add(j, BorderLayout.NORTH);

        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(4,4));
        jp.add(new JButton("1"));
        jp.add(new JButton("2"));
        jp.add(new JButton("3"));
        jp.add(new JButton("+"));
        jp.add(new JButton("4"));
        jp.add(new JButton("5"));
        jp.add(new JButton("6"));
        jp.add(new JButton("-"));
        jp.add(new JButton("7"));
        jp.add(new JButton("8"));
        jp.add(new JButton("9"));
        jp.add(new JButton("*"));
        jp.add(new JButton("0"));
        jp.add(new JButton("C"));
        jp.add(new JButton("="));
        jp.add(new JButton("/"));
        d.add(jp, BorderLayout.CENTER);

        setSize(300, 200);
        setVisible(true);
    }
    public static void main(String[] args){
        new Calculator();
    }
}
