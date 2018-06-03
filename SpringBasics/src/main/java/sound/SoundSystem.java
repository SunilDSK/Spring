package sound;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SoundSystem {

    private Music CDPlayer;

    @Autowired
    public SoundSystem(Music CDPlayer) {
        this.CDPlayer = CDPlayer;
    }

    public void playMusic() {
        CDPlayer.play();
    }
}
