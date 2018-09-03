package org.epam.rd.web.listener;

import org.epam.rd.config.PropertiesManager;
import org.epam.rd.dao.DBManager;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.Properties;


public class ApplicationLifecycleListener implements ServletContextListener {

    private PropertiesManager propertiesManager = new PropertiesManager();

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        Properties applicationProperties = propertiesManager.getApplicationProperties();
        DBManager.prepareDb(applicationProperties);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        DBManager.stopDb();
    }
}
