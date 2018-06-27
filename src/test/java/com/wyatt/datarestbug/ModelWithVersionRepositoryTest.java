package com.wyatt.datarestbug;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@DataMongoTest
@SpringBootTest
@RunWith(SpringRunner.class)
@Import(UserAuditor.class)
public class ModelWithVersionRepositoryTest {

    @Autowired
    private ModelWithVersionRepository repository;

    private ModelWithVersion modelWithVersion;

    @Before
    public void setup() {
        modelWithVersion = new ModelWithVersion();
    }

    @Test
    public void test_save_setsDateCreatedAndVersion() {
        repository.save(modelWithVersion);

        assertNotNull(modelWithVersion.getLastModified());
        assertNotNull(modelWithVersion.getCreated());
        assertNotNull(modelWithVersion.getVersion());
    }

}