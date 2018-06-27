package com.wyatt.datarestbug;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ModelWithoutVersionRepository extends CrudRepository<ModelWithoutVersion, String> {
}
