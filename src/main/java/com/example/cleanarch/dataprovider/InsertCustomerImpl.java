package com.example.cleanarch.dataprovider;

import com.example.cleanarch.core.dataprovider.InsertCustomer;
import com.example.cleanarch.core.domain.Customer;
import com.example.cleanarch.dataprovider.repository.CustomerRepository;
import com.example.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class InsertCustomerImpl implements InsertCustomer {

    private final CustomerRepository customerRepository;
    private final CustomerEntityMapper customerEntityMapper;

    @Override
    public void insert(final Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }

}
