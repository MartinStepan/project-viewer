package projectviewer.respository;

import projectviewer.model.entity.UserCredentials;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserCredentialsRepository extends CrudRepository<UserCredentials, String> {

    /**
     * Find and return user credentials by defined user name
     * @param userName
     * @return UserCredentials object
     */
    UserCredentials findByUserName(String userName);
}
