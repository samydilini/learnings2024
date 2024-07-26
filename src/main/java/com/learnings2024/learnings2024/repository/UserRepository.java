package com.learnings2024.learnings2024.repository;

import com.learnings2024.learnings2024.model.entity.DbUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends CrudRepository<DbUser, UUID> {
}
