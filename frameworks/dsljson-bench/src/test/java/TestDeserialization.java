import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Test;
import org.nvd.json.jackson.DefCveItem;

import com.dslplatform.json.DslJson;
import com.dslplatform.json.JsonReader;

public class TestDeserialization {

	@Test
	public void test() throws IOException {
		/*
		DslJson<Object> json = new DslJson<Object>(); //always reuse
		byte[] bytes = IOUtils.toByteArray(getClass().getResourceAsStream("/cve.json"));
		JsonReader<Object> reader = json.newReader().process(bytes, bytes.length);
		DefCveItem instance = new DefCveItem(); //can be reused
		DefCveItem bound = reader.next(DefCveItem.class, instance); //bound is the same as instance above		
		*/
	}
}
