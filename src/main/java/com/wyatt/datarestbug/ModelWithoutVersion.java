package com.wyatt.datarestbug;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;

import java.time.Instant;

@Data
public class ModelWithoutVersion {

    @Id
    private String id;

    @LastModifiedDate
    private Instant lastModified;

    @CreatedDate
    private Instant created;
}
