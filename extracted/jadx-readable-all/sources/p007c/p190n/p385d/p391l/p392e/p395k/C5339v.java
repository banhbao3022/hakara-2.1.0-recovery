package p007c.p190n.p385d.p391l.p392e.p395k;

import p007c.p190n.p385d.p391l.p392e.p401p.ByteString;
import p007c.p190n.p385d.p391l.p392e.p401p.CodedOutputStream;
import p007c.p190n.p385d.p391l.p392e.p401p.SessionProtobufHelper;

/* JADX INFO: renamed from: c.n.d.l.e.k.v */
/* JADX INFO: compiled from: CrashlyticsController.java */
/* JADX INFO: loaded from: classes.dex */
public class C5339v implements C5335t.g {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ UserMetadata f26629a;

    public C5339v(C5335t c5335t, UserMetadata userMetadata) {
        this.f26629a = userMetadata;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p395k.C5335t.g
    /* JADX INFO: renamed from: a */
    public void mo11773a(CodedOutputStream codedOutputStream) throws Exception {
        String str = this.f26629a.f26647a;
        ByteString byteString = SessionProtobufHelper.f26920a;
        if (str == null) {
            str = "";
        }
        ByteString byteStringM11984a = ByteString.m11984a(str);
        SessionProtobufHelper.m12013j(null);
        SessionProtobufHelper.m12013j(null);
        int iM11987c = CodedOutputStream.m11987c(1, byteStringM11984a) + 0;
        codedOutputStream.m12001u(6, 2);
        codedOutputStream.m11999r(iM11987c);
        codedOutputStream.m11996n(1, byteStringM11984a);
    }
}
