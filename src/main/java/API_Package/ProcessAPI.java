package API_Package;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
public @interface ProcessAPI {
	// Marker annotation, should be applied to an interface type
}
