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
public class PU_OSDI_AREA_CFG_PARA_V20 extends Structure {
	/** \u533a\u57df\u7d22\u5f15 */
	public NativeLong ulIndex;
	/** \u4f7f\u80fd */
	public boolean bEnable;
	/** OSDI\u540d\u79f0\u957f\u5ea6 */
	public NativeLong ulOSDINameLen;
	/**
	 * OSDI\u540d\u79f0\u5185\u5bb9<br>
	 * C type : CHAR[(96 + 4)]
	 */
	public byte[] szOSDIName = new byte[96 + 4];
	/**
	 * \u5de6\u4e0b\u5750\u6807<br>
	 * C type : PU_OSDI_POINT_INFO_S
	 */
	public PU_OSDI_POINT_INFO stLowerLeftPoint;
	/**
	 * \u53f3\u4e0b\u5750\u6807<br>
	 * C type : PU_OSDI_POINT_INFO_S
	 */
	public PU_OSDI_POINT_INFO stUpperRightPoint;
	/**
	 * OSDI\u5de6\u4e0a\u89d2\u5750\u6807<br>
	 * C type : PU_POINT_S
	 */
	public PU_POINT stOSDITopLeftPos;
	public PU_OSDI_AREA_CFG_PARA_V20() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ulIndex", "bEnable", "ulOSDINameLen", "szOSDIName", "stLowerLeftPoint", "stUpperRightPoint", "stOSDITopLeftPos");
	}
	/**
	 * @param ulIndex \u533a\u57df\u7d22\u5f15<br>
	 * @param bEnable \u4f7f\u80fd<br>
	 * @param ulOSDINameLen OSDI\u540d\u79f0\u957f\u5ea6<br>
	 * @param szOSDIName OSDI\u540d\u79f0\u5185\u5bb9<br>
	 * C type : CHAR[(96 + 4)]<br>
	 * @param stLowerLeftPoint \u5de6\u4e0b\u5750\u6807<br>
	 * C type : PU_OSDI_POINT_INFO_S<br>
	 * @param stUpperRightPoint \u53f3\u4e0b\u5750\u6807<br>
	 * C type : PU_OSDI_POINT_INFO_S<br>
	 * @param stOSDITopLeftPos OSDI\u5de6\u4e0a\u89d2\u5750\u6807<br>
	 * C type : PU_POINT_S
	 */
	public PU_OSDI_AREA_CFG_PARA_V20(NativeLong ulIndex, boolean bEnable, NativeLong ulOSDINameLen, byte szOSDIName[], PU_OSDI_POINT_INFO stLowerLeftPoint, PU_OSDI_POINT_INFO stUpperRightPoint, PU_POINT stOSDITopLeftPos) {
		super();
		this.ulIndex = ulIndex;
		this.bEnable = bEnable;
		this.ulOSDINameLen = ulOSDINameLen;
		if ((szOSDIName.length != this.szOSDIName.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szOSDIName = szOSDIName;
		this.stLowerLeftPoint = stLowerLeftPoint;
		this.stUpperRightPoint = stUpperRightPoint;
		this.stOSDITopLeftPos = stOSDITopLeftPos;
	}
	public PU_OSDI_AREA_CFG_PARA_V20(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_OSDI_AREA_CFG_PARA_V20 implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_OSDI_AREA_CFG_PARA_V20 implements Structure.ByValue {
		
	};
}
