package th.or.set;

import java.lang.reflect.ParameterizedType;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SuppressWarnings("unchecked")
public abstract class AbstractComponent<T> {
	
	public Logger log;
	
	protected AbstractComponent() {
		Class<T> tClass = (Class<T>)((ParameterizedType)this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        this.log = LogManager.getLogger(tClass);
	}

}
