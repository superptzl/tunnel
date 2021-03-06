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
public class PU_STREAM_ABILITY_PARA extends Structure {
	/**
	 * \u89c6\u9891\u6d41\u7c7b\u578b<br>
	 * C type : PU_STREAM_TYPE_E
	 */
	public int enStreamType;
	/**
	 * \u89c6\u9891\u7f16\u7801\u683c\u5f0f<br>
	 * C type : PU_ENCODE_TYPE_E[4]
	 */
	public int[] enVideoFormat = new int[4];
	/**
	 * \u6700\u5927\u5206\u8fa8\u7387<br>
	 * C type : PU_RESOLUTION_TYPE_E
	 */
	public int enMaxResolution;
	/** \u6700\u5927\u7801\u7387 */
	public NativeLong ulMaxBitRate;
	/** \u6700\u5927\u5e27\u7387 */
	public NativeLong ulMaxFrmRate;
	/** \u6700\u5927I\u5e27\u95f4\u9694 */
	public NativeLong ulMaxIFrameInterval;
	/**
	 * \u89c6\u9891\u6d41\u7c7b\u578b<br>
	 * C type : PU_VIDEO_TYPE_E
	 */
	public int enVideoType;
	/** C type : CHAR[32] */
	public byte[] szReserved = new byte[32];
	public PU_STREAM_ABILITY_PARA() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("enStreamType", "enVideoFormat", "enMaxResolution", "ulMaxBitRate", "ulMaxFrmRate", "ulMaxIFrameInterval", "enVideoType", "szReserved");
	}
	/**
	 * @param enStreamType \u89c6\u9891\u6d41\u7c7b\u578b<br>
	 * C type : PU_STREAM_TYPE_E<br>
	 * @param enVideoFormat \u89c6\u9891\u7f16\u7801\u683c\u5f0f<br>
	 * C type : PU_ENCODE_TYPE_E[4]<br>
	 * @param enMaxResolution \u6700\u5927\u5206\u8fa8\u7387<br>
	 * C type : PU_RESOLUTION_TYPE_E<br>
	 * @param ulMaxBitRate \u6700\u5927\u7801\u7387<br>
	 * @param ulMaxFrmRate \u6700\u5927\u5e27\u7387<br>
	 * @param ulMaxIFrameInterval \u6700\u5927I\u5e27\u95f4\u9694<br>
	 * @param enVideoType \u89c6\u9891\u6d41\u7c7b\u578b<br>
	 * C type : PU_VIDEO_TYPE_E<br>
	 * @param szReserved C type : CHAR[32]
	 */
	public PU_STREAM_ABILITY_PARA(int enStreamType, int enVideoFormat[], int enMaxResolution, NativeLong ulMaxBitRate, NativeLong ulMaxFrmRate, NativeLong ulMaxIFrameInterval, int enVideoType, byte szReserved[]) {
		super();
		this.enStreamType = enStreamType;
		if ((enVideoFormat.length != this.enVideoFormat.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.enVideoFormat = enVideoFormat;
		this.enMaxResolution = enMaxResolution;
		this.ulMaxBitRate = ulMaxBitRate;
		this.ulMaxFrmRate = ulMaxFrmRate;
		this.ulMaxIFrameInterval = ulMaxIFrameInterval;
		this.enVideoType = enVideoType;
		if ((szReserved.length != this.szReserved.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserved = szReserved;
	}
	public PU_STREAM_ABILITY_PARA(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_STREAM_ABILITY_PARA implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_STREAM_ABILITY_PARA implements Structure.ByValue {
		
	};
}
