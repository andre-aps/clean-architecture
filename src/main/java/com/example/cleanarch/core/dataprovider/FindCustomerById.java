package com.example.cleanarch.core.dataprovider;

import com.example.cleanarch.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerById {

    Optional<Customer> find(final String id);

}
