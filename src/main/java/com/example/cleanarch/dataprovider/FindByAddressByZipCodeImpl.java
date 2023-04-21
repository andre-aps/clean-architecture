package com.example.cleanarch.dataprovider;

import com.example.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.example.cleanarch.core.domain.Address;
import com.example.cleanarch.dataprovider.client.FindAddressByZipCodeClient;
import com.example.cleanarch.dataprovider.client.mapper.AddressResponseMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FindByAddressByZipCodeImpl implements FindAddressByZipCode {

    private final FindAddressByZipCodeClient findAddressByZipCodeClient;
    private final AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(final String zipCode) {
        var addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }

}
