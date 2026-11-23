package p007c.p165l.p178k0;

import java.util.EnumSet;

/* JADX INFO: renamed from: c.l.k0.d0, reason: use source file name */
/* JADX INFO: compiled from: SmartLoginOption.java */
/* JADX INFO: loaded from: classes.dex */
public enum SmartLoginOption {
    None(0),
    Enabled(1),
    RequireConfirm(2);


    /* JADX INFO: renamed from: i */
    public static final EnumSet<SmartLoginOption> f4904i = EnumSet.allOf(SmartLoginOption.class);

    /* JADX INFO: renamed from: k */
    public final long f4906k;

    SmartLoginOption(long j2) {
        this.f4906k = j2;
    }
}
