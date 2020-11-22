package com.drsmile.businessapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MicroserviceVersionResolverController {

    @GetMapping("/resolve/version")
    public ResponseEntity<String> resolveVersion() {
        return ResponseEntity.ok("0.0.1-SNAPSHOT (NOT FROM MAVEN YET)");
    }
}
