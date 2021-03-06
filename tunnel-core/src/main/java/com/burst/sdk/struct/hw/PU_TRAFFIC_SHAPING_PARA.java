package com.burst.sdk.struct.hw;
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
public class PU_TRAFFIC_SHAPING_PARA extends Structure {
	/** \u6d41\u91cf\u6574\u5f62\u4f7f\u80fd */
	public boolean bEnable;
	/**
	 * \u6d41\u91cf\u6574\u5f62\u7cfb\u6570<br>
	 * C type : PU_TS_COEFFICIENT_E
	 */
	public int enCoefficient;
	/**
	 * \u9884\u7559<br>
	 * C type : CHAR[32]
	 */
	public byte[] szReserved = new byte[32];
	public PU_TRAFFIC_SHAPING_PARA() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("bEnable", "enCoefficient", "szReserved");
	}
	/**
	 * @param bEnable \u6d41\u91cf\u6574\u5f62\u4f7f\u80fd<br>
	 * @param enCoefficient \u6d41\u91cf\u6574\u5f62\u7cfb\u6570<br>
	 * C type : PU_TS_COEFFICIENT_E<br>
	 * @param szReserved \u9884\u7559<br>
	 * C type : CHAR[32]
	 */
	public PU_TRAFFIC_SHAPING_PARA(boolean bEnable, int enCoefficient, byte szReserved[]) {
		super();
		this.bEnable = bEnable;
		this.enCoefficient = enCoefficient;
		if ((szReserved.length != this.szReserved.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserved = szReserved;
	}
	public PU_TRAFFIC_SHAPING_PARA(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_TRAFFIC_SHAPING_PARA implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_TRAFFIC_SHAPING_PARA implements Structure.ByValue {
		
	};
}
