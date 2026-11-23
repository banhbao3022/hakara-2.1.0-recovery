package p555j.p556a.p557a.p619l;

import java.util.Arrays;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;

/* JADX INFO: renamed from: j.a.a.l.g, reason: use source file name */
/* JADX INFO: compiled from: Extensions.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Extensions2 extends Lambda implements InterfaceC6164l<Byte, CharSequence> {

    /* JADX INFO: renamed from: g */
    public static final Extensions2 f33087g = new Extensions2();

    public Extensions2() {
        super(1);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6164l
    /* JADX INFO: renamed from: b */
    public CharSequence mo3b(Byte b) {
        String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b.byteValue())}, 1));
        Intrinsics2.m13088d(str, "java.lang.String.format(this, *args)");
        return str;
    }
}
