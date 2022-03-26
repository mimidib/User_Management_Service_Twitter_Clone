package com.cst8277.ums;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LastVisitController {
    @Autowired
    LastVisitRepository lastVisitRepository;

    @GetMapping("/lastvisits")
    public @ResponseBody Iterable<LastVisit> getAllLastVisits(){
        return lastVisitRepository.findAll();
    }
}
