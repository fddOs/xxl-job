package com.xxl.job.executor.config;
/*package com.xxl.job.executor.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ro.fortsoft.pf4j.DefaultPluginManager;
import ro.fortsoft.pf4j.ExtensionFactory;
import ro.fortsoft.pf4j.JarPluginManager;
import ro.fortsoft.pf4j.PluginManager;
import ro.fortsoft.pf4j.spring.ExtensionsInjector;
import ro.fortsoft.pf4j.spring.SpringExtensionFactory;

@Configuration
public class SpringConfiguration {

	
	 * @Bean public PluginManager pluginManager() { PluginManager pluginManager
	 * = new JarPluginManager(); pluginManager.loadPlugins();
	 * 
	 * // start (active/resolved) the plugins pluginManager.startPlugins();
	 * 
	 * return pluginManager; }
	 

	@Bean
	public PluginManager pluginManager() {
		PluginManager pluginManager = new JarPluginManager() {

			@Override
			protected ExtensionFactory createExtensionFactory() {
				return new SpringExtensionFactory(this);
			}

		};
		pluginManager.loadPlugins();

		// start (active/resolved) the plugins 
		pluginManager.startPlugins();

		return pluginManager;
	}

	@Bean
	public ExtensionsInjector extensionsInjector() {
		return new ExtensionsInjector();
	}

	
	 * @Bean public Pf4jTest pf4jTest() { return new Greetings(); }
	 

}*/