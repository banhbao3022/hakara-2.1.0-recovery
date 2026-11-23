package p477d1.p481d0;

import java.io.IOException;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: d1.d0.h, reason: use source file name */
/* JADX INFO: compiled from: Appendable.kt */
/* JADX INFO: loaded from: classes.dex */
public class Appendable {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final <T> void m12984a(java.lang.Appendable appendable, T t, InterfaceC6164l<? super T, ? extends CharSequence> interfaceC6164l) throws IOException {
        Intrinsics2.m13089e(appendable, "$this$appendElement");
        if (interfaceC6164l != null) {
            appendable.append(interfaceC6164l.mo3b(t));
            return;
        }
        if (t != 0 ? t instanceof CharSequence : true) {
            appendable.append((CharSequence) t);
        } else if (t instanceof Character) {
            appendable.append(((Character) t).charValue());
        } else {
            appendable.append(String.valueOf(t));
        }
    }
}
