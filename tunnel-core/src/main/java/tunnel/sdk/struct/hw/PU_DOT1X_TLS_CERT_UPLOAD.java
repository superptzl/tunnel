package tunnel.sdk.struct.hw;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : D:\HWPuSDK.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class PU_DOT1X_TLS_CERT_UPLOAD extends Structure {
	/**
	 * \u4e0a\u4f20\u7c7b\u578b<br>
	 * C type : PU_DOT1X_TLS_CERT_UPLOAD_TYPE_E
	 */
	public int enAction;
	/**
	 * \u79c1\u94a5\u6587\u4ef6\u7684\u52a0\u5bc6Pwd<br>
	 * C type : CHAR[(64 + 4)]
	 */
	public byte[] szPassword = new byte[64 + 4];
	public PU_DOT1X_TLS_CERT_UPLOAD() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("enAction", "szPassword");
	}
	/**
	 * @param enAction \u4e0a\u4f20\u7c7b\u578b<br>
	 * C type : PU_DOT1X_TLS_CERT_UPLOAD_TYPE_E<br>
	 * @param szPassword \u79c1\u94a5\u6587\u4ef6\u7684\u52a0\u5bc6Pwd<br>
	 * C type : CHAR[(64 + 4)]
	 */
	public PU_DOT1X_TLS_CERT_UPLOAD(int enAction, byte szPassword[]) {
		super();
		this.enAction = enAction;
		if ((szPassword.length != this.szPassword.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szPassword = szPassword;
	}
	public PU_DOT1X_TLS_CERT_UPLOAD(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_DOT1X_TLS_CERT_UPLOAD implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_DOT1X_TLS_CERT_UPLOAD implements Structure.ByValue {
		
	};
}
