package springsecurityst4.Repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import springsecurityst4.entity.Users;
import springsecurityst4.models.*;

	@Repository
	public interface UserRepository extends JpaRepository<Users, Long> {

	    @Query("SELECT u FROM Users u WHERE u.username = :username")
	    Users getUserByUsername(@Param("username") String username);

	    Optional<Users> findByEmail(String email);

	    Optional<Users> findByUsernameOrEmail(String username, String email);

	    Optional<Users> findByUsername(String username);

	    Boolean existsByUsername(String username);

	    Boolean existsByEmail(String email);
	}

}
