package com.example.Pago.Service;

import org.springframework.stereotype.Service;

import com.example.Pago.Model.Pago;
import com.example.Pago.Repository.pagoRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class pagoService {
 private final pagoRepository repository;

    public Pago Proceso(Pago pago){

        pago.setEstado("aprovado");

        log.info("procesando pago");

        return repository.save(pago);
    }
}

