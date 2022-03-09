package com.snrao.webapi.service;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.snrao.webapi.entity.Applications;

@SpringBootTest
public class ApplicationServiceTest {

	@Autowired
	ApplicationService fApplicationService;
	@Test
	void checkGetApplications_returnCorrectInfo(){
		List<Applications> applicationsList = fApplicationService.getApplications();
		assertThat(applicationsList.size()).isEqualTo(1);
	}
}
