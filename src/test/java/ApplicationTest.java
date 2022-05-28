import com.libi.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @author libi@hyperchain.cn
 * @date 2022/5/28 2:56 PM
 */
@SpringBootTest(classes = Application.class)
@RunWith(SpringRunner.class)
public class ApplicationTest {
    @Autowired
    private DataSource dataSource;

    @Test
    public void testDataSource() throws SQLException {
        dataSource.getConnection();
    }
}