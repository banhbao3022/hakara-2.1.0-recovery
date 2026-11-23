package p007c.p190n.p194b.p209b.p252x1.p258s;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.p212b2.LongArray;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p252x1.Cue;
import p007c.p190n.p194b.p209b.p252x1.SimpleSubtitleDecoder;
import p007c.p190n.p194b.p209b.p252x1.Subtitle;

/* JADX INFO: renamed from: c.n.b.b.x1.s.a, reason: use source file name */
/* JADX INFO: compiled from: SubripDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class SubripDecoder extends SimpleSubtitleDecoder {

    /* JADX INFO: renamed from: n */
    public static final Pattern f10037n = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* JADX INFO: renamed from: o */
    public static final Pattern f10038o = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: p */
    public final StringBuilder f10039p;

    /* JADX INFO: renamed from: q */
    public final ArrayList<String> f10040q;

    public SubripDecoder() {
        super("SubripDecoder");
        this.f10039p = new StringBuilder();
        this.f10040q = new ArrayList<>();
    }

    /* JADX INFO: renamed from: k */
    public static float m4450k(int i) {
        if (i == 0) {
            return 0.08f;
        }
        if (i == 1) {
            return 0.5f;
        }
        if (i == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: l */
    public static long m4451l(Matcher matcher, int i) {
        String strGroup = matcher.group(i + 1);
        long j2 = strGroup != null ? Long.parseLong(strGroup) * 60 * 60 * 1000 : 0L;
        String strGroup2 = matcher.group(i + 2);
        Objects.requireNonNull(strGroup2);
        long j3 = (Long.parseLong(strGroup2) * 60 * 1000) + j2;
        String strGroup3 = matcher.group(i + 3);
        Objects.requireNonNull(strGroup3);
        long j4 = (Long.parseLong(strGroup3) * 1000) + j3;
        String strGroup4 = matcher.group(i + 4);
        if (strGroup4 != null) {
            j4 += Long.parseLong(strGroup4);
        }
        return j4 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:102:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:104:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:105:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:107:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:108:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:110:0x01be  */
    /* JADX WARN: Code duplicated, block: B:111:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:125:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:38:0x0107  */
    /* JADX WARN: Code duplicated, block: B:40:0x010d  */
    /* JADX WARN: Code duplicated, block: B:41:0x010f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0115  */
    /* JADX WARN: Code duplicated, block: B:44:0x0118  */
    /* JADX WARN: Code duplicated, block: B:46:0x011e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0120  */
    /* JADX WARN: Code duplicated, block: B:49:0x0126  */
    /* JADX WARN: Code duplicated, block: B:50:0x0128  */
    /* JADX WARN: Code duplicated, block: B:52:0x012e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0130  */
    /* JADX WARN: Code duplicated, block: B:55:0x0136  */
    /* JADX WARN: Code duplicated, block: B:56:0x0138  */
    /* JADX WARN: Code duplicated, block: B:58:0x013e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0140  */
    /* JADX WARN: Code duplicated, block: B:61:0x0146  */
    /* JADX WARN: Code duplicated, block: B:62:0x0148  */
    /* JADX WARN: Code duplicated, block: B:64:0x014e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0150  */
    /* JADX WARN: Code duplicated, block: B:80:0x016c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0177  */
    /* JADX WARN: Code duplicated, block: B:86:0x017d  */
    /* JADX WARN: Code duplicated, block: B:87:0x017f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0185  */
    /* JADX WARN: Code duplicated, block: B:90:0x0187  */
    /* JADX WARN: Code duplicated, block: B:92:0x018d  */
    /* JADX WARN: Code duplicated, block: B:93:0x018f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0195  */
    /* JADX WARN: Code duplicated, block: B:96:0x0198  */
    /* JADX WARN: Code duplicated, block: B:98:0x019e  */
    /* JADX WARN: Code duplicated, block: B:99:0x01a0  */
    @Override // p007c.p190n.p194b.p209b.p252x1.SimpleSubtitleDecoder
    /* JADX INFO: renamed from: j */
    public Subtitle mo4394j(byte[] bArr, int i, boolean z) {
        Cue.b bVar;
        byte b;
        byte b2;
        Cue cueM4392a;
        SubripDecoder subripDecoder = this;
        ArrayList arrayList = new ArrayList();
        LongArray longArray = new LongArray();
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr, i);
        while (true) {
            String strM3202g = parsableByteArray.m3202g();
            if (strM3202g != null) {
                if (strM3202g.length() != 0) {
                    try {
                        Integer.parseInt(strM3202g);
                        String strM3202g2 = parsableByteArray.m3202g();
                        if (strM3202g2 == null) {
                            Log.w("SubripDecoder", "Unexpected end");
                        } else {
                            Matcher matcher = f10037n.matcher(strM3202g2);
                            if (matcher.matches()) {
                                longArray.m3157a(m4451l(matcher, 1));
                                longArray.m3157a(m4451l(matcher, 6));
                                subripDecoder.f10039p.setLength(0);
                                subripDecoder.f10040q.clear();
                                for (String strM3202g3 = parsableByteArray.m3202g(); !TextUtils.isEmpty(strM3202g3); strM3202g3 = parsableByteArray.m3202g()) {
                                    if (subripDecoder.f10039p.length() > 0) {
                                        subripDecoder.f10039p.append("<br>");
                                    }
                                    StringBuilder sb = subripDecoder.f10039p;
                                    ArrayList<String> arrayList2 = subripDecoder.f10040q;
                                    String strTrim = strM3202g3.trim();
                                    StringBuilder sb2 = new StringBuilder(strTrim);
                                    Matcher matcher2 = f10038o.matcher(strTrim);
                                    int i2 = 0;
                                    while (matcher2.find()) {
                                        String strGroup = matcher2.group();
                                        arrayList2.add(strGroup);
                                        int iStart = matcher2.start() - i2;
                                        int length = strGroup.length();
                                        sb2.replace(iStart, iStart + length, "");
                                        i2 += length;
                                    }
                                    sb.append(sb2.toString());
                                }
                                Spanned spannedFromHtml = Html.fromHtml(subripDecoder.f10039p.toString());
                                String str = null;
                                for (int i3 = 0; i3 < subripDecoder.f10040q.size(); i3++) {
                                    String str2 = subripDecoder.f10040q.get(i3);
                                    if (str2.matches("\\{\\\\an[1-9]\\}")) {
                                        str = str2;
                                        bVar = new Cue.b();
                                        bVar.f9803a = spannedFromHtml;
                                        if (str == null) {
                                            cueM4392a = bVar.m4392a();
                                        } else {
                                            switch (str) {
                                                case "{\an1}":
                                                    b = 0;
                                                    break;
                                                case "{\an2}":
                                                    b = 6;
                                                    break;
                                                case "{\an3}":
                                                    b = 3;
                                                    break;
                                                case "{\an4}":
                                                    b = 1;
                                                    break;
                                                case "{\an5}":
                                                    b = 7;
                                                    break;
                                                case "{\an6}":
                                                    b = 4;
                                                    break;
                                                case "{\an7}":
                                                    b = 2;
                                                    break;
                                                case "{\an8}":
                                                    b = 8;
                                                    break;
                                                case "{\an9}":
                                                    b = 5;
                                                    break;
                                                default:
                                                    b = -1;
                                                    break;
                                            }
                                            if (b != 0 || b == 1 || b == 2) {
                                                bVar.f9810h = 0;
                                            } else if (b == 3 || b == 4 || b == 5) {
                                                bVar.f9810h = 2;
                                            } else {
                                                bVar.f9810h = 1;
                                            }
                                            switch (str) {
                                                case "{\an1}":
                                                    b2 = 0;
                                                    break;
                                                case "{\an2}":
                                                    b2 = 1;
                                                    break;
                                                case "{\an3}":
                                                    b2 = 2;
                                                    break;
                                                case "{\an4}":
                                                    b2 = 6;
                                                    break;
                                                case "{\an5}":
                                                    b2 = 7;
                                                    break;
                                                case "{\an6}":
                                                    b2 = 8;
                                                    break;
                                                case "{\an7}":
                                                    b2 = 3;
                                                    break;
                                                case "{\an8}":
                                                    b2 = 4;
                                                    break;
                                                case "{\an9}":
                                                    b2 = 5;
                                                    break;
                                                default:
                                                    b2 = -1;
                                                    break;
                                            }
                                            if (b2 != 0 || b2 == 1 || b2 == 2) {
                                                bVar.f9808f = 2;
                                            } else if (b2 == 3 || b2 == 4 || b2 == 5) {
                                                bVar.f9808f = 0;
                                            } else {
                                                bVar.f9808f = 1;
                                            }
                                            bVar.f9809g = m4450k(bVar.f9810h);
                                            bVar.f9806d = m4450k(bVar.f9808f);
                                            bVar.f9807e = 0;
                                            cueM4392a = bVar.m4392a();
                                        }
                                        arrayList.add(cueM4392a);
                                        arrayList.add(Cue.f9786a);
                                    }
                                }
                                bVar = new Cue.b();
                                bVar.f9803a = spannedFromHtml;
                                if (str == null) {
                                    cueM4392a = bVar.m4392a();
                                } else {
                                    switch (str) {
                                        case -685620710:
                                            if (!str.equals("{\\an1}")) {
                                                b = 0;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case -685620679:
                                            if (!str.equals("{\\an2}")) {
                                                b = 6;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case -685620648:
                                            if (!str.equals("{\\an3}")) {
                                                b = 3;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case -685620617:
                                            if (!str.equals("{\\an4}")) {
                                                b = 1;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case -685620586:
                                            if (!str.equals("{\\an5}")) {
                                                b = 7;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case -685620555:
                                            if (!str.equals("{\\an6}")) {
                                                b = 4;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case -685620524:
                                            if (!str.equals("{\\an7}")) {
                                                b = 2;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case -685620493:
                                            if (!str.equals("{\\an8}")) {
                                                b = 8;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case -685620462:
                                            if (!str.equals("{\\an9}")) {
                                                b = 5;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        default:
                                            b = -1;
                                            break;
                                    }
                                    if (b != 0) {
                                        bVar.f9810h = 0;
                                    } else {
                                        bVar.f9810h = 0;
                                    }
                                    switch (str) {
                                        case -685620710:
                                            if (!str.equals("{\\an1}")) {
                                                b2 = 0;
                                            } else {
                                                b2 = -1;
                                            }
                                            break;
                                        case -685620679:
                                            if (!str.equals("{\\an2}")) {
                                                b2 = 1;
                                            } else {
                                                b2 = -1;
                                            }
                                            break;
                                        case -685620648:
                                            if (!str.equals("{\\an3}")) {
                                                b2 = 2;
                                            } else {
                                                b2 = -1;
                                            }
                                            break;
                                        case -685620617:
                                            if (!str.equals("{\\an4}")) {
                                                b2 = 6;
                                            } else {
                                                b2 = -1;
                                            }
                                            break;
                                        case -685620586:
                                            if (!str.equals("{\\an5}")) {
                                                b2 = 7;
                                            } else {
                                                b2 = -1;
                                            }
                                            break;
                                        case -685620555:
                                            if (!str.equals("{\\an6}")) {
                                                b2 = 8;
                                            } else {
                                                b2 = -1;
                                            }
                                            break;
                                        case -685620524:
                                            if (!str.equals("{\\an7}")) {
                                                b2 = 3;
                                            } else {
                                                b2 = -1;
                                            }
                                            break;
                                        case -685620493:
                                            if (!str.equals("{\\an8}")) {
                                                b2 = 4;
                                            } else {
                                                b2 = -1;
                                            }
                                            break;
                                        case -685620462:
                                            if (!str.equals("{\\an9}")) {
                                                b2 = 5;
                                            } else {
                                                b2 = -1;
                                            }
                                            break;
                                        default:
                                            b2 = -1;
                                            break;
                                    }
                                    if (b2 != 0) {
                                        bVar.f9808f = 2;
                                    } else {
                                        bVar.f9808f = 2;
                                    }
                                    bVar.f9809g = m4450k(bVar.f9810h);
                                    bVar.f9806d = m4450k(bVar.f9808f);
                                    bVar.f9807e = 0;
                                    cueM4392a = bVar.m4392a();
                                }
                                arrayList.add(cueM4392a);
                                arrayList.add(Cue.f9786a);
                            } else {
                                parsableByteArray = parsableByteArray;
                                outline.m1567R("Skipping invalid timing: ", strM3202g2, "SubripDecoder");
                            }
                            subripDecoder = this;
                            parsableByteArray = parsableByteArray;
                        }
                    } catch (NumberFormatException unused) {
                        parsableByteArray = parsableByteArray;
                        outline.m1567R("Skipping invalid index: ", strM3202g, "SubripDecoder");
                    }
                }
            }
        }
        return new SubripSubtitle((Cue[]) arrayList.toArray(new Cue[0]), Arrays.copyOf(longArray.f6359b, longArray.f6358a));
    }
}
