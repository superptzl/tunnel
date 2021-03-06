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
public class PU_EVENT_UPLOAD_IMAGE_COMP_NOTIFY extends Structure {
	/**
	 * \u901a\u7528\u4e8b\u4ef6<br>
	 * C type : PU_EVENT_COMMON_S
	 */
	public PU_EVENT_COMMON stPuEventCommon;
	/** \u4e0a\u4f20\u5b8c\u6210\u901a\u77e5\u4f1a\u8bddID,\u7528\u4e8e\u524d\u7aef\u6807\u8bc6\u4e00\u6b21\u552f\u4e00\u7684\u4f1a\u8bdd */
	public NativeLong ulSessionId;
	/**
	 * \u56fe\u7247\u540d<br>
	 * C type : CHAR[24]
	 */
	public byte[] szContentID = new byte[24];
	/** \u56fe\u7247\u5927\u5c0f */
	public NativeLong ulContentSize;
	/**
	 * \u6293\u62cd\u65f6\u95f4 \u683c\u5f0f\uff1a"2009-07-14 15:41:14"<br>
	 * C type : CHAR[32]
	 */
	public byte[] szSnapTime = new byte[32];
	/** C type : PU_SNAPSHOT_TYPE_E */
	public int enSnapshotType;
	/** C type : CHAR[32] */
	public byte[] szReserved = new byte[32];
	public PU_EVENT_UPLOAD_IMAGE_COMP_NOTIFY() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("stPuEventCommon", "ulSessionId", "szContentID", "ulContentSize", "szSnapTime", "enSnapshotType", "szReserved");
	}
	/**
	 * @param stPuEventCommon \u901a\u7528\u4e8b\u4ef6<br>
	 * C type : PU_EVENT_COMMON_S<br>
	 * @param ulSessionId \u4e0a\u4f20\u5b8c\u6210\u901a\u77e5\u4f1a\u8bddID,\u7528\u4e8e\u524d\u7aef\u6807\u8bc6\u4e00\u6b21\u552f\u4e00\u7684\u4f1a\u8bdd<br>
	 * @param szContentID \u56fe\u7247\u540d<br>
	 * C type : CHAR[24]<br>
	 * @param ulContentSize \u56fe\u7247\u5927\u5c0f<br>
	 * @param szSnapTime \u6293\u62cd\u65f6\u95f4 \u683c\u5f0f\uff1a"2009-07-14 15:41:14"<br>
	 * C type : CHAR[32]<br>
	 * @param enSnapshotType C type : PU_SNAPSHOT_TYPE_E<br>
	 * @param szReserved C type : CHAR[32]
	 */
	public PU_EVENT_UPLOAD_IMAGE_COMP_NOTIFY(PU_EVENT_COMMON stPuEventCommon, NativeLong ulSessionId, byte szContentID[], NativeLong ulContentSize, byte szSnapTime[], int enSnapshotType, byte szReserved[]) {
		super();
		this.stPuEventCommon = stPuEventCommon;
		this.ulSessionId = ulSessionId;
		if ((szContentID.length != this.szContentID.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szContentID = szContentID;
		this.ulContentSize = ulContentSize;
		if ((szSnapTime.length != this.szSnapTime.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szSnapTime = szSnapTime;
		this.enSnapshotType = enSnapshotType;
		if ((szReserved.length != this.szReserved.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserved = szReserved;
	}
	public PU_EVENT_UPLOAD_IMAGE_COMP_NOTIFY(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_EVENT_UPLOAD_IMAGE_COMP_NOTIFY implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_EVENT_UPLOAD_IMAGE_COMP_NOTIFY implements Structure.ByValue {
		
	};
}
