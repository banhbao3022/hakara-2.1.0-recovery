package p007c.p190n.p194b.p195a.p196i;

import com.facebook.stetho.common.Utf8Charset;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import p007c.p190n.p194b.p195a.Encoding;
import p007c.p190n.p194b.p195a.p198j.EncodedDestination;

/* JADX INFO: renamed from: c.n.b.a.i.a, reason: use source file name */
/* JADX INFO: compiled from: CCTDestination.java */
/* JADX INFO: loaded from: classes.dex */
public final class CCTDestination implements EncodedDestination {

    /* JADX INFO: renamed from: a */
    public static final String f5520a;

    /* JADX INFO: renamed from: b */
    public static final String f5521b;

    /* JADX INFO: renamed from: c */
    public static final String f5522c;

    /* JADX INFO: renamed from: d */
    public static final Set<Encoding> f5523d;

    /* JADX INFO: renamed from: e */
    public static final CCTDestination f5524e;

    /* JADX INFO: renamed from: f */
    public static final CCTDestination f5525f;

    /* JADX INFO: renamed from: g */
    public final String f5526g;

    /* JADX INFO: renamed from: h */
    public final String f5527h;

    static {
        String strM2758a = StringMerger.m2758a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f5520a = strM2758a;
        String strM2758a2 = StringMerger.m2758a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f5521b = strM2758a2;
        String strM2758a3 = StringMerger.m2758a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f5522c = strM2758a3;
        f5523d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Encoding("proto"), new Encoding("json"))));
        f5524e = new CCTDestination(strM2758a, null);
        f5525f = new CCTDestination(strM2758a2, strM2758a3);
    }

    public CCTDestination(String str, String str2) {
        this.f5526g = str;
        this.f5527h = str2;
    }

    /* JADX INFO: renamed from: a */
    public static CCTDestination m2752a(byte[] bArr) {
        String str = new String(bArr, Charset.forName(Utf8Charset.NAME));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new CCTDestination(str2, str3);
    }

    /* JADX INFO: renamed from: b */
    public byte[] m2753b() {
        String str = this.f5527h;
        if (str == null && this.f5526g == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f5526g;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName(Utf8Charset.NAME));
    }
}
