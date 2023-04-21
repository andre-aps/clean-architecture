package com.example.cleanarch.core.usecase;

import com.example.cleanarch.core.domain.Customer;

public interface InsertCustomerUseCase {

    void insert(final Customer customer, final String zipCode);

}
