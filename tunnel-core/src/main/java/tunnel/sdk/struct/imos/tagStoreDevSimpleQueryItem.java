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
public class tagStoreDevSimpleQueryItem extends Structure {
	/** C type : CHAR[IMOS_DEVICE_CODE_LEN] */
	public byte[] szStoreDevCode = new byte[IMOS_DEVICE_CODE_LEN];
	/** C type : int */
	public int ulStoreDevType;
	/** C type : CHAR[IMOS_NAME_LEN] */
	public byte[] szStoreDevName = new byte[IMOS_NAME_LEN];
	/** C type : int */
	public int ulStoreDevTotalSize;
	/** C type : int */
	public int ulStoreDevUsedSize;
	public tagStoreDevSimpleQueryItem() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("szStoreDevCode", "ulStoreDevType", "szStoreDevName", "ulStoreDevTotalSize", "ulStoreDevUsedSize");
	}
	/**
	 * @param szStoreDevCode C type : CHAR[IMOS_DEVICE_CODE_LEN]<br>
	 * @param ulStoreDevType C type : int<br>
	 * @param szStoreDevName C type : CHAR[IMOS_NAME_LEN]<br>
	 * @param ulStoreDevTotalSize C type : int<br>
	 * @param ulStoreDevUsedSize C type : int
	 */
	public tagStoreDevSimpleQueryItem(byte szStoreDevCode[], int ulStoreDevType, byte szStoreDevName[], int ulStoreDevTotalSize, int ulStoreDevUsedSize) {
		super();
		if ((szStoreDevCode.length != this.szStoreDevCode.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szStoreDevCode = szStoreDevCode;
		this.ulStoreDevType = ulStoreDevType;
		if ((szStoreDevName.length != this.szStoreDevName.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szStoreDevName = szStoreDevName;
		this.ulStoreDevTotalSize = ulStoreDevTotalSize;
		this.ulStoreDevUsedSize = ulStoreDevUsedSize;
	}
	public tagStoreDevSimpleQueryItem(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends tagStoreDevSimpleQueryItem implements Structure.ByReference {
		
	};
	public static class ByValue extends tagStoreDevSimpleQueryItem implements Structure.ByValue {
		
	};
}