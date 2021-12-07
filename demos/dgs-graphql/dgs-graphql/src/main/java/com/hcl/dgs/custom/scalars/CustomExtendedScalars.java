package com.hcl.dgs.custom.scalars;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsRuntimeWiring;
import graphql.scalars.ExtendedScalars;
import graphql.schema.idl.RuntimeWiring;

//you are binding of extendedschlar lib with our code
//@DgsComponent
public class CustomExtendedScalars {
    @DgsRuntimeWiring
    public RuntimeWiring.Builder addScalar(RuntimeWiring.Builder builder) {
        return builder.scalar(ExtendedScalars.GraphQLLong);
    }
}
