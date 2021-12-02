package pt.GoMove.AppManager.Controllers;

import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.GoMove.AppManager.Models.User;
import pt.GoMove.AppManager.Models.Repositories.UserRepository;


@RestController
@RequestMapping(path = "/api/users")
public class UserController {
    private Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserRepository userRepository;
    
    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<User> getStudents() {
        logger.info("Sending all students");
        return userRepository.findAll();
    }
    
    // Deviamos usar o RequestParam
    @GetMapping(path = "/date/{sdate}/{edate}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<User> getStudentsByDate(@PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate sdate,
                                                @PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate edate) {
        logger.info("Sending all students with birth dates between :"+
        sdate +" and " +edate);
        return UserRepository.findByBdateBetween(sdate, edate);
    }
}
