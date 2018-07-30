package th.or.set;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.validation.BindingResult;
import org.springframework.web.context.request.RequestContextHolder;

public abstract class AbstractController<T> extends AbstractComponent<T> implements Root{

	public AbstractController() {}
	
	public void requestValidation(BindingResult result) throws Exception {
        this.log.debug("====  requestValidation() ====");
        if (result.hasErrors()) {
            StringBuilder bf = new StringBuilder();
            result.getFieldErrors().forEach((x) -> {
                bf.append(x.getField() + " : " + x.getDefaultMessage());
                bf.append(", ");
            });
            throw new RuntimeException(bf.deleteCharAt(bf.length() - 1).toString());
        }
    }
	
	public String getIpAddress() {
        try {
            InetAddress ip = InetAddress.getLocalHost();
            return ip.getHostAddress();
        } catch (UnknownHostException var2) {
            var2.printStackTrace();
            return null;
        }
    }

    public String getSessionId() {
        return RequestContextHolder.currentRequestAttributes().getSessionId();
    }
	
}
