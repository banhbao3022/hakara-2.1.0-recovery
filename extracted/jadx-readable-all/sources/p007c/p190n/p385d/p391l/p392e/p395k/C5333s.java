package p007c.p190n.p385d.p391l.p392e.p395k;

import android.os.Build;
import p007c.p190n.p385d.p391l.p392e.p401p.ByteString;
import p007c.p190n.p385d.p391l.p392e.p401p.CodedOutputStream;
import p007c.p190n.p385d.p391l.p392e.p401p.SessionProtobufHelper;

/* JADX INFO: renamed from: c.n.d.l.e.k.s */
/* JADX INFO: compiled from: CrashlyticsController.java */
/* JADX INFO: loaded from: classes.dex */
public class C5333s implements C5335t.g {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f26577a;

    public C5333s(C5335t c5335t, String str, String str2, boolean z) {
        this.f26577a = z;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p395k.C5335t.g
    /* JADX INFO: renamed from: a */
    public void mo11773a(CodedOutputStream codedOutputStream) throws Exception {
        String str = Build.VERSION.RELEASE;
        String str2 = Build.VERSION.CODENAME;
        boolean z = this.f26577a;
        ByteString byteString = SessionProtobufHelper.f26920a;
        ByteString byteStringM11984a = ByteString.m11984a(str);
        ByteString byteStringM11984a2 = ByteString.m11984a(str2);
        codedOutputStream.m12001u(8, 2);
        codedOutputStream.m11999r(CodedOutputStream.m11986a(4, z) + CodedOutputStream.m11987c(3, byteStringM11984a2) + CodedOutputStream.m11987c(2, byteStringM11984a) + CodedOutputStream.m11988e(1, 3) + 0);
        codedOutputStream.m11997o(1, 3);
        codedOutputStream.m11996n(2, byteStringM11984a);
        codedOutputStream.m11996n(3, byteStringM11984a2);
        codedOutputStream.m11995m(4, z);
    }
}
