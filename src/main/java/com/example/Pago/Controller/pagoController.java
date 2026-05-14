package com.example.Pago.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Pago.Model.Pago;
import com.example.Pago.Service.pagoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/pagos")
@RequiredArgsConstructor
public class pagoController {

 private final pagoService service;

    @PostMapping
    public ResponseEntity<Pago> save(
            @RequestBody Pago pago){

        return ResponseEntity.ok(
                service.Proceso(pago)
        );
    }
    }

