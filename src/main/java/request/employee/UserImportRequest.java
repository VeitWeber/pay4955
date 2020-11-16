package request.employee;

import lombok.*;
import org.eclipse.microprofile.openapi.annotations.enums.SchemaType;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Schema(
		name = "UserImportRequest",
		description = "User import as base64 encoded CSV file",
		type = SchemaType.OBJECT
)
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class UserImportRequest {
	@Schema(description = "Import action 'INS'->Insert, 'UPD'->Update, 'DEL'-> Delete")
	CsvAction action;
}
