package p007c.p190n.p194b.p209b.p252x1.p257r;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.Log;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p252x1.Cue;
import p007c.p190n.p194b.p209b.p252x1.SimpleSubtitleDecoder;
import p007c.p190n.p194b.p209b.p252x1.Subtitle;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.x1.r.a, reason: use source file name */
/* JADX INFO: compiled from: SsaDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class SsaDecoder extends SimpleSubtitleDecoder {

    /* JADX INFO: renamed from: n */
    public static final Pattern f10007n = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: o */
    public final boolean f10008o;

    /* JADX INFO: renamed from: p */
    public final SsaDialogueFormat f10009p;

    /* JADX INFO: renamed from: q */
    public Map<String, SsaStyle> f10010q;

    /* JADX INFO: renamed from: r */
    public float f10011r;

    /* JADX INFO: renamed from: s */
    public float f10012s;

    public SsaDecoder() {
        this(null);
    }

    /* JADX INFO: renamed from: k */
    public static int m4441k(long j2, List<Long> list, List<List<Cue>> list2) {
        int i;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            }
            if (list.get(size).longValue() == j2) {
                return size;
            }
            if (list.get(size).longValue() < j2) {
                i = size + 1;
                break;
            }
            size--;
        }
        list.add(i, Long.valueOf(j2));
        list2.add(i, i == 0 ? new ArrayList() : new ArrayList(list2.get(i - 1)));
        return i;
    }

    /* JADX INFO: renamed from: l */
    public static float m4442l(int i) {
        if (i == 0) {
            return 0.05f;
        }
        if (i != 1) {
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    /* JADX INFO: renamed from: n */
    public static long m4443n(String str) {
        Matcher matcher = f10007n.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        int i = Util6.f6307a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60 * 1000000) + (Long.parseLong(strGroup) * 60 * 60 * 1000000);
    }

    @Override // p007c.p190n.p194b.p209b.p252x1.SimpleSubtitleDecoder
    /* JADX INFO: renamed from: j */
    public Subtitle mo4394j(byte[] bArr, int i, boolean z) {
        ParsableByteArray parsableByteArray;
        Layout.Alignment alignment;
        int i2;
        int iM4446a;
        int i3;
        SsaDecoder ssaDecoder = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ParsableByteArray parsableByteArray2 = new ParsableByteArray(bArr, i);
        if (!ssaDecoder.f10008o) {
            ssaDecoder.m4444m(parsableByteArray2);
        }
        SsaDialogueFormat ssaDialogueFormatM4445a = ssaDecoder.f10008o ? ssaDecoder.f10009p : null;
        while (true) {
            String strM3202g = parsableByteArray2.m3202g();
            if (strM3202g == null) {
                return new SsaSubtitle(arrayList, arrayList2);
            }
            if (strM3202g.startsWith("Format:")) {
                ssaDialogueFormatM4445a = SsaDialogueFormat.m4445a(strM3202g);
            } else {
                if (strM3202g.startsWith("Dialogue:")) {
                    if (ssaDialogueFormatM4445a == null) {
                        outline.m1567R("Skipping dialogue line before complete format: ", strM3202g, "SsaDecoder");
                    } else {
                        C2096e.m4566b(strM3202g.startsWith("Dialogue:"));
                        String[] strArrSplit = strM3202g.substring(9).split(",", ssaDialogueFormatM4445a.f10017e);
                        if (strArrSplit.length != ssaDialogueFormatM4445a.f10017e) {
                            outline.m1567R("Skipping dialogue line with fewer columns than format: ", strM3202g, "SsaDecoder");
                        } else {
                            long jM4443n = m4443n(strArrSplit[ssaDialogueFormatM4445a.f10013a]);
                            if (jM4443n == -9223372036854775807L) {
                                outline.m1567R("Skipping invalid timing: ", strM3202g, "SsaDecoder");
                            } else {
                                long jM4443n2 = m4443n(strArrSplit[ssaDialogueFormatM4445a.f10014b]);
                                if (jM4443n2 == -9223372036854775807L) {
                                    outline.m1567R("Skipping invalid timing: ", strM3202g, "SsaDecoder");
                                } else {
                                    Map<String, SsaStyle> map = ssaDecoder.f10010q;
                                    SsaStyle ssaStyle = (map == null || (i3 = ssaDialogueFormatM4445a.f10015c) == -1) ? null : map.get(strArrSplit[i3].trim());
                                    String str = strArrSplit[ssaDialogueFormatM4445a.f10016d];
                                    Matcher matcher = SsaStyle.b.f10031a.matcher(str);
                                    PointF pointF = null;
                                    int i4 = -1;
                                    while (true) {
                                        parsableByteArray = parsableByteArray2;
                                        if (matcher.find()) {
                                            String strGroup = matcher.group(1);
                                            Objects.requireNonNull(strGroup);
                                            try {
                                                PointF pointFM4449a = SsaStyle.b.m4449a(strGroup);
                                                if (pointFM4449a != null) {
                                                    pointF = pointFM4449a;
                                                }
                                            } catch (RuntimeException unused) {
                                            }
                                            try {
                                                Matcher matcher2 = SsaStyle.b.f10034d.matcher(strGroup);
                                                if (matcher2.find()) {
                                                    String strGroup2 = matcher2.group(1);
                                                    Objects.requireNonNull(strGroup2);
                                                    iM4446a = SsaStyle.m4446a(strGroup2);
                                                } else {
                                                    iM4446a = -1;
                                                }
                                                if (iM4446a != -1) {
                                                    i4 = iM4446a;
                                                }
                                            } catch (RuntimeException unused2) {
                                            }
                                            parsableByteArray2 = parsableByteArray;
                                        } else {
                                            String strReplace = SsaStyle.b.f10031a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                            float f = ssaDecoder.f10011r;
                                            float f2 = ssaDecoder.f10012s;
                                            SpannableString spannableString = new SpannableString(strReplace);
                                            Cue.b bVar = new Cue.b();
                                            bVar.f9803a = spannableString;
                                            if (ssaStyle != null) {
                                                if (ssaStyle.f10020c != null) {
                                                    spannableString.setSpan(new ForegroundColorSpan(ssaStyle.f10020c.intValue()), 0, spannableString.length(), 33);
                                                }
                                                float f3 = ssaStyle.f10021d;
                                                if (f3 != -3.4028235E38f && f2 != -3.4028235E38f) {
                                                    bVar.f9812j = f3 / f2;
                                                    bVar.f9811i = 1;
                                                }
                                                boolean z2 = ssaStyle.f10022e;
                                                if (z2 && ssaStyle.f10023f) {
                                                    spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                                } else if (z2) {
                                                    spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                                } else if (ssaStyle.f10023f) {
                                                    spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                                }
                                            } else {
                                                ssaDialogueFormatM4445a = ssaDialogueFormatM4445a;
                                                jM4443n2 = jM4443n2;
                                            }
                                            if (i4 == -1) {
                                                i4 = ssaStyle != null ? ssaStyle.f10019b : -1;
                                            }
                                            switch (i4) {
                                                case 0:
                                                default:
                                                    Log.w("SsaDecoder", outline.m1590l("Unknown alignment: ", i4));
                                                case -1:
                                                    alignment = null;
                                                    break;
                                                case 1:
                                                case 4:
                                                case 7:
                                                    alignment = Layout.Alignment.ALIGN_NORMAL;
                                                    break;
                                                case 2:
                                                case 5:
                                                case 8:
                                                    alignment = Layout.Alignment.ALIGN_CENTER;
                                                    break;
                                                case 3:
                                                case 6:
                                                case 9:
                                                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                                    break;
                                            }
                                            bVar.f9805c = alignment;
                                            int i5 = Integer.MIN_VALUE;
                                            switch (i4) {
                                                case 0:
                                                default:
                                                    Log.w("SsaDecoder", outline.m1590l("Unknown alignment: ", i4));
                                                case -1:
                                                    i2 = Integer.MIN_VALUE;
                                                    break;
                                                case 1:
                                                case 4:
                                                case 7:
                                                    i2 = 0;
                                                    break;
                                                case 2:
                                                case 5:
                                                case 8:
                                                    i2 = 1;
                                                    break;
                                                case 3:
                                                case 6:
                                                case 9:
                                                    i2 = 2;
                                                    break;
                                            }
                                            bVar.f9810h = i2;
                                            switch (i4) {
                                                case -1:
                                                    break;
                                                case 0:
                                                default:
                                                    Log.w("SsaDecoder", outline.m1590l("Unknown alignment: ", i4));
                                                    break;
                                                case 1:
                                                case 2:
                                                case 3:
                                                    i5 = 2;
                                                    break;
                                                case 4:
                                                case 5:
                                                case 6:
                                                    i5 = 1;
                                                    break;
                                                case 7:
                                                case 8:
                                                case 9:
                                                    i5 = 0;
                                                    break;
                                            }
                                            bVar.f9808f = i5;
                                            if (pointF == null || f2 == -3.4028235E38f || f == -3.4028235E38f) {
                                                bVar.f9809g = m4442l(bVar.f9810h);
                                                bVar.f9806d = m4442l(bVar.f9808f);
                                                bVar.f9807e = 0;
                                            } else {
                                                bVar.f9809g = pointF.x / f;
                                                bVar.f9806d = pointF.y / f2;
                                                bVar.f9807e = 0;
                                            }
                                            Cue cueM4392a = bVar.m4392a();
                                            int iM4441k = m4441k(jM4443n2, arrayList2, arrayList);
                                            for (int iM4441k2 = m4441k(jM4443n, arrayList2, arrayList); iM4441k2 < iM4441k; iM4441k2++) {
                                                ((List) arrayList.get(iM4441k2)).add(cueM4392a);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    parsableByteArray = parsableByteArray2;
                    ssaDialogueFormatM4445a = ssaDialogueFormatM4445a;
                } else {
                    parsableByteArray = parsableByteArray2;
                    ssaDialogueFormatM4445a = ssaDialogueFormatM4445a;
                }
                ssaDecoder = this;
                ssaDialogueFormatM4445a = ssaDialogueFormatM4445a;
                parsableByteArray2 = parsableByteArray;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:123:0x0233  */
    /* JADX WARN: Code duplicated, block: B:67:0x0110  */
    /* JADX INFO: renamed from: m */
    public final void m4444m(ParsableByteArray parsableByteArray) {
        byte b;
        SsaStyle ssaStyle;
        float f;
        while (true) {
            String strM3202g = parsableByteArray.m3202g();
            if (strM3202g == null) {
                return;
            }
            int i = 91;
            char c2 = 2;
            char c3 = 1;
            if ("[Script Info]".equalsIgnoreCase(strM3202g)) {
                while (true) {
                    String strM3202g2 = parsableByteArray.m3202g();
                    if (strM3202g2 == null || (parsableByteArray.m3196a() != 0 && parsableByteArray.m3198c() == 91)) {
                        break;
                    }
                    String[] strArrSplit = strM3202g2.split(":");
                    if (strArrSplit.length == 2) {
                        String strM3111T = Util6.m3111T(strArrSplit[0].trim());
                        strM3111T.hashCode();
                        if (strM3111T.equals("playresx")) {
                            this.f10011r = Float.parseFloat(strArrSplit[1].trim());
                        } else if (strM3111T.equals("playresy")) {
                            try {
                                this.f10012s = Float.parseFloat(strArrSplit[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(strM3202g)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (true) {
                    SsaStyle.a aVar = null;
                    while (true) {
                        String strM3202g3 = parsableByteArray.m3202g();
                        if (strM3202g3 != null && (parsableByteArray.m3196a() == 0 || parsableByteArray.m3198c() != i)) {
                            if (strM3202g3.startsWith("Format:")) {
                                String[] strArrSplit2 = TextUtils.split(strM3202g3.substring(7), ",");
                                int i2 = -1;
                                int i3 = -1;
                                int i4 = -1;
                                int i5 = -1;
                                int i6 = -1;
                                int i7 = -1;
                                for (int i8 = 0; i8 < strArrSplit2.length; i8++) {
                                    String strM3111T2 = Util6.m3111T(strArrSplit2[i8].trim());
                                    strM3111T2.hashCode();
                                    switch (strM3111T2) {
                                        case "italic":
                                            b = 0;
                                            break;
                                        case "primarycolour":
                                            b = 1;
                                            break;
                                        case "bold":
                                            b = 2;
                                            break;
                                        case "name":
                                            b = 3;
                                            break;
                                        case "fontsize":
                                            b = 4;
                                            break;
                                        case "alignment":
                                            b = 5;
                                            break;
                                        default:
                                            b = -1;
                                            break;
                                    }
                                    if (b == 0) {
                                        i7 = i8;
                                    } else if (b == c3) {
                                        i4 = i8;
                                    } else if (b == c2) {
                                        i6 = i8;
                                    } else if (b == 3) {
                                        i2 = i8;
                                    } else if (b == 4) {
                                        i5 = i8;
                                    } else if (b == 5) {
                                        i3 = i8;
                                    }
                                }
                                if (i2 != -1) {
                                    aVar = new SsaStyle.a(i2, i3, i4, i5, i6, i7, strArrSplit2.length);
                                    i = 91;
                                } else {
                                    i = 91;
                                }
                            } else {
                                if (strM3202g3.startsWith("Style:")) {
                                    if (aVar == null) {
                                        outline.m1567R("Skipping 'Style:' line before 'Format:' line: ", strM3202g3, "SsaDecoder");
                                    } else {
                                        C2096e.m4566b(strM3202g3.startsWith("Style:"));
                                        String[] strArrSplit3 = TextUtils.split(strM3202g3.substring(6), ",");
                                        int length = strArrSplit3.length;
                                        int i9 = aVar.f10030g;
                                        if (length != i9) {
                                            Object[] objArr = new Object[3];
                                            objArr[0] = Integer.valueOf(i9);
                                            objArr[c3] = Integer.valueOf(strArrSplit3.length);
                                            objArr[c2] = strM3202g3;
                                            Log.w("SsaStyle", Util6.m3126n("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", objArr));
                                        } else {
                                            try {
                                                String strTrim = strArrSplit3[aVar.f10024a].trim();
                                                int i10 = aVar.f10025b;
                                                int iM4446a = i10 != -1 ? SsaStyle.m4446a(strArrSplit3[i10].trim()) : -1;
                                                int i11 = aVar.f10026c;
                                                Integer numM4448c = i11 != -1 ? SsaStyle.m4448c(strArrSplit3[i11].trim()) : null;
                                                int i12 = aVar.f10027d;
                                                if (i12 != -1) {
                                                    String strTrim2 = strArrSplit3[i12].trim();
                                                    try {
                                                        f = Float.parseFloat(strTrim2);
                                                    } catch (NumberFormatException e) {
                                                        p007c.p190n.p194b.p209b.p212b2.Log.m3156d("SsaStyle", "Failed to parse font size: '" + strTrim2 + "'", e);
                                                        f = -3.4028235E38f;
                                                    }
                                                } else {
                                                    f = -3.4028235E38f;
                                                }
                                                int i13 = aVar.f10028e;
                                                boolean zM4447b = i13 != -1 ? SsaStyle.m4447b(strArrSplit3[i13].trim()) : false;
                                                int i14 = aVar.f10029f;
                                                ssaStyle = new SsaStyle(strTrim, iM4446a, numM4448c, f, zM4447b, i14 != -1 ? SsaStyle.m4447b(strArrSplit3[i14].trim()) : false);
                                            } catch (RuntimeException e2) {
                                                p007c.p190n.p194b.p209b.p212b2.Log.m3156d("SsaStyle", "Skipping malformed 'Style:' line: '" + strM3202g3 + "'", e2);
                                                ssaStyle = null;
                                            }
                                            if (ssaStyle != null) {
                                                linkedHashMap.put(ssaStyle.f10018a, ssaStyle);
                                            }
                                        }
                                        ssaStyle = null;
                                        if (ssaStyle != null) {
                                            linkedHashMap.put(ssaStyle.f10018a, ssaStyle);
                                        }
                                    }
                                }
                                i = 91;
                                c2 = 2;
                                c3 = 1;
                            }
                        }
                    }
                }
                this.f10010q = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(strM3202g)) {
                Log.i("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strM3202g)) {
                return;
            }
        }
    }

    public SsaDecoder(List<byte[]> list) {
        super("SsaDecoder");
        this.f10011r = -3.4028235E38f;
        this.f10012s = -3.4028235E38f;
        if (list == null || list.isEmpty()) {
            this.f10008o = false;
            this.f10009p = null;
            return;
        }
        this.f10008o = true;
        String strM3127o = Util6.m3127o(list.get(0));
        C2096e.m4566b(strM3127o.startsWith("Format:"));
        SsaDialogueFormat ssaDialogueFormatM4445a = SsaDialogueFormat.m4445a(strM3127o);
        Objects.requireNonNull(ssaDialogueFormatM4445a);
        this.f10009p = ssaDialogueFormatM4445a;
        m4444m(new ParsableByteArray(list.get(1)));
    }
}
