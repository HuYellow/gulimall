package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1.整合MyBatis-Plus
 *  1）导入依赖
 *  2）配置
 *      1.配置数据源:
 *          1）导入数据库的驱动。
 *          2）在application.yml配置数据源相关信息
 *      2.配置MyBatis-Plus:
 *          1）使用@MapperScan
 *          2）告诉MyBatis-Plus我们的sql映射文件位置
 *
 * 2.逻辑删除
 *  1）配置全局的逻辑删除规则（可以省略）
 *  2）配置逻辑删除的组件（低于3.1.1版本时）
 *  3）给Bean加上逻辑删除注解@TableLogic
 *
 * 3.JSR303
 *  1）给Bean添加校验注解: javax.validation.constraints，并定义自己的message提示（需要的话）
 *  2）开启校验功能，在需要校验的Bean前添加@Valid，效果：校验错误以后会有默认的相应
 *  3）给校验的Bean后紧跟一个BindingResult，就可以获取校验的结果
 *  4）分组校验（多场景的复杂校验）
 *      1.@NotBlank(message = "品牌名必须提交", groups = {AddGroup.class, UpdateGroup.class})
 *          给校验注解标注什么情况需要进行校验
 *      2.@Validated({AddGroup.class})
 *      3.默认没有指定分组的校验注解@NotBlank，在分组校验的情况下不生效，只会在@Validated生效
 *
 * 4.统一的异常处理
 *  @ControllerAdvice
 *  1）抽取一个异常处理类
 */
@MapperScan("com.atguigu.gulimall.product.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
