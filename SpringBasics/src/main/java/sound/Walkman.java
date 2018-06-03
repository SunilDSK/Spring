package sound;

import org.springframework.stereotype.Component;

@Component
public class Walkman implements Music {
    public void play() {
        System.out.println("This is from Walkman");
    }
}
