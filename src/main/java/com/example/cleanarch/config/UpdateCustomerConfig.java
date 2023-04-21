package com.example.cleanarch.config;

import com.example.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.example.cleanarch.core.usecase.impl.UpdateCustomerUseCaseImpl;
import com.example.cleanarch.dataprovider.FindByAddressByZipCodeImpl;
import com.example.cleanarch.dataprovider.UpdateCustomerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCaseImpl updateCustomerUseCase(final FindCustomerByIdUseCaseImpl findCustomerByIdUseCase,
        final FindByAddressByZipCodeImpl findByAddressByZipCode, final UpdateCustomerImpl updateCustomer) {
        return new UpdateCustomerUseCaseImpl(findCustomerByIdUseCase, findByAddressByZipCode, updateCustomer);
    }

}
