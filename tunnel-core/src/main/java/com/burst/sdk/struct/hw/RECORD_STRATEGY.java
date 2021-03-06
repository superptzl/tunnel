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
public class RECORD_STRATEGY extends Structure {
	public NativeLong ulChannelId;
	/** \u5b58\u50a8\u7b56\u7565:0\u5faa\u73af\u8986\u76d6  1\u505c\u6b62\u5f55\u50cf */
	public NativeLong ulStrategy;
	/** \u6700\u5c0f\u9884\u5f55\u65f6\u95f4 */
	public NativeLong ulMinRecordTime;
	/** \u8b66\u524d\u9884\u5f55\u65f6\u95f4 V2R3\u7248\u672c 0:\u4e0d\u9884\u5f55 65535:\u6309\u7167\u5185\u5b58\u80fd\u529b\u6700\u5927\u65f6\u95f4\u9884\u5f55 \u5176\u4f59\u6839\u636e\u8bbe\u5907\u80fd\u529b5-20s\u53ef\u8bbe */
	public NativeLong ulPreAlarmRecordTime;
	/** C type : CHAR[32] */
	public byte[] szReserved = new byte[32];
	public RECORD_STRATEGY() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ulChannelId", "ulStrategy", "ulMinRecordTime", "ulPreAlarmRecordTime", "szReserved");
	}
	/**
	 * @param ulStrategy \u5b58\u50a8\u7b56\u7565:0\u5faa\u73af\u8986\u76d6  1\u505c\u6b62\u5f55\u50cf<br>
	 * @param ulMinRecordTime \u6700\u5c0f\u9884\u5f55\u65f6\u95f4<br>
	 * @param ulPreAlarmRecordTime \u8b66\u524d\u9884\u5f55\u65f6\u95f4 V2R3\u7248\u672c 0:\u4e0d\u9884\u5f55 65535:\u6309\u7167\u5185\u5b58\u80fd\u529b\u6700\u5927\u65f6\u95f4\u9884\u5f55 \u5176\u4f59\u6839\u636e\u8bbe\u5907\u80fd\u529b5-20s\u53ef\u8bbe<br>
	 * @param szReserved C type : CHAR[32]
	 */
	public RECORD_STRATEGY(NativeLong ulChannelId, NativeLong ulStrategy, NativeLong ulMinRecordTime, NativeLong ulPreAlarmRecordTime, byte szReserved[]) {
		super();
		this.ulChannelId = ulChannelId;
		this.ulStrategy = ulStrategy;
		this.ulMinRecordTime = ulMinRecordTime;
		this.ulPreAlarmRecordTime = ulPreAlarmRecordTime;
		if ((szReserved.length != this.szReserved.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserved = szReserved;
	}
	public RECORD_STRATEGY(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends RECORD_STRATEGY implements Structure.ByReference {
		
	};
	public static class ByValue extends RECORD_STRATEGY implements Structure.ByValue {
		
	};
}
