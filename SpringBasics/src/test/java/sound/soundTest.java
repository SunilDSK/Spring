package sound;

import configure.Configure;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Configure.class)
public class soundTest {

    @Autowired
    private CDPlayer cdPlayer;

    @Autowired
    private Walkman walkman;

    @org.junit.Test
    public void testCDPlayer_play() {
        assertNotNull(cdPlayer);
        cdPlayer.play();
    }

    @org.junit.Test
    public void testWalkman_play() {
        assertNotNull(walkman);
        walkman.play();
    }
}