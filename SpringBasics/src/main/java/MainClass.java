import configure.Configure;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sound.CDPlayer;
import sound.Walkman;

public class MainClass {
    public static void main(String[] args) {
        // Get application context using Configure class
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(Configure.class);
        // Get a Bean of CDPlayer class
        CDPlayer cdPlayer = (CDPlayer) applicationContext.getBean("CDPlayer");
        cdPlayer.play();

        Walkman walkman = (Walkman) applicationContext.getBean("Walkman");
        walkman.play();
    }
}
