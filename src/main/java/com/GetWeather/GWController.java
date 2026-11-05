package com.GetWeather;

import com.GetWeather.dto.GWRequest;
import com.GetWeather.dto.GWResponse;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.web.bind.annotation.*;

import java.net.*;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;

@RestController
@RequestMapping("/api/v1/get-weather")
@CrossOrigin(origins = "http://localhost:3000") // Allow frontend access
public class GWController {

    private final GWService gwService;

    public GWController(GWService gwService) {
        this.gwService = gwService;
    }

    @PostMapping("/get")
    public GWResponse get(@RequestBody GWRequest request) throws Exception {
        return gwService.getWeather(request);
    }

}
