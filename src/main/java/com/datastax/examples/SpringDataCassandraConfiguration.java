package com.datastax.examples;

import java.nio.file.Paths;

import com.datastax.oss.driver.api.core.CqlSessionBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.cassandra.CassandraProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.cassandra.config.*;
import org.springframework.data.cassandra.core.cql.session.init.KeyspacePopulator;
import org.springframework.data.cassandra.core.cql.session.init.ResourceKeyspacePopulator;

@Configuration
@EnableConfigurationProperties(CassandraProperties.class)
public class SpringDataCassandraConfiguration extends AbstractCassandraConfiguration {

    @Autowired
    private CassandraProperties cassandraProperties;

    @Value("${ASTRA_DB_BUNDLE:none}")
    private String astraSecureConnectBundle;

    @Value("${ASTRA_DB_USERNAME:cassandra}")
    private String username;

    @Value("${ASTRA_DB_PASSWORD:cassandra}")
    private String password;

    @Override
    protected String getKeyspaceName() {
        return cassandraProperties.getKeyspaceName();
    }

    @Override
    protected String getLocalDataCenter() {
        return cassandraProperties.getLocalDatacenter();
    }

    @Override
    protected int getPort() {
        return cassandraProperties.getPort();
    }

    @Override
    protected SessionBuilderConfigurer getSessionBuilderConfigurer() {
        return new SessionBuilderConfigurer() {
            @Override
            public CqlSessionBuilder configure(CqlSessionBuilder cqlSessionBuilder) {
                return cqlSessionBuilder
                        .withCloudSecureConnectBundle(Paths.get(astraSecureConnectBundle))
                        .withAuthCredentials(username, password);
            }
        };
    }

    @Override
    protected KeyspacePopulator keyspacePopulator() {
        ResourceKeyspacePopulator keyspacePopulate = new ResourceKeyspacePopulator();
        keyspacePopulate.setSeparator(";");
        keyspacePopulate.setScripts(new ClassPathResource("orders-schema.cql"));
        return keyspacePopulate;
    }

    @Override
    public String[] getEntityBasePackages() {
        return new String[]{ SpringDataCassandraApplication.class.getPackageName() + ".order" };
    }

}
