package tunnel.sdk.struct.imos;
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
public class TagArrayStatusInfo extends Structure {
	/** C type : int */
	public int ulArrayStatus;
	/** C type : int */
	public int ulArrayTotleSize;
	/** C type : int */
	public int ulArrayUsedSize;
	/** C type : int */
	public int bisVirtualized;
	/** C type : ARRAY_INFO_S */
	public TagArrayInfo stArrayInfo;
	/** C type : int */
	public int ulRebuildProgress;
	public TagArrayStatusInfo() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ulArrayStatus", "ulArrayTotleSize", "ulArrayUsedSize", "bisVirtualized", "stArrayInfo", "ulRebuildProgress");
	}
	/**
	 * @param ulArrayStatus C type : int<br>
	 * @param ulArrayTotleSize C type : int<br>
	 * @param ulArrayUsedSize C type : int<br>
	 * @param bisVirtualized C type : int<br>
	 * @param stArrayInfo C type : ARRAY_INFO_S<br>
	 * @param ulRebuildProgress C type : int
	 */
	public TagArrayStatusInfo(int ulArrayStatus, int ulArrayTotleSize, int ulArrayUsedSize, int bisVirtualized, TagArrayInfo stArrayInfo, int ulRebuildProgress) {
		super();
		this.ulArrayStatus = ulArrayStatus;
		this.ulArrayTotleSize = ulArrayTotleSize;
		this.ulArrayUsedSize = ulArrayUsedSize;
		this.bisVirtualized = bisVirtualized;
		this.stArrayInfo = stArrayInfo;
		this.ulRebuildProgress = ulRebuildProgress;
	}
	public TagArrayStatusInfo(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends TagArrayStatusInfo implements Structure.ByReference {
		
	};
	public static class ByValue extends TagArrayStatusInfo implements Structure.ByValue {
		
	};
}
