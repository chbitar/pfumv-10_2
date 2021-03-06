package com.planeta.pfum.repository.search;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Configuration;

/**
 * Configure a Mock version of {@link AnneeInscriptionSearchRepository} to test the
 * application without starting Elasticsearch.
 */
@Configuration
public class AnneeInscriptionSearchRepositoryMockConfiguration {

    @MockBean
    private AnneeInscriptionSearchRepository mockAnneeInscriptionSearchRepository;

}
