package com.example.cleanarch.core.usecase;

import com.example.cleanarch.core.domain.Customer;

public interface FindCustomerByIdUseCase {

    Customer find(final String id);

}
