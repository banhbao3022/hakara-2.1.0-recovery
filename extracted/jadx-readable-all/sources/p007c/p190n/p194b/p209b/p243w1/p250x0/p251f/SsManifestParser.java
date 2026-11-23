package p007c.p190n.p194b.p209b.p243w1.p250x0.p251f;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p007c.p071d.p078c.p079a.outline;
import p007c.p165l.p175i0.C1095a;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.ParserException;
import p007c.p190n.p194b.p209b.p210a2.ParsingLoadable;
import p007c.p190n.p194b.p209b.p212b2.CodecSpecificDataUtil;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p215n1.AacUtil;
import p007c.p190n.p194b.p209b.p218q1.DrmInitData;
import p007c.p190n.p194b.p209b.p221s1.p228k0.TrackEncryptionBox;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.w1.x0.f.b, reason: use source file name */
/* JADX INFO: compiled from: SsManifestParser.java */
/* JADX INFO: loaded from: classes.dex */
public class SsManifestParser implements ParsingLoadable.a<SsManifest> {

    /* JADX INFO: renamed from: a */
    public final XmlPullParserFactory f9725a;

    /* JADX INFO: renamed from: c.n.b.b.w1.x0.f.b$a */
    /* JADX INFO: compiled from: SsManifestParser.java */
    public static abstract class a {

        /* JADX INFO: renamed from: a */
        public final String f9726a;

        /* JADX INFO: renamed from: b */
        public final String f9727b;

        /* JADX INFO: renamed from: c */
        public final a f9728c;

        /* JADX INFO: renamed from: d */
        public final List<Pair<String, Object>> f9729d = new LinkedList();

        public a(a aVar, String str, String str2) {
            this.f9728c = aVar;
            this.f9726a = str;
            this.f9727b = str2;
        }

        /* JADX INFO: renamed from: a */
        public void mo4374a(Object obj) {
        }

        /* JADX INFO: renamed from: b */
        public abstract Object mo4375b();

        /* JADX INFO: renamed from: c */
        public final Object m4376c(String str) {
            for (int i = 0; i < this.f9729d.size(); i++) {
                Pair<String, Object> pair = this.f9729d.get(i);
                if (((String) pair.first).equals(str)) {
                    return pair.second;
                }
            }
            a aVar = this.f9728c;
            if (aVar == null) {
                return null;
            }
            return aVar.m4376c(str);
        }

        /* JADX INFO: renamed from: d */
        public boolean mo4377d(String str) {
            return false;
        }

        /* JADX INFO: renamed from: e */
        public final Object m4378e(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            boolean z = false;
            int i = 0;
            while (true) {
                int eventType = xmlPullParser.getEventType();
                a fVar = null;
                if (eventType == 1) {
                    return null;
                }
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (this.f9727b.equals(name)) {
                        mo4384k(xmlPullParser);
                        z = true;
                    } else if (z) {
                        if (i > 0) {
                            i++;
                        } else if (mo4377d(name)) {
                            mo4384k(xmlPullParser);
                        } else {
                            String str = this.f9726a;
                            if ("QualityLevel".equals(name)) {
                                fVar = new d(this, str);
                            } else if ("Protection".equals(name)) {
                                fVar = new c(this, str);
                            } else if ("StreamIndex".equals(name)) {
                                fVar = new f(this, str);
                            }
                            if (fVar == null) {
                                i = 1;
                            } else {
                                mo4374a(fVar.m4378e(xmlPullParser));
                            }
                        }
                    }
                } else if (eventType != 3) {
                    if (eventType == 4 && z && i == 0) {
                        mo4385l(xmlPullParser);
                    }
                } else if (!z) {
                    continue;
                } else if (i > 0) {
                    i--;
                } else {
                    String name2 = xmlPullParser.getName();
                    mo4379f(xmlPullParser);
                    if (!mo4377d(name2)) {
                        return mo4375b();
                    }
                }
                xmlPullParser.next();
            }
        }

        /* JADX INFO: renamed from: f */
        public void mo4379f(XmlPullParser xmlPullParser) {
        }

