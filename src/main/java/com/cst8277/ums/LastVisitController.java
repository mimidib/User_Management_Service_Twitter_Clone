package com.cst8277.ums;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;

@RestController
@Slf4j
public class LastVisitController {
    @Autowired
    LastVisitRepository lastVisitRepository;

    //Get All LastVisits
    @GetMapping("/lastvisits")
    public @ResponseBody Iterable<LastVisit> getAllLastVisits(){
        return lastVisitRepository.findAll();
    }

    //insert LastVisit
    @GetMapping("/insertlastvisit")
    public @ResponseBody String insertLastVisit(@RequestParam String in,
                                                @RequestParam String out) {
        /* to create current time and toString it. TODO -> figure out how to provide the a date parameter within the ums project rather than request it
        long millis = System.currentTimeMillis();
        Date date = new Date(millis);
        out = date.toString();*/
        LastVisit newlastvisit = new LastVisit();
        newlastvisit.setIn(in);
        newlastvisit.setOut(out);
        lastVisitRepository.save(newlastvisit);
        log.info("@@@@@@@@@@@@@@@@@@ Inside /insertlastvisit PostMapping @@@@@@@@@@@@@@@@@");

        return "Role Inserted into Records";
    }
}
