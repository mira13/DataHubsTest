package ebi.datahub.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ebi.datahub.test.model.Item;
import ebi.datahub.test.repository.ItemRepository;

/**
 * This class describes an Item service.
 */
@Service
public class ItemService {

    @Autowired
    private ItemRepository repository;

    /**
     * Gets all items.
     *
     * @return All Items.
     */
    public List<Item> getAllItems() {
        return repository.findAll();
    }
}
