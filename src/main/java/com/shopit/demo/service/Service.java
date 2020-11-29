package com.shopit.demo.service;

import java.util.List;

public interface Service<T1,T2> {
	public List<T1> getAll();
	public T1 get(T2 id);
	
	public T1 save(T1 t);
	public T1 update(T1 t);
	
	public T1 remove(T2 id);
	
	
}
