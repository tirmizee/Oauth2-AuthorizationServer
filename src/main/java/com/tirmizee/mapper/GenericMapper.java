package com.tirmizee.mapper;

import java.util.List;

public interface GenericMapper<D,E> {
	
	E toEntity(D dto);
	
	D toDTO(E entity);
	
	List<E> toEnties(List<D> dtos);
	
	List<D> toDtos(List<E> entities);

}
