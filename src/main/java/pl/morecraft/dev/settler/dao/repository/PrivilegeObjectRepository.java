package pl.morecraft.dev.settler.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import pl.morecraft.dev.settler.domain.PrivilegeObject;

public interface PrivilegeObjectRepository extends JpaRepository<PrivilegeObject, Long>, QuerydslPredicateExecutor<PrivilegeObject> {

}
