package configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sound.CDPlayer;
import sound.SoundSystem;
import sound.Walkman;


@Configuration
public class Configure {

    @Bean
    public CDPlayer cdPlayer(){
        return new CDPlayer();
    }

    @Bean
    public Walkman walkman() {
        return new Walkman();
    }

    @Bean
    public SoundSystem soundSystem(){
        return new SoundSystem(new Walkman());
    }
}
