package com.wyatt.datarestbug;

import lombok.Data;
import org.springframework.data.annotation.*;

import java.time.Instant;

@Data
public class ModelWithVersion {

    @Id
    private String id;

    @LastModifiedDate
    private Instant lastModified;

    @CreatedDate
    private Instant created;

    @Version
    private String version;
}
