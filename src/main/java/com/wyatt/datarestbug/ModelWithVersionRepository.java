package com.wyatt.datarestbug;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ModelWithVersionRepository extends CrudRepository<ModelWithVersion, String> {
}
