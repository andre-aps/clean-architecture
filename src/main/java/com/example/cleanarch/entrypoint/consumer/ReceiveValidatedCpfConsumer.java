package com.example.cleanarch.entrypoint.consumer;

import com.example.cleanarch.core.usecase.UpdateCustomerUseCase;
import com.example.cleanarch.entrypoint.consumer.mapper.CustomerMessageMapper;
import com.example.cleanarch.entrypoint.consumer.message.CustomerMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ReceiveValidatedCpfConsumer {

    private final UpdateCustomerUseCase updateCustomerUseCase;
    private final CustomerMessageMapper customerMessageMapper;

    @KafkaListener(topics = "tp-cpf-validated", groupId = "cleanarch")
    public void receive(final CustomerMessage customerMessage) {
        var customer = customerMessageMapper.toCustomer(customerMessage);
        updateCustomerUseCase.update(customer, customerMessage.getZipCode());
    }

}
