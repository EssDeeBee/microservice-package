package com.drsmile.apigateway.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequiredArgsConstructor
public class BusinessController {

    private final RestTemplate restTemplate;

    @GetMapping("/business")
    public ResponseEntity<String> getVersionId() {
        String versionName = restTemplate.getForObject("http://business-api/resolve/version", String.class);

        if (versionName == null)
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Internal server error. Please try later");

        return ResponseEntity.ok(versionName);
    }
}
