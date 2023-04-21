package com.example.cleanarch.config;

import com.example.cleanarch.core.usecase.impl.InsertCustomerUseCaseImpl;
import com.example.cleanarch.dataprovider.FindByAddressByZipCodeImpl;
import com.example.cleanarch.dataprovider.InsertCustomerImpl;
import com.example.cleanarch.dataprovider.SendCpfForValidationImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCaseImpl insertCustomerUseCase(final FindByAddressByZipCodeImpl findByAddressByZipCode,
        final InsertCustomerImpl insertCustomer, final SendCpfForValidationImpl sendCpfForValidation) {
        return new InsertCustomerUseCaseImpl(findByAddressByZipCode, insertCustomer, sendCpfForValidation);
    }

}
