package test.rest.domain;

import java.io.IOException;
import java.io.StringWriter;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;

public class MyDateSerializer extends JsonSerializer<DateTime> {
	private ObjectMapper mapper = new ObjectMapper();
	private static final DateTimeFormatter df = DateTimeFormat.forPattern("YYYY-MM-dd");

	@Override
	public void serialize(DateTime value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
		StringWriter writer = new StringWriter();
        mapper.writeValue(writer, df.print(value));
        gen.writeRaw(writer.toString());
	}

}
