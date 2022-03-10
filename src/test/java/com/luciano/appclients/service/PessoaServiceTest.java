package com.luciano.appclients.service;

import com.luciano.appclients.service.impl.PessoaServiceImpl;
import org.junit.jupiter.api.BeforeEach;

public class PessoaServiceTest {

    private PessoaService sut;

    @BeforeEach
    void setUp() {
        sut = new PessoaServiceImpl();
    }
}
