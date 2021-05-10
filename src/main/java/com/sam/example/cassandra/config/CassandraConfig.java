package com.sam.example.cassandra.config;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.config.SchemaAction;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@Configuration
@EnableCassandraRepositories
public class CassandraConfig extends AbstractCassandraConfiguration {

	@Value("${spring.data.cassandra.keyspace-name}")
	private String keySpaceName;

	@Value("${spring.data.cassandra.contactpoints}")
	private String contactPoints;

	@Value("${spring.data.cassandra.port}")
	private int port;
	
	@Value("${spring.data.cassandra.local-datacenter}")
	private String localDc;

//	@Value("${cassandra.basePackages}")
//	private String basePackages;

	@Override
	protected String getContactPoints() {
		return contactPoints;
	}

	@Override
	protected int getPort() {
		return port;
	}

	@Override
	public SchemaAction getSchemaAction() {
		return SchemaAction.CREATE_IF_NOT_EXISTS;
	}

//	@Override
//	public String[] getEntityBasePackages() {
//		return new String[] { basePackages };
//	}

	@Override
	protected String getKeyspaceName() {
		return keySpaceName;
	}
	
	@Override
	protected BeanFactory getBeanFactory() {
		// TODO Auto-generated method stub
		return super.getBeanFactory();
	}
	@Override
	protected String getLocalDataCenter() {
		// TODO Auto-generated method stub
		return localDc;
	}

}
