package site.LatteIs.latteIs.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

//JpaRepository를 상속하면 자동 컴포넌트
public interface UserRepository extends JpaRepository<User, Long> {
    // SELECT * FROM user WHERE username = ?1
    User findByUsername(String username);

    // SELECT * FROM user WHERE provider = ?1 and providerId = ?2
    Optional<User> findByProviderAndProviderId(String provider, String providerId);
}
