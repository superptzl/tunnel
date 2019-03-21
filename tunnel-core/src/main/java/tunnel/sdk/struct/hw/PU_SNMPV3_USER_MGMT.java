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
public class PU_SNMPV3_USER_MGMT extends Structure {
	/**
	 * \u64cd\u4f5c\u7c7b\u578b<br>
	 * C type : PU_OPT_TYPE_E
	 */
	public int enManipulateType;
	/**
	 * \u64cd\u4f5c\u4fe1\u606f<br>
	 * C type : PU_SNMPV3_USER_INFO_S
	 */
	public PU_SNMPV3_USER_INFO stMgmtUserInfo;
	/**
	 * \u5f53\u524dsnmp\u7528\u6237\u7684\u8ba4\u8bc1Pwd(\u5b89\u5168\u7ea7\u522b\u4e0d\u4e3anoauth)<br>
	 * C type : CHAR[(64 + 4)]
	 */
	public byte[] szModifyVerifyPwd = new byte[64 + 4];
	/** C type : CHAR[32] */
	public byte[] szReserved = new byte[32];
	public PU_SNMPV3_USER_MGMT() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("enManipulateType", "stMgmtUserInfo", "szModifyVerifyPwd", "szReserved");
	}
	/**
	 * @param enManipulateType \u64cd\u4f5c\u7c7b\u578b<br>
	 * C type : PU_OPT_TYPE_E<br>
	 * @param stMgmtUserInfo \u64cd\u4f5c\u4fe1\u606f<br>
	 * C type : PU_SNMPV3_USER_INFO_S<br>
	 * @param szModifyVerifyPwd \u5f53\u524dsnmp\u7528\u6237\u7684\u8ba4\u8bc1Pwd(\u5b89\u5168\u7ea7\u522b\u4e0d\u4e3anoauth)<br>
	 * C type : CHAR[(64 + 4)]<br>
	 * @param szReserved C type : CHAR[32]
	 */
	public PU_SNMPV3_USER_MGMT(int enManipulateType, PU_SNMPV3_USER_INFO stMgmtUserInfo, byte szModifyVerifyPwd[], byte szReserved[]) {
		super();
		this.enManipulateType = enManipulateType;
		this.stMgmtUserInfo = stMgmtUserInfo;
		if ((szModifyVerifyPwd.length != this.szModifyVerifyPwd.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szModifyVerifyPwd = szModifyVerifyPwd;
		if ((szReserved.length != this.szReserved.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserved = szReserved;
	}
	public PU_SNMPV3_USER_MGMT(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_SNMPV3_USER_MGMT implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_SNMPV3_USER_MGMT implements Structure.ByValue {
		
	};
}
