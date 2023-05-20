package org.apache.ibatis.demo.test;

import org.apache.ibatis.demo.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @auther: pengli
 * @date: 2023/5/17 1:46
 * @version: 1.0
 * @description:
 **/
public class MybatisTest {


  /**
   * @auther: pengli
   * @date: 2023/5/17 1:47
   * @version: 1.0
   * @description: 测试方法：传统方式
   **/
  @Test
  public void test1() throws IOException {

    // 1、通过类加载器对配置文件进行加载，加载成字节输入流，存到内存中
    // 注意：配置文件并没有被解析
    InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");

    // 2、（1）解析了配置文件，封装 configuration 对象
    // （2）创建 DefaultSqlSessionFactory 工厂对象
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

    SqlSession sqlSession = sqlSessionFactory.openSession();

    User user = sqlSession.selectOne("user.findUserById", 1);

    System.out.println(user);
    System.out.println("Mybatis源码环境搭建成功...");

    sqlSession.close();

  }



}
