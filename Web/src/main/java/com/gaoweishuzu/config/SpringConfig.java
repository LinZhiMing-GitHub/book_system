package com.gaoweishuzu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * Spring配置类
 */
// 标识为Spring配置类

// 扫描所有包下所有配置bean对象的类

// 导入另外的配置类

// 导入配置源
@Configuration
@ComponentScan("com.gaoweishuzu")
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class, MybatisConfig.class})
public class SpringConfig {
}
