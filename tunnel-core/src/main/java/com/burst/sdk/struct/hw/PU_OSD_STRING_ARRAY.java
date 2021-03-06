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
public class PU_OSD_STRING_ARRAY extends Structure {
	/** \u901a\u9053ID */
	public NativeLong ulChannelID;
	/**
	 * OSD\u65f6\u95f4\u53c2\u6570<br>
	 * C type : PU_OSD_DATETIME_PARA_S
	 */
	public PU_OSD_DATETIME_PARA stOsdDateTimePara;
	/** \u6709\u6548\u7684\u5b57\u7b26\u4e32\u4e2a\u6570 */
	public NativeLong ulOSDStringNum;
	/**
	 * OSD\u5b57\u7b26\u4e32\u53c2\u6570<br>
	 * C type : PU_OSD_STRING_PARA_S[7]
	 */
	public PU_OSD_STRING_PARA[] szStringPara = new PU_OSD_STRING_PARA[7];
	public PU_OSD_STRING_ARRAY() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ulChannelID", "stOsdDateTimePara", "ulOSDStringNum", "szStringPara");
	}
	/**
	 * @param ulChannelID \u901a\u9053ID<br>
	 * @param stOsdDateTimePara OSD\u65f6\u95f4\u53c2\u6570<br>
	 * C type : PU_OSD_DATETIME_PARA_S<br>
	 * @param ulOSDStringNum \u6709\u6548\u7684\u5b57\u7b26\u4e32\u4e2a\u6570<br>
	 * @param szStringPara OSD\u5b57\u7b26\u4e32\u53c2\u6570<br>
	 * C type : PU_OSD_STRING_PARA_S[7]
	 */
	public PU_OSD_STRING_ARRAY(NativeLong ulChannelID, PU_OSD_DATETIME_PARA stOsdDateTimePara, NativeLong ulOSDStringNum, PU_OSD_STRING_PARA szStringPara[]) {
		super();
		this.ulChannelID = ulChannelID;
		this.stOsdDateTimePara = stOsdDateTimePara;
		this.ulOSDStringNum = ulOSDStringNum;
		if ((szStringPara.length != this.szStringPara.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szStringPara = szStringPara;
	}
	public PU_OSD_STRING_ARRAY(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_OSD_STRING_ARRAY implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_OSD_STRING_ARRAY implements Structure.ByValue {
		
	};
}
