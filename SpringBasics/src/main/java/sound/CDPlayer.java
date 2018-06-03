package sound;

import org.springframework.stereotype.Component;

@Component("CDPlayer")
public class CDPlayer implements Music {
    public void play() {
        System.out.println("This is from CDPlayer");
    }
}
