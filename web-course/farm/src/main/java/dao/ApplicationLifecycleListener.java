package dao;
import config.PropertiesManager;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.Properties;


public class ApplicationLifecycleListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        Properties applicationProperties = PropertiesManager.getInstance().getApplicationProperties();
        DatabaseManager.getInstance().initialize(applicationProperties);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        DatabaseManager.getInstance().stopDb();
    }
}