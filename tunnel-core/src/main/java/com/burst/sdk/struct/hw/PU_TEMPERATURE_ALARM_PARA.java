package com.burst.sdk.struct.hw;
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
public class PU_TEMPERATURE_ALARM_PARA extends Structure {
	/** \u4f7f\u80fd */
	public NativeLong lEnable;
	/** \u544a\u8b66\u68c0\u6d4b\u65f6\u95f4\u95f4\u96941~256,\u6bcfx\u79d2\u68c0\u6d4b\u4e00\u6b21\u662f\u5426\u5728\u544a\u8b66\u72b6\u6001 */
	public NativeLong ulDeteInterval;
	public NativeLong lTemperatureMax;
	public NativeLong lTemperatureMin;
	public PU_TEMPERATURE_ALARM_PARA() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("lEnable", "ulDeteInterval", "lTemperatureMax", "lTemperatureMin");
	}
	/**
	 * @param lEnable \u4f7f\u80fd<br>
	 * @param ulDeteInterval \u544a\u8b66\u68c0\u6d4b\u65f6\u95f4\u95f4\u96941~256,\u6bcfx\u79d2\u68c0\u6d4b\u4e00\u6b21\u662f\u5426\u5728\u544a\u8b66\u72b6\u6001
	 */
	public PU_TEMPERATURE_ALARM_PARA(NativeLong lEnable, NativeLong ulDeteInterval, NativeLong lTemperatureMax, NativeLong lTemperatureMin) {
		super();
		this.lEnable = lEnable;
		this.ulDeteInterval = ulDeteInterval;
		this.lTemperatureMax = lTemperatureMax;
		this.lTemperatureMin = lTemperatureMin;
	}
	public PU_TEMPERATURE_ALARM_PARA(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_TEMPERATURE_ALARM_PARA implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_TEMPERATURE_ALARM_PARA implements Structure.ByValue {
		
	};
}
