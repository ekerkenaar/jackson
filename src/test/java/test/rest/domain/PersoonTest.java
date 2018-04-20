package test.rest.domain;

import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.joda.JodaModule;

import test.rest.domain.Persoon;

public class PersoonTest {
	ObjectMapper mapper;

	@Before
	public void setup() {
		this.mapper = new ObjectMapper();
		mapper.registerModule(new JodaModule());
	}

	@Test
	public void testPersoon() throws JsonProcessingException {
		DateTime dateOfBirth = new DateTime(new GregorianCalendar(2018, 04, 19));
		String dateOfBirthValue = new SimpleDateFormat("YYYY-MM-dd").format(dateOfBirth.toDate().getTime());
		String expected = "{\"firstName\":\"Jan\",\"lastName\":\"Janssen\",\"dateOfBirth\"\"" + dateOfBirthValue
				+ "\"}";

		Persoon persoon = new Persoon("Jan", "Janssen", dateOfBirth);
		String jsonString = mapper.writeValueAsString(persoon);

		assertEquals(expected, jsonString);
	}
}
