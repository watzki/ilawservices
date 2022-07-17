package com.ilaw.akay;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/akay")
public record AkayController(AkayService akayService) {

    @PostMapping
    public void registerAkay(@RequestBody AkayRegistrationRequest akayRegistrationRequestRequest){
        log.info("New akay registration {}", akayRegistrationRequestRequest);
        akayService.registerAkay(akayRegistrationRequestRequest);
    }
}
