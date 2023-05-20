MyBatis SQL Mapper Framework for Java
=====================================

[![build](https://github.com/mybatis/mybatis-3/workflows/Java%20CI/badge.svg)](https://github.com/mybatis/mybatis-3/actions?query=workflow%3A%22Java+CI%22)
[![Coverage Status](https://coveralls.io/repos/mybatis/mybatis-3/badge.svg?branch=master&service=github)](https://coveralls.io/github/mybatis/mybatis-3?branch=master)
[![Maven central](https://maven-badges.herokuapp.com/maven-central/org.mybatis/mybatis/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.mybatis/mybatis)
[![Sonatype Nexus (Snapshots)](https://img.shields.io/nexus/s/https/oss.sonatype.org/org.mybatis/mybatis.svg)](https://oss.sonatype.org/content/repositories/snapshots/org/mybatis/mybatis/)
[![License](http://img.shields.io/:license-apache-brightgreen.svg)](http://www.apache.org/licenses/LICENSE-2.0.html)
[![Stack Overflow](http://img.shields.io/:stack%20overflow-mybatis-brightgreen.svg)](http://stackoverflow.com/questions/tagged/mybatis)
[![Project Stats](https://www.openhub.net/p/mybatis/widgets/project_thin_badge.gif)](https://www.openhub.net/p/mybatis)

![mybatis](http://mybatis.github.io/images/mybatis-logo.png)

The MyBatis SQL mapper framework makes it easier to use a relational database with object-oriented applications.
MyBatis couples objects with stored procedures or SQL statements using a XML descriptor or annotations.
Simplicity is the biggest advantage of the MyBatis data mapper over object relational mapping tools.

Essentials
----------

* [See the docs](http://mybatis.github.io/mybatis-3)
* [Download Latest](https://github.com/mybatis/mybatis-3/releases)
* [Download Snapshot](https://oss.sonatype.org/content/repositories/snapshots/org/mybatis/mybatis/)


源码目录
----------
* **[annotations]** Mapper 映射器接口中使用到的注解
* **[binding]** Mapper 映射器接口与映射语句关系绑定构建
* **[builder]** Configuration 配置的构建包
* **[cache]** 缓存实现与定义（含一级/二级缓存）
* **[cursor]** 游标（针对查询结果集的获取与遍历等）
* **[datasource]** 数据源/连接池
* **[exceptions]** 异常包
* **[executor]** 语句执行器（含参数/结果集/语句处理等）
* **[io]** 资源读取辅助包
* **[jdbc]** Mybatis 内部的 sql 脚本运行的测试包
* **[logging]** 一套日志接口和适配器包
* **[mapping]** Mapper 映射器相关参数/语句/结果/类型等对象包
* **[parsing]** Xml 解析包（例如 #{} 占位符解析）
* **[plugin]** 插件包
* **[reflection]** 反射处理工具包
* **[scripting]**  Sql 执行脚本的解析处理包
* **[session]** 数据库连接会话核心包（会话创建/管理/调用）
* **[transaction]** 事务
* **[type]** 类型处理器（定义 bean 与数据库类型的转换关系）