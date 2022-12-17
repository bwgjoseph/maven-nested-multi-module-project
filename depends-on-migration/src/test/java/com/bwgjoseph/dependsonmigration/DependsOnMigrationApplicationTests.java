package com.bwgjoseph.dependsonmigration;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.bwgjoseph.migration.Migration;

@SpringBootTest
class DependsOnMigrationApplicationTests {

	@Test
	void contextLoads() {
	}

    @Test
    void test1() {
        Migration migration = new Migration();
    }

}
