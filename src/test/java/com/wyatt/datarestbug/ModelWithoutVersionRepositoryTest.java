package com.wyatt.datarestbug;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.data.annotation.Id;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

@DataMongoTest
@SpringBootTest
@RunWith(SpringRunner.class)
@Import(UserAuditor.class)
public class ModelWithoutVersionRepositoryTest {

    @Autowired
    private ModelWithoutVersionRepository repository;

    private ModelWithoutVersion modelWithoutVersion;

    @Before
    public void setup() {
        modelWithoutVersion = new ModelWithoutVersion();
    }

    @Test
    public void test_save_setsDateCreatedAndVersion() {
        repository.save(modelWithoutVersion);

        assertNotNull(modelWithoutVersion.getLastModified());
        assertNotNull(modelWithoutVersion.getCreated());
    }

}