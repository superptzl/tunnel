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
public class tagTimeSliceInfoV2 extends Structure {
	/** C type : TIME_SLICE_V2_S */
	public tagTimeSliceV2 stTimeSliceV2;
	public tagTimeSliceInfoV2() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("stTimeSliceV2");
	}
	/** @param stTimeSliceV2 C type : TIME_SLICE_V2_S */
	public tagTimeSliceInfoV2(tagTimeSliceV2 stTimeSliceV2) {
		super();
		this.stTimeSliceV2 = stTimeSliceV2;
	}
	public tagTimeSliceInfoV2(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends tagTimeSliceInfoV2 implements Structure.ByReference {
		
	};
	public static class ByValue extends tagTimeSliceInfoV2 implements Structure.ByValue {
		
	};
}
