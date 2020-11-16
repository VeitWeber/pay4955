import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.servers.Server;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@OpenAPIDefinition(info = @Info(
		title = "RESTful API",
		description = "Backend REST API",
		version = "1.0.0-Snapshot",
		contact = @Contact(
				name = "Veit Weber",
				email = "veit@pikodat.com",
				url = "https://www.pikodat.com")
),
		servers = {
				@Server(url = "http://localhost:8080/", description = "Local Development Server "),
		}
)
@ApplicationPath("/api/v1")
public class RestApplication extends Application {
}
