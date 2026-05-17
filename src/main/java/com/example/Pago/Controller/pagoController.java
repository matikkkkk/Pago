package com.example.Pago.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.Pago.Model.DTO.pagoDto;
import com.example.Pago.Service.pagoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/pagos")
@RequiredArgsConstructor
public class pagoController {

    private final pagoService service;

    @PostMapping
    public ResponseEntity<pagoDto> save(
            @RequestBody pagoDto pago){

        return ResponseEntity.ok(
                service.Proceso(pago)
        );
    }
}

