package org.simplileran.sportyShoe.service.impl;

import org.simplileran.sportyShoe.dao.AddressDao;
import org.simplileran.sportyShoe.dao.impl.AddressDaoImpl;
import org.simplileran.sportyShoe.entity.Address;
import org.simplileran.sportyShoe.model.AddressModel;
import org.simplileran.sportyShoe.service.AddressService;

public class AddressServiceImpl implements AddressService{
	private AddressDao dao = new AddressDaoImpl();

	@Override
	public void addAddress(AddressModel address) {
		Address entity = new Address();
		entity.setCity(address.getCity());
		entity.setCountry(address.getCountry());
		entity.setPostalCode(address.getPostalCode());
		entity.setState(address.getState());
		entity.setStreet(address.getStreet());
		//dao.insertAddress(entity);
	}

	@Override
	public Address getAddress(AddressModel address) {
		Address entity = new Address();
		entity.setCity(address.getCity());
		entity.setCountry(address.getCountry());
		entity.setPostalCode(address.getPostalCode());
		entity.setState(address.getState());
		entity.setStreet(address.getStreet());
		return  entity;
	}

	
}
