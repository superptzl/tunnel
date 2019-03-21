package tunnel.sdk.struct.imos;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;
import static tunnel.sdk.constanst.IMOSDefLibrary.*;
/**
 * <i>native declaration : sdk_struct.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class TagScreenRelatedDC extends Structure {
	/** C type : CHAR[IMOS_CODE_LEN] */
	public byte[] szScreenCode = new byte[IMOS_CODE_LEN];
	/** C type : CHAR[IMOS_NAME_LEN] */
	public byte[] szScreenName = new byte[IMOS_NAME_LEN];
	/** C type : CHAR[IMOS_DESC_LEN] */
	public byte[] szDevDesc = new byte[IMOS_DESC_LEN];
	/** C type : CHAR[IMOS_CODE_LEN] */
	public byte[] szDCCode = new byte[IMOS_CODE_LEN];
	/** C type : CHAR[IMOS_NAME_LEN] */
	public byte[] szDCName = new byte[IMOS_NAME_LEN];
	/** C type : int */
	public int ulDCType;
	/** C type : CHAR[IMOS_IPADDR_LEN] */
	public byte[] szDCIPAddr = new byte[IMOS_IPADDR_LEN];
	/** C type : int */
	public int ulChannelIndex;
	/** C type : CHAR[28] */
	public byte[] szReserve = new byte[28];
	public TagScreenRelatedDC() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("szScreenCode", "szScreenName", "szDevDesc", "szDCCode", "szDCName", "ulDCType", "szDCIPAddr", "ulChannelIndex", "szReserve");
	}
	/**
	 * @param szScreenCode C type : CHAR[IMOS_CODE_LEN]<br>
	 * @param szScreenName C type : CHAR[IMOS_NAME_LEN]<br>
	 * @param szDevDesc C type : CHAR[IMOS_DESC_LEN]<br>
	 * @param szDCCode C type : CHAR[IMOS_CODE_LEN]<br>
	 * @param szDCName C type : CHAR[IMOS_NAME_LEN]<br>
	 * @param ulDCType C type : int<br>
	 * @param szDCIPAddr C type : CHAR[IMOS_IPADDR_LEN]<br>
	 * @param ulChannelIndex C type : int<br>
	 * @param szReserve C type : CHAR[28]
	 */
	public TagScreenRelatedDC(byte szScreenCode[], byte szScreenName[], byte szDevDesc[], byte szDCCode[], byte szDCName[], int ulDCType, byte szDCIPAddr[], int ulChannelIndex, byte szReserve[]) {
		super();
		if ((szScreenCode.length != this.szScreenCode.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szScreenCode = szScreenCode;
		if ((szScreenName.length != this.szScreenName.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szScreenName = szScreenName;
		if ((szDevDesc.length != this.szDevDesc.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szDevDesc = szDevDesc;
		if ((szDCCode.length != this.szDCCode.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szDCCode = szDCCode;
		if ((szDCName.length != this.szDCName.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szDCName = szDCName;
		this.ulDCType = ulDCType;
		if ((szDCIPAddr.length != this.szDCIPAddr.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szDCIPAddr = szDCIPAddr;
		this.ulChannelIndex = ulChannelIndex;
		if ((szReserve.length != this.szReserve.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserve = szReserve;
	}
	public TagScreenRelatedDC(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends TagScreenRelatedDC implements Structure.ByReference {
		
	};
	public static class ByValue extends TagScreenRelatedDC implements Structure.ByValue {
		
	};
}
