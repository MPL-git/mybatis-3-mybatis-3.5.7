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

    // 2、解析配置文件，及 Mapper XML 文件逻辑
    // （1）解析了配置文件，封装 configuration 对象
    // （2）创建 DefaultSqlSessionFactory 工厂对象
    // （3）SqlSessionFactoryBuild 里的 双层 Builder( XMLConfigBuilder() ) 使用到 建造者模式
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

    // 3、执行器逻辑
    // （1）创建事务对象
    // （2）创建了执行器对象 cacheingExecutor
    // （3）DefaultSqlSession 对象
    // （4）使用到 装饰者模式
    SqlSession sqlSession = sqlSessionFactory.openSession();

    // 4、委派给 Exector 来执行，Executor 执行时又会调用很多其他组件：
    // （1）参数设置
    // （2）解析sql的获取
    // （3）sql的执行
    // （4）结果集的封装
    // wrapCollection(parameter) 使用到 装饰者模式
    User user = sqlSession.selectOne("user.findUserById", 1);

    System.out.println(user);
    System.out.println("Mybatis源码环境搭建成功...");

    sqlSession.close();

  }



}
