package com.yatri.seva.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/add")
public class SaveProvideDetailsController {
    @PostMapping("/vehicle")
    public ResponseEntity<String> addVehicleDetails()
    {
        return new ResponseEntity<>("Detailed Saved Succesfullly", HttpStatusCode.valueOf(200));
    }
    @PostMapping("/user")
    public ResponseEntity<String> addUserDetails()
    {
        return new ResponseEntity<>("User Added Succesfully", HttpStatus.ACCEPTED);
    }
}
