package com.zjy.generator.config;

import com.zjy.generator.dao.*;
import com.zjy.generator.utils.Constant;
import com.zjy.generator.utils.Exception;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.annotation.Resource;

/**
 * 数据库配置
 *
 * @author Mark sunlightcs@gmail.com
 */
@Configuration
public class DbConfig {

    @Value("${renren.database: mysql}")
    private String database;
    @Resource
    private MySqlGeneratorDao mySqlGeneratorDao;
    @Resource
    private OracleGeneratorDao oracleGeneratorDao;
    @Resource
    private SQLServerGeneratorDao sqlServerGeneratorDao;
    @Resource
    private PostgreSQLGeneratorDao postgreSqlGeneratorDao;

    @Bean
    @Primary
    public GeneratorDao getGeneratorDao(){
        if(Constant.DB_type.MySql.getValue().equalsIgnoreCase(database)){
            return mySqlGeneratorDao;
        }else if(Constant.DB_type.Oracle.getValue().equalsIgnoreCase(database)){
            return oracleGeneratorDao;
        }else if(Constant.DB_type.SqlServer.getValue().equalsIgnoreCase(database)){
            return sqlServerGeneratorDao;
        }else if(Constant.DB_type.PostGreSql.getValue().equalsIgnoreCase(database)){
            return postgreSqlGeneratorDao;
        }else {
            throw new Exception("不支持当前数据库：" + database);
        }
    }
}
