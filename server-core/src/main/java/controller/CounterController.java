package controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CounterController {

    private static final Logger log = LoggerFactory.getLogger(CounterController.class);

    @RequestMapping(value = "/coordinates", method = RequestMethod.POST)
    public String setCoords(@RequestBody String point) throws JsonProcessingException {

        log.info(point);

        return point;

    }

}