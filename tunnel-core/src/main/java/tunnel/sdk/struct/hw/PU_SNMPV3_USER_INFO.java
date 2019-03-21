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
public class PU_SNMPV3_USER_INFO extends Structure {
	/**
	 * \u7528\u6237\u540d<br>
	 * C type : CHAR[32]
	 */
	public byte[] szUserName = new byte[32];
	/** \u662f\u5426\u9700\u8981\u6307\u5b9aENGINEID(\u6682\u65f6\u53ea\u5728\u914d\u7f6eTrap\u65f6\u4f7f\u7528) */
	public boolean bEngineIdEnable;
	/**
	 * ENGINEID(\u6682\u65f6\u53ea\u5728\u914d\u7f6eTrap\u65f6\u4f7f\u7528)<br>
	 * C type : CHAR[(32 + 1)]
	 */
	public byte[] szEngineId = new byte[32 + 1];
	/** \u662f\u5426\u9700\u8981\u6307\u5b9a\u4e0a\u4e0b\u6587\u540d(\u6682\u65f6\u53ea\u5728\u914d\u7f6eTrap\u65f6\u4f7f\u7528) */
	public boolean bContextEnable;
	/**
	 * \u4e0a\u4e0b\u6587\u540d(\u6682\u65f6\u53ea\u5728\u914d\u7f6eTrap\u65f6\u4f7f\u7528)<br>
	 * C type : CHAR[(16 + 1)]
	 */
	public byte[] szContextName = new byte[16 + 1];
	/**
	 * \u8ba4\u8bc1Pwd(\u5f53\u88abWEB\u914d\u7f6e\u7684\u65f6\u5019\u4e3a\u539f\u6587\u4e0b\u53d1;\u8bb0\u5f55\u5728\u914d\u7f6e\u6587\u4ef6\u4e2d\u4e3a\u5bc6\u6587\u5f62\u5f0f)<br>
	 * C type : CHAR[(64 + 4)]
	 */
	public byte[] szAuthPassword = new byte[64 + 4];
	/**
	 * \u5bc6\u94a5(\u5f53\u88abWEB\u914d\u7f6e\u7684\u65f6\u5019\u4e3a\u539f\u6587\u4e0b\u53d1;\u8bb0\u5f55\u5728\u914d\u7f6e\u6587\u4ef6\u4e2d\u4e3a\u5bc6\u6587\u5f62\u5f0f)<br>
	 * C type : CHAR[(64 + 4)]
	 */
	public byte[] szPrivKey = new byte[64 + 4];
	/**
	 * \u5b89\u5168\u7ea7\u522b<br>
	 * C type : PU_SNMPV3_SECURITY_LEVEL_E
	 */
	public int enSecurityLevel;
	/**
	 * \u8ba4\u8bc1\u534f\u8bae<br>
	 * C type : PU_SNMPV3_AUTH_PROTOCOL_E
	 */
	public int enAuthProtocol;
	/**
	 * \u5bc6\u94a5\u534f\u8bae<br>
	 * C type : PU_SNMPV3_PRIV_PROTOCOL_E
	 */
	public int enPrivProtocol;
	/** C type : CHAR[32] */
	public byte[] szReserved = new byte[32];
	public PU_SNMPV3_USER_INFO() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("szUserName", "bEngineIdEnable", "szEngineId", "bContextEnable", "szContextName", "szAuthPassword", "szPrivKey", "enSecurityLevel", "enAuthProtocol", "enPrivProtocol", "szReserved");
	}
	public PU_SNMPV3_USER_INFO(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_SNMPV3_USER_INFO implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_SNMPV3_USER_INFO implements Structure.ByValue {
		
	};
}
