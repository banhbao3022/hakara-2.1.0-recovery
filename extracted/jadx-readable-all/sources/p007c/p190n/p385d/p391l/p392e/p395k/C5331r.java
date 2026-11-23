package p007c.p190n.p385d.p391l.p392e.p395k;

import p007c.p190n.p385d.p391l.p392e.p401p.ByteString;
import p007c.p190n.p385d.p391l.p392e.p401p.CodedOutputStream;
import p007c.p190n.p385d.p391l.p392e.p401p.SessionProtobufHelper;

/* JADX INFO: renamed from: c.n.d.l.e.k.r */
/* JADX INFO: compiled from: CrashlyticsController.java */
/* JADX INFO: loaded from: classes.dex */
public class C5331r implements C5335t.g {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f26571a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f26572b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f26573c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f26574d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f26575e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C5335t f26576f;

    public C5331r(C5335t c5335t, String str, String str2, String str3, String str4, int i) {
        this.f26576f = c5335t;
        this.f26571a = str;
        this.f26572b = str2;
        this.f26573c = str3;
        this.f26574d = str4;
        this.f26575e = i;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p395k.C5335t.g
    /* JADX INFO: renamed from: a */
    public void mo11773a(CodedOutputStream codedOutputStream) throws Exception {
        String str = this.f26571a;
        String str2 = this.f26572b;
        String str3 = this.f26573c;
        String str4 = this.f26574d;
        int i = this.f26575e;
        String str5 = this.f26576f.f26608y;
        ByteString byteString = SessionProtobufHelper.f26920a;
        ByteString byteStringM11984a = ByteString.m11984a(str);
        ByteString byteStringM11984a2 = ByteString.m11984a(str2);
        ByteString byteStringM11984a3 = ByteString.m11984a(str3);
        ByteString byteStringM11984a4 = ByteString.m11984a(str4);
        ByteString byteStringM11984a5 = str5 != null ? ByteString.m11984a(str5) : null;
        codedOutputStream.m12001u(7, 2);
        int iM11987c = CodedOutputStream.m11987c(6, byteStringM11984a4) + CodedOutputStream.m11987c(3, byteStringM11984a3) + CodedOutputStream.m11987c(2, byteStringM11984a2) + CodedOutputStream.m11987c(1, byteStringM11984a) + 0;
        if (byteStringM11984a5 != null) {
            iM11987c = CodedOutputStream.m11987c(9, byteStringM11984a5) + CodedOutputStream.m11987c(8, SessionProtobufHelper.f26921b) + iM11987c;
        }
        codedOutputStream.m11999r(CodedOutputStream.m11988e(10, i) + iM11987c);
        codedOutputStream.m11996n(1, byteStringM11984a);
        codedOutputStream.m11996n(2, byteStringM11984a2);
        codedOutputStream.m11996n(3, byteStringM11984a3);
        codedOutputStream.m11996n(6, byteStringM11984a4);
        if (byteStringM11984a5 != null) {
            codedOutputStream.m11996n(8, SessionProtobufHelper.f26921b);
            codedOutputStream.m11996n(9, byteStringM11984a5);
        }
        codedOutputStream.m11997o(10, i);
    }
}
