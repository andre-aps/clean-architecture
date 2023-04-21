package com.example.cleanarch.core.usecase;

import com.example.cleanarch.core.domain.Customer;

public interface UpdateCustomerUseCase {

    void update(final Customer customer, final String zipCode);

}
