package ac.za.cput.snw.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);

       Magazine m = new Magazine();
       Bible b = new Bible();

       m.output();
       b.output();

    }

}
