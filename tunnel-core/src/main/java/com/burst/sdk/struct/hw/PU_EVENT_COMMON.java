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
public class PU_EVENT_COMMON extends Structure {
	/**
	 * \u4e8b\u4ef6\u7c7b\u578b<br>
	 * C type : PU_EVENT_TYPE_E
	 */
	public int enEventType;
	/** \u552f\u4e00\u6807\u8bc6\u7684ID\u53f7 */
	public NativeLong ulIdentifyID;
	public NativeLong ulChannelId;
	public PU_EVENT_COMMON() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("enEventType", "ulIdentifyID", "ulChannelId");
	}
	/**
	 * @param enEventType \u4e8b\u4ef6\u7c7b\u578b<br>
	 * C type : PU_EVENT_TYPE_E<br>
	 * @param ulIdentifyID \u552f\u4e00\u6807\u8bc6\u7684ID\u53f7
	 */
	public PU_EVENT_COMMON(int enEventType, NativeLong ulIdentifyID, NativeLong ulChannelId) {
		super();
		this.enEventType = enEventType;
		this.ulIdentifyID = ulIdentifyID;
		this.ulChannelId = ulChannelId;
	}
	public PU_EVENT_COMMON(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_EVENT_COMMON implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_EVENT_COMMON implements Structure.ByValue {
		
	};
}
