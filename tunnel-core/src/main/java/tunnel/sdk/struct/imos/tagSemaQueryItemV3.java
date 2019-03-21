package tunnel.sdk.struct.imos;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

/**
 * <i>native declaration : sdk_struct.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class tagSemaQueryItemV3 extends Structure {
	/** C type : SEMA_QUERY_ITEM_S */
	public tagSemaQueryItem stSemaQueryItemInfo;
	/** C type : int */
	public int ulAlarmIOEnableFlag;
	/** C type : CHAR[256] */
	public byte[] szReserve = new byte[256];
	public tagSemaQueryItemV3() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("stSemaQueryItemInfo", "ulAlarmIOEnableFlag", "szReserve");
	}
	/**
	 * @param stSemaQueryItemInfo C type : SEMA_QUERY_ITEM_S<br>
	 * @param ulAlarmIOEnableFlag C type : int<br>
	 * @param szReserve C type : CHAR[256]
	 */
	public tagSemaQueryItemV3(tagSemaQueryItem stSemaQueryItemInfo, int ulAlarmIOEnableFlag, byte szReserve[]) {
		super();
		this.stSemaQueryItemInfo = stSemaQueryItemInfo;
		this.ulAlarmIOEnableFlag = ulAlarmIOEnableFlag;
		if ((szReserve.length != this.szReserve.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserve = szReserve;
	}
	public tagSemaQueryItemV3(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends tagSemaQueryItemV3 implements Structure.ByReference {
		
	};
	public static class ByValue extends tagSemaQueryItemV3 implements Structure.ByValue {
		
	};
}
