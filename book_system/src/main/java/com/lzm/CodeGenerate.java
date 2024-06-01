package com.lzm;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;

public class CodeGenerate {
    public static void main(String[] args) {
        //1.获取代码生成器的对象
        AutoGenerator autoGenerator = new AutoGenerator();

        //设置数据库相关配置
        DataSourceConfig dataSource = new DataSourceConfig();
        dataSource.setDriverName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/book_system?serverTimezone=UTC");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        autoGenerator.setDataSource(dataSource);

        //设置全局配置
        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig.setOutputDir(System.getProperty("user.dir") + "/src/main/java"); //设置代码生成位置
        globalConfig.setOpen(false); //设置生成完毕后是否打开生成代码所在的目录
        globalConfig.setAuthor("林志明"); //设置作者
        globalConfig.setFileOverride(true); //设置是否覆盖原始生成的文件
        globalConfig.setMapperName("%sDao"); //设置数据层接口名，%s为占位符，指代模块名称
        globalConfig.setIdType(IdType.ASSIGN_ID); //设置Id生成策略
        autoGenerator.setGlobalConfig(globalConfig);

        //设置包名相关配置
        PackageConfig packageInfo = new PackageConfig();
        packageInfo.setParent("com.lzm"); //设置生成的包名，与代码所在位置不冲突， 二者叠加组成完整路径
        packageInfo.setEntity("domain"); //设置实体类包名
        packageInfo.setMapper("dao"); //设置数据层包名
        autoGenerator.setPackageInfo(packageInfo);

        //书籍表策略设置
//        StrategyConfig strategyConfig1 = new StrategyConfig();
//        strategyConfig1.setInclude("tb_books"); //设置当前参与生成的表名，参数为可变参数
//        strategyConfig1.setTablePrefix("tb_"); //设置数据库表的前缀名称，模块名 = 数据库表名 - 前缀名 例如： User = tbl_user - tbl_
//        strategyConfig1.setRestControllerStyle(true); //设置是否启用Rest风格
//        strategyConfig1.setVersionFieldName("version"); //设置乐观锁字段名
//        strategyConfig1.setLogicDeleteFieldName("deleted"); //设置逻辑删除字段名
//        strategyConfig1.setEntityLombokModel(true); //设置是否启用lombok
//        autoGenerator.setStrategy(strategyConfig1);

        //购物车表策略设置
//        StrategyConfig strategyConfig2 = new StrategyConfig();
//        strategyConfig2.setInclude("tb_cart"); //设置当前参与生成的表名，参数为可变参数
//        strategyConfig2.setTablePrefix("tb_"); //设置数据库表的前缀名称，模块名 = 数据库表名 - 前缀名 例如： User = tbl_user - tbl_
//        strategyConfig2.setRestControllerStyle(true); //设置是否启用Rest风格
//        strategyConfig2.setVersionFieldName("version"); //设置乐观锁字段名
//        strategyConfig2.setLogicDeleteFieldName("deleted"); //设置逻辑删除字段名
//        strategyConfig2.setEntityLombokModel(true); //设置是否启用lombok
//        autoGenerator.setStrategy(strategyConfig2);

        //购物车详情表策略设置
//        StrategyConfig strategyConfig3 = new StrategyConfig();
//        strategyConfig3.setInclude("tb_cartdetails"); //设置当前参与生成的表名，参数为可变参数
//        strategyConfig3.setTablePrefix("tb_"); //设置数据库表的前缀名称，模块名 = 数据库表名 - 前缀名 例如： User = tbl_user - tbl_
//        strategyConfig3.setRestControllerStyle(true); //设置是否启用Rest风格
//        strategyConfig3.setVersionFieldName("version"); //设置乐观锁字段名
//        strategyConfig3.setLogicDeleteFieldName("deleted"); //设置逻辑删除字段名
//        strategyConfig3.setEntityLombokModel(true); //设置是否启用lombok
//        autoGenerator.setStrategy(strategyConfig3);

        //订单详情表策略设置
//        StrategyConfig strategyConfig4 = new StrategyConfig();
//        strategyConfig4.setInclude("tb_orderdetails"); //设置当前参与生成的表名，参数为可变参数
//        strategyConfig4.setTablePrefix("tb_"); //设置数据库表的前缀名称，模块名 = 数据库表名 - 前缀名 例如： User = tbl_user - tbl_
//        strategyConfig4.setRestControllerStyle(true); //设置是否启用Rest风格
//        strategyConfig4.setVersionFieldName("version"); //设置乐观锁字段名
//        strategyConfig4.setLogicDeleteFieldName("deleted"); //设置逻辑删除字段名
//        strategyConfig4.setEntityLombokModel(true); //设置是否启用lombok
//        autoGenerator.setStrategy(strategyConfig4);

        //订单表策略设置
//        StrategyConfig strategyConfig5 = new StrategyConfig();
//        strategyConfig5.setInclude("tb_orders"); //设置当前参与生成的表名，参数为可变参数
//        strategyConfig5.setTablePrefix("tb_"); //设置数据库表的前缀名称，模块名 = 数据库表名 - 前缀名 例如： User = tbl_user - tbl_
//        strategyConfig5.setRestControllerStyle(true); //设置是否启用Rest风格
//        strategyConfig5.setVersionFieldName("version"); //设置乐观锁字段名
//        strategyConfig5.setLogicDeleteFieldName("deleted"); //设置逻辑删除字段名
//        strategyConfig5.setEntityLombokModel(true); //设置是否启用lombok
//        autoGenerator.setStrategy(strategyConfig5);

        //支付表策略设置
//        StrategyConfig strategyConfig6 = new StrategyConfig();
//        strategyConfig6.setInclude("tb_payments"); //设置当前参与生成的表名，参数为可变参数
//        strategyConfig6.setTablePrefix("tb_"); //设置数据库表的前缀名称，模块名 = 数据库表名 - 前缀名 例如： User = tbl_user - tbl_
//        strategyConfig6.setRestControllerStyle(true); //设置是否启用Rest风格
//        strategyConfig6.setVersionFieldName("version"); //设置乐观锁字段名
//        strategyConfig6.setLogicDeleteFieldName("deleted"); //设置逻辑删除字段名
//        strategyConfig6.setEntityLombokModel(true); //设置是否启用lombok
//        autoGenerator.setStrategy(strategyConfig6);

        //用户表策略设置
//        StrategyConfig strategyConfig7 = new StrategyConfig();
//        strategyConfig7.setInclude("tb_users"); //设置当前参与生成的表名，参数为可变参数
//        strategyConfig7.setTablePrefix("tb_"); //设置数据库表的前缀名称，模块名 = 数据库表名 - 前缀名 例如： User = tbl_user - tbl_
//        strategyConfig7.setRestControllerStyle(true); //设置是否启用Rest风格
//        strategyConfig7.setVersionFieldName("version"); //设置乐观锁字段名
//        strategyConfig7.setLogicDeleteFieldName("deleted"); //设置逻辑删除字段名
//        strategyConfig7.setEntityLombokModel(true); //设置是否启用lombok
//        autoGenerator.setStrategy(strategyConfig7);

        //2.执行生成操作
        autoGenerator.execute();

    }
}
