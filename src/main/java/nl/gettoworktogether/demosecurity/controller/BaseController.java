package nl.gettoworktogether.demosecurity.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @GetMapping("/")
    public ResponseEntity<Object> sayHallo() {
        return ResponseEntity.ok("Hallo");
    }

}
