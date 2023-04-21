package com.example.cleanarch.core.usecase.impl;

import com.example.cleanarch.core.dataprovider.FindCustomerById;
import com.example.cleanarch.core.domain.Customer;
import com.example.cleanarch.core.usecase.FindCustomerByIdUseCase;

public class FindCustomerByIdUseCaseImpl implements FindCustomerByIdUseCase {

    private final FindCustomerById findCustomerById;

    public FindCustomerByIdUseCaseImpl(final FindCustomerById findCustomerById) {
        this.findCustomerById = findCustomerById;
    }

    @Override
    public Customer find(final String id) {
        return findCustomerById.find(id)
            .orElseThrow(() -> new RuntimeException("customer not found"));
    }

}
