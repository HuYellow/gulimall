package com.atguigu.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1.如何使用Nacos作为配置中心统一管理配置
 * 	1）引入依赖
 * 	2）创建一个bootstrap.properties
 * 		配置spring.application.name=微服务名字
 * 		配置spring.cloud.nacos.config.server-addr=127.0.01:8848
 * 	3）需要给配置中心默认添加一个 数据集（Data Id） 当前应用名.properties
 * 	4）给 当前应用名.properties 添加任何配置
 * 	5）动态获取配置
 * 		@RefreshScope：动态获取并刷新配置
 * 		@Value("${配置项的名}")：获取到配置。
 * 		如果配置中心和当前应用的配置文件中都配置了相同的项，优先使用配置中心的配置。
 *
 * 2.细节
 * 	1）命名空间：配置隔离
 * 		默认：public（保留空间）：默认新增的所有配置都在public空间。
 * 		1.开发、测试、生产可能都有不同的配置：利用命名空间来做环境隔离。
 * 			注意：在bootstrap.properties里配置使用哪个命名空间下的配置，只能写命名空间ID
 * 		2.每一个微服务之间互相隔离配置，每一个微服务都创建自己的命名空间，只加载自己命名空间下的所有配置。
 *
 * 	2）配置集：一组相关或者不相关的配置项的集合（所有配置的集合）称为配置集
 *
 * 	3）配置集ID：类似于配置文件名。在Nacos中是那个建立配置集时的Data ID
 *
 * 	4）配置分组：
 * 		默认所有的配置集都属于：DEFAULT_GROUP；
 * 		新建配置时就可以输入Group，即所属组名。
 * 		在bootstrap.properties里配置使用哪个配置组中的配置
 *
 * 	每个微服务创建自己的命名空间，使用配置分组来区分环境（dev,test,prop等）
 *
 * 	3.同时加载多个配置集
 * 		1）微服务任何配置信息、任何配置文件都能放在配置中心里
 * 		2）只需要在bootstrap.properties说明加载配置中心里哪些配置文件即可
 * 			spring.cloud.nacos.config.extension-configs[0].data-id=
 *   		spring.cloud.nacos.config.extension-configs[0].group=
 *   		spring.cloud.nacos.config.extension-configs[0].refresh=
 *   	3）@Value、@ConfigurationProperties等以前SpringBoot任何方法从配置文件中获取值的方法，都能使用。
 *   		配置中心有的，优先使用配置中心的配置值。
 */
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallCouponApplication {

	public static void main(String[] args) {
		SpringApplication.run(GulimallCouponApplication.class, args);
	}

}
