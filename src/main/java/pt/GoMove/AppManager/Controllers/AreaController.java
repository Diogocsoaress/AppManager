package pt.GoMove.AppManager.Controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.GoMove.AppManager.Models.Area;
import pt.GoMove.AppManager.Models.Repositories.AreaRepository;

@RestController
@RequestMapping(path = "/area")
public class AreaController {
    private Logger logger = LoggerFactory.getLogger(AreaController.class);
    @Autowired
    private AreaRepository areaRepository;
    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Area> getAreas() {
        logger.info("Sending all areas");
        return areaRepository.findAll();
    }

    @GetMapping(path = "/points", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Area> getAreasByPoints(){
        logger.info("Sending all areas by points");
        return areaRepository.findByPoints();
    }
}