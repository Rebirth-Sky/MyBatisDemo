package mybatisTest;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import mybatisTest.model.Role;

public class SqlSessionTest {

    public static void main(String[] args) {
        SqlSessionFactory sqlSessionFactory = null;
        String resource = "mybatis-config.xml";
        InputStream inputStream;
        try {
            inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        }catch(IOException e) {
            e.printStackTrace();
        }
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Role role = (Role)sqlSession.selectOne("mybatisTest.mapper.RoleMapper.getRole",1);
        System.out.println(role.getAge());
    }

}