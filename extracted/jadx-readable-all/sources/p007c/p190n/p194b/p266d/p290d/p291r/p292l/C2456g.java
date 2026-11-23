package p007c.p190n.p194b.p266d.p290d.p291r.p292l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.d.r.l.g */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2456g extends AbstractC2767a {

    /* JADX INFO: renamed from: A */
    public final int f11238A;

    /* JADX INFO: renamed from: B */
    public final int f11239B;

    /* JADX INFO: renamed from: C */
    public final int f11240C;

    /* JADX INFO: renamed from: D */
    public final int f11241D;

    /* JADX INFO: renamed from: E */
    public final int f11242E;

    /* JADX INFO: renamed from: F */
    public final int f11243F;

    /* JADX INFO: renamed from: G */
    public final int f11244G;

    /* JADX INFO: renamed from: H */
    public final int f11245H;

    /* JADX INFO: renamed from: I */
    public final int f11246I;

    /* JADX INFO: renamed from: J */
    public final int f11247J;

    /* JADX INFO: renamed from: K */
    public final int f11248K;

    /* JADX INFO: renamed from: L */
    public final int f11249L;

    /* JADX INFO: renamed from: M */
    public final InterfaceC2497y f11250M;

    /* JADX INFO: renamed from: h */
    public final List<String> f11251h;

    /* JADX INFO: renamed from: i */
    public final int[] f11252i;

    /* JADX INFO: renamed from: j */
    public final long f11253j;

    /* JADX INFO: renamed from: k */
    public final String f11254k;

    /* JADX INFO: renamed from: l */
    public final int f11255l;

    /* JADX INFO: renamed from: m */
    public final int f11256m;

    /* JADX INFO: renamed from: n */
    public final int f11257n;

    /* JADX INFO: renamed from: o */
    public final int f11258o;

    /* JADX INFO: renamed from: p */
    public final int f11259p;

    /* JADX INFO: renamed from: q */
    public final int f11260q;

    /* JADX INFO: renamed from: r */
    public final int f11261r;

    /* JADX INFO: renamed from: s */
    public final int f11262s;

    /* JADX INFO: renamed from: t */
    public final int f11263t;

    /* JADX INFO: renamed from: u */
    public final int f11264u;

    /* JADX INFO: renamed from: v */
    public final int f11265v;

    /* JADX INFO: renamed from: w */
    public final int f11266w;

    /* JADX INFO: renamed from: x */
    public final int f11267x;

    /* JADX INFO: renamed from: y */
    public final int f11268y;

    /* JADX INFO: renamed from: z */
    public final int f11269z;

    /* JADX INFO: renamed from: f */
    public static final List<String> f11236f = Arrays.asList(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK, MediaIntentReceiver.ACTION_STOP_CASTING);

    /* JADX INFO: renamed from: g */
    public static final int[] f11237g = {0, 1};
    public static final Parcelable.Creator<C2456g> CREATOR = new C2482l0();

    /* JADX INFO: renamed from: c.n.b.d.d.r.l.g$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public List<String> f11270a = C2456g.f11236f;

        /* JADX INFO: renamed from: b */
        public int[] f11271b = C2456g.f11237g;

        /* JADX INFO: renamed from: c */
        public int f11272c = m5058a("smallIconDrawableResId");

        /* JADX INFO: renamed from: d */
        public int f11273d = m5058a("stopLiveStreamDrawableResId");

        /* JADX INFO: renamed from: e */
        public int f11274e = m5058a("pauseDrawableResId");

        /* JADX INFO: renamed from: f */
        public int f11275f = m5058a("playDrawableResId");

        /* JADX INFO: renamed from: g */
        public int f11276g = m5058a("skipNextDrawableResId");

        /* JADX INFO: renamed from: h */
        public int f11277h = m5058a("skipPrevDrawableResId");

        /* JADX INFO: renamed from: i */
        public int f11278i = m5058a("forwardDrawableResId");

        /* JADX INFO: renamed from: j */
        public int f11279j = m5058a("forward10DrawableResId");

        /* JADX INFO: renamed from: k */
        public int f11280k = m5058a("forward30DrawableResId");

        /* JADX INFO: renamed from: l */
        public int f11281l = m5058a("rewindDrawableResId");

        /* JADX INFO: renamed from: m */
        public int f11282m = m5058a("rewind10DrawableResId");

        /* JADX INFO: renamed from: n */
        public int f11283n = m5058a("rewind30DrawableResId");

        /* JADX INFO: renamed from: o */
        public int f11284o = m5058a("disconnectDrawableResId");

        /* JADX INFO: renamed from: p */
        public long f11285p = 10000;

        /* JADX INFO: renamed from: a */
        public static int m5058a(String str) {
            try {
                Integer num = (Integer) Class.forName("com.google.android.gms.cast.framework.media.internal.ResourceProvider").getMethod("findResourceByName", String.class).invoke(null, str);
                if (num == null) {
                    return 0;
                }
                return num.intValue();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return 0;
            }
        }
    }

    public C2456g(List<String> list, int[] iArr, long j2, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, IBinder iBinder) {
        InterfaceC2497y c2445a0 = null;
        if (list != null) {
            this.f11251h = new ArrayList(list);
        } else {
            this.f11251h = null;
        }
        if (iArr != null) {
            this.f11252i = Arrays.copyOf(iArr, iArr.length);
        } else {
            this.f11252i = null;
        }
        this.f11253j = j2;
        this.f11254k = str;
        this.f11255l = i;
        this.f11256m = i2;
        this.f11257n = i3;
        this.f11258o = i4;
        this.f11259p = i5;
        this.f11260q = i6;
        this.f11261r = i7;
        this.f11262s = i8;
        this.f11263t = i9;
        this.f11264u = i10;
        this.f11265v = i11;
        this.f11266w = i12;
        this.f11267x = i13;
        this.f11268y = i14;
        this.f11269z = i15;
        this.f11238A = i16;
        this.f11239B = i17;
        this.f11240C = i18;
        this.f11241D = i19;
        this.f11242E = i20;
        this.f11243F = i21;
        this.f11244G = i22;
        this.f11245H = i23;
        this.f11246I = i24;
        this.f11247J = i25;
        this.f11248K = i26;
        this.f11249L = i27;
        if (iBinder != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.INotificationActionsProvider");
            c2445a0 = iInterfaceQueryLocalInterface instanceof InterfaceC2497y ? (InterfaceC2497y) iInterfaceQueryLocalInterface : new C2445a0(iBinder);
        }
        this.f11250M = c2445a0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        C2622l.m5323W(parcel, 2, this.f11251h, false);
        int[] iArr = this.f11252i;
        C2622l.m5307S(parcel, 3, Arrays.copyOf(iArr, iArr.length), false);
        long j2 = this.f11253j;
        parcel.writeInt(524292);
        parcel.writeLong(j2);
        C2622l.m5315U(parcel, 5, this.f11254k, false);
        int i2 = this.f11255l;
        parcel.writeInt(262150);
        parcel.writeInt(i2);
        int i3 = this.f11256m;
        parcel.writeInt(262151);
        parcel.writeInt(i3);
        int i4 = this.f11257n;
        parcel.writeInt(262152);
        parcel.writeInt(i4);
        int i5 = this.f11258o;
        parcel.writeInt(262153);
        parcel.writeInt(i5);
        int i6 = this.f11259p;
        parcel.writeInt(262154);
        parcel.writeInt(i6);
        int i7 = this.f11260q;
        parcel.writeInt(262155);
        parcel.writeInt(i7);
        int i8 = this.f11261r;
        parcel.writeInt(262156);
        parcel.writeInt(i8);
        int i9 = this.f11262s;
        parcel.writeInt(262157);
        parcel.writeInt(i9);
        int i10 = this.f11263t;
        parcel.writeInt(262158);
        parcel.writeInt(i10);
        int i11 = this.f11264u;
        parcel.writeInt(262159);
        parcel.writeInt(i11);
        int i12 = this.f11265v;
        parcel.writeInt(262160);
        parcel.writeInt(i12);
        int i13 = this.f11266w;
        parcel.writeInt(262161);
        parcel.writeInt(i13);
        int i14 = this.f11267x;
        parcel.writeInt(262162);
        parcel.writeInt(i14);
        int i15 = this.f11268y;
        parcel.writeInt(262163);
        parcel.writeInt(i15);
        int i16 = this.f11269z;
        parcel.writeInt(262164);
        parcel.writeInt(i16);
        int i17 = this.f11238A;
        parcel.writeInt(262165);
        parcel.writeInt(i17);
        int i18 = this.f11239B;
        parcel.writeInt(262166);
        parcel.writeInt(i18);
        int i19 = this.f11240C;
        parcel.writeInt(262167);
        parcel.writeInt(i19);
        int i20 = this.f11241D;
        parcel.writeInt(262168);
        parcel.writeInt(i20);
        int i21 = this.f11242E;
        parcel.writeInt(262169);
        parcel.writeInt(i21);
        int i22 = this.f11243F;
        parcel.writeInt(262170);
        parcel.writeInt(i22);
        int i23 = this.f11244G;
        parcel.writeInt(262171);
        parcel.writeInt(i23);
        int i24 = this.f11245H;
        parcel.writeInt(262172);
        parcel.writeInt(i24);
        int i25 = this.f11246I;
        parcel.writeInt(262173);
        parcel.writeInt(i25);
        int i26 = this.f11247J;
        parcel.writeInt(262174);
        parcel.writeInt(i26);
        int i27 = this.f11248K;
        parcel.writeInt(262175);
        parcel.writeInt(i27);
        int i28 = this.f11249L;
        parcel.writeInt(262176);
        parcel.writeInt(i28);
        InterfaceC2497y interfaceC2497y = this.f11250M;
        C2622l.m5303R(parcel, 33, interfaceC2497y == null ? null : interfaceC2497y.asBinder(), false);
        C2622l.m5447v2(parcel, iM5239D1);
    }
}
