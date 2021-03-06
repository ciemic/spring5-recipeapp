package pl.ciemic.spring5recipeapp.repositories;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;
import pl.ciemic.spring5recipeapp.domain.UnitOfMeasure;

import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UnitOfMeasureRepositoryTest {

    @Autowired
    UnitOfMeasureRepository unitOfMeasureRepository;

    @Before
    public void setUp() throws Exception {
    }


    @Test
    public void findByDescription() throws Exception{

        Optional<UnitOfMeasure> unitOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

        assertEquals("Teaspoon", unitOptional.get().getDescription());
    }

    @Test
    public void findByDescriptionCup() throws Exception{

        Optional<UnitOfMeasure> unitOptional = unitOfMeasureRepository.findByDescription("Cup");

        assertEquals("Cup", unitOptional.get().getDescription());
    }
}