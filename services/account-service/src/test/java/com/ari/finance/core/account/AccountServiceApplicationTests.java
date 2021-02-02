package com.ari.finance.core.account;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;
import static org.springframework.http.MediaType.APPLICATION_JSON;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=RANDOM_PORT)
class AccountServiceApplicationTests {

	@Autowired
	private WebTestClient client;

	@Test
	public void getAccountById() {

		int accountId = 1;

		client.get()
				.uri("/account/" + accountId)
				.accept(APPLICATION_JSON)
				.exchange()
				.expectStatus().isOk()
				.expectHeader().contentType(APPLICATION_JSON)
				.expectBody()
				.jsonPath("$.accountId").isEqualTo(accountId);
	}

	@Test
	public void getAccountNotFound() {

		int accountIdNotFound = 13;

		client.get()
				.uri("/account/" + accountIdNotFound)
				.accept(APPLICATION_JSON)
				.exchange()
				.expectStatus().isNotFound()
				.expectHeader().contentType(APPLICATION_JSON)
				.expectBody()
				.jsonPath("$.path").isEqualTo("/account/" + accountIdNotFound)
				.jsonPath("$.message").isEqualTo("No account found for accountId: " + accountIdNotFound);
	}


}
