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
public class PU_TYPICAL_SCENE_LIST_EX_OUT extends Structure {
	/** \u5c5e\u4e8e\u54ea\u4e2a\u901a\u9053 */
	public NativeLong ulChannelId;
	/** \u5178\u578b\u573a\u666f\u5957\u9910\u4e2a\u6570 */
	public NativeLong ulTypicalScenesNum;
	/**
	 * \u5f53\u524d\u6fc0\u6d3b\u7684\u5178\u578b\u573a\u666f\u5957\u9910<br>
	 * C type : PU_TYPICAL_SCENE_MODE_E
	 */
	public int enSceneMode;
	/**
	 * \u4fe1\u606f\u5217\u8868<br>
	 * C type : PU_TYPICAL_SCENE_INFO_S*
	 */
	public PU_TYPICAL_SCENE_INFO.ByReference pstTypicalSceneInfo;
	/** C type : CHAR[32] */
	public byte[] szReserved = new byte[32];
	public PU_TYPICAL_SCENE_LIST_EX_OUT() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ulChannelId", "ulTypicalScenesNum", "enSceneMode", "pstTypicalSceneInfo", "szReserved");
	}
	/**
	 * @param ulChannelId \u5c5e\u4e8e\u54ea\u4e2a\u901a\u9053<br>
	 * @param ulTypicalScenesNum \u5178\u578b\u573a\u666f\u5957\u9910\u4e2a\u6570<br>
	 * @param enSceneMode \u5f53\u524d\u6fc0\u6d3b\u7684\u5178\u578b\u573a\u666f\u5957\u9910<br>
	 * C type : PU_TYPICAL_SCENE_MODE_E<br>
	 * @param pstTypicalSceneInfo \u4fe1\u606f\u5217\u8868<br>
	 * C type : PU_TYPICAL_SCENE_INFO_S*<br>
	 * @param szReserved C type : CHAR[32]
	 */
	public PU_TYPICAL_SCENE_LIST_EX_OUT(NativeLong ulChannelId, NativeLong ulTypicalScenesNum, int enSceneMode, PU_TYPICAL_SCENE_INFO.ByReference pstTypicalSceneInfo, byte szReserved[]) {
		super();
		this.ulChannelId = ulChannelId;
		this.ulTypicalScenesNum = ulTypicalScenesNum;
		this.enSceneMode = enSceneMode;
		this.pstTypicalSceneInfo = pstTypicalSceneInfo;
		if ((szReserved.length != this.szReserved.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserved = szReserved;
	}
	public PU_TYPICAL_SCENE_LIST_EX_OUT(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_TYPICAL_SCENE_LIST_EX_OUT implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_TYPICAL_SCENE_LIST_EX_OUT implements Structure.ByValue {
		
	};
}