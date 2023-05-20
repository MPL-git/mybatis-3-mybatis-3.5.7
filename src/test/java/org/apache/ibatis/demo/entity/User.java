package org.apache.ibatis.demo.entity;

/**
 * @auther: pengli
 * @date: 2023/5/17 1:33
 * @version: 1.0
 * @description: 测试用户
 **/
public class User {

  // 主键ID
  private Integer Id;

  // 用户名称
  private String name;


  public Integer getId() {
    return Id;
  }

  public void setId(Integer id) {
    Id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "User{" +
      "Id=" + Id +
      ", name='" + name + '\'' +
      '}';
  }

}
