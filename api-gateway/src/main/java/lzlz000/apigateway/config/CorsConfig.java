package lzlz000.apigateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;

/**
 * 跨域配置
 */
@Configuration
public class CorsConfig {

	@Bean
	public CorsFilter corsFilter() {
		final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		final CorsConfiguration config = new CorsConfiguration();

		config.setAllowCredentials(true);
		config.setAllowedOrigins(Arrays.asList("*")); // 允许跨域的地址 http:www.abc.com
		config.setAllowedHeaders(Arrays.asList("*")); // 允许跨域的head
		config.setAllowedMethods(Arrays.asList("*")); // 允许跨域的方法 GET POST ....
		config.setMaxAge(300l);

		source.registerCorsConfiguration("/**", config);
		return new CorsFilter(source);
	}
}
