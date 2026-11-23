package p007c.p190n.p194b.p266d.p297e;

import android.os.Build;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.d.e.d */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2577d implements Parcelable {
    public static final Parcelable.Creator<C2577d> CREATOR = new C2579f();

    /* JADX INFO: renamed from: f */
    public Messenger f11510f;

    /* JADX INFO: renamed from: c.n.b.d.e.d$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
    public static final class a extends ClassLoader {
        @Override // java.lang.ClassLoader
        public final Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
            if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
                return super.loadClass(str, z);
            }
            if (!(Log.isLoggable("CloudMessengerCompat", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("CloudMessengerCompat", 3)))) {
                return C2577d.class;
            }
            Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
            return C2577d.class;
        }
    }

    public C2577d(IBinder iBinder) {
        this.f11510f = new Messenger(iBinder);
    }

    /* JADX INFO: renamed from: a */
    public final IBinder m5179a() {
        Messenger messenger = this.f11510f;
        Objects.requireNonNull(messenger);
        return messenger.getBinder();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return m5179a().equals(((C2577d) obj).m5179a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        return m5179a().hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.f11510f;
        Objects.requireNonNull(messenger);
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
