package com.learnings2024.learnings2024.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;
import java.util.UUID;

@Entity
@Table(name = "accounts", schema = "my_schema")
@Getter
@NoArgsConstructor
public class DbUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String account_name;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    private Date created_date;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    private Date last_updated;

    public DbUser(UUID id, String account_name, Date created_date, Date last_updated) {
        this.id = id;
        this.account_name = account_name;
        this.created_date = created_date;
        this.last_updated = last_updated;
    }
}

