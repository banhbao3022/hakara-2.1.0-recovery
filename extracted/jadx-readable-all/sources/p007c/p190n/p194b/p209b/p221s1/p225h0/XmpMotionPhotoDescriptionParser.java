package p007c.p190n.p194b.p209b.p221s1.p225h0;

import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.ParserException;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p378c.p380b.AbstractIndexedListIterator;
import p007c.p190n.p378c.p380b.ImmutableList2;
import p007c.p190n.p378c.p380b.RegularImmutableList;

/* JADX INFO: renamed from: c.n.b.b.s1.h0.e, reason: use source file name */
/* JADX INFO: compiled from: XmpMotionPhotoDescriptionParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class XmpMotionPhotoDescriptionParser {

    /* JADX INFO: renamed from: a */
    public static final String[] f7673a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: b */
    public static final String[] f7674b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: c */
    public static final String[] f7675c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX INFO: renamed from: a */
    public static MotionPhotoDescription m3775a(String str) throws XmlPullParserException, IOException {
        boolean z;
        long j2;
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!C2096e.m4582r(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw new ParserException("Couldn't find xmp metadata");
        }
        AbstractIndexedListIterator<Object> abstractIndexedListIterator = ImmutableList2.f26255g;
        ImmutableList2<Object> immutableList2M3776b = RegularImmutableList.f26218h;
        long j3 = -9223372036854775807L;
        do {
            xmlPullParserNewPullParser.next();
            if (C2096e.m4582r(xmlPullParserNewPullParser, "rdf:Description")) {
                String[] strArr = f7673a;
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        String strM4575k = C2096e.m4575k(xmlPullParserNewPullParser, strArr[i]);
                        if (strM4575k == null) {
                            i++;
                        } else if (Integer.parseInt(strM4575k) == 1) {
                            z = true;
                            break;
                        }
                    }
                    z = false;
                    break;
                }
                if (!z) {
                    return null;
                }
                String[] strArr2 = f7674b;
                int length2 = strArr2.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length2) {
                        String strM4575k2 = C2096e.m4575k(xmlPullParserNewPullParser, strArr2[i2]);
                        if (strM4575k2 != null) {
                            j2 = Long.parseLong(strM4575k2);
                            if (j2 != -1) {
                                break;
                            }
                            break;
                        }
                        i2++;
                    }
                    j2 = -9223372036854775807L;
                    break;
                }
                String[] strArr3 = f7675c;
                int length3 = strArr3.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length3) {
                        AbstractIndexedListIterator<Object> abstractIndexedListIterator2 = ImmutableList2.f26255g;
                        immutableList2M3776b = RegularImmutableList.f26218h;
                        break;
                    }
                    String strM4575k3 = C2096e.m4575k(xmlPullParserNewPullParser, strArr3[i3]);
                    if (strM4575k3 != null) {
                        long j4 = Long.parseLong(strM4575k3);
                        MotionPhotoDescription.a aVar = new MotionPhotoDescription.a("image/jpeg", "Primary", 0L, 0L);
                        MotionPhotoDescription.a aVar2 = new MotionPhotoDescription.a("video/mp4", "MotionPhoto", j4, 0L);
                        AbstractIndexedListIterator<Object> abstractIndexedListIterator3 = ImmutableList2.f26255g;
                        immutableList2M3776b = ImmutableList2.m11641v(aVar, aVar2);
                        break;
                    }
                    i3++;
                }
                j3 = j2;
            } else if (C2096e.m4582r(xmlPullParserNewPullParser, "Container:Directory")) {
                immutableList2M3776b = m3776b(xmlPullParserNewPullParser, "Container", "Item");
            } else if (C2096e.m4582r(xmlPullParserNewPullParser, "GContainer:Directory")) {
                immutableList2M3776b = m3776b(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!C2096e.m4580p(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (immutableList2M3776b.isEmpty()) {
            return null;
        }
        return new MotionPhotoDescription(j3, immutableList2M3776b);
    }

    /* JADX INFO: renamed from: b */
    public static ImmutableList2<MotionPhotoDescription.a> m3776b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        AbstractIndexedListIterator<Object> abstractIndexedListIterator = ImmutableList2.f26255g;
        ImmutableList2.a aVar = new ImmutableList2.a();
        String strM1599u = outline.m1599u(str, ":Item");
        String strM1599u2 = outline.m1599u(str, ":Directory");
        do {
            xmlPullParser.next();
            if (C2096e.m4582r(xmlPullParser, strM1599u)) {
                String strM1599u3 = outline.m1599u(str2, ":Mime");
                String strM1599u4 = outline.m1599u(str2, ":Semantic");
                String strM1599u5 = outline.m1599u(str2, ":Length");
                String strM1599u6 = outline.m1599u(str2, ":Padding");
                String strM4575k = C2096e.m4575k(xmlPullParser, strM1599u3);
                String strM4575k2 = C2096e.m4575k(xmlPullParser, strM1599u4);
                String strM4575k3 = C2096e.m4575k(xmlPullParser, strM1599u5);
                String strM4575k4 = C2096e.m4575k(xmlPullParser, strM1599u6);
                if (strM4575k == null || strM4575k2 == null) {
                    return RegularImmutableList.f26218h;
                }
                aVar.m11646b(new MotionPhotoDescription.a(strM4575k, strM4575k2, strM4575k3 != null ? Long.parseLong(strM4575k3) : 0L, strM4575k4 != null ? Long.parseLong(strM4575k4) : 0L));
            }
        } while (!C2096e.m4580p(xmlPullParser, strM1599u2));
        return aVar.m11647c();
    }
}
