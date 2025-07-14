package org.soipan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"org.soipan.services"})
@EnableAspectJAutoProxy
public class ProjectConfiguration {
}
