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
public class PU_SNMPV3_USER_LIST extends Structure {
	/** \u7528\u6237\u6570\u76ee */
	public NativeLong ulUserNum;
	/**
	 * \u7528\u6237\u4fe1\u606f<br>
	 * C type : PU_SNMPV3_USER_INFO_S[3]
	 */
	public PU_SNMPV3_USER_INFO[] szUserInfo = new PU_SNMPV3_USER_INFO[3];
	/** C type : CHAR[32] */
	public byte[] szReserved = new byte[32];
	public PU_SNMPV3_USER_LIST() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ulUserNum", "szUserInfo", "szReserved");
	}
	/**
	 * @param ulUserNum \u7528\u6237\u6570\u76ee<br>
	 * @param szUserInfo \u7528\u6237\u4fe1\u606f<br>
	 * C type : PU_SNMPV3_USER_INFO_S[3]<br>
	 * @param szReserved C type : CHAR[32]
	 */
	public PU_SNMPV3_USER_LIST(NativeLong ulUserNum, PU_SNMPV3_USER_INFO szUserInfo[], byte szReserved[]) {
		super();
		this.ulUserNum = ulUserNum;
		if ((szUserInfo.length != this.szUserInfo.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szUserInfo = szUserInfo;
		if ((szReserved.length != this.szReserved.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserved = szReserved;
	}
	public PU_SNMPV3_USER_LIST(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_SNMPV3_USER_LIST implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_SNMPV3_USER_LIST implements Structure.ByValue {
		
	};
}
