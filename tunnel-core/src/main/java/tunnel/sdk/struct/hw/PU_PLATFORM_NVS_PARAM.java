package tunnel.sdk.struct.hw;
import com.sun.jna.NativeLong;
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
public class PU_PLATFORM_NVS_PARAM extends Structure {
	/**
	 * NVS IP\u5730\u5740<br>
	 * C type : CHAR[32]
	 */
	public byte[] szNvsIp = new byte[32];
	/** NVS\u7aef\u53e3 */
	public NativeLong ulNvsPort;
	/**
	 * \u8bbe\u5907ID<br>
	 * C type : CHAR[32]
	 */
	public byte[] pszDeviceID = new byte[32];
	/**
	 * NVS\u767b\u5f55\u540d<br>
	 * C type : CHAR[32]
	 */
	public byte[] pszLoginName = new byte[32];
	/**
	 * NVS\u767b\u5f55\u57df<br>
	 * C type : CHAR[32]
	 */
	public byte[] pszLoginDomain = new byte[32];
	/**
	 * NVS\u767b\u5f55Pwd<br>
	 * C type : CHAR[32]
	 */
	public byte[] pszPassword = new byte[32];
	/** C type : CHAR[32] */
	public byte[] szReserve = new byte[32];
	public PU_PLATFORM_NVS_PARAM() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("szNvsIp", "ulNvsPort", "pszDeviceID", "pszLoginName", "pszLoginDomain", "pszPassword", "szReserve");
	}
	/**
	 * @param szNvsIp NVS IP\u5730\u5740<br>
	 * C type : CHAR[32]<br>
	 * @param ulNvsPort NVS\u7aef\u53e3<br>
	 * @param pszDeviceID \u8bbe\u5907ID<br>
	 * C type : CHAR[32]<br>
	 * @param pszLoginName NVS\u767b\u5f55\u540d<br>
	 * C type : CHAR[32]<br>
	 * @param pszLoginDomain NVS\u767b\u5f55\u57df<br>
	 * C type : CHAR[32]<br>
	 * @param pszPassword NVS\u767b\u5f55Pwd<br>
	 * C type : CHAR[32]<br>
	 * @param szReserve C type : CHAR[32]
	 */
	public PU_PLATFORM_NVS_PARAM(byte szNvsIp[], NativeLong ulNvsPort, byte pszDeviceID[], byte pszLoginName[], byte pszLoginDomain[], byte pszPassword[], byte szReserve[]) {
		super();
		if ((szNvsIp.length != this.szNvsIp.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szNvsIp = szNvsIp;
		this.ulNvsPort = ulNvsPort;
		if ((pszDeviceID.length != this.pszDeviceID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.pszDeviceID = pszDeviceID;
		if ((pszLoginName.length != this.pszLoginName.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.pszLoginName = pszLoginName;
		if ((pszLoginDomain.length != this.pszLoginDomain.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.pszLoginDomain = pszLoginDomain;
		if ((pszPassword.length != this.pszPassword.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.pszPassword = pszPassword;
		if ((szReserve.length != this.szReserve.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserve = szReserve;
	}
	public PU_PLATFORM_NVS_PARAM(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_PLATFORM_NVS_PARAM implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_PLATFORM_NVS_PARAM implements Structure.ByValue {
		
	};
}
