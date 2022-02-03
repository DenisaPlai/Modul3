package com.application.modul3.publisher;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Integer> {
	public List<Publisher> findByName(String name);
}
