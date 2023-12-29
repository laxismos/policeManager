package net.base.open.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.base.open.entity.Officer;
import net.base.util.Result;

@RestController
@RequestMapping
public class PoliceManController {
    
    @GetMapping("/officer/add")
    public Result addOfficer(@RequestBody Officer officer){

        return Result.Success("Hello");
    }

}
