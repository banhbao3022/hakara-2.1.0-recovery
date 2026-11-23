package p007c.p190n.p385d.p391l.p392e.p395k;

import p007c.p190n.p385d.p391l.p392e.p401p.ByteString;
import p007c.p190n.p385d.p391l.p392e.p401p.CodedOutputStream;
import p007c.p190n.p385d.p391l.p392e.p401p.SessionProtobufHelper;

/* JADX INFO: renamed from: c.n.d.l.e.k.q */
/* JADX INFO: compiled from: CrashlyticsController.java */
/* JADX INFO: loaded from: classes.dex */
public class C5329q implements C5335t.g {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f26561a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f26562b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f26563c;

    public C5329q(C5335t c5335t, String str, String str2, long j2) {
        this.f26561a = str;
        this.f26562b = str2;
        this.f26563c = j2;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p395k.C5335t.g
    /* JADX INFO: renamed from: a */
    public void mo11773a(CodedOutputStream codedOutputStream) throws Exception {
        String str = this.f26561a;
        String str2 = this.f26562b;
        long j2 = this.f26563c;
        ByteString byteString = SessionProtobufHelper.f26920a;
        codedOutputStream.m11996n(1, ByteString.m11984a(str2));
        codedOutputStream.m11996n(2, ByteString.m11984a(str));
        codedOutputStream.m12003w(3, j2);
    }
}
