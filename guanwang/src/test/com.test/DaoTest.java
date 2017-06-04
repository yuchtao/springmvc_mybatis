import com.site.domain.User;
import com.site.exception.ServiceException;
import com.site.service.UserService;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * Created by yuch on 2017/6/3.
 */

public class DaoTest extends AbstractSpringTest {

    @Resource
    private UserService userService;

    @Test
    public void test() throws ServiceException {
        User user = userService.find(200033L);
        System.out.println(user.getAccount());
    }

}
