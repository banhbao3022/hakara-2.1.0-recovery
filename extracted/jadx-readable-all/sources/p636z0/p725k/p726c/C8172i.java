package p636z0.p725k.p726c;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: z0.k.c.i */
/* JADX INFO: compiled from: NotificationCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class C8172i {

    /* JADX INFO: renamed from: a */
    public final Bundle f37685a;

    /* JADX INFO: renamed from: b */
    public IconCompat f37686b;

    /* JADX INFO: renamed from: c */
    public final RemoteInput[] f37687c;

    /* JADX INFO: renamed from: d */
    public final RemoteInput[] f37688d;

    /* JADX INFO: renamed from: e */
    public boolean f37689e;

    /* JADX INFO: renamed from: f */
    public boolean f37690f;

    /* JADX INFO: renamed from: g */
    public final int f37691g;

    /* JADX INFO: renamed from: h */
    public final boolean f37692h;

    /* JADX INFO: renamed from: i */
    @Deprecated
    public int f37693i;

    /* JADX INFO: renamed from: j */
    public CharSequence f37694j;

    /* JADX INFO: renamed from: k */
    public PendingIntent f37695k;

    /* JADX INFO: renamed from: z0.k.c.i$a */
    /* JADX INFO: compiled from: NotificationCompat.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final IconCompat f37696a;

        /* JADX INFO: renamed from: b */
        public final CharSequence f37697b;

        /* JADX INFO: renamed from: c */
        public final PendingIntent f37698c;

        /* JADX INFO: renamed from: d */
        public boolean f37699d;

        /* JADX INFO: renamed from: e */
        public final Bundle f37700e;

        /* JADX INFO: renamed from: f */
        public ArrayList<RemoteInput> f37701f;

        /* JADX INFO: renamed from: g */
        public int f37702g;

        /* JADX INFO: renamed from: h */
        public boolean f37703h;

        /* JADX INFO: renamed from: i */
        public boolean f37704i;

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false);
        }

        /* JADX INFO: renamed from: a */
        public C8172i m16087a() {
            CharSequence[] charSequenceArr;
            Set<String> set;
            if (this.f37704i) {
                Objects.requireNonNull(this.f37698c, "Contextual Actions must contain a valid PendingIntent");
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList<RemoteInput> arrayList3 = this.f37701f;
            if (arrayList3 != null) {
                for (RemoteInput remoteInput : arrayList3) {
                    if ((remoteInput.f37804d || ((charSequenceArr = remoteInput.f37803c) != null && charSequenceArr.length != 0) || (set = remoteInput.f37807g) == null || set.isEmpty()) ? false : true) {
                        arrayList.add(remoteInput);
                    } else {
                        arrayList2.add(remoteInput);
                    }
                }
            }
            return new C8172i(this.f37696a, this.f37697b, this.f37698c, this.f37700e, arrayList2.isEmpty() ? null : (RemoteInput[]) arrayList2.toArray(new RemoteInput[arrayList2.size()]), arrayList.isEmpty() ? null : (RemoteInput[]) arrayList.toArray(new RemoteInput[arrayList.size()]), this.f37699d, this.f37702g, this.f37703h, this.f37704i);
        }

        public a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i != 0 ? IconCompat.m345d(null, "", i) : null, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false);
        }

        public a(C8172i c8172i) {
            this(c8172i.m16086a(), c8172i.f37694j, c8172i.f37695k, new Bundle(c8172i.f37685a), c8172i.f37687c, c8172i.f37689e, c8172i.f37691g, c8172i.f37690f, c8172i.f37692h);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, RemoteInput[] remoteInputArr, boolean z, int i, boolean z2, boolean z3) {
            this.f37699d = true;
            this.f37703h = true;
            this.f37696a = iconCompat;
            this.f37697b = C8176m.m16104d(charSequence);
            this.f37698c = pendingIntent;
            this.f37700e = bundle;
            this.f37701f = remoteInputArr == null ? null : new ArrayList<>(Arrays.asList(remoteInputArr));
            this.f37699d = z;
            this.f37702g = i;
            this.f37703h = z2;
            this.f37704i = z3;
        }
    }

    public C8172i(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        this(i != 0 ? IconCompat.m345d(null, "", i) : null, charSequence, pendingIntent);
    }

    /* JADX INFO: renamed from: a */
    public IconCompat m16086a() {
        int i;
        if (this.f37686b == null && (i = this.f37693i) != 0) {
            this.f37686b = IconCompat.m345d(null, "", i);
        }
        return this.f37686b;
    }

    public C8172i(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
        this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false);
    }

    public C8172i(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, RemoteInput[] remoteInputArr, RemoteInput[] remoteInputArr2, boolean z, int i, boolean z2, boolean z3) {
        this.f37690f = true;
        this.f37686b = iconCompat;
        if (iconCompat != null && iconCompat.m352i() == 2) {
            this.f37693i = iconCompat.m350e();
        }
        this.f37694j = C8176m.m16104d(charSequence);
        this.f37695k = pendingIntent;
        this.f37685a = bundle == null ? new Bundle() : bundle;
        this.f37687c = remoteInputArr;
        this.f37688d = remoteInputArr2;
        this.f37689e = z;
        this.f37691g = i;
        this.f37690f = z2;
        this.f37692h = z3;
    }
}
