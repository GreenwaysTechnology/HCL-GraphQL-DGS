package com.hcl.dgs.data.fetcher;

import com.hcl.dgs.data.model.Movie;
import com.hcl.dgs.data.model.Series;
import com.hcl.dgs.data.model.Video;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.DgsTypeResolver;

//@DgsComponent
public class VideoDataFetcher {

    @DgsQuery(field = "video")
    public Video showVideo() {
        //return new Show("BigBoss",5);
        // return new Movie("The Matrix", "150");
        return new Series("BigBoss", 5);
    }

    //Default Type Resolver
    // type resolver :"Video" is interface Name
//    @DgsTypeResolver(name = "Video")
//    public String resolveVideoType(Video video) { //Video is Java Type
//        if (video instanceof Movie) {
//            return "Movie"; //schema Type Name
//        } else if (video instanceof Show) {
//            return "Show"; // schema Type Name
//        } else {
//            throw new RuntimeException("UnKnown Type" + video.getClass().getName());
//        }
//    }

    //if schema name and model name is different
    @DgsTypeResolver(name = "Video")
    public String resolveVideoType(Video video) { //Video is Java Type
        if (video instanceof Movie) {
            return "Movie"; //schema Type Name
        } else if (video instanceof Series) {
            return "Show"; // schema Type Name
        } else {
            throw new RuntimeException("UnKnown Type" + video.getClass().getName());
        }
    }
}
