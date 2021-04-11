package network;

import org.testng.annotations.Test;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class WorkingWithHttp {

    @Test
    public void httpClientExample() throws URISyntaxException {
        final var client = HttpClient.newHttpClient();
        final var request = HttpRequest.newBuilder(new URI("http://google.com"))
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();

        final var completableFuture = client.sendAsync(request, HttpResponse.BodyHandlers.ofString());
        completableFuture.thenApply(HttpResponse::body);

        final var httpResponse = completableFuture.join();
        System.out.println(httpResponse.body());
    }
}
