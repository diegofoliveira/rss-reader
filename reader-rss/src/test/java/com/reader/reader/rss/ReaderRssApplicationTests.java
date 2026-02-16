package com.reader.reader.rss;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.reader.reader.rss.service.RssService;

@SpringBootTest
class ReaderRssApplicationTests {

	RssService rssService = new RssService();

	@Test
	void contextLoads() {
	}

	@Test
	void testReadRssFeed() 	{
		String url = "https://www.espn.com/espn/rss/soccer/news"; // Exemplo de URL de feed RSS
		rssService.readRssFeed(url);
	}

}
