package com.example.cleanarch.dataprovider.repository.mapper;

import com.example.cleanarch.core.domain.Customer;
import com.example.cleanarch.dataprovider.repository.entity.CustomerEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, imports = {
    CustomerEntity.class,
    Customer.class
})
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(final Customer customer);

    Customer toCustomer(final CustomerEntity customerEntity);

}
