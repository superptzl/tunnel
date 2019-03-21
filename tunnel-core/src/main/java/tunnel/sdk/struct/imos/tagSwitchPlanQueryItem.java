package tunnel.sdk.struct.imos;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import tunnel.sdk.constanst.IMOSDefLibrary;

import java.util.Arrays;
import java.util.List;

/**
 * <i>native declaration : sdk_struct.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class tagSwitchPlanQueryItem extends Structure {
	/** C type : CHAR[IMOS_RES_CODE_LEN] */
	public byte[] szSwitchPlanCode = new byte[IMOSDefLibrary.IMOS_RES_CODE_LEN];
	/** C type : CHAR[IMOS_NAME_LEN] */
	public byte[] szPlanName = new byte[IMOSDefLibrary.IMOS_NAME_LEN];
	/** C type : CHAR[IMOS_TIME_LEN] */
	public byte[] szCreatTime = new byte[IMOSDefLibrary.IMOS_TIME_LEN];
	/** C type : CHAR[IMOS_NAME_LEN] */
	public byte[] szScrName = new byte[IMOSDefLibrary.IMOS_NAME_LEN];
	/** C type : int */
	public int ulPlanStatus;
	public tagSwitchPlanQueryItem() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("szSwitchPlanCode", "szPlanName", "szCreatTime", "szScrName", "ulPlanStatus");
	}
	/**
	 * @param szSwitchPlanCode C type : CHAR[IMOS_RES_CODE_LEN]<br>
	 * @param szPlanName C type : CHAR[IMOS_NAME_LEN]<br>
	 * @param szCreatTime C type : CHAR[IMOS_TIME_LEN]<br>
	 * @param szScrName C type : CHAR[IMOS_NAME_LEN]<br>
	 * @param ulPlanStatus C type : int
	 */
	public tagSwitchPlanQueryItem(byte szSwitchPlanCode[], byte szPlanName[], byte szCreatTime[], byte szScrName[], int ulPlanStatus) {
		super();
		if ((szSwitchPlanCode.length != this.szSwitchPlanCode.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szSwitchPlanCode = szSwitchPlanCode;
		if ((szPlanName.length != this.szPlanName.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szPlanName = szPlanName;
		if ((szCreatTime.length != this.szCreatTime.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szCreatTime = szCreatTime;
		if ((szScrName.length != this.szScrName.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szScrName = szScrName;
		this.ulPlanStatus = ulPlanStatus;
	}
	public tagSwitchPlanQueryItem(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends tagSwitchPlanQueryItem implements Structure.ByReference {
		
	};
	public static class ByValue extends tagSwitchPlanQueryItem implements Structure.ByValue {
		
	};
}
