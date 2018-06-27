# data-rest-version-createdby-bug

This exposes a bug when a Spring Data Rest model has both an @Version and a @CreatedDate. When saved to a repository, the @CreatedDate will not be set.

This repo has two models and repos: ModelWithVersion and ModelWithoutVersion (and their respective repositories).

The repos each have tests where a model is saved, and there are checks that @CreatedDate and @Version are set. This will fail on the ModelWithVersionRepository

``` java
@Test
public void test_save_setsDateCreatedAndVersion() {
    repository.save(modelWithVersion);

    assertNotNull(modelWithVersion.getLastModified());
    assertNotNull(modelWithVersion.getCreated());
    assertNotNull(modelWithVersion.getVersion());
}
```

To run all tests:
```bash
./gradlew test
```
