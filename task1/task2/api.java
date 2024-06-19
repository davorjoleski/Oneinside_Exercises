package oneinside.task1.task2;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
//import com.fasterxml.jackson.databind.JsonNode;
//import com.fasterxml.jackson.databind.ObjectMapper;

public class api {
    private static final String JOKE_API_URL = "https://official-joke-api.appspot.com/random_joke";

    public static void main(String[] args) {
        try {
            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(JOKE_API_URL))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Parse the JSON response
            ObjectMapper objectMapper = new ObjectMapper();               //raboti se  samo zakomentiraj gi ovie crvenite  ako sakas da gi proveris drugite zadaci
            JsonNode jsonNode = objectMapper.readTree(response.body());

            // Extract  details
            String setup = jsonNode.get("setup").asText();
            String punchline = jsonNode.get("punchline").asText();

            // Printing
            System.out.println("Joke: " + setup);
            System.out.println("Punchline: " + punchline);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
