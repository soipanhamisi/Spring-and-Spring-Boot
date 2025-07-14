package org.soipan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(
        basePackages = {"org.soipan.proxies", "org.soipan.repositories", "org.soipan.services"}
)
public class ProjectConfiguration {
}
