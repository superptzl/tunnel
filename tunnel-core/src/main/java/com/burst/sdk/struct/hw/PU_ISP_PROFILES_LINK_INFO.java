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
public class PU_ISP_PROFILES_LINK_INFO extends Structure {
	public NativeLong ulChannelID;
	/** \u662f\u5426\u5f00\u542f\u65e5\u591c\u8054\u52a8ISP\u5957\u9910 */
	public boolean bEnable;
	/**
	 * \u8054\u52a8\u5217\u8868<br>
	 * C type : PU_ISP_PROFILES_LINK_MODE_S[3]
	 */
	public PU_ISP_PROFILES_LINK_MODE[] szLinkMode = new PU_ISP_PROFILES_LINK_MODE[3];
	/**
	 * \u9884\u7559\u5b57\u6bb5<br>
	 * C type : CHAR[32]
	 */
	public byte[] szReserved = new byte[32];
	public PU_ISP_PROFILES_LINK_INFO() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ulChannelID", "bEnable", "szLinkMode", "szReserved");
	}
	/**
	 * @param bEnable \u662f\u5426\u5f00\u542f\u65e5\u591c\u8054\u52a8ISP\u5957\u9910<br>
	 * @param szLinkMode \u8054\u52a8\u5217\u8868<br>
	 * C type : PU_ISP_PROFILES_LINK_MODE_S[3]<br>
	 * @param szReserved \u9884\u7559\u5b57\u6bb5<br>
	 * C type : CHAR[32]
	 */
	public PU_ISP_PROFILES_LINK_INFO(NativeLong ulChannelID, boolean bEnable, PU_ISP_PROFILES_LINK_MODE szLinkMode[], byte szReserved[]) {
		super();
		this.ulChannelID = ulChannelID;
		this.bEnable = bEnable;
		if ((szLinkMode.length != this.szLinkMode.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szLinkMode = szLinkMode;
		if ((szReserved.length != this.szReserved.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserved = szReserved;
	}
	public PU_ISP_PROFILES_LINK_INFO(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_ISP_PROFILES_LINK_INFO implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_ISP_PROFILES_LINK_INFO implements Structure.ByValue {
		
	};
}