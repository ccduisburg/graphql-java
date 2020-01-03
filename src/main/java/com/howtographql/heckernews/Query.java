package com.howtographql.heckernews;

import com.coxautodev.graphql.tools.GraphQLRootResolver;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Query implements GraphQLRootResolver {

    private final LinkRepository linkRepository;

    public Query(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }


    public List<Link> allLinks() {
        return linkRepository.findAll();
    }


}
