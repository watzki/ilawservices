package com.ilaw.akay;

import org.springframework.stereotype.Service;

@Service
public record AkayService(AkayRepository akayRepository) {
    public void registerAkay(AkayRegistrationRequest request) {
        Akay akay = Akay.builder()
                .lName(request.lName())
                .fName(request.fName())
                .purok((request.purok()))
                .build();

        // todo: check if akay exist in db
        // todo: store akay in db
        akayRepository.save(akay);
    }
}
