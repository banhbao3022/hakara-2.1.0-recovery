package p007c.p190n.p194b.p209b.p243w1.p246v0.p247l;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import com.cgfay.media.CainMediaMetadataRetriever;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p007c.p071d.p078c.p079a.outline;
import p007c.p165l.p175i0.C1095a;
import p007c.p190n.p194b.p209b.C;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.ParserException;
import p007c.p190n.p194b.p209b.p210a2.ParsingLoadable;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p218q1.DrmInitData;
import p007c.p190n.p194b.p209b.p221s1.p228k0.PsshAtomUtil;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p334e.C4799a;

/* JADX INFO: renamed from: c.n.b.b.w1.v0.l.c, reason: use source file name */
/* JADX INFO: compiled from: DashManifestParser.java */
/* JADX INFO: loaded from: classes.dex */
public class DashManifestParser extends DefaultHandler implements ParsingLoadable.a<DashManifest> {

    /* JADX INFO: renamed from: a */
    public static final Pattern f9267a = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* JADX INFO: renamed from: b */
    public static final Pattern f9268b = Pattern.compile("CC([1-4])=.*");

    /* JADX INFO: renamed from: c */
    public static final Pattern f9269c = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* JADX INFO: renamed from: d */
    public static final int[] f9270d = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* JADX INFO: renamed from: e */
    public final XmlPullParserFactory f9271e;

    /* JADX INFO: renamed from: c.n.b.b.w1.v0.l.c$a */
    /* JADX INFO: compiled from: DashManifestParser.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Format f9272a;

        /* JADX INFO: renamed from: b */
        public final String f9273b;

        /* JADX INFO: renamed from: c */
        public final SegmentBase f9274c;

        /* JADX INFO: renamed from: d */
        public final String f9275d;

        /* JADX INFO: renamed from: e */
        public final ArrayList<DrmInitData.b> f9276e;

        /* JADX INFO: renamed from: f */
        public final ArrayList<Descriptor2> f9277f;

        /* JADX INFO: renamed from: g */
        public final long f9278g;

