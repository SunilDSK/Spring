import configure.Configure;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sound.CDPlayer;

public class MainClass {
    public static void main(String[] args) {
        // Get application context using Configure class
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(Configure.class);
        // Get a Bean of CDPlayer class
        CDPlayer cdPlayer = (CDPlayer) applicationContext.getBean("CDPlayer");
        cdPlayer.play();
    }
}
