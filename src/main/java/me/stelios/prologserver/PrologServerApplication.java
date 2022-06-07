package me.stelios.prologserver;

import com.parctechnologies.eclipse.EclipseEngineOptions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrologServerApplication {

    public static final EclipseEngineOptions ENGINE_OPTIONS = new EclipseEngineOptions();

    public static void main(String[] args) {
        ENGINE_OPTIONS.setUseQueues(false);
        SpringApplication.run(PrologServerApplication.class, args);
    }

}
