package p007c.p190n.p194b.p334e.p357q;

import android.content.Context;
import mtp.media.karaoke.R;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p194b.p334e.p362v.MaterialAttributes;

/* JADX INFO: renamed from: c.n.b.e.q.a, reason: use source file name */
/* JADX INFO: compiled from: ElevationOverlayProvider.java */
/* JADX INFO: loaded from: classes.dex */
public class ElevationOverlayProvider {

    /* JADX INFO: renamed from: a */
    public final boolean f25322a;

    /* JADX INFO: renamed from: b */
    public final int f25323b;

    /* JADX INFO: renamed from: c */
    public final int f25324c;

    /* JADX INFO: renamed from: d */
    public final float f25325d;

    public ElevationOverlayProvider(Context context) {
        this.f25322a = MaterialAttributes.m11350b(context, R.attr.elevationOverlayEnabled, false);
        this.f25323b = C4799a.m10959J(context, R.attr.elevationOverlayColor, 0);
        this.f25324c = C4799a.m10959J(context, R.attr.colorSurface, 0);
        this.f25325d = context.getResources().getDisplayMetrics().density;
    }
}
