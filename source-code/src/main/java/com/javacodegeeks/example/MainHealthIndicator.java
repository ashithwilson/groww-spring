package com.javacodegeeks.example;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class MainHealthIndicator implements HealthIndicator {

	@Override
	public Health health() {
		return Health.up().withDetail("Memory Usage", "Ok").build();
	}

}
