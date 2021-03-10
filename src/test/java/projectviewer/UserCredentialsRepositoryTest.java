package projectviewer;

import projectviewer.model.entity.UserCredentials;
import projectviewer.respository.UserCredentialsRepository;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
@SpringBootTest
public class UserCredentialsRepositoryTest {

    @Autowired
    UserCredentialsRepository userCredentialsRepository;

    @Test
    public void testFindByUserName() {
        UserCredentials user1 = new UserCredentials("user1", "password1");
        UserCredentials user2 = new UserCredentials("user2", "password2");

        userCredentialsRepository.save(user1);
        userCredentialsRepository.save(user2);

        Assertions.assertEquals(userCredentialsRepository.findByUserName(user1.getUserName()).getUserName(), user1.getUserName());
        Assertions.assertEquals(userCredentialsRepository.findByUserName(user1.getUserName()).getPassword(), user1.getPassword());
    }
}
