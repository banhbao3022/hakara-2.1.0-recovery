package p477d1.p481d0;

import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;

/* JADX INFO: renamed from: d1.d0.i, reason: use source file name */
/* JADX INFO: compiled from: Indent.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Indent extends Lambda implements InterfaceC6164l<String, String> {

    /* JADX INFO: renamed from: g */
    public static final Indent f29472g = new Indent();

    public Indent() {
        super(1);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6164l
    /* JADX INFO: renamed from: b */
    public String mo3b(String str) {
        String str2 = str;
        Intrinsics2.m13089e(str2, "line");
        return str2;
    }
}
