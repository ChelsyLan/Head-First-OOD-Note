import javax.swing.*;

public class SwingObserverExample {
    JFrame frame;
    public static void main(String[] args){
        SwingObserverExample example = new SwingObserverExample();
        example.go();

    }

    public void go(){
        frame = new JFrame();
        JButton button = new JButton("should I do that?");
        button.addActionListener(event -> System.out.println("yes,you should"));//lambda expression
        //When you click the button, the function objects created by the lambda expressions are notified
        //and the method they implement is run.
        button.addActionListener(event -> System.out.println("don't do it, you might regret that!"));
    }

}
