package springsecurityst4.Repositories;
import org.springframework.stereotype.Repository;

import springsecurityst4.entity.Role;
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	@Query("SELECT u FROM Role u WHERE u.name = :name")
	public Role getUserByName(@Param("name") String name);
	Optional<Role> findByName(String name);
}

