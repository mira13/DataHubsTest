package ebi.datahub.test.repository;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ebi.datahub.test.model.Item;

/**
 * This interface describes a Item repository.
 */
@Repository
@CrossOrigin
public interface ItemRepository extends
        JpaRepository<Item, Long> {
}

