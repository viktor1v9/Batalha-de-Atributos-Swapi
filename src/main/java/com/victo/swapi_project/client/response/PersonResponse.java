package com.victo.swapi_project.client.response;

public record PersonResponse(
    String name,
    String height,
    String mass,
    String movies
) {}
