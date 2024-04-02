package com.reservas.hoteles.business;

import java.util.List;
import java.util.Optional;

import com.reservas.hoteles.exception.BusinessException;
import com.reservas.hoteles.exception.ResourceNotFoundException;
import com.reservas.hoteles.model.Hotel;

public interface IHotelBusiness {
	public List<Hotel> loadBusqueda(String busqueda);
	public Optional<Hotel> load(long id) throws ResourceNotFoundException;
	public List<Hotel> list() throws ResourceNotFoundException;
	public Hotel add(Hotel hotel);
	public Hotel update(Hotel hotel);
	public void delete(long id) throws BusinessException;
}
