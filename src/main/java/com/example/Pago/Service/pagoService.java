package com.example.Pago.Service;

import org.springframework.stereotype.Service;

import com.example.Pago.Model.DTO.pagoDto;
import com.example.Pago.Repository.pagoRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class pagoService {
 private final pagoRepository repository;

    public pagoDto Proceso( pagoDto pago){

        return pago;
    }
}

