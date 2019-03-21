package tunnel.sdk.struct.imos;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
import static tunnel.sdk.constanst.IMOSDefLibrary.*;
import static tunnel.sdk.constanst.SDKDef.IMOS_NTP_SERVER_MAXNUM;

/**
 * <i>native declaration : sdk_struct.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class TagLoDomain extends Structure {
	/** C type : CHAR[IMOS_DOMAIN_CODE_LEN] */
	public byte[] szDomainCode = new byte[IMOS_DOMAIN_CODE_LEN];
	/** C type : CHAR[IMOS_NAME_LEN] */
	public byte[] szDomainName = new byte[IMOS_NAME_LEN];
	/** C type : CHAR[IMOS_STRING_LEN_64] */
	public byte[] szManufacturerType = new byte[IMOS_STRING_LEN_64];
	/** C type : CHAR[IMOS_NTP_SERVER_MAXNUM][IMOS_IPADDR_LEN] */
	public byte[] szNTPServerAddr = new byte[((IMOS_NTP_SERVER_MAXNUM) * (IMOS_IPADDR_LEN))];
	public TagLoDomain() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("szDomainCode", "szDomainName", "szManufacturerType", "szNTPServerAddr");
	}
	/**
	 * @param szDomainCode C type : CHAR[IMOS_DOMAIN_CODE_LEN]<br>
	 * @param szDomainName C type : CHAR[IMOS_NAME_LEN]<br>
	 * @param szManufacturerType C type : CHAR[IMOS_STRING_LEN_64]<br>
	 * @param szNTPServerAddr C type : CHAR[IMOS_NTP_SERVER_MAXNUM][IMOS_IPADDR_LEN]
	 */
	public TagLoDomain(byte szDomainCode[], byte szDomainName[], byte szManufacturerType[], byte szNTPServerAddr[]) {
		super();
		if ((szDomainCode.length != this.szDomainCode.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szDomainCode = szDomainCode;
		if ((szDomainName.length != this.szDomainName.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szDomainName = szDomainName;
		if ((szManufacturerType.length != this.szManufacturerType.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szManufacturerType = szManufacturerType;
		if ((szNTPServerAddr.length != this.szNTPServerAddr.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szNTPServerAddr = szNTPServerAddr;
	}
	public TagLoDomain(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends TagLoDomain implements Structure.ByReference {
		
	};
	public static class ByValue extends TagLoDomain implements Structure.ByValue {
		
	};
}