        /* JADX INFO: renamed from: g */
        public final int m4380g(XmlPullParser xmlPullParser, String str, int i) throws ParserException {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                return i;
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e) {
                throw new ParserException(e);
            }
        }

        /* JADX INFO: renamed from: h */
        public final long m4381h(XmlPullParser xmlPullParser, String str, long j2) throws ParserException {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                return j2;
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e) {
                throw new ParserException(e);
            }
        }

        /* JADX INFO: renamed from: i */
        public final int m4382i(XmlPullParser xmlPullParser, String str) throws ParserException {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                throw new b(str);
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e) {
                throw new ParserException(e);
            }
        }

        /* JADX INFO: renamed from: j */
        public final String m4383j(XmlPullParser xmlPullParser, String str) throws b {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                return attributeValue;
            }
            throw new b(str);
        }

        /* JADX INFO: renamed from: k */
        public void mo4384k(XmlPullParser xmlPullParser) throws ParserException {
        }

        /* JADX INFO: renamed from: l */
        public void mo4385l(XmlPullParser xmlPullParser) {
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.w1.x0.f.b$b */
    /* JADX INFO: compiled from: SsManifestParser.java */
    public static class b extends ParserException {
        public b(String str) {
            super(outline.m1599u("Missing required field: ", str));
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.w1.x0.f.b$c */
    /* JADX INFO: compiled from: SsManifestParser.java */
    public static class c extends a {

        /* JADX INFO: renamed from: e */
        public boolean f9730e;

        /* JADX INFO: renamed from: f */
        public UUID f9731f;

        /* JADX INFO: renamed from: g */
        public byte[] f9732g;

        public c(a aVar, String str) {
            super(aVar, str, "Protection");
        }

        /* JADX INFO: renamed from: m */
        public static void m4386m(byte[] bArr, int i, int i2) {
            byte b = bArr[i];
            bArr[i] = bArr[i2];
            bArr[i2] = b;
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.p250x0.p251f.SsManifestParser.a
        /* JADX INFO: renamed from: b */
        public Object mo4375b() {
            UUID uuid = this.f9731f;
            byte[] bArrM2391g = C1095a.m2391g(uuid, this.f9732g);
            byte[] bArr = this.f9732g;
            TrackEncryptionBox[] trackEncryptionBoxArr = new TrackEncryptionBox[1];
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bArr.length; i += 2) {
                sb.append((char) bArr[i]);
            }
            String string = sb.toString();
            byte[] bArrDecode = Base64.decode(string.substring(string.indexOf("<KID>") + 5, string.indexOf("</KID>")), 0);
            m4386m(bArrDecode, 0, 3);
            byte b = bArrDecode[1];
            bArrDecode[1] = bArrDecode[2];
            bArrDecode[2] = b;
            byte b2 = bArrDecode[4];
            bArrDecode[4] = bArrDecode[5];
            bArrDecode[5] = b2;
            byte b3 = bArrDecode[6];
            bArrDecode[6] = bArrDecode[7];
            bArrDecode[7] = b3;
            trackEncryptionBoxArr[0] = new TrackEncryptionBox(true, null, 8, bArrDecode, 0, 0, null);
            return new SsManifest.a(uuid, bArrM2391g, trackEncryptionBoxArr);
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.p250x0.p251f.SsManifestParser.a
        /* JADX INFO: renamed from: d */
        public boolean mo4377d(String str) {
            return "ProtectionHeader".equals(str);
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.p250x0.p251f.SsManifestParser.a
        /* JADX INFO: renamed from: f */
        public void mo4379f(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f9730e = false;
            }
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.p250x0.p251f.SsManifestParser.a
        /* JADX INFO: renamed from: k */
        public void mo4384k(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f9730e = true;
                String attributeValue = xmlPullParser.getAttributeValue(null, "SystemID");
                if (attributeValue.charAt(0) == '{' && attributeValue.charAt(attributeValue.length() - 1) == '}') {
                    attributeValue = attributeValue.substring(1, attributeValue.length() - 1);
                }
                this.f9731f = UUID.fromString(attributeValue);
            }
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.p250x0.p251f.SsManifestParser.a
        /* JADX INFO: renamed from: l */
        public void mo4385l(XmlPullParser xmlPullParser) {
            if (this.f9730e) {
                this.f9732g = Base64.decode(xmlPullParser.getText(), 0);
            }
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.w1.x0.f.b$d */
    /* JADX INFO: compiled from: SsManifestParser.java */
    public static class d extends a {

        /* JADX INFO: renamed from: e */
        public Format f9733e;

        public d(a aVar, String str) {
            super(aVar, str, "QualityLevel");
        }

        /* JADX INFO: renamed from: m */
        public static List<byte[]> m4387m(String str) {
            byte[][] bArr;
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                int i = Util6.f6307a;
                int length = str.length() / 2;
                byte[] bArr2 = new byte[length];
                for (int i2 = 0; i2 < length; i2++) {
                    int i3 = i2 * 2;
                    bArr2[i2] = (byte) (Character.digit(str.charAt(i3 + 1), 16) + (Character.digit(str.charAt(i3), 16) << 4));
                }
                if (CodecSpecificDataUtil.m3091c(bArr2, 0)) {
                    ArrayList arrayList2 = new ArrayList();
                    int length2 = 0;
                    do {
                        arrayList2.add(Integer.valueOf(length2));
                        byte[] bArr3 = CodecSpecificDataUtil.f6305a;
                        length2 += bArr3.length;
                        int length3 = length - bArr3.length;
                        while (true) {
                            if (length2 > length3) {
                                length2 = -1;
                                break;
                            }
                            if (CodecSpecificDataUtil.m3091c(bArr2, length2)) {
                                break;
                            }
                            length2++;
                        }
                    } while (length2 != -1);
                    byte[][] bArr4 = new byte[arrayList2.size()][];
                    int i4 = 0;
                    while (i4 < arrayList2.size()) {
                        int iIntValue = ((Integer) arrayList2.get(i4)).intValue();
                        int iIntValue2 = (i4 < arrayList2.size() + (-1) ? ((Integer) arrayList2.get(i4 + 1)).intValue() : length) - iIntValue;
                        byte[] bArr5 = new byte[iIntValue2];
                        System.arraycopy(bArr2, iIntValue, bArr5, 0, iIntValue2);
                        bArr4[i4] = bArr5;
                        i4++;
                    }
                    bArr = bArr4;
                } else {
                    bArr = null;
                }
                if (bArr == null) {
                    arrayList.add(bArr2);
                } else {
                    Collections.addAll(arrayList, bArr);
                }
            }
            return arrayList;
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.p250x0.p251f.SsManifestParser.a
        /* JADX INFO: renamed from: b */
        public Object mo4375b() {
            return this.f9733e;
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.p250x0.p251f.SsManifestParser.a
        /* JADX INFO: renamed from: k */
        public void mo4384k(XmlPullParser xmlPullParser) throws ParserException {
            String str;
            Format.b bVar = new Format.b();
            String strM4383j = m4383j(xmlPullParser, "FourCC");
            if (strM4383j.equalsIgnoreCase("H264") || strM4383j.equalsIgnoreCase("X264") || strM4383j.equalsIgnoreCase("AVC1") || strM4383j.equalsIgnoreCase("DAVC")) {
                str = "video/avc";
            } else if (strM4383j.equalsIgnoreCase("AAC") || strM4383j.equalsIgnoreCase("AACL") || strM4383j.equalsIgnoreCase("AACH") || strM4383j.equalsIgnoreCase("AACP")) {
                str = "audio/mp4a-latm";
            } else if (strM4383j.equalsIgnoreCase("TTML") || strM4383j.equalsIgnoreCase("DFXP")) {
                str = "application/ttml+xml";
            } else if (strM4383j.equalsIgnoreCase("ac-3") || strM4383j.equalsIgnoreCase("dac3")) {
                str = "audio/ac3";
            } else if (strM4383j.equalsIgnoreCase("ec-3") || strM4383j.equalsIgnoreCase("dec3")) {
                str = "audio/eac3";
            } else if (strM4383j.equalsIgnoreCase("dtsc")) {
                str = "audio/vnd.dts";
            } else if (strM4383j.equalsIgnoreCase("dtsh") || strM4383j.equalsIgnoreCase("dtsl")) {
                str = "audio/vnd.dts.hd";
            } else if (strM4383j.equalsIgnoreCase("dtse")) {
                str = "audio/vnd.dts.hd;profile=lbr";
            } else {
                str = strM4383j.equalsIgnoreCase("opus") ? "audio/opus" : null;
            }
            int iIntValue = ((Integer) m4376c("Type")).intValue();
            if (iIntValue == 2) {
                List<byte[]> listM4387m = m4387m(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
                bVar.f6957j = "video/mp4";
                bVar.f6963p = m4382i(xmlPullParser, "MaxWidth");
                bVar.f6964q = m4382i(xmlPullParser, "MaxHeight");
                bVar.f6960m = listM4387m;
            } else {
                int i = 0;
                if (iIntValue == 1) {
                    if (str == null) {
                        str = "audio/mp4a-latm";
                    }
                    int iM4382i = m4382i(xmlPullParser, "Channels");
                    int iM4382i2 = m4382i(xmlPullParser, "SamplingRate");
                    List<byte[]> listM4387m2 = m4387m(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
                    if (((ArrayList) listM4387m2).isEmpty() && "audio/mp4a-latm".equals(str)) {
                        int i2 = 0;
                        int i3 = -1;
                        while (true) {
                            int[] iArr = AacUtil.f7081a;
                            if (i2 >= iArr.length) {
                                break;
                            }
                            if (iM4382i2 == iArr[i2]) {
                                i3 = i2;
                            }
                            i2++;
                        }
                        int i4 = -1;
                        while (true) {
                            int[] iArr2 = AacUtil.f7082b;
                            if (i >= iArr2.length) {
                                break;
                            }
                            if (iM4382i == iArr2[i]) {
                                i4 = i;
                            }
                            i++;
                        }
                        if (iM4382i2 == -1 || i4 == -1) {
                            throw new IllegalArgumentException("Invalid sample rate or number of channels: " + iM4382i2 + ", " + iM4382i);
                        }
                        listM4387m2 = Collections.singletonList(AacUtil.m3550a(2, i3, i4));
                    }
                    bVar.f6957j = "audio/mp4";
                    bVar.f6971x = iM4382i;
                    bVar.f6972y = iM4382i2;
                    bVar.f6960m = listM4387m2;
                } else if (iIntValue == 3) {
                    String str2 = (String) m4376c("Subtype");
                    if (str2 != null) {
                        if (str2.equals("CAPT")) {
                            i = 64;
                        } else if (str2.equals("DESC")) {
                            i = 1024;
                        }
                    }
                    bVar.f6957j = "application/mp4";
                    bVar.f6952e = i;
                } else {
                    bVar.f6957j = "application/mp4";
                }
            }
            bVar.f6948a = xmlPullParser.getAttributeValue(null, "Index");
            bVar.f6949b = (String) m4376c("Name");
            bVar.f6958k = str;
            bVar.f6953f = m4382i(xmlPullParser, "Bitrate");
            bVar.f6950c = (String) m4376c("Language");
            this.f9733e = bVar.m3519a();
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.w1.x0.f.b$e */
    /* JADX INFO: compiled from: SsManifestParser.java */
    public static class e extends a {

        /* JADX INFO: renamed from: e */
        public final List<SsManifest.b> f9734e;

        /* JADX INFO: renamed from: f */
        public int f9735f;

        /* JADX INFO: renamed from: g */
        public int f9736g;

        /* JADX INFO: renamed from: h */
        public long f9737h;

        /* JADX INFO: renamed from: i */
        public long f9738i;

        /* JADX INFO: renamed from: j */
        public long f9739j;

        /* JADX INFO: renamed from: k */
        public int f9740k;

        /* JADX INFO: renamed from: l */
        public boolean f9741l;

        /* JADX INFO: renamed from: m */
        public SsManifest.a f9742m;

        public e(a aVar, String str) {
            super(aVar, str, "SmoothStreamingMedia");
            this.f9740k = -1;
            this.f9742m = null;
            this.f9734e = new LinkedList();
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.p250x0.p251f.SsManifestParser.a
        /* JADX INFO: renamed from: a */
        public void mo4374a(Object obj) {
            if (obj instanceof SsManifest.b) {
                this.f9734e.add((SsManifest.b) obj);
            } else if (obj instanceof SsManifest.a) {
                C2096e.m4570f(this.f9742m == null);
                this.f9742m = (SsManifest.a) obj;
            }
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.p250x0.p251f.SsManifestParser.a
        /* JADX INFO: renamed from: b */
        public Object mo4375b() {
            int size = this.f9734e.size();
            SsManifest.b[] bVarArr = new SsManifest.b[size];
            this.f9734e.toArray(bVarArr);
            SsManifest.a aVar = this.f9742m;
            if (aVar != null) {
                DrmInitData drmInitData = new DrmInitData(new DrmInitData.b(aVar.f9706a, "video/mp4", aVar.f9707b));
                for (int i = 0; i < size; i++) {
                    SsManifest.b bVar = bVarArr[i];
                    int i2 = bVar.f9709a;
                    if (i2 == 2 || i2 == 1) {
                        Format[] formatArr = bVar.f9718j;
                        for (int i3 = 0; i3 < formatArr.length; i3++) {
                            Format.b bVarM3515a = formatArr[i3].m3515a();
                            bVarM3515a.f6961n = drmInitData;
                            formatArr[i3] = bVarM3515a.m3519a();
                        }
                    }
                }
            }
            return new SsManifest(this.f9735f, this.f9736g, this.f9737h, this.f9738i, this.f9739j, this.f9740k, this.f9741l, this.f9742m, bVarArr);
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.p250x0.p251f.SsManifestParser.a
        /* JADX INFO: renamed from: k */
        public void mo4384k(XmlPullParser xmlPullParser) throws ParserException {
            this.f9735f = m4382i(xmlPullParser, "MajorVersion");
            this.f9736g = m4382i(xmlPullParser, "MinorVersion");
            this.f9737h = m4381h(xmlPullParser, "TimeScale", 10000000L);
            String attributeValue = xmlPullParser.getAttributeValue(null, "Duration");
            if (attributeValue == null) {
                throw new b("Duration");
            }
            try {
                this.f9738i = Long.parseLong(attributeValue);
                this.f9739j = m4381h(xmlPullParser, "DVRWindowLength", 0L);
                this.f9740k = m4380g(xmlPullParser, "LookaheadCount", -1);
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "IsLive");
                this.f9741l = attributeValue2 != null ? Boolean.parseBoolean(attributeValue2) : false;
                this.f9729d.add(Pair.create("TimeScale", Long.valueOf(this.f9737h)));
            } catch (NumberFormatException e) {
                throw new ParserException(e);
            }
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.w1.x0.f.b$f */
    /* JADX INFO: compiled from: SsManifestParser.java */
    public static class f extends a {

        /* JADX INFO: renamed from: e */
        public final String f9743e;

        /* JADX INFO: renamed from: f */
        public final List<Format> f9744f;

        /* JADX INFO: renamed from: g */
        public int f9745g;

        /* JADX INFO: renamed from: h */
        public String f9746h;

        /* JADX INFO: renamed from: i */
        public long f9747i;

        /* JADX INFO: renamed from: j */
        public String f9748j;

        /* JADX INFO: renamed from: k */
        public String f9749k;

        /* JADX INFO: renamed from: l */
        public int f9750l;

        /* JADX INFO: renamed from: m */
        public int f9751m;

        /* JADX INFO: renamed from: n */
        public int f9752n;

        /* JADX INFO: renamed from: o */
        public int f9753o;

        /* JADX INFO: renamed from: p */
        public String f9754p;

        /* JADX INFO: renamed from: q */
        public ArrayList<Long> f9755q;

        /* JADX INFO: renamed from: r */
        public long f9756r;

        public f(a aVar, String str) {
            super(aVar, str, "StreamIndex");
            this.f9743e = str;
            this.f9744f = new LinkedList();
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.p250x0.p251f.SsManifestParser.a
        /* JADX INFO: renamed from: a */
        public void mo4374a(Object obj) {
            if (obj instanceof Format) {
                this.f9744f.add((Format) obj);
            }
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.p250x0.p251f.SsManifestParser.a
        /* JADX INFO: renamed from: b */
        public Object mo4375b() {
            Format[] formatArr = new Format[this.f9744f.size()];
            this.f9744f.toArray(formatArr);
            return new SsManifest.b(this.f9743e, this.f9749k, this.f9745g, this.f9746h, this.f9747i, this.f9748j, this.f9750l, this.f9751m, this.f9752n, this.f9753o, this.f9754p, formatArr, this.f9755q, this.f9756r);
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.p250x0.p251f.SsManifestParser.a
        /* JADX INFO: renamed from: d */
        public boolean mo4377d(String str) {
            return "c".equals(str);
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.p250x0.p251f.SsManifestParser.a
        /* JADX INFO: renamed from: k */
        public void mo4384k(XmlPullParser xmlPullParser) throws ParserException {
            int i = 1;
            if (!"c".equals(xmlPullParser.getName())) {
                String attributeValue = xmlPullParser.getAttributeValue(null, "Type");
                if (attributeValue == null) {
                    throw new b("Type");
                }
                if (!"audio".equalsIgnoreCase(attributeValue)) {
                    if ("video".equalsIgnoreCase(attributeValue)) {
                        i = 2;
                    } else {
                        if (!"text".equalsIgnoreCase(attributeValue)) {
                            throw new ParserException(outline.m1600v("Invalid key value[", attributeValue, "]"));
                        }
                        i = 3;
                    }
                }
                this.f9745g = i;
                this.f9729d.add(Pair.create("Type", Integer.valueOf(i)));
                if (this.f9745g == 3) {
                    this.f9746h = m4383j(xmlPullParser, "Subtype");
                } else {
                    this.f9746h = xmlPullParser.getAttributeValue(null, "Subtype");
                }
                this.f9729d.add(Pair.create("Subtype", this.f9746h));
                this.f9748j = xmlPullParser.getAttributeValue(null, "Name");
                this.f9749k = m4383j(xmlPullParser, "Url");
                this.f9750l = m4380g(xmlPullParser, "MaxWidth", -1);
                this.f9751m = m4380g(xmlPullParser, "MaxHeight", -1);
                this.f9752n = m4380g(xmlPullParser, "DisplayWidth", -1);
                this.f9753o = m4380g(xmlPullParser, "DisplayHeight", -1);
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "Language");
                this.f9754p = attributeValue2;
                this.f9729d.add(Pair.create("Language", attributeValue2));
                long jM4380g = m4380g(xmlPullParser, "TimeScale", -1);
                this.f9747i = jM4380g;
                if (jM4380g == -1) {
                    this.f9747i = ((Long) m4376c("TimeScale")).longValue();
                }
                this.f9755q = new ArrayList<>();
                return;
            }
            int size = this.f9755q.size();
            long jM4381h = m4381h(xmlPullParser, "t", -9223372036854775807L);
            if (jM4381h == -9223372036854775807L) {
                if (size == 0) {
                    jM4381h = 0;
                } else {
                    if (this.f9756r == -1) {
                        throw new ParserException("Unable to infer start time");
                    }
                    jM4381h = this.f9756r + this.f9755q.get(size - 1).longValue();
                }
            }
            this.f9755q.add(Long.valueOf(jM4381h));
            this.f9756r = m4381h(xmlPullParser, "d", -9223372036854775807L);
            long jM4381h2 = m4381h(xmlPullParser, "r", 1L);
            if (jM4381h2 > 1 && this.f9756r == -9223372036854775807L) {
                throw new ParserException("Repeated chunk with unspecified duration");
            }
            while (true) {
                long j2 = i;
                if (j2 >= jM4381h2) {
                    return;
                }
                this.f9755q.add(Long.valueOf((this.f9756r * j2) + jM4381h));
                i++;
            }
        }
    }

    public SsManifestParser() {
        try {
            this.f9725a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.ParsingLoadable.a
    /* JADX INFO: renamed from: a */
    public SsManifest mo2912a(Uri uri, InputStream inputStream) throws IOException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f9725a.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            return (SsManifest) new e(null, uri.toString()).m4378e(xmlPullParserNewPullParser);
        } catch (XmlPullParserException e2) {
            throw new ParserException(e2);
        }
    }
}
