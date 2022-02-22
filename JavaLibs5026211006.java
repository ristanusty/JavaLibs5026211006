import javax.swing.*;
import java.awt.*;

public class JavaLibs5026211006 {
    public JavaLibs5026211006(){

    }
    public static void main(String[] args) {

        String  Name, Age, Job, Office, House, Hobby, FavFood, Language, WomenType, Title;
        int IntAge, countAge;
        double douLanguage;
        Title = "Dating Game by Rista";

        String[] options = new String[]{"Next", "Exit"};
        int introInt = JOptionPane.showOptionDialog(null, "Hello! welcome to the Dating Game, where men and women meet the people of their dreams. Now, let’s introduce yourself", " " +Title+" ", 0, 2, null, options, options[0]);
        if (introInt != 0) {
            System.exit(0);
        }
        ;

        Name = (String) JOptionPane.showInputDialog((Component) null, "What is your name?", " " +Title+" ", 3, (Icon) null, (Object[]) null, "");

        Age = (String) JOptionPane.showInputDialog((Component) null, "How old are you?", " " +Title+" ", 3, (Icon) null, (Object[]) null, "");

        Job = (String) JOptionPane.showInputDialog((Component) null, "What is your job? ", " " +Title+" ", 3, (Icon) null, (Object[]) null, "");

        Office = (String) JOptionPane.showInputDialog((Component) null, "Where do you work? ", " " +Title+" ", 3, (Icon) null, (Object[]) null, "");

        House = (String) JOptionPane.showInputDialog((Component) null, "Where do you live? ", " " +Title+" ", 3, (Icon) null, (Object[]) null, "");

        Hobby = (String) JOptionPane.showInputDialog((Component) null, "What activities would you love to do at your free time?", " " +Title+" ", 3, (Icon) null, (Object[]) null, "");

        FavFood = (String) JOptionPane.showInputDialog((Component) null, "What food do you like the most?", " " +Title+" ", 3, (Icon) null, (Object[]) null, "");

        Language = (String) JOptionPane.showInputDialog((Component) null, "How many language you able to speak with fluently?", " " +Title+" ", 3, (Icon) null, (Object[]) null, "");

        WomenType = (String) JOptionPane.showInputDialog((Component) null, "what type of women do you like? \nexample: Can cook, Likes sport, Have a good sense of humour, etc", " " +Title+" ", 3, (Icon) null, (Object[]) null, "");

        IntAge = Integer.parseInt(Age);
        douLanguage = Double.parseDouble(Language);
        countAge = IntAge*4;

        JOptionPane.showMessageDialog((Component) null, "introducing my self...");

        JOptionPane.showMessageDialog((Component) null, " Hi I'm " +Name+" !, I'm "+Age+" years old, and I work as a "+Job+ " at " +Office+".\nI live at " +House+ ". In my free time, I enjoy " +Hobby+ ", and raising chickens" +
                                                                " in my backyard.\n I also help feed the homeless once a week. " +FavFood+  "are my favorite meal to eat.\n I also speak " +douLanguage+ " languages and I love women who " +WomenType+ ". I " +
                                                                "think I'm the man for you \n and I'll love you until we turn"  +countAge+ ".");

        JOptionPane.showMessageDialog((Component) null, "Thanks for your participation!",  " "+Title+" ", 2);


    }
}