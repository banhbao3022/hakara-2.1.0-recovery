package p007c.p190n.p194b.p209b.p252x1.p259t;

import java.util.regex.Pattern;
import p007c.p190n.p378c.p380b.ImmutableSet;

/* JADX INFO: renamed from: c.n.b.b.x1.t.b, reason: use source file name */
/* JADX INFO: compiled from: TextEmphasis.java */
/* JADX INFO: loaded from: classes.dex */
public final class TextEmphasis {

    /* JADX INFO: renamed from: a */
    public static final Pattern f10043a = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: b */
    public static final ImmutableSet<String> f10044b;

    /* JADX INFO: renamed from: c */
    public static final ImmutableSet<String> f10045c;

    /* JADX INFO: renamed from: d */
    public static final ImmutableSet<String> f10046d;

    /* JADX INFO: renamed from: e */
    public static final ImmutableSet<String> f10047e;

    /* JADX INFO: renamed from: f */
    public final int f10048f;

    /* JADX INFO: renamed from: g */
    public final int f10049g;

    /* JADX INFO: renamed from: h */
    public final int f10050h;

    static {
        int i = ImmutableSet.f26280g;
        f10044b = ImmutableSet.m11660u(2, "auto", "none");
        f10045c = ImmutableSet.m11658B("dot", "sesame", "circle");
        f10046d = ImmutableSet.m11660u(2, "filled", "open");
        f10047e = ImmutableSet.m11658B("after", "before", "outside");
    }

    public TextEmphasis(int i, int i2, int i3) {
        this.f10048f = i;
        this.f10049g = i2;
        this.f10050h = i3;
    }
}
