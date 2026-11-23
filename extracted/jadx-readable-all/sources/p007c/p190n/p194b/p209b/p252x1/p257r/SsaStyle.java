package p007c.p190n.p194b.p209b.p252x1.p257r;

import android.graphics.Color;
import android.graphics.PointF;
import android.util.Log;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p334e.C4799a;

/* JADX INFO: renamed from: c.n.b.b.x1.r.c, reason: use source file name */
/* JADX INFO: compiled from: SsaStyle.java */
/* JADX INFO: loaded from: classes.dex */
public final class SsaStyle {

    /* JADX INFO: renamed from: a */
    public final String f10018a;

    /* JADX INFO: renamed from: b */
    public final int f10019b;

    /* JADX INFO: renamed from: c */
    public final Integer f10020c;

    /* JADX INFO: renamed from: d */
    public final float f10021d;

    /* JADX INFO: renamed from: e */
    public final boolean f10022e;

    /* JADX INFO: renamed from: f */
    public final boolean f10023f;

    /* JADX INFO: renamed from: c.n.b.b.x1.r.c$a */
    /* JADX INFO: compiled from: SsaStyle.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final int f10024a;

        /* JADX INFO: renamed from: b */
        public final int f10025b;

        /* JADX INFO: renamed from: c */
        public final int f10026c;

        /* JADX INFO: renamed from: d */
        public final int f10027d;

        /* JADX INFO: renamed from: e */
        public final int f10028e;

        /* JADX INFO: renamed from: f */
        public final int f10029f;

        /* JADX INFO: renamed from: g */
        public final int f10030g;

        public a(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
            this.f10024a = i;
            this.f10025b = i2;
            this.f10026c = i3;
            this.f10027d = i4;
            this.f10028e = i5;
            this.f10029f = i6;
            this.f10030g = i7;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.x1.r.c$b */
    /* JADX INFO: compiled from: SsaStyle.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public static final Pattern f10031a = Pattern.compile("\\{([^}]*)\\}");

        /* JADX INFO: renamed from: b */
        public static final Pattern f10032b = Pattern.compile(Util6.m3126n("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* JADX INFO: renamed from: c */
        public static final Pattern f10033c = Pattern.compile(Util6.m3126n("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* JADX INFO: renamed from: d */
        public static final Pattern f10034d = Pattern.compile("\\\\an(\\d+)");

        /* JADX INFO: renamed from: a */
        public static PointF m4449a(String str) {
            String strGroup;
            String strGroup2;
            Matcher matcher = f10032b.matcher(str);
            Matcher matcher2 = f10033c.matcher(str);
            boolean zFind = matcher.find();
            boolean zFind2 = matcher2.find();
            if (zFind) {
                if (zFind2) {
                    Log.i("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                strGroup = matcher.group(1);
                strGroup2 = matcher.group(2);
            } else {
                if (!zFind2) {
                    return null;
                }
                strGroup = matcher2.group(1);
                strGroup2 = matcher2.group(2);
            }
            Objects.requireNonNull(strGroup);
            float f = Float.parseFloat(strGroup.trim());
            Objects.requireNonNull(strGroup2);
            return new PointF(f, Float.parseFloat(strGroup2.trim()));
        }
    }

    public SsaStyle(String str, int i, Integer num, float f, boolean z, boolean z2) {
        this.f10018a = str;
        this.f10019b = i;
        this.f10020c = num;
        this.f10021d = f;
        this.f10022e = z;
        this.f10023f = z2;
    }

    /* JADX INFO: renamed from: a */
    public static int m4446a(String str) {
        boolean z;
        try {
            int i = Integer.parseInt(str.trim());
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    z = true;
                    break;
                default:
                    z = false;
                    break;
            }
            if (z) {
                return i;
            }
        } catch (NumberFormatException unused) {
        }
        outline.m1567R("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m4447b(String str) {
        try {
            int i = Integer.parseInt(str);
            return i == 1 || i == -1;
        } catch (NumberFormatException e) {
            p007c.p190n.p194b.p209b.p212b2.Log.m3156d("SsaStyle", "Failed to parse bold/italic: '" + str + "'", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static Integer m4448c(String str) {
        try {
            long j2 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            C2096e.m4566b(j2 <= 4294967295L);
            return Integer.valueOf(Color.argb(C4799a.m11008q(((j2 >> 24) & 255) ^ 255), C4799a.m11008q(j2 & 255), C4799a.m11008q((j2 >> 8) & 255), C4799a.m11008q((j2 >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            p007c.p190n.p194b.p209b.p212b2.Log.m3156d("SsaStyle", "Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }
}
