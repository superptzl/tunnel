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
public class PU_PTZ_PRESET_LIST_PARA extends Structure {
	/** \u901a\u9053ID */
	public NativeLong ulChannelId;
	/** \u9884\u7f6e\u4f4d\u5f00\u59cb\u7f16\u53f7 */
	public NativeLong ulBeginIndex;
	/** \u9884\u7f6e\u4f4d\u7ed3\u675f\u7f16\u53f7 */
	public NativeLong ulEndIndex;
	/** \u8fd4\u56de\u7684\u9884\u7f6e\u4f4d\u5b9e\u9645\u4e2a\u6570 */
	public NativeLong ulTotalNum;
	/**
	 * \u9884\u7f6e\u4f4d\u4fe1\u606f<br>
	 * C type : PU_PTZ_PRESET_INFO_S[10]
	 */
	public PU_PTZ_PRESET_INFO[] stPtzPresetInfo = new PU_PTZ_PRESET_INFO[10];
	public PU_PTZ_PRESET_LIST_PARA() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ulChannelId", "ulBeginIndex", "ulEndIndex", "ulTotalNum", "stPtzPresetInfo");
	}
	/**
	 * @param ulChannelId \u901a\u9053ID<br>
	 * @param ulBeginIndex \u9884\u7f6e\u4f4d\u5f00\u59cb\u7f16\u53f7<br>
	 * @param ulEndIndex \u9884\u7f6e\u4f4d\u7ed3\u675f\u7f16\u53f7<br>
	 * @param ulTotalNum \u8fd4\u56de\u7684\u9884\u7f6e\u4f4d\u5b9e\u9645\u4e2a\u6570<br>
	 * @param stPtzPresetInfo \u9884\u7f6e\u4f4d\u4fe1\u606f<br>
	 * C type : PU_PTZ_PRESET_INFO_S[10]
	 */
	public PU_PTZ_PRESET_LIST_PARA(NativeLong ulChannelId, NativeLong ulBeginIndex, NativeLong ulEndIndex, NativeLong ulTotalNum, PU_PTZ_PRESET_INFO stPtzPresetInfo[]) {
		super();
		this.ulChannelId = ulChannelId;
		this.ulBeginIndex = ulBeginIndex;
		this.ulEndIndex = ulEndIndex;
		this.ulTotalNum = ulTotalNum;
		if ((stPtzPresetInfo.length != this.stPtzPresetInfo.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.stPtzPresetInfo = stPtzPresetInfo;
	}
	public PU_PTZ_PRESET_LIST_PARA(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_PTZ_PRESET_LIST_PARA implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_PTZ_PRESET_LIST_PARA implements Structure.ByValue {
		
	};
}