        public a(Format format, String str, SegmentBase segmentBase, String str2, ArrayList<DrmInitData.b> arrayList, ArrayList<Descriptor2> arrayList2, long j2) {
            this.f9272a = format;
            this.f9273b = str;
            this.f9274c = segmentBase;
            this.f9275d = str2;
            this.f9276e = arrayList;
            this.f9277f = arrayList2;
            this.f9278g = j2;
        }
    }

    public DashManifestParser() {
        try {
            this.f9271e = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m4257c(int i, int i2) {
        if (i == -1) {
            return i2;
        }
        if (i2 == -1) {
            return i;
        }
        C2096e.m4570f(i == i2);
        return i;
    }

    /* JADX INFO: renamed from: d */
    public static long m4258d(long j2, long j3) {
        if (j3 != -9223372036854775807L) {
            j2 = j3;
        }
        if (j2 == Long.MAX_VALUE) {
            return -9223372036854775807L;
        }
        return j2;
    }

    /* JADX INFO: renamed from: e */
    public static void m4259e(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (C2096e.m4581q(xmlPullParser)) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (C2096e.m4581q(xmlPullParser)) {
                    i++;
                } else {
                    if (xmlPullParser.getEventType() == 3) {
                        i--;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static Descriptor2 m4260k(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = "";
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "id");
        String str2 = attributeValue3 != null ? attributeValue3 : null;
        do {
            xmlPullParser.next();
        } while (!C2096e.m4580p(xmlPullParser, str));
        return new Descriptor2(attributeValue, attributeValue2, str2);
    }

    /* JADX INFO: renamed from: l */
    public static long m4261l(XmlPullParser xmlPullParser, String str, long j2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j2;
        }
        Matcher matcher = Util6.f6314h.matcher(attributeValue);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
        }
        boolean zIsEmpty = true ^ TextUtils.isEmpty(matcher.group(1));
        String strGroup = matcher.group(3);
        double d = strGroup != null ? Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
        String strGroup2 = matcher.group(5);
        double d2 = d + (strGroup2 != null ? Double.parseDouble(strGroup2) * 2629739.0d : 0.0d);
        String strGroup3 = matcher.group(7);
        double d3 = d2 + (strGroup3 != null ? Double.parseDouble(strGroup3) * 86400.0d : 0.0d);
        String strGroup4 = matcher.group(10);
        double d4 = d3 + (strGroup4 != null ? Double.parseDouble(strGroup4) * 3600.0d : 0.0d);
        String strGroup5 = matcher.group(12);
        double d5 = d4 + (strGroup5 != null ? Double.parseDouble(strGroup5) * 60.0d : 0.0d);
        String strGroup6 = matcher.group(14);
        long j3 = (long) ((d5 + (strGroup6 != null ? Double.parseDouble(strGroup6) : 0.0d)) * 1000.0d);
        return zIsEmpty ? -j3 : j3;
    }

    /* JADX INFO: renamed from: m */
    public static float m4262m(XmlPullParser xmlPullParser, float f) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue == null) {
            return f;
        }
        Matcher matcher = f9267a.matcher(attributeValue);
        if (!matcher.matches()) {
            return f;
        }
        int i = Integer.parseInt(matcher.group(1));
        String strGroup = matcher.group(2);
        return !TextUtils.isEmpty(strGroup) ? i / Integer.parseInt(strGroup) : i;
    }

    /* JADX INFO: renamed from: n */
    public static int m4263n(XmlPullParser xmlPullParser, String str, int i) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i : Integer.parseInt(attributeValue);
    }

    /* JADX INFO: renamed from: o */
    public static long m4264o(XmlPullParser xmlPullParser, String str, long j2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j2 : Long.parseLong(attributeValue);
    }

    /* JADX INFO: renamed from: x */
    public static String m4265x(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String text = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            } else {
                m4259e(xmlPullParser);
            }
        } while (!C2096e.m4580p(xmlPullParser, str));
        return text;
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.ParsingLoadable.a
    /* JADX INFO: renamed from: a */
    public DashManifest mo2912a(Uri uri, InputStream inputStream) throws IOException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f9271e.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            if (xmlPullParserNewPullParser.next() == 2 && "MPD".equals(xmlPullParserNewPullParser.getName())) {
                return m4272p(xmlPullParserNewPullParser, uri.toString());
            }
            throw new ParserException("inputStream does not contain a valid media presentation description");
        } catch (XmlPullParserException e) {
            throw new ParserException(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final long m4266b(List<SegmentBase.d> list, long j2, long j3, int i, long j4) {
        int i2;
        if (i >= 0) {
            i2 = i + 1;
        } else {
            int i3 = Util6.f6307a;
            i2 = (int) ((((j4 - j2) + j3) - 1) / j3);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            list.add(new SegmentBase.d(j2, j3));
            j2 += j3;
        }
        return j2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0088  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:56:0x009d  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b1  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: f */
    public int m4267f(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        byte b;
        String strM3111T;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = null;
        }
        attributeValue.hashCode();
        byte b2 = 0;
        int iM4263n = -1;
        switch (attributeValue) {
            case "urn:mpeg:dash:23003:3:audio_channel_configuration:2011":
                b = 0;
                break;
            case "tag:dolby.com,2014:dash:audio_channel_configuration:2011":
                b = 1;
                break;
            case "urn:mpeg:mpegB:cicp:ChannelConfiguration":
                b = 2;
                break;
            case "urn:dolby:dash:audio_channel_configuration:2011":
                b = 3;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            iM4263n = m4263n(xmlPullParser, "value", -1);
        } else if (b == 1) {
            strM3111T = Util6.m3111T(xmlPullParser.getAttributeValue(null, "value"));
            if (strM3111T != null) {
                switch (strM3111T.hashCode()) {
                    case 1596796:
                        if (!strM3111T.equals("4000")) {
                            b2 = -1;
                        }
                        break;
                    case 2937391:
                        if (strM3111T.equals("a000")) {
                            b2 = -1;
                        } else {
                            b2 = 1;
                        }
                        break;
                    case 3094035:
                        if (strM3111T.equals("f801")) {
                            b2 = -1;
                        } else {
                            b2 = 2;
                        }
                        break;
                    case 3133436:
                        if (strM3111T.equals("fa01")) {
                            b2 = -1;
                        } else {
                            b2 = 3;
                        }
                        break;
                    default:
                        b2 = -1;
                        break;
                }
                if (b2 != 0) {
                    iM4263n = 1;
                } else if (b2 != 1) {
                    iM4263n = 2;
                } else if (b2 != 2) {
                    iM4263n = 6;
                } else if (b2 == 3) {
                    iM4263n = 8;
                }
            }
        } else if (b == 2) {
            int iM4263n2 = m4263n(xmlPullParser, "value", -1);
            if (iM4263n2 >= 0) {
                int[] iArr = f9270d;
                if (iM4263n2 < iArr.length) {
                    iM4263n = iArr[iM4263n2];
                }
            }
        } else if (b == 3) {
            strM3111T = Util6.m3111T(xmlPullParser.getAttributeValue(null, "value"));
            if (strM3111T != null) {
                switch (strM3111T.hashCode()) {
                    case 1596796:
                        if (!strM3111T.equals("4000")) {
                            b2 = -1;
                        }
                        break;
                    case 2937391:
                        if (strM3111T.equals("a000")) {
                            b2 = 1;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 3094035:
                        if (strM3111T.equals("f801")) {
                            b2 = 2;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 3133436:
                        if (strM3111T.equals("fa01")) {
                            b2 = 3;
                        } else {
                            b2 = -1;
                        }
                        break;
                    default:
                        b2 = -1;
                        break;
                }
                if (b2 != 0) {
                    iM4263n = 1;
                } else if (b2 != 1) {
                    iM4263n = 2;
                } else if (b2 != 2) {
                    iM4263n = 6;
                } else if (b2 == 3) {
                    iM4263n = 8;
                }
            }
        }
        do {
            xmlPullParser.next();
        } while (!C2096e.m4580p(xmlPullParser, "AudioChannelConfiguration"));
        return iM4263n;
    }

    /* JADX INFO: renamed from: g */
    public long m4268g(XmlPullParser xmlPullParser, long j2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j2;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    /* JADX INFO: renamed from: h */
    public String m4269h(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        return C2096e.m4584t(str, m4265x(xmlPullParser, "BaseURL"));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0048  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:78:0x011e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x0120  */
    /* JADX WARN: Code duplicated, block: B:86:0x0143  */
    /* JADX INFO: renamed from: i */
    public Pair<String, DrmInitData.b> m4270i(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String attributeValue;
        UUID uuid;
        byte[] bArrM2391g;
        String attributeValue2;
        UUID uuid2;
        boolean z;
        byte b;
        UUID uuid3;
        String attributeValue3;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue4 != null) {
            String strM3111T = Util6.m3111T(attributeValue4);
            strM3111T.hashCode();
            int iHashCode = strM3111T.hashCode();
            if (iHashCode != 489446379) {
                if (iHashCode != 755418770) {
                    if (iHashCode == 1812765994 && strM3111T.equals("urn:mpeg:dash:mp4protection:2011")) {
                        b = 2;
                    } else {
                        b = -1;
                    }
                } else if (strM3111T.equals("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed")) {
                    b = 1;
                } else {
                    b = -1;
                }
            } else if (strM3111T.equals("urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95")) {
                b = 0;
            } else {
                b = -1;
            }
            if (b == 0) {
                uuid3 = C.f6407e;
            } else if (b != 1) {
                if (b != 2) {
                    attributeValue = null;
                } else {
                    attributeValue = xmlPullParser.getAttributeValue(null, "value");
                    int attributeCount = xmlPullParser.getAttributeCount();
                    int i = 0;
                    while (true) {
                        if (i >= attributeCount) {
                            attributeValue3 = null;
                            break;
                        }
                        String attributeName = xmlPullParser.getAttributeName(i);
                        int iIndexOf = attributeName.indexOf(58);
                        if (iIndexOf != -1) {
                            attributeName = attributeName.substring(iIndexOf + 1);
                        }
                        if (attributeName.equals("default_KID")) {
                            attributeValue3 = xmlPullParser.getAttributeValue(i);
                            break;
                        }
                        i++;
                    }
                    if (!TextUtils.isEmpty(attributeValue3) && !"00000000-0000-0000-0000-000000000000".equals(attributeValue3)) {
                        String[] strArrSplit = attributeValue3.split("\\s+");
                        UUID[] uuidArr = new UUID[strArrSplit.length];
                        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                            uuidArr[i2] = UUID.fromString(strArrSplit[i2]);
                        }
                        uuid = C.f6404b;
                        bArrM2391g = C1095a.m2392h(uuid, uuidArr, null);
                        attributeValue2 = null;
                    }
                }
                uuid = null;
                bArrM2391g = null;
                attributeValue2 = null;
            } else {
                uuid3 = C.f6406d;
            }
            uuid = uuid3;
            attributeValue = null;
            bArrM2391g = null;
            attributeValue2 = null;
        } else {
            attributeValue = null;
            uuid = null;
            bArrM2391g = null;
            attributeValue2 = null;
        }
        do {
            xmlPullParser.next();
            if (C2096e.m4582r(xmlPullParser, "ms:laurl")) {
                attributeValue2 = xmlPullParser.getAttributeValue(null, "licenseUrl");
            } else if (bArrM2391g == null) {
                if (C2096e.m4581q(xmlPullParser)) {
                    String name = xmlPullParser.getName();
                    int iIndexOf2 = name.indexOf(58);
                    if (iIndexOf2 != -1) {
                        name = name.substring(iIndexOf2 + 1);
                    }
                    if (name.equals("pssh")) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                if (z && xmlPullParser.next() == 4) {
                    byte[] bArrDecode = Base64.decode(xmlPullParser.getText(), 0);
                    PsshAtomUtil psshAtomUtilM2405u = C1095a.m2405u(bArrDecode);
                    UUID uuid4 = psshAtomUtilM2405u == null ? null : psshAtomUtilM2405u.f7967a;
                    if (uuid4 == null) {
                        Log.w("MpdParser", "Skipping malformed cenc:pssh data");
                        uuid = uuid4;
                        bArrM2391g = null;
                    } else {
                        UUID uuid5 = uuid4;
                        bArrM2391g = bArrDecode;
                        uuid = uuid5;
                    }
                } else if (bArrM2391g == null) {
                    uuid2 = C.f6407e;
                    if (!uuid2.equals(uuid)) {
                        m4259e(xmlPullParser);
                    } else {
                        m4259e(xmlPullParser);
                    }
                } else {
                    m4259e(xmlPullParser);
                }
            } else if (bArrM2391g == null) {
                uuid2 = C.f6407e;
                if (!uuid2.equals(uuid) && C2096e.m4582r(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                    bArrM2391g = C1095a.m2391g(uuid2, Base64.decode(xmlPullParser.getText(), 0));
                } else {
                    m4259e(xmlPullParser);
                }
            } else {
                m4259e(xmlPullParser);
            }
        } while (!C2096e.m4580p(xmlPullParser, "ContentProtection"));
        return Pair.create(attributeValue, uuid != null ? new DrmInitData.b(uuid, attributeValue2, "video/mp4", bArrM2391g) : null);
    }

    /* JADX INFO: renamed from: j */
    public int m4271j(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        return "text".equals(attributeValue) ? 3 : -1;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 43321. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: p */
    public p007c.p190n.p194b.p209b.p243w1.p246v0.p247l.DashManifest m4272p(org.xmlpull.v1.XmlPullParser r132, java.lang.String r133) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 4332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p007c.p190n.p194b.p209b.p243w1.p246v0.p247l.DashManifestParser.m4272p(org.xmlpull.v1.XmlPullParser, java.lang.String):c.n.b.b.w1.v0.l.b");
    }

    /* JADX INFO: renamed from: q */
    public RangedUri m4273q(XmlPullParser xmlPullParser, String str, String str2) {
        long j2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] strArrSplit = attributeValue2.split("-");
            j2 = Long.parseLong(strArrSplit[0]);
            long j3 = strArrSplit.length == 2 ? (Long.parseLong(strArrSplit[1]) - j2) + 1 : -1L;
            return new RangedUri(attributeValue, j2, j3);
        }
        j2 = 0;
        return new RangedUri(attributeValue, j2, j3);
    }

    /* JADX INFO: renamed from: r */
    public int m4274r(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
            case "subtitle":
            case "forced_subtitle":
                return 128;
            case "description":
                return 512;
            case "enhanced-audio-intelligibility":
                return 2048;
            case "alternate":
                return 2;
            case "dub":
                return 16;
            case "main":
                return 1;
            case "sign":
                return 256;
            case "caption":
                return 64;
            case "commentary":
                return 8;
            case "emergency":
                return 32;
            case "supplementary":
                return 4;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: s */
    public int m4275s(List<Descriptor2> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (C4799a.m10953D("http://dashif.org/guidelines/trickmode", list.get(i2).f9279a)) {
                i |= 16384;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: t */
    public SegmentBase.e m4276t(XmlPullParser xmlPullParser, SegmentBase.e eVar) throws XmlPullParserException, IOException {
        long j2;
        long j3;
        long jM4264o = m4264o(xmlPullParser, "timescale", eVar != null ? eVar.f9309b : 1L);
        long jM4264o2 = m4264o(xmlPullParser, "presentationTimeOffset", eVar != null ? eVar.f9310c : 0L);
        long j4 = eVar != null ? eVar.f9323d : 0L;
        long j5 = eVar != null ? eVar.f9324e : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] strArrSplit = attributeValue.split("-");
            long j6 = Long.parseLong(strArrSplit[0]);
            j2 = (Long.parseLong(strArrSplit[1]) - j6) + 1;
            j3 = j6;
        } else {
            j2 = j5;
            j3 = j4;
        }
        RangedUri rangedUriM4273q = eVar != null ? eVar.f9308a : null;
        do {
            xmlPullParser.next();
            if (C2096e.m4582r(xmlPullParser, "Initialization")) {
                rangedUriM4273q = m4273q(xmlPullParser, "sourceURL", "range");
            } else {
                m4259e(xmlPullParser);
            }
        } while (!C2096e.m4580p(xmlPullParser, "SegmentBase"));
        return new SegmentBase.e(rangedUriM4273q, jM4264o, jM4264o2, j3, j2);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00b2 A[PHI: r0 r20
  0x00b2: PHI (r0v7 java.util.List<c.n.b.b.w1.v0.l.j$d>) = (r0v6 java.util.List<c.n.b.b.w1.v0.l.j$d>), (r0v9 java.util.List<c.n.b.b.w1.v0.l.j$d>) binds: [B:32:0x0098, B:39:0x00a6] A[DONT_GENERATE, DONT_INLINE]
  0x00b2: PHI (r20v3 c.n.b.b.w1.v0.l.h) = (r20v2 c.n.b.b.w1.v0.l.h), (r20v6 c.n.b.b.w1.v0.l.h) binds: [B:32:0x0098, B:39:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: u */
    public SegmentBase.b m4277u(XmlPullParser xmlPullParser, SegmentBase.b bVar, long j2, long j3, long j4, long j5, long j6) throws XmlPullParserException, IOException {
        RangedUri rangedUri;
        List<RangedUri> list;
        List<SegmentBase.d> list2;
        long jM4264o = m4264o(xmlPullParser, "timescale", bVar != null ? bVar.f9309b : 1L);
        long jM4264o2 = m4264o(xmlPullParser, "presentationTimeOffset", bVar != null ? bVar.f9310c : 0L);
        long jM4264o3 = m4264o(xmlPullParser, CainMediaMetadataRetriever.METADATA_KEY_DURATION, bVar != null ? bVar.f9312e : -9223372036854775807L);
        long jM4264o4 = m4264o(xmlPullParser, "startNumber", bVar != null ? bVar.f9311d : 1L);
        long jM4258d = m4258d(j4, j5);
        List<SegmentBase.d> listM4279w = null;
        ArrayList arrayList = null;
        RangedUri rangedUriM4273q = null;
        do {
            xmlPullParser.next();
            if (C2096e.m4582r(xmlPullParser, "Initialization")) {
                rangedUriM4273q = m4273q(xmlPullParser, "sourceURL", "range");
            } else if (C2096e.m4582r(xmlPullParser, "SegmentTimeline")) {
                listM4279w = m4279w(xmlPullParser, jM4264o, j3);
            } else if (C2096e.m4582r(xmlPullParser, "SegmentURL")) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                ArrayList arrayList2 = arrayList;
                arrayList2.add(m4273q(xmlPullParser, "media", "mediaRange"));
                arrayList = arrayList2;
            } else {
                m4259e(xmlPullParser);
            }
        } while (!C2096e.m4580p(xmlPullParser, "SegmentList"));
        if (bVar == null) {
            rangedUri = rangedUriM4273q;
            list = arrayList;
            list2 = listM4279w;
        } else {
            if (rangedUriM4273q == null) {
                rangedUriM4273q = bVar.f9308a;
            }
            if (listM4279w == null) {
                listM4279w = bVar.f9313f;
            }
            if (arrayList != null) {
                rangedUri = rangedUriM4273q;
                list = arrayList;
                list2 = listM4279w;
            } else {
                list2 = listM4279w;
                rangedUri = rangedUriM4273q;
                list = bVar.f9317j;
            }
        }
        return new SegmentBase.b(rangedUri, jM4264o, jM4264o2, jM4264o4, jM4264o3, list2, jM4258d, list, C.m3236b(j6), C.m3236b(j2));
    }

    /* JADX INFO: renamed from: v */
    public SegmentBase.c m4278v(XmlPullParser xmlPullParser, SegmentBase.c cVar, List<Descriptor2> list, long j2, long j3, long j4, long j5, long j6) throws XmlPullParserException, IOException {
        long j7;
        long jM4264o = m4264o(xmlPullParser, "timescale", cVar != null ? cVar.f9309b : 1L);
        long jM4264o2 = m4264o(xmlPullParser, "presentationTimeOffset", cVar != null ? cVar.f9310c : 0L);
        long jM4264o3 = m4264o(xmlPullParser, CainMediaMetadataRetriever.METADATA_KEY_DURATION, cVar != null ? cVar.f9312e : -9223372036854775807L);
        long jM4264o4 = m4264o(xmlPullParser, "startNumber", cVar != null ? cVar.f9311d : 1L);
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                j7 = -1;
                break;
            }
            Descriptor2 descriptor2 = list.get(i);
            if (C4799a.m10953D("http://dashif.org/guidelines/last-segment-number", descriptor2.f9279a)) {
                j7 = Long.parseLong(descriptor2.f9280b);
                break;
            }
            i++;
        }
        long j8 = j7;
        long jM4258d = m4258d(j4, j5);
        List<SegmentBase.d> listM4279w = null;
        UrlTemplate urlTemplateM4280y = m4280y(xmlPullParser, "media", cVar != null ? cVar.f9319k : null);
        UrlTemplate urlTemplateM4280y2 = m4280y(xmlPullParser, "initialization", cVar != null ? cVar.f9318j : null);
        RangedUri rangedUriM4273q = null;
        do {
            xmlPullParser.next();
            if (C2096e.m4582r(xmlPullParser, "Initialization")) {
                rangedUriM4273q = m4273q(xmlPullParser, "sourceURL", "range");
            } else if (C2096e.m4582r(xmlPullParser, "SegmentTimeline")) {
                listM4279w = m4279w(xmlPullParser, jM4264o, j3);
            } else {
                m4259e(xmlPullParser);
            }
        } while (!C2096e.m4580p(xmlPullParser, "SegmentTemplate"));
        if (cVar != null) {
            if (rangedUriM4273q == null) {
                rangedUriM4273q = cVar.f9308a;
            }
            if (listM4279w == null) {
                listM4279w = cVar.f9313f;
            }
        }
        return new SegmentBase.c(rangedUriM4273q, jM4264o, jM4264o2, jM4264o4, j8, jM4264o3, listM4279w, jM4258d, urlTemplateM4280y2, urlTemplateM4280y, C.m3236b(j6), C.m3236b(j2));
    }

    /* JADX INFO: renamed from: w */
    public List<SegmentBase.d> m4279w(XmlPullParser xmlPullParser, long j2, long j3) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        long jM4266b = 0;
        long jM4264o = -9223372036854775807L;
        boolean z = false;
        int iM4263n = 0;
        do {
            xmlPullParser.next();
            if (C2096e.m4582r(xmlPullParser, "S")) {
                long jM4264o2 = m4264o(xmlPullParser, "t", -9223372036854775807L);
                if (z) {
                    jM4266b = m4266b(arrayList, jM4266b, jM4264o, iM4263n, jM4264o2);
                }
                if (jM4264o2 == -9223372036854775807L) {
                    jM4264o2 = jM4266b;
                }
                jM4264o = m4264o(xmlPullParser, "d", -9223372036854775807L);
                iM4263n = m4263n(xmlPullParser, "r", 0);
                jM4266b = jM4264o2;
                z = true;
            } else {
                m4259e(xmlPullParser);
            }
        } while (!C2096e.m4580p(xmlPullParser, "SegmentTimeline"));
        if (z) {
            m4266b(arrayList, jM4266b, jM4264o, iM4263n, Util6.m3104M(j3, j2, 1000L));
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:45:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e5 A[SYNTHETIC] */
    /* JADX INFO: renamed from: y */
    public UrlTemplate m4280y(XmlPullParser xmlPullParser, String str, UrlTemplate urlTemplate) {
        String strSubstring;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return urlTemplate;
        }
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        strArr[0] = "";
        int length = 0;
        int i = 0;
        while (length < attributeValue.length()) {
            int iIndexOf = attributeValue.indexOf("$", length);
            if (iIndexOf == -1) {
                strArr[i] = strArr[i] + attributeValue.substring(length);
                length = attributeValue.length();
            } else if (iIndexOf != length) {
                strArr[i] = strArr[i] + attributeValue.substring(length, iIndexOf);
                length = iIndexOf;
            } else if (attributeValue.startsWith("$$", length)) {
                strArr[i] = outline.m1550A(new StringBuilder(), strArr[i], "$");
                length += 2;
            } else {
                int i2 = length + 1;
                int iIndexOf2 = attributeValue.indexOf("$", i2);
                String strSubstring2 = attributeValue.substring(i2, iIndexOf2);
                if (!strSubstring2.equals("RepresentationID")) {
                    int iIndexOf3 = strSubstring2.indexOf("%0");
                    if (iIndexOf3 != -1) {
                        strSubstring = strSubstring2.substring(iIndexOf3);
                        if (!strSubstring.endsWith("d") && !strSubstring.endsWith("x")) {
                            strSubstring = outline.m1599u(strSubstring, "d");
                        }
                        strSubstring2 = strSubstring2.substring(0, iIndexOf3);
                    } else {
                        strSubstring = "%01d";
                    }
                    strSubstring2.hashCode();
                    strSubstring2.hashCode();
                    byte b = -1;
                    switch (strSubstring2) {
                        case "Number":
                            b = 0;
                        case "Time":
                            b = 1;
                        case "Bandwidth":
                            b = 2;
                        default:
                            switch (b) {
                                case 0:
                                    iArr[i] = 2;
                                    break;
                                case 1:
                                    iArr[i] = 4;
                                    break;
                                case 2:
                                    iArr[i] = 3;
                                    break;
                                default:
                                    throw new IllegalArgumentException(outline.m1599u("Invalid template: ", attributeValue));
                            }
                    }
                } else {
                    iArr[i] = 1;
                }
                i++;
                strArr[i] = "";
                length = iIndexOf2 + 1;
            }
        }
        return new UrlTemplate(strArr, iArr, strArr2, i);
    }
}
