package baemindelivery.common;


import baemindelivery.BoundedContext708Application;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { BoundedContext708Application.class })
public class CucumberSpingConfiguration {
    
}
