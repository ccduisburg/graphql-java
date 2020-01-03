package com.howtographql.heckernews;

import com.coxautodev.graphql.tools.GraphQLRootResolver;
import org.springframework.stereotype.Service;

@Service
public class Mutation implements GraphQLRootResolver {

    private final LinkRepository linkRepository;

    public Mutation(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }


    public Link createLink(String url, String description) {
        Link newLink = new Link(url, description);
        linkRepository.save(newLink);
        return newLink;
    }
}