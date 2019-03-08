package ac.za.cput.snw.demo1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class AppConfig {


        @Bean(name="Change")
        public Book getBible()
        {
            return new Bible();
        }
        @Bean(name ="Publish")
        public Book getStories()
        {

            return new Magazine();
        }
}
