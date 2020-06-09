package com.example.demo.ifaces;
import java.util.*;
public interface MyRepository<T> {

	T add(T t);
	List<T> findAll();
	T remove(T t);
}
