/*
 * This class file was automatically generated by ASN1bean (http://www.beanit.com)
 */

package com.beanit.asn1bean.compiler.pedefinitions;

import java.io.IOException;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.io.Serializable;
import com.beanit.asn1bean.ber.*;
import com.beanit.asn1bean.ber.types.*;
import com.beanit.asn1bean.ber.types.string.*;


public class ServicesList implements BerType, Serializable {

	private static final long serialVersionUID = 1L;

	public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);

	private byte[] code = null;
	public BerNull contactless = null;
	public BerNull usim = null;
	public BerNull isim = null;
	public BerNull csim = null;
	public BerNull milenage = null;
	public BerNull tuak128 = null;
	public BerNull cave = null;
	public BerNull gbaUsim = null;
	public BerNull gbaIsim = null;
	public BerNull mbms = null;
	public BerNull eap = null;
	public BerNull javacard = null;
	public BerNull multos = null;
	public BerNull multipleUsim = null;
	public BerNull multipleIsim = null;
	public BerNull multipleCsim = null;
	public BerNull tuak256 = null;
	public BerNull usimTestAlgorithm = null;
	public BerNull berTlv = null;
	public BerNull dfLink = null;
	public BerNull catTp = null;
	public BerNull getIdentity = null;
	public BerNull profileAX25519 = null;
	public BerNull profileBP256 = null;
	
	public ServicesList() {
	}

	public ServicesList(byte[] code) {
		this.code = code;
	}

	public ServicesList(BerNull contactless, BerNull usim, BerNull isim, BerNull csim, BerNull milenage, BerNull tuak128, BerNull cave, BerNull gbaUsim, BerNull gbaIsim, BerNull mbms, BerNull eap, BerNull javacard, BerNull multos, BerNull multipleUsim, BerNull multipleIsim, BerNull multipleCsim, BerNull tuak256, BerNull usimTestAlgorithm, BerNull berTlv, BerNull dfLink, BerNull catTp, BerNull getIdentity, BerNull profileAX25519, BerNull profileBP256) {
		this.contactless = contactless;
		this.usim = usim;
		this.isim = isim;
		this.csim = csim;
		this.milenage = milenage;
		this.tuak128 = tuak128;
		this.cave = cave;
		this.gbaUsim = gbaUsim;
		this.gbaIsim = gbaIsim;
		this.mbms = mbms;
		this.eap = eap;
		this.javacard = javacard;
		this.multos = multos;
		this.multipleUsim = multipleUsim;
		this.multipleIsim = multipleIsim;
		this.multipleCsim = multipleCsim;
		this.tuak256 = tuak256;
		this.usimTestAlgorithm = usimTestAlgorithm;
		this.berTlv = berTlv;
		this.dfLink = dfLink;
		this.catTp = catTp;
		this.getIdentity = getIdentity;
		this.profileAX25519 = profileAX25519;
		this.profileBP256 = profileBP256;
	}

	@Override public int encode(OutputStream reverseOS) throws IOException {
		return encode(reverseOS, true);
	}

	public int encode(OutputStream reverseOS, boolean withTag) throws IOException {

		if (code != null) {
			reverseOS.write(code);
			if (withTag) {
				return tag.encode(reverseOS) + code.length;
			}
			return code.length;
		}

		int codeLength = 0;
		if (profileBP256 != null) {
			codeLength += profileBP256.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 23
			reverseOS.write(0x97);
			codeLength += 1;
		}
		
		if (profileAX25519 != null) {
			codeLength += profileAX25519.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 22
			reverseOS.write(0x96);
			codeLength += 1;
		}
		
		if (getIdentity != null) {
			codeLength += getIdentity.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 21
			reverseOS.write(0x95);
			codeLength += 1;
		}
		
		if (catTp != null) {
			codeLength += catTp.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 20
			reverseOS.write(0x94);
			codeLength += 1;
		}
		
		if (dfLink != null) {
			codeLength += dfLink.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 19
			reverseOS.write(0x93);
			codeLength += 1;
		}
		
		if (berTlv != null) {
			codeLength += berTlv.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 18
			reverseOS.write(0x92);
			codeLength += 1;
		}
		
		if (usimTestAlgorithm != null) {
			codeLength += usimTestAlgorithm.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 17
			reverseOS.write(0x91);
			codeLength += 1;
		}
		
		if (tuak256 != null) {
			codeLength += tuak256.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 16
			reverseOS.write(0x90);
			codeLength += 1;
		}
		
		if (multipleCsim != null) {
			codeLength += multipleCsim.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 15
			reverseOS.write(0x8F);
			codeLength += 1;
		}
		
		if (multipleIsim != null) {
			codeLength += multipleIsim.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 14
			reverseOS.write(0x8E);
			codeLength += 1;
		}
		
		if (multipleUsim != null) {
			codeLength += multipleUsim.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 13
			reverseOS.write(0x8D);
			codeLength += 1;
		}
		
		if (multos != null) {
			codeLength += multos.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 12
			reverseOS.write(0x8C);
			codeLength += 1;
		}
		
		if (javacard != null) {
			codeLength += javacard.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 11
			reverseOS.write(0x8B);
			codeLength += 1;
		}
		
		if (eap != null) {
			codeLength += eap.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 10
			reverseOS.write(0x8A);
			codeLength += 1;
		}
		
		if (mbms != null) {
			codeLength += mbms.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 9
			reverseOS.write(0x89);
			codeLength += 1;
		}
		
		if (gbaIsim != null) {
			codeLength += gbaIsim.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 8
			reverseOS.write(0x88);
			codeLength += 1;
		}
		
		if (gbaUsim != null) {
			codeLength += gbaUsim.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 7
			reverseOS.write(0x87);
			codeLength += 1;
		}
		
		if (cave != null) {
			codeLength += cave.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 6
			reverseOS.write(0x86);
			codeLength += 1;
		}
		
		if (tuak128 != null) {
			codeLength += tuak128.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 5
			reverseOS.write(0x85);
			codeLength += 1;
		}
		
		if (milenage != null) {
			codeLength += milenage.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 4
			reverseOS.write(0x84);
			codeLength += 1;
		}
		
		if (csim != null) {
			codeLength += csim.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 3
			reverseOS.write(0x83);
			codeLength += 1;
		}
		
		if (isim != null) {
			codeLength += isim.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 2
			reverseOS.write(0x82);
			codeLength += 1;
		}
		
		if (usim != null) {
			codeLength += usim.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 1
			reverseOS.write(0x81);
			codeLength += 1;
		}
		
		if (contactless != null) {
			codeLength += contactless.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 0
			reverseOS.write(0x80);
			codeLength += 1;
		}
		
		codeLength += BerLength.encodeLength(reverseOS, codeLength);

		if (withTag) {
			codeLength += tag.encode(reverseOS);
		}

		return codeLength;

	}

	@Override public int decode(InputStream is) throws IOException {
		return decode(is, true);
	}

	public int decode(InputStream is, boolean withTag) throws IOException {
		int tlByteCount = 0;
		int vByteCount = 0;
		BerTag berTag = new BerTag();

		if (withTag) {
			tlByteCount += tag.decodeAndCheck(is);
		}

		BerLength length = new BerLength();
		tlByteCount += length.decode(is);
		int lengthVal = length.val;
		if (lengthVal == 0) {
			return tlByteCount;
		}
		vByteCount += berTag.decode(is);

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 0)) {
			contactless = new BerNull();
			vByteCount += contactless.decode(is, false);
			if (lengthVal >= 0 && vByteCount == lengthVal) {
				return tlByteCount + vByteCount;
			}
			vByteCount += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 1)) {
			usim = new BerNull();
			vByteCount += usim.decode(is, false);
			if (lengthVal >= 0 && vByteCount == lengthVal) {
				return tlByteCount + vByteCount;
			}
			vByteCount += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 2)) {
			isim = new BerNull();
			vByteCount += isim.decode(is, false);
			if (lengthVal >= 0 && vByteCount == lengthVal) {
				return tlByteCount + vByteCount;
			}
			vByteCount += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 3)) {
			csim = new BerNull();
			vByteCount += csim.decode(is, false);
			if (lengthVal >= 0 && vByteCount == lengthVal) {
				return tlByteCount + vByteCount;
			}
			vByteCount += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 4)) {
			milenage = new BerNull();
			vByteCount += milenage.decode(is, false);
			if (lengthVal >= 0 && vByteCount == lengthVal) {
				return tlByteCount + vByteCount;
			}
			vByteCount += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 5)) {
			tuak128 = new BerNull();
			vByteCount += tuak128.decode(is, false);
			if (lengthVal >= 0 && vByteCount == lengthVal) {
				return tlByteCount + vByteCount;
			}
			vByteCount += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 6)) {
			cave = new BerNull();
			vByteCount += cave.decode(is, false);
			if (lengthVal >= 0 && vByteCount == lengthVal) {
				return tlByteCount + vByteCount;
			}
			vByteCount += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 7)) {
			gbaUsim = new BerNull();
			vByteCount += gbaUsim.decode(is, false);
			if (lengthVal >= 0 && vByteCount == lengthVal) {
				return tlByteCount + vByteCount;
			}
			vByteCount += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 8)) {
			gbaIsim = new BerNull();
			vByteCount += gbaIsim.decode(is, false);
			if (lengthVal >= 0 && vByteCount == lengthVal) {
				return tlByteCount + vByteCount;
			}
			vByteCount += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 9)) {
			mbms = new BerNull();
			vByteCount += mbms.decode(is, false);
			if (lengthVal >= 0 && vByteCount == lengthVal) {
				return tlByteCount + vByteCount;
			}
			vByteCount += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 10)) {
			eap = new BerNull();
			vByteCount += eap.decode(is, false);
			if (lengthVal >= 0 && vByteCount == lengthVal) {
				return tlByteCount + vByteCount;
			}
			vByteCount += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 11)) {
			javacard = new BerNull();
			vByteCount += javacard.decode(is, false);
			if (lengthVal >= 0 && vByteCount == lengthVal) {
				return tlByteCount + vByteCount;
			}
			vByteCount += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 12)) {
			multos = new BerNull();
			vByteCount += multos.decode(is, false);
			if (lengthVal >= 0 && vByteCount == lengthVal) {
				return tlByteCount + vByteCount;
			}
			vByteCount += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 13)) {
			multipleUsim = new BerNull();
			vByteCount += multipleUsim.decode(is, false);
			if (lengthVal >= 0 && vByteCount == lengthVal) {
				return tlByteCount + vByteCount;
			}
			vByteCount += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 14)) {
			multipleIsim = new BerNull();
			vByteCount += multipleIsim.decode(is, false);
			if (lengthVal >= 0 && vByteCount == lengthVal) {
				return tlByteCount + vByteCount;
			}
			vByteCount += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 15)) {
			multipleCsim = new BerNull();
			vByteCount += multipleCsim.decode(is, false);
			if (lengthVal >= 0 && vByteCount == lengthVal) {
				return tlByteCount + vByteCount;
			}
			vByteCount += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 16)) {
			tuak256 = new BerNull();
			vByteCount += tuak256.decode(is, false);
			if (lengthVal >= 0 && vByteCount == lengthVal) {
				return tlByteCount + vByteCount;
			}
			vByteCount += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 17)) {
			usimTestAlgorithm = new BerNull();
			vByteCount += usimTestAlgorithm.decode(is, false);
			if (lengthVal >= 0 && vByteCount == lengthVal) {
				return tlByteCount + vByteCount;
			}
			vByteCount += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 18)) {
			berTlv = new BerNull();
			vByteCount += berTlv.decode(is, false);
			if (lengthVal >= 0 && vByteCount == lengthVal) {
				return tlByteCount + vByteCount;
			}
			vByteCount += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 19)) {
			dfLink = new BerNull();
			vByteCount += dfLink.decode(is, false);
			if (lengthVal >= 0 && vByteCount == lengthVal) {
				return tlByteCount + vByteCount;
			}
			vByteCount += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 20)) {
			catTp = new BerNull();
			vByteCount += catTp.decode(is, false);
			if (lengthVal >= 0 && vByteCount == lengthVal) {
				return tlByteCount + vByteCount;
			}
			vByteCount += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 21)) {
			getIdentity = new BerNull();
			vByteCount += getIdentity.decode(is, false);
			if (lengthVal >= 0 && vByteCount == lengthVal) {
				return tlByteCount + vByteCount;
			}
			vByteCount += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 22)) {
			profileAX25519 = new BerNull();
			vByteCount += profileAX25519.decode(is, false);
			if (lengthVal >= 0 && vByteCount == lengthVal) {
				return tlByteCount + vByteCount;
			}
			vByteCount += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 23)) {
			profileBP256 = new BerNull();
			vByteCount += profileBP256.decode(is, false);
			if (lengthVal >= 0 && vByteCount == lengthVal) {
				return tlByteCount + vByteCount;
			}
			vByteCount += berTag.decode(is);
		}
		
		if (lengthVal < 0) {
			if (!berTag.equals(0, 0, 0)) {
				throw new IOException("Decoded sequence has wrong end of contents octets");
			}
			vByteCount += BerLength.readEocByte(is);
			return tlByteCount + vByteCount;
		}

		throw new IOException("Unexpected end of sequence, length tag: " + lengthVal + ", bytes decoded: " + vByteCount);

	}

	public void encodeAndSave(int encodingSizeGuess) throws IOException {
		ReverseByteArrayOutputStream reverseOS = new ReverseByteArrayOutputStream(encodingSizeGuess);
		encode(reverseOS, false);
		code = reverseOS.getArray();
	}

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		appendAsString(sb, 0);
		return sb.toString();
	}

	public void appendAsString(StringBuilder sb, int indentLevel) {

		sb.append("{");
		boolean firstSelectedElement = true;
		if (contactless != null) {
			sb.append("\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("contactless: ").append(contactless);
			firstSelectedElement = false;
		}
		
		if (usim != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("usim: ").append(usim);
			firstSelectedElement = false;
		}
		
		if (isim != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("isim: ").append(isim);
			firstSelectedElement = false;
		}
		
		if (csim != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("csim: ").append(csim);
			firstSelectedElement = false;
		}
		
		if (milenage != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("milenage: ").append(milenage);
			firstSelectedElement = false;
		}
		
		if (tuak128 != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("tuak128: ").append(tuak128);
			firstSelectedElement = false;
		}
		
		if (cave != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("cave: ").append(cave);
			firstSelectedElement = false;
		}
		
		if (gbaUsim != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("gbaUsim: ").append(gbaUsim);
			firstSelectedElement = false;
		}
		
		if (gbaIsim != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("gbaIsim: ").append(gbaIsim);
			firstSelectedElement = false;
		}
		
		if (mbms != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("mbms: ").append(mbms);
			firstSelectedElement = false;
		}
		
		if (eap != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("eap: ").append(eap);
			firstSelectedElement = false;
		}
		
		if (javacard != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("javacard: ").append(javacard);
			firstSelectedElement = false;
		}
		
		if (multos != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("multos: ").append(multos);
			firstSelectedElement = false;
		}
		
		if (multipleUsim != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("multipleUsim: ").append(multipleUsim);
			firstSelectedElement = false;
		}
		
		if (multipleIsim != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("multipleIsim: ").append(multipleIsim);
			firstSelectedElement = false;
		}
		
		if (multipleCsim != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("multipleCsim: ").append(multipleCsim);
			firstSelectedElement = false;
		}
		
		if (tuak256 != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("tuak256: ").append(tuak256);
			firstSelectedElement = false;
		}
		
		if (usimTestAlgorithm != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("usimTestAlgorithm: ").append(usimTestAlgorithm);
			firstSelectedElement = false;
		}
		
		if (berTlv != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("berTlv: ").append(berTlv);
			firstSelectedElement = false;
		}
		
		if (dfLink != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("dfLink: ").append(dfLink);
			firstSelectedElement = false;
		}
		
		if (catTp != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("catTp: ").append(catTp);
			firstSelectedElement = false;
		}
		
		if (getIdentity != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("getIdentity: ").append(getIdentity);
			firstSelectedElement = false;
		}
		
		if (profileAX25519 != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("profileAX25519: ").append(profileAX25519);
			firstSelectedElement = false;
		}
		
		if (profileBP256 != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("profileBP256: ").append(profileBP256);
		}
		
		sb.append("\n");
		for (int i = 0; i < indentLevel; i++) {
			sb.append("\t");
		}
		sb.append("}");
	}

}

