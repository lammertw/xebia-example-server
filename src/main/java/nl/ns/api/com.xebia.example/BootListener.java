package nl.ns.api.com.xebia.example;

import nl.ns.commonservice.configuration.BaseConfiguration;
import nl.ns.commonservice.configuration.RuntimeEnvironment;
import nl.ns.commonservice.init.EnvironmentBootListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;

/**
 * Created by jamiecraane on 07/07/16.
 */
public class BootListener extends EnvironmentBootListener {
    private static final Logger LOGGER = LoggerFactory.getLogger(BootListener.class);

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        super.contextInitialized(sce);
        LOGGER.info("contextInitialized()");
        final RuntimeEnvironment runtimeEnvironment = BaseConfiguration.getRuntimeEnvironment();

//        execute any initialization logic the API may need.
    }
}
