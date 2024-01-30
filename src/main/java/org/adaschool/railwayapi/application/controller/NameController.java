package org.adaschool.railwayapi.application.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/name")
public record NameController() {
    @GetMapping
    public ResponseEntity<?> getHealth(){
        return new ResponseEntity<>("Willian Alejandro Rueda Quiroga !", HttpStatus.OK);
    }
}
