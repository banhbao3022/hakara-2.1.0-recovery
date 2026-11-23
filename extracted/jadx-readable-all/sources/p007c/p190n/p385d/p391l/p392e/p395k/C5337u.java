package p007c.p190n.p385d.p391l.p392e.p395k;

import android.os.Build;
import p007c.p190n.p385d.p391l.p392e.p401p.ByteString;
import p007c.p190n.p385d.p391l.p392e.p401p.CodedOutputStream;
import p007c.p190n.p385d.p391l.p392e.p401p.SessionProtobufHelper;

/* JADX INFO: renamed from: c.n.d.l.e.k.u */
/* JADX INFO: compiled from: CrashlyticsController.java */
/* JADX INFO: loaded from: classes.dex */
public class C5337u implements C5335t.g {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f26623a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f26624b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f26625c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f26626d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f26627e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f26628f;

    public C5337u(C5335t c5335t, int i, String str, int i2, long j2, long j3, boolean z, int i3, String str2, String str3) {
        this.f26623a = i;
        this.f26624b = i2;
        this.f26625c = j2;
        this.f26626d = j3;
        this.f26627e = z;
        this.f26628f = i3;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p395k.C5335t.g
    /* JADX INFO: renamed from: a */
    public void mo11773a(CodedOutputStream codedOutputStream) throws Exception {
        int i = this.f26623a;
        String str = Build.MODEL;
        int i2 = this.f26624b;
        long j2 = this.f26625c;
        long j3 = this.f26626d;
        boolean z = this.f26627e;
        int i3 = this.f26628f;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.PRODUCT;
        ByteString byteStringM12013j = SessionProtobufHelper.m12013j(str);
        ByteString byteStringM12013j2 = SessionProtobufHelper.m12013j(str3);
        ByteString byteStringM12013j3 = SessionProtobufHelper.m12013j(str2);
        codedOutputStream.m12001u(9, 2);
        int iM11988e = CodedOutputStream.m11988e(3, i) + 0;
        int iM11987c = byteStringM12013j == null ? 0 : CodedOutputStream.m11987c(4, byteStringM12013j);
        int iM11991i = CodedOutputStream.m11991i(5, i2);
        int iM11992j = CodedOutputStream.m11992j(6, j2);
        int iM11992j2 = CodedOutputStream.m11992j(7, j3);
        codedOutputStream.m11999r(CodedOutputStream.m11991i(12, i3) + CodedOutputStream.m11986a(10, z) + iM11992j2 + iM11992j + iM11991i + iM11988e + iM11987c + (byteStringM12013j3 == null ? 0 : CodedOutputStream.m11987c(13, byteStringM12013j3)) + (byteStringM12013j2 == null ? 0 : CodedOutputStream.m11987c(14, byteStringM12013j2)));
        codedOutputStream.m11997o(3, i);
        codedOutputStream.m11996n(4, byteStringM12013j);
        codedOutputStream.m12002v(5, i2);
        codedOutputStream.m12003w(6, j2);
        codedOutputStream.m12003w(7, j3);
        codedOutputStream.m11995m(10, z);
        codedOutputStream.m12002v(12, i3);
        if (byteStringM12013j3 != null) {
            codedOutputStream.m11996n(13, byteStringM12013j3);
        }
        if (byteStringM12013j2 != null) {
            codedOutputStream.m11996n(14, byteStringM12013j2);
        }
    }
}
