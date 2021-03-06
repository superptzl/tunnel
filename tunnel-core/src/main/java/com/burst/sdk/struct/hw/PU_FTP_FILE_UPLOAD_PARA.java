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
public class PU_FTP_FILE_UPLOAD_PARA extends Structure {
	/** \u662f\u5426\u4e0a\u4f20\u6293\u62cd\u56fe\u7247 */
	public boolean bSnapPic;
	/**
	 * \u4e0a\u4f20\u534f\u8bae<br>
	 * C type : PU_FTP_UPLOAD_PROTOCOL_TYPE_E
	 */
	public int enProtocol;
	/**
	 * \u670d\u52a1\u5668IP\u5730\u5740<br>
	 * C type : CHAR[16]
	 */
	public byte[] szServerIP = new byte[16];
	/** \u670d\u52a1\u5668\u7aef\u53e3 */
	public NativeLong ulServerPort;
	/**
	 * \u7528\u6237\u540d<br>
	 * C type : CHAR[(32 + 4)]
	 */
	public byte[] szUserName = new byte[32 + 4];
	/**
	 * Pwd<br>
	 * C type : CHAR[(64 + 4)]
	 */
	public byte[] szUserPwd = new byte[64 + 4];
	/**
	 * \u4e0a\u4f20\u76ee\u5f55\u7ed3\u6784<br>
	 * C type : PU_FTP_UPLOAD_DIR_TYPE_E
	 */
	public int enDirType;
	/**
	 * \u4e0a\u4f20\u4e00\u7ea7\u76ee\u5f55\u7c7b\u578b<br>
	 * C type : PU_FTP_UPLOAD_FIRST_DIR_TYPE_E
	 */
	public int enFirstDirType;
	/**
	 * \u4e0a\u4f20\u4e8c\u7ea7\u76ee\u5f55\u7c7b\u578b<br>
	 * C type : PU_FTP_UPLOAD_SECOND_DIR_TYPE_E
	 */
	public int enSecondDirType;
	/**
	 * \u4e0a\u4f20\u6587\u4ef6\u547d\u540d\u89c4\u5219<br>
	 * C type : PU_FTP_UPLOAD_FILE_NAMING_RULE_E
	 */
	public int enFileNamingRule;
	/**
	 * \u81ea\u5b9a\u4e49\u4e00\u7ea7\u76ee\u5f55\u540d<br>
	 * C type : CHAR[(128 + 4)]
	 */
	public byte[] szFirstDir = new byte[128 + 4];
	/**
	 * \u81ea\u5b9a\u4e49\u4e8c\u7ea7\u76ee\u5f55\u540d<br>
	 * C type : CHAR[(128 + 4)]
	 */
	public byte[] szSecondDir = new byte[128 + 4];
	/**
	 * \u9884\u7559\u5b57\u6bb5<br>
	 * C type : CHAR[32]
	 */
	public byte[] szReserved = new byte[32];
	public PU_FTP_FILE_UPLOAD_PARA() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("bSnapPic", "enProtocol", "szServerIP", "ulServerPort", "szUserName", "szUserPwd", "enDirType", "enFirstDirType", "enSecondDirType", "enFileNamingRule", "szFirstDir", "szSecondDir", "szReserved");
	}
	public PU_FTP_FILE_UPLOAD_PARA(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_FTP_FILE_UPLOAD_PARA implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_FTP_FILE_UPLOAD_PARA implements Structure.ByValue {
		
	};
}
