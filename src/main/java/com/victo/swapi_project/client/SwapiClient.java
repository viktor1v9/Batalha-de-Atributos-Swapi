package com.victo.swapi_project.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.victo.swapi_project.client.response.PersonResponse;

@FeignClient(name = "swapi", url = "https://swapi.dev/api")
public interface SwapiClient {

    @GetMapping("/people/{id}/")
    PersonResponse getPerson(@PathVariable("id") Long id);
}
