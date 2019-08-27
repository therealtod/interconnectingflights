package two.task.interconnectingflights.controllers;


import two.task.interconnectingflights.models.Solution;
import two.task.interconnectingflights.services.InterconnectedFlightsSolutionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InterconnectionsController {

    @Autowired
    private InterconnectedFlightsSolutionsService interconnectedFlightsSolutionsService;

    @RequestMapping(value = "/api/v1/interconnections", method = RequestMethod.GET)
    public List<Solution> giveResponse(@RequestParam String departure,
                                       @RequestParam String arrival,
                                       @RequestParam String departureDateTime,
                                       @RequestParam String arrivalDateTime) {

        return interconnectedFlightsSolutionsService
                .getSolutions(
                        departure,
                        arrival,
                        departureDateTime,
                        arrivalDateTime);

    }
}
