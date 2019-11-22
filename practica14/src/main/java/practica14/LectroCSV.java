import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LectorCSV{

	public static List<String[]>leer (String ruta) throws IOException{
		List<String> lineas=Files.readAllLines(Paths.get(ruta));
	}
}