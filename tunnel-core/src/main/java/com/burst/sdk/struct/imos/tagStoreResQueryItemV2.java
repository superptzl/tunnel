package com.burst.sdk.struct.imos;
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
public class tagStoreResQueryItemV2 extends Structure {
	/** C type : STORE_RES_QUERY_ITEM_S */
	public tagStoreResQueryItem stStoreResQryItem;
	/** C type : STORE_RES_EXT_INFO_S */
	public tagStoreResQueryItem stStoreResExtInfo;
	public tagStoreResQueryItemV2() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("stStoreResQryItem", "stStoreResExtInfo");
	}
	/**
	 * @param stStoreResQryItem C type : STORE_RES_QUERY_ITEM_S<br>
	 * @param stStoreResExtInfo C type : STORE_RES_EXT_INFO_S
	 */
	public tagStoreResQueryItemV2(tagStoreResQueryItem stStoreResQryItem, tagStoreResQueryItem stStoreResExtInfo) {
		super();
		this.stStoreResQryItem = stStoreResQryItem;
		this.stStoreResExtInfo = stStoreResExtInfo;
	}
	public tagStoreResQueryItemV2(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends tagStoreResQueryItemV2 implements Structure.ByReference {
		
	};
	public static class ByValue extends tagStoreResQueryItemV2 implements Structure.ByValue {
		
	};
}