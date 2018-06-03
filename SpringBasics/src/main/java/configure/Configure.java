package configure;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import sound.CDPlayer;

@Configuration
@ComponentScan(basePackageClasses = CDPlayer.class)
public class Configure {
}
