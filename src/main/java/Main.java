import org.springframework.http.HttpHeaders;
import org.springframework.web.reactive.function.client.WebClient;

public class Main {
    private static final String CUSTOM_PROPERTIES_URL_TEMPLATE ="https://convera-staging.api.apiable.io/api/subscriptions/{subscriptionId}/custom-properties";
    public static void main(String[] args) {

        String accessToken = ""; // set token here
        String url = CUSTOM_PROPERTIES_URL_TEMPLATE.replace("{subscriptionId}", "67191ef5a2920b1074361ee8");
        WebClient webClient = WebClient.builder().build();
        String response =
                webClient
                        .get()
                        .uri(url)
                        .header(HttpHeaders.AUTHORIZATION, "Bearer " + accessToken)
                        .header("accept", "application/json")
                        .header("x-api-version", "latest")
                        .retrieve()
                        .bodyToMono(String.class)
                        .block(); // blocking the call to wait for the result

        System.out.println(response);
    }
}


