package p007c.p190n.p438f.p441j;

import com.facebook.stetho.common.Utf8Charset;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: c.n.f.j.c, reason: use source file name */
/* JADX INFO: compiled from: CharacterSetECI.java */
/* JADX INFO: loaded from: classes.dex */
public enum CharacterSetECI {
    Cp437(new int[]{0, 2}, new String[0]),
    ISO8859_1(new int[]{1, 3}, "ISO-8859-1"),
    ISO8859_2(4, "ISO-8859-2"),
    ISO8859_3(5, "ISO-8859-3"),
    ISO8859_4(6, "ISO-8859-4"),
    ISO8859_5(7, "ISO-8859-5"),
    ISO8859_6(8, "ISO-8859-6"),
    ISO8859_7(9, "ISO-8859-7"),
    ISO8859_8(10, "ISO-8859-8"),
    ISO8859_9(11, "ISO-8859-9"),
    ISO8859_10(12, "ISO-8859-10"),
    ISO8859_11(13, "ISO-8859-11"),
    ISO8859_13(15, "ISO-8859-13"),
    ISO8859_14(16, "ISO-8859-14"),
    ISO8859_15(17, "ISO-8859-15"),
    ISO8859_16(18, "ISO-8859-16"),
    SJIS(20, "Shift_JIS"),
    Cp1250(21, "windows-1250"),
    Cp1251(22, "windows-1251"),
    Cp1252(23, "windows-1252"),
    Cp1256(24, "windows-1256"),
    UnicodeBigUnmarked(25, "UTF-16BE", "UnicodeBig"),
    UTF8(26, Utf8Charset.NAME),
    ASCII(new int[]{27, 170}, "US-ASCII"),
    Big5(28),
    GB18030(29, "GB2312", "EUC_CN", "GBK"),
    EUC_KR(30, "EUC-KR");


    /* JADX INFO: renamed from: G */
    public static final Map<Integer, CharacterSetECI> f27653G = new HashMap();

    /* JADX INFO: renamed from: H */
    public static final Map<String, CharacterSetECI> f27654H = new HashMap();

    /* JADX INFO: renamed from: J */
    public final int[] f27677J;

    /* JADX INFO: renamed from: K */
    public final String[] f27678K;

    static {
        CharacterSetECI[] characterSetECIArrValues = values();
        for (int i = 0; i < 27; i++) {
            CharacterSetECI characterSetECI = characterSetECIArrValues[i];
            for (int i2 : characterSetECI.f27677J) {
                f27653G.put(Integer.valueOf(i2), characterSetECI);
            }
            f27654H.put(characterSetECI.name(), characterSetECI);
            for (String str : characterSetECI.f27678K) {
                f27654H.put(str, characterSetECI);
            }
        }
    }

    CharacterSetECI(int i, String... strArr) {
        this.f27677J = new int[]{i};
        this.f27678K = strArr;
    }

    CharacterSetECI(int i) {
        this.f27677J = new int[]{i};
        this.f27678K = new String[0];
    }

    CharacterSetECI(int[] iArr, String... strArr) {
        this.f27677J = iArr;
        this.f27678K = strArr;
    }
}
