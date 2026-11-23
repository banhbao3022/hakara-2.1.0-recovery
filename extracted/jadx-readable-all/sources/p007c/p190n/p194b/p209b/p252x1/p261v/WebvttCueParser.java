package p007c.p190n.p194b.p209b.p252x1.p261v;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p007c.p071d.p078c.p079a.outline;
import p007c.p165l.p175i0.C1095a;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p252x1.Cue;
import p007c.p190n.p194b.p209b.p252x1.p256q.HorizontalTextInVerticalContextSpan;
import p007c.p190n.p194b.p209b.p252x1.p256q.RubySpan;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.x1.v.h, reason: use source file name */
/* JADX INFO: compiled from: WebvttCueParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class WebvttCueParser {

    /* JADX INFO: renamed from: a */
    public static final Pattern f10148a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* JADX INFO: renamed from: b */
    public static final Pattern f10149b = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: c */
    public static final Map<String, Integer> f10150c;

    /* JADX INFO: renamed from: d */
    public static final Map<String, Integer> f10151d;

    /* JADX INFO: renamed from: c.n.b.b.x1.v.h$b */
    /* JADX INFO: compiled from: WebvttCueParser.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int f10152a = 0;

        /* JADX INFO: renamed from: b */
        public final c f10153b;

        /* JADX INFO: renamed from: c */
        public final int f10154c;

        public b(c cVar, int i, a aVar) {
            this.f10153b = cVar;
            this.f10154c = i;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.x1.v.h$c */
    /* JADX INFO: compiled from: WebvttCueParser.java */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final String f10155a;

        /* JADX INFO: renamed from: b */
        public final int f10156b;

        /* JADX INFO: renamed from: c */
        public final String f10157c;

        /* JADX INFO: renamed from: d */
        public final Set<String> f10158d;

        public c(String str, int i, String str2, Set<String> set) {
            this.f10156b = i;
            this.f10155a = str;
            this.f10157c = str2;
            this.f10158d = set;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.x1.v.h$d */
    /* JADX INFO: compiled from: WebvttCueParser.java */
    public static final class d implements Comparable<d> {

        /* JADX INFO: renamed from: f */
        public final int f10159f;

        /* JADX INFO: renamed from: g */
        public final WebvttCssStyle f10160g;

        public d(int i, WebvttCssStyle webvttCssStyle) {
            this.f10159f = i;
            this.f10160g = webvttCssStyle;
        }

        @Override // java.lang.Comparable
        public int compareTo(d dVar) {
            return Integer.compare(this.f10159f, dVar.f10159f);
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.x1.v.h$e */
    /* JADX INFO: compiled from: WebvttCueParser.java */
    public static final class e {

        /* JADX INFO: renamed from: c */
        public CharSequence f10163c;

        /* JADX INFO: renamed from: a */
        public long f10161a = 0;

        /* JADX INFO: renamed from: b */
        public long f10162b = 0;

        /* JADX INFO: renamed from: d */
        public int f10164d = 2;

        /* JADX INFO: renamed from: e */
        public float f10165e = -3.4028235E38f;

        /* JADX INFO: renamed from: f */
        public int f10166f = 1;

        /* JADX INFO: renamed from: g */
        public int f10167g = 0;

        /* JADX INFO: renamed from: h */
        public float f10168h = -3.4028235E38f;

        /* JADX INFO: renamed from: i */
        public int f10169i = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: j */
        public float f10170j = 1.0f;

        /* JADX INFO: renamed from: k */
        public int f10171k = Integer.MIN_VALUE;

        /* JADX WARN: Code duplicated, block: B:20:0x0034  */
        /* JADX WARN: Code duplicated, block: B:21:0x0036  */
        /* JADX WARN: Code duplicated, block: B:29:0x0051  */
        /* JADX WARN: Code duplicated, block: B:31:0x0057  */
        /* JADX WARN: Code duplicated, block: B:43:0x0074  */
        /* JADX INFO: renamed from: a */
        public Cue.b m4490a() {
            Layout.Alignment alignment;
            float f = this.f10168h;
            float f2 = -3.4028235E38f;
            if (f == -3.4028235E38f) {
                int i = this.f10164d;
                if (i != 4) {
                    f = i != 5 ? 0.5f : 1.0f;
                } else {
                    f = 0.0f;
                }
            }
            int i2 = this.f10169i;
            if (i2 == Integer.MIN_VALUE) {
                int i3 = this.f10164d;
                if (i3 == 1) {
                    i2 = 0;
                } else if (i3 == 3) {
                    i2 = 2;
                } else if (i3 == 4) {
                    i2 = 0;
                } else if (i3 != 5) {
                    i2 = 1;
                } else {
                    i2 = 2;
                }
            }
            Cue.b bVar = new Cue.b();
            int i4 = this.f10164d;
            if (i4 == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i4 == 2) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            } else if (i4 == 3) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (i4 == 4) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i4 != 5) {
                outline.m1565P("Unknown textAlignment: ", i4, "WebvttCueParser");
                alignment = null;
            } else {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            }
            bVar.f9805c = alignment;
            float f3 = this.f10165e;
            int i5 = this.f10166f;
            if (f3 != -3.4028235E38f && i5 == 0 && (f3 < 0.0f || f3 > 1.0f)) {
                f2 = 1.0f;
            } else if (f3 != -3.4028235E38f) {
                f2 = f3;
            } else if (i5 == 0) {
                f2 = 1.0f;
            }
            bVar.f9806d = f2;
            bVar.f9807e = i5;
            bVar.f9808f = this.f10167g;
            bVar.f9809g = f;
            bVar.f9810h = i2;
            float f4 = this.f10170j;
            if (i2 == 0) {
                f = 1.0f - f;
            } else if (i2 == 1) {
                f = f <= 0.5f ? f * 2.0f : (1.0f - f) * 2.0f;
            } else if (i2 != 2) {
                throw new IllegalStateException(String.valueOf(i2));
            }
            bVar.f9813k = Math.min(f4, f);
            bVar.f9817o = this.f10171k;
            CharSequence charSequence = this.f10163c;
            if (charSequence != null) {
                bVar.f9803a = charSequence;
            }
            return bVar;
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f10150c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f10151d = Collections.unmodifiableMap(map2);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    /* JADX INFO: renamed from: a */
    public static void m4482a(String str, c cVar, List<b> list, SpannableStringBuilder spannableStringBuilder, List<WebvttCssStyle> list2) {
        byte b2;
        int i = cVar.f10156b;
        int length = spannableStringBuilder.length();
        String str2 = cVar.f10155a;
        str2.hashCode();
        int iHashCode = str2.hashCode();
        int i2 = -1;
        if (iHashCode != 0) {
            if (iHashCode != 105) {
                if (iHashCode != 3314158) {
                    if (iHashCode != 3511770) {
                        if (iHashCode != 98) {
                            if (iHashCode != 99) {
                                if (iHashCode != 117) {
                                    if (iHashCode == 118 && str2.equals("v")) {
                                        b2 = 5;
                                    } else {
                                        b2 = -1;
                                    }
                                } else if (str2.equals("u")) {
                                    b2 = 4;
                                } else {
                                    b2 = -1;
                                }
                            } else if (str2.equals("c")) {
                                b2 = 2;
                            } else {
                                b2 = -1;
                            }
                        } else if (str2.equals("b")) {
                            b2 = 1;
                        } else {
                            b2 = -1;
                        }
                    } else if (str2.equals("ruby")) {
                        b2 = 7;
                    } else {
                        b2 = -1;
                    }
                } else if (str2.equals("lang")) {
                    b2 = 6;
                } else {
                    b2 = -1;
                }
            } else if (str2.equals("i")) {
                b2 = 3;
            } else {
                b2 = -1;
            }
        } else if (str2.equals("")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        switch (b2) {
            case 0:
            case 5:
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i, length, 33);
                break;
            case 2:
                for (String str3 : cVar.f10158d) {
                    Map<String, Integer> map = f10150c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(str3).intValue()), i, length, 33);
                    } else {
                        Map<String, Integer> map2 = f10151d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(map2.get(str3).intValue()), i, length, 33);
                        }
                    }
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                break;
            case 7:
                int iM4484c = m4484c(list2, str, cVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                int i3 = b.f10152a;
                Collections.sort(arrayList, new Comparator() { // from class: c.n.b.b.x1.v.a
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return Integer.compare(((WebvttCueParser.b) obj).f10153b.f10156b, ((WebvttCueParser.b) obj2).f10153b.f10156b);
                    }
                });
                int i4 = cVar.f10156b;
                int i5 = 0;
                int length2 = 0;
                while (i5 < arrayList.size()) {
                    if ("rt".equals(((b) arrayList.get(i5)).f10153b.f10155a)) {
                        b bVar = (b) arrayList.get(i5);
                        int iM4484c2 = m4484c(list2, str, bVar.f10153b);
                        if (iM4484c2 == i2) {
                            iM4484c2 = iM4484c != i2 ? iM4484c : 1;
                        }
                        int i6 = bVar.f10153b.f10156b - length2;
                        int i7 = bVar.f10154c - length2;
                        CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i6, i7);
                        spannableStringBuilder.delete(i6, i7);
                        spannableStringBuilder.setSpan(new RubySpan(charSequenceSubSequence.toString(), iM4484c2), i4, i6, 33);
                        length2 = charSequenceSubSequence.length() + length2;
                        i4 = i6;
                    }
                    i5++;
                    i2 = -1;
                }
                break;
            default:
                return;
        }
        List<d> listM4483b = m4483b(list2, str, cVar);
        int i8 = 0;
        while (true) {
            ArrayList arrayList2 = (ArrayList) listM4483b;
            if (i8 >= arrayList2.size()) {
                return;
            }
            WebvttCssStyle webvttCssStyle = ((d) arrayList2.get(i8)).f10160g;
            if (webvttCssStyle != null) {
                if (webvttCssStyle.m4481a() != -1) {
                    C1095a.m2387c(spannableStringBuilder, new StyleSpan(webvttCssStyle.m4481a()), i, length, 33);
                }
                if (webvttCssStyle.f10138j == 1) {
                    spannableStringBuilder.setSpan(new StrikethroughSpan(), i, length, 33);
                }
                if (webvttCssStyle.f10139k == 1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                }
                if (webvttCssStyle.f10135g) {
                    if (!webvttCssStyle.f10135g) {
                        throw new IllegalStateException("Font color not defined");
                    }
                    C1095a.m2387c(spannableStringBuilder, new ForegroundColorSpan(webvttCssStyle.f10134f), i, length, 33);
                }
                if (webvttCssStyle.f10137i) {
                    if (!webvttCssStyle.f10137i) {
                        throw new IllegalStateException("Background color not defined.");
                    }
                    C1095a.m2387c(spannableStringBuilder, new BackgroundColorSpan(webvttCssStyle.f10136h), i, length, 33);
                }
                if (webvttCssStyle.f10133e != null) {
                    C1095a.m2387c(spannableStringBuilder, new TypefaceSpan(webvttCssStyle.f10133e), i, length, 33);
                }
                int i9 = webvttCssStyle.f10142n;
                if (i9 == 1) {
                    C1095a.m2387c(spannableStringBuilder, new AbsoluteSizeSpan((int) 0.0f, true), i, length, 33);
                } else if (i9 == 2 || i9 == 3) {
                    C1095a.m2387c(spannableStringBuilder, new RelativeSizeSpan(0.0f), i, length, 33);
                }
                if (webvttCssStyle.f10144p) {
                    spannableStringBuilder.setSpan(new HorizontalTextInVerticalContextSpan(), i, length, 33);
                }
            }
            i8++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX INFO: renamed from: b */
    public static List<d> m4483b(List<WebvttCssStyle> list, String str, c cVar) {
        ?? r4;
        int size;
        boolean zIsEmpty;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            WebvttCssStyle webvttCssStyle = list.get(i);
            String str2 = cVar.f10155a;
            Set<String> set = cVar.f10158d;
            String str3 = cVar.f10157c;
            if (webvttCssStyle.f10129a.isEmpty() && webvttCssStyle.f10130b.isEmpty() && webvttCssStyle.f10131c.isEmpty() && webvttCssStyle.f10132d.isEmpty()) {
                zIsEmpty = TextUtils.isEmpty(str2);
            } else {
                int iM4480b = WebvttCssStyle.m4480b(WebvttCssStyle.m4480b(WebvttCssStyle.m4480b(0, webvttCssStyle.f10129a, str, 1073741824), webvttCssStyle.f10130b, str2, 2), webvttCssStyle.f10132d, str3, 4);
                if (iM4480b == -1 || !set.containsAll(webvttCssStyle.f10131c)) {
                    r4 = 0;
                } else {
                    size = iM4480b + (webvttCssStyle.f10131c.size() * 4);
                }
            }
            if (r4 > 0) {
                r4 = size;
                r4 = zIsEmpty;
                arrayList.add(new d(r4, webvttCssStyle));
            } else {
                r4 = size;
                r4 = zIsEmpty;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static int m4484c(List<WebvttCssStyle> list, String str, c cVar) {
        List<d> listM4483b = m4483b(list, str, cVar);
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) listM4483b;
            if (i >= arrayList.size()) {
                return -1;
            }
            int i2 = ((d) arrayList.get(i)).f10160g.f10143o;
            if (i2 != -1) {
                return i2;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: d */
    public static WebvttCueInfo m4485d(String str, Matcher matcher, ParsableByteArray parsableByteArray, List<WebvttCssStyle> list) {
        e eVar = new e();
        try {
            String strGroup = matcher.group(1);
            Objects.requireNonNull(strGroup);
            eVar.f10161a = WebvttParserUtil.m4493c(strGroup);
            String strGroup2 = matcher.group(2);
            Objects.requireNonNull(strGroup2);
            eVar.f10162b = WebvttParserUtil.m4493c(strGroup2);
            String strGroup3 = matcher.group(3);
            Objects.requireNonNull(strGroup3);
            m4486e(strGroup3, eVar);
            StringBuilder sb = new StringBuilder();
            String strM3202g = parsableByteArray.m3202g();
            while (!TextUtils.isEmpty(strM3202g)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strM3202g.trim());
                strM3202g = parsableByteArray.m3202g();
            }
            eVar.f10163c = m4487f(str, sb.toString(), list);
            return new WebvttCueInfo(eVar.m4490a().m4392a(), eVar.f10161a, eVar.f10162b);
        } catch (NumberFormatException unused) {
            StringBuilder sbM1556G = outline.m1556G("Skipping cue with bad header: ");
            sbM1556G.append(matcher.group());
            Log.w("WebvttCueParser", sbM1556G.toString());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: e */
    public static void m4486e(String str, e eVar) {
        Matcher matcher = f10149b.matcher(str);
        while (matcher.find()) {
            int i = 1;
            String strGroup = matcher.group(1);
            Objects.requireNonNull(strGroup);
            String strGroup2 = matcher.group(2);
            Objects.requireNonNull(strGroup2);
            try {
                if ("line".equals(strGroup)) {
                    m4488g(strGroup2, eVar);
                } else if ("align".equals(strGroup)) {
                    strGroup2.hashCode();
                    switch (strGroup2) {
                        case "center":
                        case "middle":
                            i = 2;
                            break;
                        case "end":
                            i = 3;
                            break;
                        case "left":
                            i = 4;
                            break;
                        case "right":
                            i = 5;
                            break;
                        case "start":
                            break;
                        default:
                            Log.w("WebvttCueParser", "Invalid alignment value: " + strGroup2);
                            i = 2;
                            break;
                    }
                    eVar.f10164d = i;
                } else if ("position".equals(strGroup)) {
                    m4489h(strGroup2, eVar);
                } else if ("size".equals(strGroup)) {
                    eVar.f10170j = WebvttParserUtil.m4492b(strGroup2);
                } else if ("vertical".equals(strGroup)) {
                    if (strGroup2.equals("lr")) {
                        i = 2;
                    } else if (!strGroup2.equals("rl")) {
                        Log.w("WebvttCueParser", "Invalid 'vertical' value: " + strGroup2);
                        i = Integer.MIN_VALUE;
                    }
                    eVar.f10171k = i;
                } else {
                    Log.w("WebvttCueParser", "Unknown cue setting " + strGroup + ":" + strGroup2);
                }
            } catch (NumberFormatException unused) {
                StringBuilder sbM1556G = outline.m1556G("Skipping bad cue setting: ");
                sbM1556G.append(matcher.group());
                Log.w("WebvttCueParser", sbM1556G.toString());
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x00a4  */
    /* JADX INFO: renamed from: f */
    public static SpannedString m4487f(String str, String str2, List<WebvttCssStyle> list) {
        boolean z;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (true) {
            String strTrim = "";
            if (i2 >= str2.length()) {
                while (!arrayDeque.isEmpty()) {
                    m4482a(str, (c) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                m4482a(str, new c("", 0, "", Collections.emptySet()), Collections.emptyList(), spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            char cCharAt = str2.charAt(i2);
            if (cCharAt == '&') {
                i2++;
                int iIndexOf = str2.indexOf(59, i2);
                int iIndexOf2 = str2.indexOf(32, i2);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    String strSubstring = str2.substring(i2, iIndexOf);
                    strSubstring.hashCode();
                    switch (strSubstring) {
                        case "gt":
                            spannableStringBuilder.append('>');
                            break;
                        case "lt":
                            spannableStringBuilder.append('<');
                            break;
                        case "amp":
                            spannableStringBuilder.append('&');
                            break;
                        case "nbsp":
                            spannableStringBuilder.append(' ');
                            break;
                        default:
                            Log.w("WebvttCueParser", "ignoring unsupported entity: '&" + strSubstring + ";'");
                            break;
                    }
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i2 = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i2++;
            } else {
                int length = i2 + 1;
                if (length < str2.length()) {
                    boolean z2 = str2.charAt(length) == '/';
                    int iIndexOf3 = str2.indexOf(62, length);
                    length = iIndexOf3 == -1 ? str2.length() : iIndexOf3 + 1;
                    int i3 = length - 2;
                    boolean z3 = str2.charAt(i3) == '/';
                    int i4 = i2 + (z2 ? 2 : 1);
                    if (!z3) {
                        i3 = length - 1;
                    }
                    String strSubstring2 = str2.substring(i4, i3);
                    if (!strSubstring2.trim().isEmpty()) {
                        String strTrim2 = strSubstring2.trim();
                        C2096e.m4566b(!strTrim2.isEmpty());
                        int i5 = Util6.f6307a;
                        String str3 = strTrim2.split("[ \\.]", 2)[i];
                        str3.hashCode();
                        switch (str3) {
                            case "b":
                            case "c":
                            case "i":
                            case "u":
                            case "v":
                            case "rt":
                            case "lang":
                            case "ruby":
                                z = true;
                                break;
                            default:
                                z = false;
                                break;
                        }
                        if (z) {
                            if (z2) {
                                while (!arrayDeque.isEmpty()) {
                                    c cVar = (c) arrayDeque.pop();
                                    m4482a(str, cVar, arrayList, spannableStringBuilder, list);
                                    if (arrayDeque.isEmpty()) {
                                        arrayList.clear();
                                    } else {
                                        arrayList.add(new b(cVar, spannableStringBuilder.length(), null));
                                    }
                                    if (cVar.f10155a.equals(str3)) {
                                    }
                                }
                            } else if (!z3) {
                                int length2 = spannableStringBuilder.length();
                                String strTrim3 = strSubstring2.trim();
                                C2096e.m4566b(!strTrim3.isEmpty());
                                int iIndexOf4 = strTrim3.indexOf(" ");
                                if (iIndexOf4 != -1) {
                                    strTrim = strTrim3.substring(iIndexOf4).trim();
                                    strTrim3 = strTrim3.substring(i, iIndexOf4);
                                }
                                String[] strArrM3106O = Util6.m3106O(strTrim3, "\\.");
                                String str4 = strArrM3106O[i];
                                HashSet hashSet = new HashSet();
                                for (int i6 = 1; i6 < strArrM3106O.length; i6++) {
                                    hashSet.add(strArrM3106O[i6]);
                                }
                                arrayDeque.push(new c(str4, length2, strTrim, hashSet));
                            }
                        }
                    }
                    i2 = length;
                }
                i2 = length;
            }
            i = 0;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m4488g(String str, e eVar) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            String strSubstring = str.substring(iIndexOf + 1);
            strSubstring.hashCode();
            strSubstring.hashCode();
            int i = 2;
            switch (strSubstring) {
                case "center":
                case "middle":
                    i = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i = 0;
                    break;
                default:
                    outline.m1567R("Invalid anchor value: ", strSubstring, "WebvttCueParser");
                    i = Integer.MIN_VALUE;
                    break;
            }
            eVar.f10167g = i;
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            eVar.f10165e = WebvttParserUtil.m4492b(str);
            eVar.f10166f = 0;
        } else {
            eVar.f10165e = Integer.parseInt(str);
            eVar.f10166f = 1;
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m4489h(String str, e eVar) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            String strSubstring = str.substring(iIndexOf + 1);
            strSubstring.hashCode();
            strSubstring.hashCode();
            int i = 2;
            switch (strSubstring) {
                case "line-left":
                case "start":
                    i = 0;
                    break;
                case "center":
                case "middle":
                    i = 1;
                    break;
                case "line-right":
                case "end":
                    break;
                default:
                    outline.m1567R("Invalid anchor value: ", strSubstring, "WebvttCueParser");
                    i = Integer.MIN_VALUE;
                    break;
            }
            eVar.f10169i = i;
            str = str.substring(0, iIndexOf);
        }
        eVar.f10168h = WebvttParserUtil.m4492b(str);
    }
}
