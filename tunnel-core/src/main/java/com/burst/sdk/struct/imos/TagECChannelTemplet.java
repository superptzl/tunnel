package com.burst.sdk.struct.imos;
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
public class TagECChannelTemplet extends Structure {
	/** C type : CHANNEL_TEMPLET_BASIC_S */
	public TagChannelTempletBasic stTempBasicInfo;
	/** C type : VIN_CHANNEL_TEMPLET_S */
	public tagVinChannelTemplet stVinChannelTemp;
	public TagECChannelTemplet() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("stTempBasicInfo", "stVinChannelTemp");
	}
	/**
	 * @param stTempBasicInfo C type : CHANNEL_TEMPLET_BASIC_S<br>
	 * @param stVinChannelTemp C type : VIN_CHANNEL_TEMPLET_S
	 */
	public TagECChannelTemplet(TagChannelTempletBasic stTempBasicInfo, tagVinChannelTemplet stVinChannelTemp) {
		super();
		this.stTempBasicInfo = stTempBasicInfo;
		this.stVinChannelTemp = stVinChannelTemp;
	}
	public TagECChannelTemplet(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends TagECChannelTemplet implements Structure.ByReference {
		
	};
	public static class ByValue extends TagECChannelTemplet implements Structure.ByValue {
		
	};
}
