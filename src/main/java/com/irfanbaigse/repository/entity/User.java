package com.irfanbaigse.repository.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Transient;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Document(collection = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Field(name = "name")
    private String fullName;

    private Boolean active;

    @Field(name = "created_at")
    @CreatedDate
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private LocalDateTime createdAt;

    @Field(name = "updated_at")
    @LastModifiedDate
    private LocalDateTime updatedAt;

    @Transient
    @Getter(value = AccessLevel.PRIVATE)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDate creationDateTo;

    @Transient
    @Getter(value = AccessLevel.PRIVATE)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDate creationDateFrom;
}
