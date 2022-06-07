package me.stelios.prologserver.controllers;

import com.parctechnologies.eclipse.CompoundTerm;
import com.parctechnologies.eclipse.EclipseEngine;
import com.parctechnologies.eclipse.EclipseException;
import com.parctechnologies.eclipse.OutOfProcessEclipse;
import me.stelios.prologserver.PrologServerApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;

@RestController
public class ScheduleController {

    private final EclipseEngine engine;

    public static final String PROGRAM = "program.ecl";

    public ScheduleController() throws EclipseException, IOException {
        // Create the eclipse engine and load the scheduling program
        engine = new OutOfProcessEclipse(PrologServerApplication.ENGINE_OPTIONS);
        engine.compile(new File(PROGRAM));
    }

    @GetMapping("/")
    // TODO: 07-Jun-22 Replace String return type with Schedule
    public String schedule() throws EclipseException, IOException {
        CompoundTerm result = engine.rpc("schedule(Tasks).");
        return result.arg(1).toString();
    }

}
