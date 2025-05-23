import javax.swing.JOptionPane;
//import java.util.Scanner;

public class NameMaker {
    
    public static void main(String args[])
    {
        String name = JOptionPane.showInputDialog("Enter your name");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        String address= JOptionPane.showInputDialog("Enter yoru address");
        String message = String.format("Your anme is %s%nYou are %d years old%nYou live at %s" , name, age, address);
        System.out.println(message);
    }
    
}
