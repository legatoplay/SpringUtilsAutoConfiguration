package com.gary.demo.config;

import com.gary.demo.util.SpringContextUtil;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by Gary on 2018-12-27.
 *
 * @author Gary
 * @version 0.0.1
 * @date 2018-12-27
 * @since 0.0.1
 */
@Configuration
@Import(SpringContextUtil.class)
public class SpringContextUtilAutoConfiguration {
}
