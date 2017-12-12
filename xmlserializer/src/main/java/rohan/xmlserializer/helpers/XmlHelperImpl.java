package rohan.xmlserializer.helpers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class XmlHelperImpl {

	public static String getXml(Object object) {

		XmlMapper mapper = new XmlMapper();

		String xml = null;
		try {
			xml = mapper.writeValueAsString(object);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		return xml;
	}

}
