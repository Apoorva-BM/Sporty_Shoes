package org.simplileran.sportyShoe.service;

import org.simplileran.sportyShoe.entity.Address;
import org.simplileran.sportyShoe.model.AddressModel;

public interface AddressService {
	void addAddress(AddressModel address);
	Address getAddress(AddressModel address);
	
}
