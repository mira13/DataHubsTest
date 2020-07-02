package ebi.datahub.test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ebi.datahub.test.repository.ItemRepository;
import ebi.datahub.test.model.Item;


@SpringBootTest
class TestApplicationTests {

    @Autowired
    private ItemRepository repository;

    @Test
    void findAllItems() {
        List<Item> items = repository.findAll();
        int nOfItems = 2;
        assertNotNull(items);
        assertEquals(2, items.size());
    }

}
