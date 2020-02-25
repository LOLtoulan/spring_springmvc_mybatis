import com.toulan.dao.AccountDAO;
import com.toulan.domain.Account;
import com.toulan.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.InputStream;
import java.util.List;

/**
 * @Author LOL_toulan
 * @Time 2020/2/25 11:42
 * @Message
 */
public class SpringConfigTetst {

    @Test
    public void test() {

        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        AccountService service = (AccountService) ac.getBean("accountService");

        service.findAll();
    }

    @Test
    public void test1() throws Exception{

        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");

        //创建工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        //创建sqlsession对象
        SqlSession sqlSession = factory.openSession();

        AccountDAO mapper = sqlSession.getMapper(AccountDAO.class);

        Account account = mapper.findById(1);

        System.out.println(account);

        sqlSession.close();
        is.close();

    }

}
