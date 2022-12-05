package baemindelivery.common;


import baemindelivery.BoundedContext672Application;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { BoundedContext672Application.class })
public class CucumberSpingConfiguration {
    
}
