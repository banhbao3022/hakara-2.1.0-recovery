package p007c.p190n.p194b.p266d.p310g;

import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.RecentlyNonNull;
import p007c.p190n.p194b.p266d.p314j.p322h.BinderC4063b;

/* JADX INFO: renamed from: c.n.b.d.g.a */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2799a extends IInterface {

    /* JADX INFO: renamed from: c.n.b.d.g.a$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public static abstract class a extends BinderC4063b implements InterfaceC2799a {
        public a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        @RecentlyNonNull
        /* JADX INFO: renamed from: i1 */
        public static InterfaceC2799a m5638i1(@RecentlyNonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return iInterfaceQueryLocalInterface instanceof InterfaceC2799a ? (InterfaceC2799a) iInterfaceQueryLocalInterface : new C2802d(iBinder);
        }
    }
}
