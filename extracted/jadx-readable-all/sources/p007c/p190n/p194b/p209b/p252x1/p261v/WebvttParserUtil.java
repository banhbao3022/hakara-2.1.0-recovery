package p007c.p190n.p194b.p209b.p252x1.p261v;

import java.util.regex.Pattern;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.ParserException;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p212b2.Util6;

/* JADX INFO: renamed from: c.n.b.b.x1.v.j, reason: use source file name */
/* JADX INFO: compiled from: WebvttParserUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class WebvttParserUtil {

    /* JADX INFO: renamed from: a */
    public static final Pattern f10174a = Pattern.compile("^NOTE([ \t].*)?$");

    /* JADX INFO: renamed from: a */
    public static boolean m4491a(ParsableByteArray parsableByteArray) {
        String strM3202g = parsableByteArray.m3202g();
        return strM3202g != null && strM3202g.startsWith("WEBVTT");
    }

    /* JADX INFO: renamed from: b */
    public static float m4492b(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    /* JADX INFO: renamed from: c */
    public static long m4493c(String str) throws NumberFormatException {
        int i = Util6.f6307a;
        String[] strArrSplit = str.split("\\.", 2);
        long j2 = 0;
        for (String str2 : Util6.m3106O(strArrSplit[0], ":")) {
            j2 = (j2 * 60) + Long.parseLong(str2);
        }
        long j3 = j2 * 1000;
        if (strArrSplit.length == 2) {
            j3 += Long.parseLong(strArrSplit[1]);
        }
        return j3 * 1000;
    }

    /* JADX INFO: renamed from: d */
    public static void m4494d(ParsableByteArray parsableByteArray) throws ParserException {
        int i = parsableByteArray.f6393b;
        if (m4491a(parsableByteArray)) {
            return;
        }
        parsableByteArray.m3194D(i);
        StringBuilder sbM1556G = outline.m1556G("Expected WEBVTT. Got ");
        sbM1556G.append(parsableByteArray.m3202g());
        throw new ParserException(sbM1556G.toString());
    }
}
