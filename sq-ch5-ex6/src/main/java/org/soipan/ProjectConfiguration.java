package org.soipan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.soipan.services", "org.soipan.repositories"})
public class ProjectConfiguration {
}
