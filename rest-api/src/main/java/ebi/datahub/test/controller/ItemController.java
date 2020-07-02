package ebi.datahub.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ebi.datahub.test.model.Item;
import ebi.datahub.test.service.ItemService;

/**
 * Controls the data flow into a Item object.
 */
@RestController
@CrossOrigin
@RequestMapping("/")
public class ItemController {

    @Autowired
    private ItemService service;

    /**
     * Gets list of all supported items, with sorting and pagination options
     * /items{?page,size,sort}
     *
     * @return All items.
     */
    @GetMapping(value = "items/")
    @ResponseBody
    public List<Item> getAllItems() {
        return service.getAllItems();
    }

}
