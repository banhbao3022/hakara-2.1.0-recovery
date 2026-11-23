package p007c.p190n.p194b.p209b.p252x1.p259t;

import android.text.Layout;
import android.text.TextUtils;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.p212b2.ColorParser2;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p252x1.SimpleSubtitleDecoder;
import p007c.p190n.p194b.p209b.p252x1.Subtitle;
import p007c.p190n.p194b.p209b.p252x1.SubtitleDecoderException;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p378c.p380b.Collections2;
import p007c.p190n.p378c.p380b.ImmutableSet;
import p007c.p190n.p378c.p380b.Sets2;
import p007c.p190n.p378c.p380b.Sets4;

/* JADX INFO: renamed from: c.n.b.b.x1.t.c, reason: use source file name */
/* JADX INFO: compiled from: TtmlDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class TtmlDecoder extends SimpleSubtitleDecoder {

    /* JADX INFO: renamed from: n */
    public static final Pattern f10051n = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: o */
    public static final Pattern f10052o = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: p */
    public static final Pattern f10053p = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: q */
    public static final Pattern f10054q = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: r */
    public static final Pattern f10055r = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: s */
    public static final Pattern f10056s = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: t */
    public static final Pattern f10057t = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: u */
    public static final b f10058u = new b(30.0f, 1, 1);

    /* JADX INFO: renamed from: v */
    public static final a f10059v = new a(32, 15);

    /* JADX INFO: renamed from: w */
    public final XmlPullParserFactory f10060w;

    /* JADX INFO: renamed from: c.n.b.b.x1.t.c$a */
    /* JADX INFO: compiled from: TtmlDecoder.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final int f10061a;

        public a(int i, int i2) {
            this.f10061a = i2;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.x1.t.c$b */
    /* JADX INFO: compiled from: TtmlDecoder.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final float f10062a;

        /* JADX INFO: renamed from: b */
        public final int f10063b;

        /* JADX INFO: renamed from: c */
        public final int f10064c;

        public b(float f, int i, int i2) {
            this.f10062a = f;
            this.f10063b = i;
            this.f10064c = i2;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.x1.t.c$c */
    /* JADX INFO: compiled from: TtmlDecoder.java */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final int f10065a;

        /* JADX INFO: renamed from: b */
        public final int f10066b;

        public c(int i, int i2) {
            this.f10065a = i;
            this.f10066b = i2;
        }
    }

    public TtmlDecoder() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f10060w = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* JADX INFO: renamed from: k */
    public static TtmlStyle m4452k(TtmlStyle ttmlStyle) {
        return ttmlStyle == null ? new TtmlStyle() : ttmlStyle;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m4453l(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    /* JADX INFO: renamed from: m */
    public static a m4454m(XmlPullParser xmlPullParser, a aVar) throws SubtitleDecoderException {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = f10057t.matcher(attributeValue);
        if (!matcher.matches()) {
            outline.m1567R("Ignoring malformed cell resolution: ", attributeValue, "TtmlDecoder");
            return aVar;
        }
        try {
            String strGroup = matcher.group(1);
            Objects.requireNonNull(strGroup);
            int i = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            Objects.requireNonNull(strGroup2);
            int i2 = Integer.parseInt(strGroup2);
            if (i != 0 && i2 != 0) {
                return new a(i, i2);
            }
            throw new SubtitleDecoderException("Invalid cell resolution " + i + " " + i2);
        } catch (NumberFormatException unused) {
            outline.m1567R("Ignoring malformed cell resolution: ", attributeValue, "TtmlDecoder");
            return aVar;
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m4455n(String str, TtmlStyle ttmlStyle) throws SubtitleDecoderException {
        Matcher matcher;
        int i = Util6.f6307a;
        String[] strArrSplit = str.split("\\s+", -1);
        if (strArrSplit.length == 1) {
            matcher = f10053p.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                throw new SubtitleDecoderException(outline.m1603y(outline.m1556G("Invalid number of entries for fontSize: "), strArrSplit.length, "."));
            }
            matcher = f10053p.matcher(strArrSplit[1]);
            Log.w("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new SubtitleDecoderException(outline.m1600v("Invalid expression for fontSize: '", str, "'."));
        }
        String strGroup = matcher.group(3);
        Objects.requireNonNull(strGroup);
        strGroup.hashCode();
        switch (strGroup) {
            case "%":
                ttmlStyle.f10099j = 3;
                break;
            case "em":
                ttmlStyle.f10099j = 2;
                break;
            case "px":
                ttmlStyle.f10099j = 1;
                break;
            default:
                throw new SubtitleDecoderException(outline.m1600v("Invalid unit for fontSize: '", strGroup, "'."));
        }
        String strGroup2 = matcher.group(1);
        Objects.requireNonNull(strGroup2);
        ttmlStyle.f10100k = Float.parseFloat(strGroup2);
    }

    /* JADX INFO: renamed from: o */
    public static b m4456o(XmlPullParser xmlPullParser) throws SubtitleDecoderException {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        float f = 1.0f;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i2 = Util6.f6307a;
            String[] strArrSplit = attributeValue2.split(" ", -1);
            if (strArrSplit.length != 2) {
                throw new SubtitleDecoderException("frameRateMultiplier doesn't have 2 parts");
            }
            f = Integer.parseInt(strArrSplit[0]) / Integer.parseInt(strArrSplit[1]);
        }
        b bVar = f10058u;
        int i3 = bVar.f10063b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i3 = Integer.parseInt(attributeValue3);
        }
        int i4 = bVar.f10064c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i4 = Integer.parseInt(attributeValue4);
        }
        return new b(i * f, i3, i4);
    }

    /* JADX WARN: Code duplicated, block: B:113:0x010c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x00df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:41:0x0105 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0107  */
    /* JADX WARN: Code duplicated, block: B:47:0x0136  */
    /* JADX WARN: Code duplicated, block: B:49:0x0145  */
    /* JADX WARN: Code duplicated, block: B:52:0x014e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0153  */
    /* JADX WARN: Code duplicated, block: B:54:0x015c  */
    /* JADX WARN: Code duplicated, block: B:57:0x016f  */
    /* JADX WARN: Code duplicated, block: B:59:0x017e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0183  */
    /* JADX WARN: Code duplicated, block: B:68:0x0194  */
    /* JADX WARN: Code duplicated, block: B:71:0x019d  */
    /* JADX WARN: Code duplicated, block: B:72:0x019f  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:85:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:86:0x01d3  */
    /* JADX INFO: renamed from: p */
    public static Map<String, TtmlStyle> m4457p(XmlPullParser xmlPullParser, Map<String, TtmlStyle> map, a aVar, c cVar, Map<String, TtmlRegion> map2, Map<String, String> map3) throws XmlPullParserException, IOException {
        String strM4575k;
        TtmlRegion ttmlRegion;
        float f;
        float f2;
        String strM4575k2;
        Matcher matcher;
        Matcher matcher2;
        float f3;
        float f4;
        String strM4575k3;
        float f5;
        int i;
        String strM4575k4;
        int i2;
        String strM3111T;
        int iHashCode;
        byte b2;
        String strM3111T2;
        do {
            xmlPullParser.next();
            if (C2096e.m4582r(xmlPullParser, "style")) {
                String strM4575k5 = C2096e.m4575k(xmlPullParser, "style");
                TtmlStyle ttmlStyleM4459r = m4459r(xmlPullParser, new TtmlStyle());
                if (strM4575k5 != null) {
                    for (String str : m4460s(strM4575k5)) {
                        ttmlStyleM4459r.m4473a(map.get(str));
                    }
                }
                String str2 = ttmlStyleM4459r.f10101l;
                if (str2 != null) {
                    map.put(str2, ttmlStyleM4459r);
                }
            } else if (C2096e.m4582r(xmlPullParser, "region")) {
                String strM4575k6 = C2096e.m4575k(xmlPullParser, "id");
                if (strM4575k6 != null) {
                    String strM4575k7 = C2096e.m4575k(xmlPullParser, "origin");
                    if (strM4575k7 != null) {
                        Pattern pattern = f10055r;
                        Matcher matcher3 = pattern.matcher(strM4575k7);
                        Pattern pattern2 = f10056s;
                        Matcher matcher4 = pattern2.matcher(strM4575k7);
                        if (matcher3.matches()) {
                            try {
                                String strGroup = matcher3.group(1);
                                Objects.requireNonNull(strGroup);
                                f = Float.parseFloat(strGroup) / 100.0f;
                                String strGroup2 = matcher3.group(2);
                                Objects.requireNonNull(strGroup2);
                                f2 = Float.parseFloat(strGroup2) / 100.0f;
                                strM4575k2 = C2096e.m4575k(xmlPullParser, "extent");
                                if (strM4575k2 != null) {
                                    matcher = pattern.matcher(strM4575k2);
                                    matcher2 = pattern2.matcher(strM4575k2);
                                    if (matcher.matches()) {
                                        try {
                                            String strGroup3 = matcher.group(1);
                                            Objects.requireNonNull(strGroup3);
                                            float f6 = Float.parseFloat(strGroup3) / 100.0f;
                                            String strGroup4 = matcher.group(2);
                                            Objects.requireNonNull(strGroup4);
                                            f3 = Float.parseFloat(strGroup4) / 100.0f;
                                            f4 = f6;
                                        } catch (NumberFormatException unused) {
                                            outline.m1567R("Ignoring region with malformed extent: ", strM4575k7, "TtmlDecoder");
                                            ttmlRegion = null;
                                        }
                                    } else if (matcher2.matches()) {
                                        outline.m1567R("Ignoring region with unsupported extent: ", strM4575k7, "TtmlDecoder");
                                    } else if (cVar == null) {
                                        outline.m1567R("Ignoring region with missing tts:extent: ", strM4575k7, "TtmlDecoder");
                                    } else {
                                        try {
                                            String strGroup5 = matcher2.group(1);
                                            Objects.requireNonNull(strGroup5);
                                            int i3 = Integer.parseInt(strGroup5);
                                            String strGroup6 = matcher2.group(2);
                                            Objects.requireNonNull(strGroup6);
                                            float f7 = Integer.parseInt(strGroup6);
                                            f4 = i3 / cVar.f10065a;
                                            f3 = f7 / cVar.f10066b;
                                        } catch (NumberFormatException unused2) {
                                            outline.m1567R("Ignoring region with malformed extent: ", strM4575k7, "TtmlDecoder");
                                            ttmlRegion = null;
                                        }
                                    }
                                    strM4575k3 = C2096e.m4575k(xmlPullParser, "displayAlign");
                                    if (strM4575k3 != null) {
                                        strM3111T2 = Util6.m3111T(strM4575k3);
                                        strM3111T2.hashCode();
                                        if (!strM3111T2.equals("center")) {
                                            f5 = (f3 / 2.0f) + f2;
                                            i = 1;
                                        } else if (strM3111T2.equals("after")) {
                                            f5 = f2 + f3;
                                            i = 2;
                                        } else {
                                            f5 = f2;
                                            i = 0;
                                        }
                                    } else {
                                        f5 = f2;
                                        i = 0;
                                    }
                                    float f8 = 1.0f / aVar.f10061a;
                                    strM4575k4 = C2096e.m4575k(xmlPullParser, "writingMode");
                                    if (strM4575k4 != null) {
                                        strM3111T = Util6.m3111T(strM4575k4);
                                        strM3111T.hashCode();
                                        iHashCode = strM3111T.hashCode();
                                        if (iHashCode != 3694) {
                                            if (iHashCode != 3553396) {
                                                if (iHashCode != 3553576 && strM3111T.equals("tbrl")) {
                                                    b2 = 2;
                                                } else {
                                                    b2 = -1;
                                                }
                                            } else if (strM3111T.equals("tblr")) {
                                                b2 = 1;
                                            } else {
                                                b2 = -1;
                                            }
                                        } else if (strM3111T.equals("tb")) {
                                            b2 = 0;
                                        } else {
                                            b2 = -1;
                                        }
                                        if (b2 != 0 || b2 == 1) {
                                            i2 = 2;
                                        } else if (b2 != 2) {
                                            i2 = Integer.MIN_VALUE;
                                        } else {
                                            i2 = 1;
                                        }
                                    } else {
                                        i2 = Integer.MIN_VALUE;
                                    }
                                    ttmlRegion = new TtmlRegion(strM4575k6, f, f5, 0, i, f4, f3, 1, f8, i2);
                                } else {
                                    Log.w("TtmlDecoder", "Ignoring region without an extent");
                                }
                            } catch (NumberFormatException unused3) {
                                outline.m1567R("Ignoring region with malformed origin: ", strM4575k7, "TtmlDecoder");
                            }
                        } else if (!matcher4.matches()) {
                            outline.m1567R("Ignoring region with unsupported origin: ", strM4575k7, "TtmlDecoder");
                        } else if (cVar == null) {
                            outline.m1567R("Ignoring region with missing tts:extent: ", strM4575k7, "TtmlDecoder");
                        } else {
                            try {
                                String strGroup7 = matcher4.group(1);
                                Objects.requireNonNull(strGroup7);
                                int i4 = Integer.parseInt(strGroup7);
                                String strGroup8 = matcher4.group(2);
                                Objects.requireNonNull(strGroup8);
                                int i5 = Integer.parseInt(strGroup8);
                                float f9 = i4 / cVar.f10065a;
                                float f10 = i5 / cVar.f10066b;
                                f = f9;
                                f2 = f10;
                                strM4575k2 = C2096e.m4575k(xmlPullParser, "extent");
                                if (strM4575k2 != null) {
                                    matcher = pattern.matcher(strM4575k2);
                                    matcher2 = pattern2.matcher(strM4575k2);
                                    if (matcher.matches()) {
                                        String strGroup9 = matcher.group(1);
                                        Objects.requireNonNull(strGroup9);
                                        float f11 = Float.parseFloat(strGroup9) / 100.0f;
                                        String strGroup10 = matcher.group(2);
                                        Objects.requireNonNull(strGroup10);
                                        f3 = Float.parseFloat(strGroup10) / 100.0f;
                                        f4 = f11;
                                    } else if (matcher2.matches()) {
                                        outline.m1567R("Ignoring region with unsupported extent: ", strM4575k7, "TtmlDecoder");
                                    } else if (cVar == null) {
                                        outline.m1567R("Ignoring region with missing tts:extent: ", strM4575k7, "TtmlDecoder");
                                    } else {
                                        String strGroup11 = matcher2.group(1);
                                        Objects.requireNonNull(strGroup11);
                                        int i6 = Integer.parseInt(strGroup11);
                                        String strGroup12 = matcher2.group(2);
                                        Objects.requireNonNull(strGroup12);
                                        float f12 = Integer.parseInt(strGroup12);
                                        f4 = i6 / cVar.f10065a;
                                        f3 = f12 / cVar.f10066b;
                                    }
                                    strM4575k3 = C2096e.m4575k(xmlPullParser, "displayAlign");
                                    if (strM4575k3 != null) {
                                        strM3111T2 = Util6.m3111T(strM4575k3);
                                        strM3111T2.hashCode();
                                        if (!strM3111T2.equals("center")) {
                                            f5 = (f3 / 2.0f) + f2;
                                            i = 1;
                                        } else if (strM3111T2.equals("after")) {
                                            f5 = f2;
                                            i = 0;
                                        } else {
                                            f5 = f2 + f3;
                                            i = 2;
                                        }
                                    } else {
                                        f5 = f2;
                                        i = 0;
                                    }
                                    float f13 = 1.0f / aVar.f10061a;
                                    strM4575k4 = C2096e.m4575k(xmlPullParser, "writingMode");
                                    if (strM4575k4 != null) {
                                        strM3111T = Util6.m3111T(strM4575k4);
                                        strM3111T.hashCode();
                                        iHashCode = strM3111T.hashCode();
                                        if (iHashCode != 3694) {
                                            if (iHashCode != 3553396) {
                                                if (iHashCode != 3553576) {
                                                    b2 = -1;
                                                } else {
                                                    b2 = 2;
                                                }
                                            } else if (strM3111T.equals("tblr")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 1;
                                            }
                                        } else if (strM3111T.equals("tb")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 0;
                                        }
                                        if (b2 != 0) {
                                            i2 = 2;
                                        } else {
                                            i2 = 2;
                                        }
                                    } else {
                                        i2 = Integer.MIN_VALUE;
                                    }
                                    ttmlRegion = new TtmlRegion(strM4575k6, f, f5, 0, i, f4, f3, 1, f13, i2);
                                } else {
                                    Log.w("TtmlDecoder", "Ignoring region without an extent");
                                }
                            } catch (NumberFormatException unused4) {
                                outline.m1567R("Ignoring region with malformed origin: ", strM4575k7, "TtmlDecoder");
                            }
                        }
                    } else {
                        Log.w("TtmlDecoder", "Ignoring region without an origin");
                    }
                    ttmlRegion = null;
                } else {
                    ttmlRegion = null;
                }
                TtmlRegion ttmlRegion2 = ttmlRegion;
                if (ttmlRegion2 != null) {
                    map2.put(ttmlRegion2.f10080a, ttmlRegion2);
                }
            } else if (C2096e.m4582r(xmlPullParser, "metadata")) {
                do {
                    xmlPullParser.next();
                    if (C2096e.m4582r(xmlPullParser, "image") && (strM4575k = C2096e.m4575k(xmlPullParser, "id")) != null) {
                        map3.put(strM4575k, xmlPullParser.nextText());
                    }
                } while (!C2096e.m4580p(xmlPullParser, "metadata"));
            }
        } while (!C2096e.m4580p(xmlPullParser, "head"));
        return map;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x007c  */
    /* JADX WARN: Code duplicated, block: B:76:0x00fc  */
    /* JADX INFO: renamed from: q */
    public static TtmlNode m4458q(XmlPullParser xmlPullParser, TtmlNode ttmlNode, Map<String, TtmlRegion> map, b bVar) throws SubtitleDecoderException {
        long j2;
        long j3;
        byte b2;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        int attributeCount = xmlPullParser.getAttributeCount();
        TtmlStyle ttmlStyleM4459r = m4459r(xmlPullParser2, null);
        String strSubstring = null;
        String str = "";
        long jM4461t = -9223372036854775807L;
        long jM4461t2 = -9223372036854775807L;
        long jM4461t3 = -9223372036854775807L;
        String[] strArr = null;
        int i = 0;
        while (i < attributeCount) {
            String attributeName = xmlPullParser2.getAttributeName(i);
            String attributeValue = xmlPullParser2.getAttributeValue(i);
            attributeName.hashCode();
            switch (attributeName) {
                case "region":
                    b2 = 0;
                    break;
                case "dur":
                    b2 = 1;
                    break;
                case "end":
                    b2 = 2;
                    break;
                case "begin":
                    b2 = 3;
                    break;
                case "style":
                    b2 = 4;
                    break;
                case "backgroundImage":
                    b2 = 5;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 != 0) {
                if (b2 == 1) {
                    jM4461t3 = m4461t(attributeValue, bVar);
                } else if (b2 == 2) {
                    jM4461t2 = m4461t(attributeValue, bVar);
                } else if (b2 == 3) {
                    jM4461t = m4461t(attributeValue, bVar);
                } else if (b2 == 4) {
                    String[] strArrM4460s = m4460s(attributeValue);
                    if (strArrM4460s.length > 0) {
                        strArr = strArrM4460s;
                    }
                } else if (b2 == 5 && attributeValue.startsWith("#")) {
                    strSubstring = attributeValue.substring(1);
                }
            } else if (map.containsKey(attributeValue)) {
                str = attributeValue;
            }
            i++;
            xmlPullParser2 = xmlPullParser;
        }
        if (ttmlNode != null) {
            long j4 = ttmlNode.f10070d;
            j2 = -9223372036854775807L;
            if (j4 != -9223372036854775807L) {
                if (jM4461t != -9223372036854775807L) {
                    jM4461t += j4;
                }
                if (jM4461t2 != -9223372036854775807L) {
                    jM4461t2 += j4;
                }
            }
        } else {
            j2 = -9223372036854775807L;
        }
        if (jM4461t2 != j2) {
            j3 = jM4461t2;
        } else if (jM4461t3 != j2) {
            j3 = jM4461t + jM4461t3;
        } else if (ttmlNode != null) {
            long j5 = ttmlNode.f10071e;
            if (j5 != j2) {
                j3 = j5;
            } else {
                j3 = jM4461t2;
            }
        } else {
            j3 = jM4461t2;
        }
        return new TtmlNode(xmlPullParser.getName(), null, jM4461t, j3, ttmlStyleM4459r, strArr, str, strSubstring, ttmlNode);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x0173  */
    /* JADX WARN: Code duplicated, block: B:119:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:141:0x0210  */
    /* JADX WARN: Code duplicated, block: B:226:0x0356  */
    /* JADX WARN: Code duplicated, block: B:229:0x036e  */
    /* JADX WARN: Code duplicated, block: B:63:0x00cc  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    public static TtmlStyle m4459r(XmlPullParser xmlPullParser, TtmlStyle ttmlStyle) {
        byte b2;
        byte b3;
        TextEmphasis textEmphasis;
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeValue = xmlPullParser.getAttributeValue(i);
            String attributeName = xmlPullParser.getAttributeName(i);
            attributeName.hashCode();
            int i2 = -1;
            byte b4 = 1;
            switch (attributeName) {
                case "fontStyle":
                    ttmlStyle = m4452k(ttmlStyle);
                    ttmlStyle.f10098i = "italic".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case "fontFamily":
                    ttmlStyle = m4452k(ttmlStyle);
                    ttmlStyle.f10090a = attributeValue;
                    break;
                case "textAlign":
                    String strM3111T = Util6.m3111T(attributeValue);
                    strM3111T.hashCode();
                    strM3111T.hashCode();
                    switch (strM3111T) {
                        case "center":
                            ttmlStyle = m4452k(ttmlStyle);
                            ttmlStyle.f10104o = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case "end":
                        case "right":
                            ttmlStyle = m4452k(ttmlStyle);
                            ttmlStyle.f10104o = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        case "left":
                        case "start":
                            ttmlStyle = m4452k(ttmlStyle);
                            ttmlStyle.f10104o = Layout.Alignment.ALIGN_NORMAL;
                            break;
                    }
                    break;
                case "textDecoration":
                    String strM3111T2 = Util6.m3111T(attributeValue);
                    strM3111T2.hashCode();
                    strM3111T2.hashCode();
                    switch (strM3111T2) {
                        case "nounderline":
                            ttmlStyle = m4452k(ttmlStyle);
                            ttmlStyle.f10096g = 0;
                            break;
                        case "underline":
                            ttmlStyle = m4452k(ttmlStyle);
                            ttmlStyle.f10096g = 1;
                            break;
                        case "nolinethrough":
                            ttmlStyle = m4452k(ttmlStyle);
                            ttmlStyle.f10095f = 0;
                            break;
                        case "linethrough":
                            ttmlStyle = m4452k(ttmlStyle);
                            ttmlStyle.f10095f = 1;
                            break;
                    }
                    break;
                case "fontWeight":
                    ttmlStyle = m4452k(ttmlStyle);
                    ttmlStyle.f10097h = "bold".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case "id":
                    if (!"style".equals(xmlPullParser.getName())) {
                        break;
                    } else {
                        ttmlStyle = m4452k(ttmlStyle);
                        ttmlStyle.f10101l = attributeValue;
                        break;
                    }
                    break;
                case "ruby":
                    String strM3111T3 = Util6.m3111T(attributeValue);
                    strM3111T3.hashCode();
                    switch (strM3111T3.hashCode()) {
                        case -618561360:
                            if (strM3111T3.equals("baseContainer")) {
                                i2 = 0;
                            }
                            break;
                        case -410956671:
                            if (strM3111T3.equals("container")) {
                                i2 = 1;
                            }
                            break;
                        case -250518009:
                            if (strM3111T3.equals("delimiter")) {
                                i2 = 2;
                            }
                            break;
                        case -136074796:
                            if (strM3111T3.equals("textContainer")) {
                                i2 = 3;
                            }
                            break;
                        case 3016401:
                            if (strM3111T3.equals("base")) {
                                i2 = 4;
                            }
                            break;
                        case 3556653:
                            if (strM3111T3.equals("text")) {
                                i2 = 5;
                            }
                            break;
                    }
                    if (i2 != 0) {
                        if (i2 == 1) {
                            ttmlStyle = m4452k(ttmlStyle);
                            ttmlStyle.f10102m = 1;
                        } else if (i2 == 2) {
                            ttmlStyle = m4452k(ttmlStyle);
                            ttmlStyle.f10102m = 4;
                        } else if (i2 == 3) {
                            ttmlStyle = m4452k(ttmlStyle);
                            ttmlStyle.f10102m = 3;
                        } else if (i2 == 4) {
                            ttmlStyle = m4452k(ttmlStyle);
                            ttmlStyle.f10102m = 2;
                        } else if (i2 == 5) {
                            ttmlStyle = m4452k(ttmlStyle);
                            ttmlStyle.f10102m = 3;
                        }
                        break;
                    } else {
                        ttmlStyle = m4452k(ttmlStyle);
                        ttmlStyle.f10102m = 2;
                        break;
                    }
                    break;
                case "color":
                    ttmlStyle = m4452k(ttmlStyle);
                    try {
                        ttmlStyle.f10091b = ColorParser2.m3139a(attributeValue, false);
                        ttmlStyle.f10092c = true;
                        break;
                    } catch (IllegalArgumentException unused) {
                        outline.m1567R("Failed parsing color value: ", attributeValue, "TtmlDecoder");
                        break;
                    }
                    break;
                case "shear":
                    ttmlStyle = m4452k(ttmlStyle);
                    Matcher matcher = f10054q.matcher(attributeValue);
                    float fMin = Float.MAX_VALUE;
                    if (matcher.matches()) {
                        try {
                            String strGroup = matcher.group(1);
                            Objects.requireNonNull(strGroup);
                            fMin = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup)));
                        } catch (NumberFormatException e) {
                            p007c.p190n.p194b.p209b.p212b2.Log.m3156d("TtmlDecoder", "Failed to parse shear: " + attributeValue, e);
                        }
                        break;
                    } else {
                        outline.m1567R("Invalid value for shear: ", attributeValue, "TtmlDecoder");
                    }
                    ttmlStyle.f10107r = fMin;
                    break;
                case "textCombine":
                    String strM3111T4 = Util6.m3111T(attributeValue);
                    strM3111T4.hashCode();
                    if (!strM3111T4.equals("all")) {
                        if (strM3111T4.equals("none")) {
                            ttmlStyle = m4452k(ttmlStyle);
                            ttmlStyle.f10105p = 0;
                        }
                        break;
                    } else {
                        ttmlStyle = m4452k(ttmlStyle);
                        ttmlStyle.f10105p = 1;
                        break;
                    }
                    break;
                case "fontSize":
                    try {
                        ttmlStyle = m4452k(ttmlStyle);
                        m4455n(attributeValue, ttmlStyle);
                        break;
                    } catch (SubtitleDecoderException unused2) {
                        outline.m1567R("Failed parsing fontSize value: ", attributeValue, "TtmlDecoder");
                        break;
                    }
                    break;
                case "textEmphasis":
                    ttmlStyle = m4452k(ttmlStyle);
                    String strM3111T5 = Util6.m3111T(attributeValue);
                    Pattern pattern = TextEmphasis.f10043a;
                    TextEmphasis textEmphasis2 = null;
                    if (strM3111T5 != null) {
                        String strTrim = strM3111T5.trim();
                        if (!strTrim.isEmpty()) {
                            ImmutableSet immutableSetM11662x = ImmutableSet.m11662x(TextUtils.split(strTrim, TextEmphasis.f10043a));
                            String str = (String) C4799a.m10964O(Collections2.m11604b(TextEmphasis.f10047e, immutableSetM11662x), "outside");
                            int iHashCode = str.hashCode();
                            if (iHashCode != -1392885889) {
                                if (iHashCode != -1106037339) {
                                    if (iHashCode == 92734940 && str.equals("after")) {
                                        b2 = 0;
                                    } else {
                                        b2 = -1;
                                    }
                                } else if (str.equals("outside")) {
                                    b2 = 1;
                                } else {
                                    b2 = -1;
                                }
                            } else if (str.equals("before")) {
                                b2 = 2;
                            } else {
                                b2 = -1;
                            }
                            int i3 = b2 != 0 ? b2 != 1 ? 1 : -2 : 2;
                            Collections2.a aVar = (Collections2.a) Collections2.m11604b(TextEmphasis.f10044b, immutableSetM11662x);
                            if (aVar.isEmpty()) {
                                Sets4 sets4M11604b = Collections2.m11604b(TextEmphasis.f10046d, immutableSetM11662x);
                                Sets4 sets4M11604b2 = Collections2.m11604b(TextEmphasis.f10045c, immutableSetM11662x);
                                if (((Collections2.a) sets4M11604b).isEmpty() && ((Collections2.a) sets4M11604b2).isEmpty()) {
                                    textEmphasis = new TextEmphasis(-1, 0, i3);
                                } else {
                                    String str2 = (String) C4799a.m10964O(sets4M11604b, "filled");
                                    int iHashCode2 = str2.hashCode();
                                    if (iHashCode2 != -1274499742) {
                                        if (iHashCode2 == 3417674 && str2.equals("open")) {
                                            b3 = 0;
                                        } else {
                                            b3 = -1;
                                        }
                                    } else if (str2.equals("filled")) {
                                        b3 = 1;
                                    } else {
                                        b3 = -1;
                                    }
                                    int i4 = b3 != 0 ? 1 : 2;
                                    String str3 = (String) C4799a.m10964O(sets4M11604b2, "circle");
                                    int iHashCode3 = str3.hashCode();
                                    if (iHashCode3 != -1360216880) {
                                        if (iHashCode3 != -905816648) {
                                            if (iHashCode3 == 99657 && str3.equals("dot")) {
                                                i2 = 0;
                                            }
                                        } else if (str3.equals("sesame")) {
                                            i2 = 1;
                                        }
                                    } else if (str3.equals("circle")) {
                                        i2 = 2;
                                    }
                                    textEmphasis2 = new TextEmphasis(i2 != 0 ? i2 != 1 ? 1 : 3 : 2, i4, i3);
                                }
                            } else {
                                String str4 = (String) new Sets2(aVar).next();
                                int iHashCode4 = str4.hashCode();
                                if (iHashCode4 != 3005871) {
                                    if (iHashCode4 == 3387192 && str4.equals("none")) {
                                        b4 = 0;
                                    } else {
                                        b4 = -1;
                                    }
                                } else if (!str4.equals("auto")) {
                                    b4 = -1;
                                }
                                textEmphasis = new TextEmphasis(b4 == 0 ? 0 : -1, 0, i3);
                            }
                            textEmphasis2 = textEmphasis;
                        }
                    }
                    ttmlStyle.f10106q = textEmphasis2;
                    break;
                case "rubyPosition":
                    String strM3111T6 = Util6.m3111T(attributeValue);
                    strM3111T6.hashCode();
                    if (!strM3111T6.equals("before")) {
                        if (strM3111T6.equals("after")) {
                            ttmlStyle = m4452k(ttmlStyle);
                            ttmlStyle.f10103n = 2;
                        }
                        break;
                    } else {
                        ttmlStyle = m4452k(ttmlStyle);
                        ttmlStyle.f10103n = 1;
                        break;
                    }
                    break;
                case "backgroundColor":
                    ttmlStyle = m4452k(ttmlStyle);
                    try {
                        ttmlStyle.f10093d = ColorParser2.m3139a(attributeValue, false);
                        ttmlStyle.f10094e = true;
                        break;
                    } catch (IllegalArgumentException unused3) {
                        outline.m1567R("Failed parsing background value: ", attributeValue, "TtmlDecoder");
                        break;
                    }
                    break;
            }
        }
        return ttmlStyle;
    }

    /* JADX INFO: renamed from: s */
    public static String[] m4460s(String str) {
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return new String[0];
        }
        int i = Util6.f6307a;
        return strTrim.split("\\s+", -1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:42:0x00da  */
    /* JADX WARN: Failed to find 'out' block for switch in B:43:0x00db. Please report as an issue. */
    /* JADX INFO: renamed from: t */
    public static long m4461t(String str, b bVar) throws SubtitleDecoderException {
        double d;
        double d2;
        double d3;
        Matcher matcher = f10051n.matcher(str);
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            Objects.requireNonNull(strGroup);
            double d4 = Long.parseLong(strGroup) * 3600;
            String strGroup2 = matcher.group(2);
            Objects.requireNonNull(strGroup2);
            double d5 = d4 + (Long.parseLong(strGroup2) * 60);
            String strGroup3 = matcher.group(3);
            Objects.requireNonNull(strGroup3);
            double d6 = d5 + Long.parseLong(strGroup3);
            String strGroup4 = matcher.group(4);
            double d7 = d6 + (strGroup4 != null ? Double.parseDouble(strGroup4) : 0.0d);
            String strGroup5 = matcher.group(5);
            double d8 = d7 + (strGroup5 != null ? Long.parseLong(strGroup5) / bVar.f10062a : 0.0d);
            String strGroup6 = matcher.group(6);
            d = d8 + (strGroup6 != null ? (Long.parseLong(strGroup6) / ((double) bVar.f10063b)) / ((double) bVar.f10062a) : 0.0d);
        } else {
            Matcher matcher2 = f10052o.matcher(str);
            if (!matcher2.matches()) {
                throw new SubtitleDecoderException(outline.m1599u("Malformed time expression: ", str));
            }
            String strGroup7 = matcher2.group(1);
            Objects.requireNonNull(strGroup7);
            d = Double.parseDouble(strGroup7);
            String strGroup8 = matcher2.group(2);
            Objects.requireNonNull(strGroup8);
            switch (strGroup8) {
                case "f":
                    d2 = bVar.f10062a;
                    d /= d2;
                    break;
                case "h":
                    d3 = 3600.0d;
                    d *= d3;
                    break;
                case "m":
                    d3 = 60.0d;
                    d *= d3;
                    break;
                case "t":
                    d2 = bVar.f10064c;
                    d /= d2;
                    break;
                case "ms":
                    d2 = 1000.0d;
                    d /= d2;
                    break;
            }
        }
        return (long) (d * 1000000.0d);
    }

    /* JADX INFO: renamed from: u */
    public static c m4462u(XmlPullParser xmlPullParser) {
        String strM4575k = C2096e.m4575k(xmlPullParser, "extent");
        if (strM4575k == null) {
            return null;
        }
        Matcher matcher = f10056s.matcher(strM4575k);
        if (!matcher.matches()) {
            outline.m1567R("Ignoring non-pixel tts extent: ", strM4575k, "TtmlDecoder");
            return null;
        }
        try {
            String strGroup = matcher.group(1);
            Objects.requireNonNull(strGroup);
            int i = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            Objects.requireNonNull(strGroup2);
            return new c(i, Integer.parseInt(strGroup2));
        } catch (NumberFormatException unused) {
            outline.m1567R("Ignoring malformed tts extent: ", strM4575k, "TtmlDecoder");
            return null;
        }
    }

    @Override // p007c.p190n.p194b.p209b.p252x1.SimpleSubtitleDecoder
    /* JADX INFO: renamed from: j */
    public Subtitle mo4394j(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        b bVar;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f10060w.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new TtmlRegion(""));
            c cVarM4462u = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            b bVarM4456o = f10058u;
            a aVarM4454m = f10059v;
            TtmlSubtitle ttmlSubtitle = null;
            int i2 = 0;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                TtmlNode ttmlNode = (TtmlNode) arrayDeque.peek();
                if (i2 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            bVarM4456o = m4456o(xmlPullParserNewPullParser);
                            aVarM4454m = m4454m(xmlPullParserNewPullParser, f10059v);
                            cVarM4462u = m4462u(xmlPullParserNewPullParser);
                        }
                        c cVar = cVarM4462u;
                        b bVar2 = bVarM4456o;
                        a aVar = aVarM4454m;
                        if (!m4453l(name)) {
                            Log.i("TtmlDecoder", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                            i2++;
                            bVar = bVar2;
                        } else if ("head".equals(name)) {
                            bVar = bVar2;
                            m4457p(xmlPullParserNewPullParser, map, aVar, cVar, map2, map3);
                        } else {
                            bVar = bVar2;
                            try {
                                TtmlNode ttmlNodeM4458q = m4458q(xmlPullParserNewPullParser, ttmlNode, map2, bVar);
                                arrayDeque.push(ttmlNodeM4458q);
                                if (ttmlNode != null) {
                                    ttmlNode.m4465a(ttmlNodeM4458q);
                                }
                            } catch (SubtitleDecoderException e) {
                                p007c.p190n.p194b.p209b.p212b2.Log.m3156d("TtmlDecoder", "Suppressing parser error", e);
                                i2++;
                            }
                        }
                        bVarM4456o = bVar;
                        cVarM4462u = cVar;
                        aVarM4454m = aVar;
                    } else if (eventType == 4) {
                        Objects.requireNonNull(ttmlNode);
                        TtmlNode ttmlNodeM4463b = TtmlNode.m4463b(xmlPullParserNewPullParser.getText());
                        if (ttmlNode.f10079m == null) {
                            ttmlNode.f10079m = new ArrayList();
                        }
                        ttmlNode.f10079m.add(ttmlNodeM4463b);
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            TtmlNode ttmlNode2 = (TtmlNode) arrayDeque.peek();
                            Objects.requireNonNull(ttmlNode2);
                            ttmlSubtitle = new TtmlSubtitle(ttmlNode2, map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i2++;
                } else if (eventType == 3) {
                    i2--;
                }
                xmlPullParserNewPullParser.next();
            }
            if (ttmlSubtitle != null) {
                return ttmlSubtitle;
            }
            throw new SubtitleDecoderException("No TTML subtitles found");
        } catch (IOException e2) {
            throw new IllegalStateException("Unexpected error when reading input.", e2);
        } catch (XmlPullParserException e3) {
            throw new SubtitleDecoderException("Unable to decode source", e3);
        }
    }
}
