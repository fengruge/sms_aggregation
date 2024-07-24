package org.dromara.sms4j.starter.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.dromara.sms4j.aliyun.config.AlibabaConfig;
import org.dromara.sms4j.cloopen.config.CloopenConfig;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

/**
 * 此写法主要解决:由于定义抽象的ConfigMap定义,Spring boot 配置文件无法给予友好提示的问题
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ConfigurationProperties("sms.blends")
public class CloopenMultiConfig extends AbstractMultiConfig<AlibabaConfig> {
    Map<String, CloopenConfig> cloopen;
}