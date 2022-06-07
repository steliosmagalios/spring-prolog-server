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
import java.net.URISyntaxException;
import java.util.Objects;

@RestController
public class ScheduleController {

    private static final String PROGRAM_LOCATION = "/programs/schedule.ecl";

    private final EclipseEngine engine;

    public ScheduleController() throws EclipseException, IOException, URISyntaxException {
        // Create the eclipse engine and load the scheduling program
        engine = new OutOfProcessEclipse(PrologServerApplication.ENGINE_OPTIONS);
        engine.compile(new File(Objects.requireNonNull(getClass().getResource(PROGRAM_LOCATION)).toURI()));
    }

    @GetMapping("/schedule")
    // TODO: 07-Jun-22 Replace String return type with Schedule
    public String schedule() throws EclipseException, IOException {
        CompoundTerm result = engine.rpc("schedule(Tasks).");
        return result.arg(1).toString();
    }

}
