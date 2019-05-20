package com;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;

import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * @Author{作者}
 * @Date{更新日期}2019/5/16-15:22
 */
public class MpGenerator {

    /**
     * <p>
     * MySQL 生成演示
     * </p>
     */
    public static void main(String[] args) {
        // 选择 freemarker 引擎，默认 Veloctiy
        // mpg.setTemplateEngine(new FreemarkerTemplateEngine());

        // 全局配置
        GlobalConfig config = new GlobalConfig();
        config.setAuthor("金")                //作者
                .setOutputDir("D:\\idea\\测试\\umbrella\\generator-service\\src\\main\\java\\")   //生成路径
                .setFileOverride(true)           //是否文件覆盖
                .setBaseResultMap(true)           //生成SQL映射文件
                .setBaseColumnList(true);          //生成SQL片段
        config.setServiceName("%sService");			//service 命名方式   默认值：null 例如：%sBusiness 生成 UserBusiness
        config.setSwagger2(true);					//开启 swagger2 模式 默认false
        //数据源配置
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.HSQL)     //指定数据库类型
                .setDriverName("com.mysql.jdbc.Driver")  //mysql驱动
                .setUrl("jdbc:mysql://47.99.183.253:3306/umbrella_db")
                .setUsername("root")
                .setPassword("root");
        //策略配置
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setCapitalMode(true)             //全局大写命名
                .setNaming(NamingStrategy.underline_to_camel);//数据库表印射实体策略

        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("com")
                .setMapper("mapper")
                .setService("service")
                .setController("controller")
                .setEntity("entity")
                .setXml("mapper");
        //整合配置
        AutoGenerator ag = new AutoGenerator();
        ag.setGlobalConfig(config)
                .setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig)
                .setPackageInfo(packageConfig);

        ag.execute();
    }
}
