package com.hcl.dgs.data.mutation;

import com.hcl.dgs.data.model.Rating;
import com.hcl.dgs.data.model.RatingInput;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsMutation;
import com.netflix.graphql.dgs.InputArgument;

@DgsComponent
public class RatingMutation {

    @DgsMutation(field = "addRating")
    public Rating addRating(@InputArgument("input") RatingInput ratingInput) {
        //biz logic to save rating into database
        System.out.println("Rated :" + ratingInput.getTitle() + "with " + " " + ratingInput.getStars());
        return new Rating(ratingInput.getStars());
    }
}
