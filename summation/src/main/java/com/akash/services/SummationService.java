package com.akash.services;

import org.springframework.stereotype.Service;

@Service
public class SummationService {

	public int add(int a, int b) {
		return a+b;
	}
}
