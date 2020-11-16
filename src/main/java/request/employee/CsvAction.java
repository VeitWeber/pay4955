package request.employee;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public enum CsvAction {
	INS("ins"),
	UPD("upd"),
	DEL("del");

	private final String literal;

	private static final Map<String, CsvAction> ENUM_MAP;

	CsvAction(String literal) {
		this.literal = literal;
	}

	public String getLiteral() {
		return this.literal;
	}


	static {
		Map<String, CsvAction> map = new ConcurrentHashMap<>();
		for (CsvAction instance : CsvAction.values()) {
			map.put(instance.getLiteral(), instance);
		}
		ENUM_MAP = Collections.unmodifiableMap(map);
	}

	public static CsvAction get(String literal) {
		return ENUM_MAP.get(literal);
	}
}