package com.cvt.itemcatalog.component;

import com.cvt.itemcatalog.dal.ItemRepository;
import com.cvt.itemcatalog.model.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
class ItemInitializer implements CommandLineRunner {
	private final ItemRepository itemRepository;

	ItemInitializer(ItemRepository itemRepository) {
		this.itemRepository = itemRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		Stream.of("Lining", "PUMA", "Bad Boy", "Air Jordan", "Nike", "Adidas", "Reebok")
				.forEach(item -> itemRepository.save(new Item(item)));
		Logger logger = LoggerFactory.getLogger(ItemInitializer.class);
		itemRepository.findAll().forEach(item -> logger.info(item.toString()));
	}
}
