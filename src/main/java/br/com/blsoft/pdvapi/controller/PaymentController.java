package br.com.blsoft.pdvapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.blsoft.pdvapi.config.SpringFoxConfig;
import br.com.blsoft.pdvapi.domain.model.Payment;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/pdv/payment")
@Api(tags = { SpringFoxConfig.PAYMENT_TAG })
public class PaymentController {

    @ApiOperation(value = "Listar formas de pagamentos")
    @GetMapping
    public Payment[] findAllActive() {
        return Payment.values();
    }
}
