package pt.GoMove.AppManager.Controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.GoMove.AppManager.Models.Coords;
import pt.GoMove.AppManager.Models.Repositories.CoordsRepository;

@RestController
@RequestMapping(path = "/coords")
public class CoordsController {
    private Logger logger = LoggerFactory.getLogger(CoordsController.class);
    @Autowired
    private CoordsRepository coordsRepository;
    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Coords> getUnits() {
        logger.info("Sending all coords");
        return coordsRepository.findAll();
    }
}
