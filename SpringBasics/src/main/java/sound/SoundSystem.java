package sound;

import org.springframework.stereotype.Component;

@Component
public class SoundSystem {

    private Music CDPlayer;

    public SoundSystem(Music CDPlayer) {
        this.CDPlayer = CDPlayer;
    }

    public void playMusic() {
        CDPlayer.play();
    }
}
