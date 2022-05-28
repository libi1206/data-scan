import com.libi.Application;
import com.libi.dao.F27x9133aDao;
import com.libi.dao.History1077aDao;
import com.libi.entity.F27x9133aDo;
import com.libi.entity.History1077aDo;
import com.libi.service.F27x9133aService;
import com.libi.service.History1077aService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Random;

/**
 * @author libi@hyperchain.cn
 * @date 2022/5/28 2:56 PM
 */
@SpringBootTest(classes = Application.class)
@RunWith(SpringRunner.class)
public class ApplicationTest {
    @Autowired
    private F27x9133aService f27x9133aService;
    @Autowired
    private History1077aService history1077aService;


    @Test
    public void testDataSource() throws SQLException {
        Random random = new Random();
        int fCount = 100;
        int hCount = 100000;
        for (int i = 0; i < fCount; i++) {
            F27x9133aDo fDo = new F27x9133aDo();
            fDo.setS1(random.nextInt());
            fDo.setS2(random.nextInt());
            fDo.setS3(random.nextInt());
            fDo.setS4(random.nextInt());
            fDo.setS5(random.nextInt());
            fDo.setS6(random.nextInt());
            fDo.setS7(random.nextInt());
            fDo.setS8(random.nextInt());
            fDo.setS9(random.nextInt());
            fDo.setS10(random.nextInt());
            f27x9133aService.save(fDo);
        }
        for (int i = 0; i < hCount; i++) {
            History1077aDo hDo = new History1077aDo();
            hDo.setN1(random.nextInt());
            hDo.setN2(random.nextInt());
            hDo.setN3(random.nextInt());
            hDo.setN4(random.nextInt());
            hDo.setN5(random.nextInt());
            hDo.setN6(random.nextInt());
            hDo.setN7(random.nextInt());
            hDo.setN8(random.nextInt());
            hDo.setN9(random.nextInt());
            hDo.setN10(random.nextInt());
            history1077aService.save(hDo);
        }
    }
}