package com.example.demo;

import com.fragments.CustomFragment;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TestEntityRepository extends JpaRepository<TestEntity, Long>, CustomFragment {
	//
}
