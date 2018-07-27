package th.or.set;

import org.atteo.evo.inflector.English;

public class EvoInflectorUtil extends AbstractComponent<EvoInflectorUtil> {
	
	public static void main(String... args) {
		new EvoInflectorUtil().log.debug(English.plural("variety"));
	}
	
	

}
