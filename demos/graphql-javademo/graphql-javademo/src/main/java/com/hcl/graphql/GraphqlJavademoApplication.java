package com.hcl.graphql;

import graphql.Scalars;
import graphql.schema.GraphQLObjectType;
import graphql.schema.GraphQLSchema;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GraphqlJavademoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlJavademoApplication.class, args);
	}

}
