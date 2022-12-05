package baemindelivery.common;


import baemindelivery.BoundedContext1160Application;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { BoundedContext1160Application.class })
public class CucumberSpingConfiguration {
    
}
