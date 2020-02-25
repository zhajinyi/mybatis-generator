package com.zjy.generator.utils;

/**
 * 常量
 *
 * @author zhajinyi
 * @email zhajinyi@163.com
 * @date 2019年06月17日 上午10:27:52
 */
public class Constant {

    public enum DB_type{

        /**
         * MySQL
         */
        MySql("mysql"),
        /**
         * Oracle
         */
        Oracle("oracle"),
        /**
         * SqlServer
         */
        SqlServer("sqlserver"),
        /**
         * PostGreSql
         */
        PostGreSql("postgresql");
        private String value;

        DB_type(String value){
            this.value = value;
        }
        public String getValue() {
            return this.value;
        }
    }

}
