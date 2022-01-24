package jinny.springboot.sample.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class WorkerApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(WorkerApplication.class);

        System.out.println("run Application ..!!! ");
        System.out.println("test.. 11111");
        application.run(args);
    }
}