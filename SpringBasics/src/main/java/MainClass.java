import configure.Configure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sound.CDPlayer;
import sound.SoundSystem;
import sound.Walkman;

public class MainClass {

    public static void main(String[] args) {
        // Get application context using Configure class
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(Configure.class);
        // Get a Bean of CDPlayer class
        CDPlayer cdPlayer = applicationContext.getBean(CDPlayer.class);
        cdPlayer.play();
        // Get a Bean of Walkman class
        Walkman walkman = applicationContext.getBean(Walkman.class);
        walkman.play();

        SoundSystem soundSystem = applicationContext.getBean(SoundSystem.class);
        soundSystem.playMusic();
    }
}
