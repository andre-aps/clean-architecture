package com.example.cleanarch.config;

import com.example.cleanarch.core.usecase.impl.DeleteCustomerByIdUseCaseImpl;
import com.example.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.example.cleanarch.dataprovider.DeleteCustomerByIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {

    @Bean
    public DeleteCustomerByIdUseCaseImpl deleteCustomerByIdUseCase(final FindCustomerByIdUseCaseImpl findCustomerByIdUseCase,
        final DeleteCustomerByIdImpl deleteCustomerById) {
        return new DeleteCustomerByIdUseCaseImpl(findCustomerByIdUseCase, deleteCustomerById);
    }

}
