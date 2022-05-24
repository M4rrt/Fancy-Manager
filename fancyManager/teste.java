import com.formdev.flatlaf.FlatDarkLaf;

public class teste
	extends FlatDarkLaf
{
	public static final String NAME = "teste";

	public static boolean setup() {
		return setup( new teste() );
	}

	public static void installLafInfo() {
		installLafInfo( NAME, teste.class );
	}

	@Override
	public String getName() {
		return NAME;
	}
}
