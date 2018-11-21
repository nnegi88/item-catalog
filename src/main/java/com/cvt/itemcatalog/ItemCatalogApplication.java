package com.cvt.itemcatalog;

import com.cvt.itemcatalog.dal.ItemRepository;
import com.cvt.itemcatalog.model.Item;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@EnableDiscoveryClient
@SpringBootApplication
public class ItemCatalogApplication {
	public static void main(String[] args) {
		SpringApplication.run(ItemCatalogApplication.class, args);
	}
}
