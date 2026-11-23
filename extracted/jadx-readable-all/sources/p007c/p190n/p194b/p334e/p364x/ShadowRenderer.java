package p007c.p190n.p194b.p334e.p364x;

import android.graphics.Paint;
import android.graphics.Path;
import p636z0.p725k.p729e.ColorUtils;

/* JADX INFO: renamed from: c.n.b.e.x.a, reason: use source file name */
/* JADX INFO: compiled from: ShadowRenderer.java */
/* JADX INFO: loaded from: classes.dex */
public class ShadowRenderer {

    /* JADX INFO: renamed from: a */
    public static final int[] f25553a = new int[3];

    /* JADX INFO: renamed from: b */
    public static final float[] f25554b = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: c */
    public static final int[] f25555c = new int[4];

    /* JADX INFO: renamed from: d */
    public static final float[] f25556d = {0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: e */
    public final Paint f25557e;

    /* JADX INFO: renamed from: f */
    public final Paint f25558f;

    /* JADX INFO: renamed from: g */
    public final Paint f25559g;

    /* JADX INFO: renamed from: h */
    public int f25560h;

    /* JADX INFO: renamed from: i */
    public int f25561i;

    /* JADX INFO: renamed from: j */
    public int f25562j;

    /* JADX INFO: renamed from: k */
    public final Path f25563k;

    /* JADX INFO: renamed from: l */
    public Paint f25564l;

    public ShadowRenderer() {
        this(-16777216);
    }

    /* JADX INFO: renamed from: a */
    public void m11362a(int i) {
        this.f25560h = ColorUtils.m16165d(i, 68);
        this.f25561i = ColorUtils.m16165d(i, 20);
        this.f25562j = ColorUtils.m16165d(i, 0);
        this.f25557e.setColor(this.f25560h);
    }

    public ShadowRenderer(int i) {
        this.f25563k = new Path();
        this.f25564l = new Paint();
        this.f25557e = new Paint();
        m11362a(i);
        this.f25564l.setColor(0);
        Paint paint = new Paint(4);
        this.f25558f = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f25559g = new Paint(paint);
    }
}
